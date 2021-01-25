/*-
 * -\-\-
 * FastForward HTTP Module
 * --
 * Copyright (C) 2016 - 2018 Spotify AB
 * --
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * -/-/-
 */

package com.spotify.ffwd.http;

import static io.netty.handler.codec.http.HttpMethod.GET;
import static io.netty.handler.codec.http.HttpMethod.POST;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.ffwd.model.v2.Batch;
import com.spotify.ffwd.model.v2.Metric;
import com.spotify.ffwd.model.v2.Value;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufInputStream;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandler.Sharable;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;
import io.netty.handler.codec.http.DefaultFullHttpResponse;
import io.netty.handler.codec.http.FullHttpRequest;
import io.netty.handler.codec.http.HttpResponseStatus;
import io.netty.handler.codec.http.HttpVersion;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Collectors;
import javax.inject.Inject;
import javax.inject.Named;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Sharable
public class HttpDecoder extends MessageToMessageDecoder<FullHttpRequest> {

  private static final Logger log = LoggerFactory.getLogger(HttpDecoder.class);

  @Inject
  @Named("application/json")
  private ObjectMapper mapper;

  @Override
  protected void decode(ChannelHandlerContext ctx, FullHttpRequest in, List<Object> out) {
    switch (in.uri()) {
      case "/ping":
        if (in.method() == GET) {
          getPing(ctx);
          return;
        }

        throw new HttpException(HttpResponseStatus.METHOD_NOT_ALLOWED);
      case "/v1/batch":
      case "/v2/batch":
        if (in.method() == POST) {
          if (matchContentType(in, "application/json")) {
            postBatch(ctx, in, out);
            return;
          }
          log.error("Unsupported Media Type");
          throw new HttpException(HttpResponseStatus.UNSUPPORTED_MEDIA_TYPE);
        }
        log.error("HTTP Method Not Allowed");
        throw new HttpException(HttpResponseStatus.METHOD_NOT_ALLOWED);
      default:
        /* do nothing */
        break;
    }

    throw new HttpException(HttpResponseStatus.NOT_FOUND);
  }

  private boolean matchContentType(final FullHttpRequest in, final String expected) {
    final String value = in.headers().get("Content-Type");
    return value != null && value.equals(expected);
  }

  private void postBatch(
      final ChannelHandlerContext ctx, final FullHttpRequest in, final List<Object> out
  ) {
    final Object batch = convertToBatch(in);
    out.add(batch);
    ctx
        .channel()
        .writeAndFlush(new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.OK))
        .addListener((ChannelFutureListener) future -> future.channel().close());
  }

  private Object convertToBatch(final FullHttpRequest in) {
    final String endPoint = in.uri();
    final ByteBuf content = in.content();
    try (final InputStream inputStream = new ByteBufInputStream(content.copy())) {
      if ("/v2/batch".equals(endPoint)) {
        return mapper.readValue(inputStream, Batch.class);
      } else {
        com.spotify.ffwd.model.Batch batch =
            mapper.readValue(inputStream, com.spotify.ffwd.model.Batch.class);
        return convert(batch);
      }
    } catch (final IOException e) {
      log.error(
          "HTTP Bad Request. uri: {}, content: {}",
          endPoint,
          content.toString(StandardCharsets.UTF_8),
          e);
      throw new HttpException(HttpResponseStatus.BAD_REQUEST);
    }
  }

  private Batch convert(final com.spotify.ffwd.model.Batch batch) {
    List<com.spotify.ffwd.model.Batch.Point> v1Point = batch.getPoints();
    final List<Metric> v2Point = v1Point
        .stream()
        .map(p -> Metric.builder()
            .setKey(p.getKey())
            .setTags(p.getTags())
            .setResource(p.getResource())
            .setValue(Value.DoubleValue.create(p.getValue()))
            .setTimestamp(p.getTimestamp())
            .build())
        .collect(Collectors.toList());
    return new Batch(batch.getCommonTags(), batch.getCommonResource(), v2Point);
  }


  private void getPing(final ChannelHandlerContext ctx) {
    ctx
        .channel()
        .writeAndFlush(new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.OK))
        .addListener((ChannelFutureListener) future -> future.channel().close());
  }
}
