/*-
 * -\-\-
 * FastForward API
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


package com.spotify.ffwd.protobuf;

import com.spotify.ffwd.FastForward;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class ProtobufDecoderTest {
   @Mock
   private ByteBuf byteBuf;
   private long totalLength = 3000L;
   private ProtobufDecoder decoder;


    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
       setUpMock(2007, FastForward.Version.V0);
       decoder = new ProtobufDecoder();

    }

    @Test
    public void testDocodeOne()throws Exception {
         List<Object> out = new ArrayList<>();
        // decoder.decode(null, byteBuf,out );
    }

    private void setUpMock(final int readableByteSize, final FastForward.Version version) {
        Mockito.when(byteBuf.readableBytes()).thenReturn(readableByteSize);
        Mockito.when(byteBuf.getUnsignedInt(0)).thenReturn((long)version.getVersion());
        Mockito.when(byteBuf.getUnsignedInt(1)).thenReturn(totalLength);

    }


}
