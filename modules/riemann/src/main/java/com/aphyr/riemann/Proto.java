/*-
 * -\-\-
 * FastForward Riemann Module
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

// source: proto/riemann.proto

package com.aphyr.riemann;

public final class Proto {
    private Proto() {
    }

    public static void registerAllExtensions(
        com.spotify.ffwd.protobuf250.ExtensionRegistry registry
    ) {
    }

    public interface StateOrBuilder extends com.spotify.ffwd.protobuf250.MessageOrBuilder {

        // optional int64 time = 1;

        /**
         * <code>optional int64 time = 1;</code>
         */
        boolean hasTime();

        /**
         * <code>optional int64 time = 1;</code>
         */
        long getTime();

        // optional string state = 2;

        /**
         * <code>optional string state = 2;</code>
         */
        boolean hasState();

        /**
         * <code>optional string state = 2;</code>
         */
        java.lang.String getState();

        /**
         * <code>optional string state = 2;</code>
         */
        com.spotify.ffwd.protobuf250.ByteString getStateBytes();

        // optional string service = 3;

        /**
         * <code>optional string service = 3;</code>
         */
        boolean hasService();

        /**
         * <code>optional string service = 3;</code>
         */
        java.lang.String getService();

        /**
         * <code>optional string service = 3;</code>
         */
        com.spotify.ffwd.protobuf250.ByteString getServiceBytes();

        // optional string host = 4;

        /**
         * <code>optional string host = 4;</code>
         */
        boolean hasHost();

        /**
         * <code>optional string host = 4;</code>
         */
        java.lang.String getHost();

        /**
         * <code>optional string host = 4;</code>
         */
        com.spotify.ffwd.protobuf250.ByteString getHostBytes();

        // optional string description = 5;

        /**
         * <code>optional string description = 5;</code>
         */
        boolean hasDescription();

        /**
         * <code>optional string description = 5;</code>
         */
        java.lang.String getDescription();

        /**
         * <code>optional string description = 5;</code>
         */
        com.spotify.ffwd.protobuf250.ByteString getDescriptionBytes();

        // optional bool once = 6;

        /**
         * <code>optional bool once = 6;</code>
         */
        boolean hasOnce();

        /**
         * <code>optional bool once = 6;</code>
         */
        boolean getOnce();

        // repeated string tags = 7;

        /**
         * <code>repeated string tags = 7;</code>
         */
        java.util.List<java.lang.String> getTagsList();

        /**
         * <code>repeated string tags = 7;</code>
         */
        int getTagsCount();

        /**
         * <code>repeated string tags = 7;</code>
         */
        java.lang.String getTags(int index);

        /**
         * <code>repeated string tags = 7;</code>
         */
        com.spotify.ffwd.protobuf250.ByteString getTagsBytes(int index);

        // optional float ttl = 8;

        /**
         * <code>optional float ttl = 8;</code>
         */
        boolean hasTtl();

        /**
         * <code>optional float ttl = 8;</code>
         */
        float getTtl();
    }

    /**
     * Protobuf type {@code State}
     * <p>
     * <pre>
     * Deprecated; state was used by early versions of the protocol, but not any
     * more.
     * </pre>
     */
    public static final class State extends com.spotify.ffwd.protobuf250.GeneratedMessage
        implements StateOrBuilder {
        // Use State.newBuilder() to construct.
        private State(com.spotify.ffwd.protobuf250.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.unknownFields = builder.getUnknownFields();
        }

        private State(boolean noInit) {
            this.unknownFields = com.spotify.ffwd.protobuf250.UnknownFieldSet.getDefaultInstance();
        }

        private static final State defaultInstance;

        public static State getDefaultInstance() {
            return defaultInstance;
        }

        public State getDefaultInstanceForType() {
            return defaultInstance;
        }

        private final com.spotify.ffwd.protobuf250.UnknownFieldSet unknownFields;

        @java.lang.Override
        public final com.spotify.ffwd.protobuf250.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private State(
            com.spotify.ffwd.protobuf250.CodedInputStream input,
            com.spotify.ffwd.protobuf250.ExtensionRegistryLite extensionRegistry
        ) throws com.spotify.ffwd.protobuf250.InvalidProtocolBufferException {
            initFields();
            int mutable_bitField0_ = 0;
            com.spotify.ffwd.protobuf250.UnknownFieldSet.Builder unknownFields =
                com.spotify.ffwd.protobuf250.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 8: {
                            bitField0_ |= 0x00000001;
                            time_ = input.readInt64();
                            break;
                        }
                        case 18: {
                            bitField0_ |= 0x00000002;
                            state_ = input.readBytes();
                            break;
                        }
                        case 26: {
                            bitField0_ |= 0x00000004;
                            service_ = input.readBytes();
                            break;
                        }
                        case 34: {
                            bitField0_ |= 0x00000008;
                            host_ = input.readBytes();
                            break;
                        }
                        case 42: {
                            bitField0_ |= 0x00000010;
                            description_ = input.readBytes();
                            break;
                        }
                        case 48: {
                            bitField0_ |= 0x00000020;
                            once_ = input.readBool();
                            break;
                        }
                        case 58: {
                            if (!((mutable_bitField0_ & 0x00000040) == 0x00000040)) {
                                tags_ = new com.spotify.ffwd.protobuf250.LazyStringArrayList();
                                mutable_bitField0_ |= 0x00000040;
                            }
                            tags_.add(input.readBytes());
                            break;
                        }
                        case 69: {
                            bitField0_ |= 0x00000040;
                            ttl_ = input.readFloat();
                            break;
                        }
                    }
                }
            } catch (com.spotify.ffwd.protobuf250.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.spotify.ffwd.protobuf250.InvalidProtocolBufferException(
                    e.getMessage()).setUnfinishedMessage(this);
            } finally {
                if (((mutable_bitField0_ & 0x00000040) == 0x00000040)) {
                    tags_ = new com.spotify.ffwd.protobuf250.UnmodifiableLazyStringList(tags_);
                }
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final com.spotify.ffwd.protobuf250.Descriptors.Descriptor getDescriptor() {
            return com.aphyr.riemann.Proto.internal_static_State_descriptor;
        }

        protected com.spotify.ffwd.protobuf250.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.aphyr.riemann.Proto.internal_static_State_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                com.aphyr.riemann.Proto.State.class, com.aphyr.riemann.Proto.State.Builder.class);
        }

        public static com.spotify.ffwd.protobuf250.Parser<State> PARSER =
            new com.spotify.ffwd.protobuf250.AbstractParser<State>() {
                public State parsePartialFrom(
                    com.spotify.ffwd.protobuf250.CodedInputStream input,
                    com.spotify.ffwd.protobuf250.ExtensionRegistryLite extensionRegistry
                ) throws com.spotify.ffwd.protobuf250.InvalidProtocolBufferException {
                    return new State(input, extensionRegistry);
                }
            };

        @java.lang.Override
        public com.spotify.ffwd.protobuf250.Parser<State> getParserForType() {
            return PARSER;
        }

        private int bitField0_;
        // optional int64 time = 1;
        public static final int TIME_FIELD_NUMBER = 1;
        private long time_;

        /**
         * <code>optional int64 time = 1;</code>
         */
        public boolean hasTime() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }

        /**
         * <code>optional int64 time = 1;</code>
         */
        public long getTime() {
            return time_;
        }

        // optional string state = 2;
        public static final int STATE_FIELD_NUMBER = 2;
        private java.lang.Object state_;

        /**
         * <code>optional string state = 2;</code>
         */
        public boolean hasState() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }

        /**
         * <code>optional string state = 2;</code>
         */
        public java.lang.String getState() {
            java.lang.Object ref = state_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.spotify.ffwd.protobuf250.ByteString bs =
                    (com.spotify.ffwd.protobuf250.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    state_ = s;
                }
                return s;
            }
        }

        /**
         * <code>optional string state = 2;</code>
         */
        public com.spotify.ffwd.protobuf250.ByteString getStateBytes() {
            java.lang.Object ref = state_;
            if (ref instanceof java.lang.String) {
                com.spotify.ffwd.protobuf250.ByteString b =
                    com.spotify.ffwd.protobuf250.ByteString.copyFromUtf8((java.lang.String) ref);
                state_ = b;
                return b;
            } else {
                return (com.spotify.ffwd.protobuf250.ByteString) ref;
            }
        }

        // optional string service = 3;
        public static final int SERVICE_FIELD_NUMBER = 3;
        private java.lang.Object service_;

        /**
         * <code>optional string service = 3;</code>
         */
        public boolean hasService() {
            return ((bitField0_ & 0x00000004) == 0x00000004);
        }

        /**
         * <code>optional string service = 3;</code>
         */
        public java.lang.String getService() {
            java.lang.Object ref = service_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.spotify.ffwd.protobuf250.ByteString bs =
                    (com.spotify.ffwd.protobuf250.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    service_ = s;
                }
                return s;
            }
        }

        /**
         * <code>optional string service = 3;</code>
         */
        public com.spotify.ffwd.protobuf250.ByteString getServiceBytes() {
            java.lang.Object ref = service_;
            if (ref instanceof java.lang.String) {
                com.spotify.ffwd.protobuf250.ByteString b =
                    com.spotify.ffwd.protobuf250.ByteString.copyFromUtf8((java.lang.String) ref);
                service_ = b;
                return b;
            } else {
                return (com.spotify.ffwd.protobuf250.ByteString) ref;
            }
        }

        // optional string host = 4;
        public static final int HOST_FIELD_NUMBER = 4;
        private java.lang.Object host_;

        /**
         * <code>optional string host = 4;</code>
         */
        public boolean hasHost() {
            return ((bitField0_ & 0x00000008) == 0x00000008);
        }

        /**
         * <code>optional string host = 4;</code>
         */
        public java.lang.String getHost() {
            java.lang.Object ref = host_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.spotify.ffwd.protobuf250.ByteString bs =
                    (com.spotify.ffwd.protobuf250.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    host_ = s;
                }
                return s;
            }
        }

        /**
         * <code>optional string host = 4;</code>
         */
        public com.spotify.ffwd.protobuf250.ByteString getHostBytes() {
            java.lang.Object ref = host_;
            if (ref instanceof java.lang.String) {
                com.spotify.ffwd.protobuf250.ByteString b =
                    com.spotify.ffwd.protobuf250.ByteString.copyFromUtf8((java.lang.String) ref);
                host_ = b;
                return b;
            } else {
                return (com.spotify.ffwd.protobuf250.ByteString) ref;
            }
        }

        // optional string description = 5;
        public static final int DESCRIPTION_FIELD_NUMBER = 5;
        private java.lang.Object description_;

        /**
         * <code>optional string description = 5;</code>
         */
        public boolean hasDescription() {
            return ((bitField0_ & 0x00000010) == 0x00000010);
        }

        /**
         * <code>optional string description = 5;</code>
         */
        public java.lang.String getDescription() {
            java.lang.Object ref = description_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.spotify.ffwd.protobuf250.ByteString bs =
                    (com.spotify.ffwd.protobuf250.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    description_ = s;
                }
                return s;
            }
        }

        /**
         * <code>optional string description = 5;</code>
         */
        public com.spotify.ffwd.protobuf250.ByteString getDescriptionBytes() {
            java.lang.Object ref = description_;
            if (ref instanceof java.lang.String) {
                com.spotify.ffwd.protobuf250.ByteString b =
                    com.spotify.ffwd.protobuf250.ByteString.copyFromUtf8((java.lang.String) ref);
                description_ = b;
                return b;
            } else {
                return (com.spotify.ffwd.protobuf250.ByteString) ref;
            }
        }

        // optional bool once = 6;
        public static final int ONCE_FIELD_NUMBER = 6;
        private boolean once_;

        /**
         * <code>optional bool once = 6;</code>
         */
        public boolean hasOnce() {
            return ((bitField0_ & 0x00000020) == 0x00000020);
        }

        /**
         * <code>optional bool once = 6;</code>
         */
        public boolean getOnce() {
            return once_;
        }

        // repeated string tags = 7;
        public static final int TAGS_FIELD_NUMBER = 7;
        private com.spotify.ffwd.protobuf250.LazyStringList tags_;

        /**
         * <code>repeated string tags = 7;</code>
         */
        public java.util.List<java.lang.String> getTagsList() {
            return tags_;
        }

        /**
         * <code>repeated string tags = 7;</code>
         */
        public int getTagsCount() {
            return tags_.size();
        }

        /**
         * <code>repeated string tags = 7;</code>
         */
        public java.lang.String getTags(int index) {
            return tags_.get(index);
        }

        /**
         * <code>repeated string tags = 7;</code>
         */
        public com.spotify.ffwd.protobuf250.ByteString getTagsBytes(int index) {
            return tags_.getByteString(index);
        }

        // optional float ttl = 8;
        public static final int TTL_FIELD_NUMBER = 8;
        private float ttl_;

        /**
         * <code>optional float ttl = 8;</code>
         */
        public boolean hasTtl() {
            return ((bitField0_ & 0x00000040) == 0x00000040);
        }

        /**
         * <code>optional float ttl = 8;</code>
         */
        public float getTtl() {
            return ttl_;
        }

        private void initFields() {
            time_ = 0L;
            state_ = "";
            service_ = "";
            host_ = "";
            description_ = "";
            once_ = false;
            tags_ = com.spotify.ffwd.protobuf250.LazyStringArrayList.EMPTY;
            ttl_ = 0F;
        }

        private byte memoizedIsInitialized = -1;

        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized != -1) {
                return isInitialized == 1;
            }

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.spotify.ffwd.protobuf250.CodedOutputStream output)
            throws java.io.IOException {
            getSerializedSize();
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeInt64(1, time_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeBytes(2, getStateBytes());
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                output.writeBytes(3, getServiceBytes());
            }
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                output.writeBytes(4, getHostBytes());
            }
            if (((bitField0_ & 0x00000010) == 0x00000010)) {
                output.writeBytes(5, getDescriptionBytes());
            }
            if (((bitField0_ & 0x00000020) == 0x00000020)) {
                output.writeBool(6, once_);
            }
            for (int i = 0; i < tags_.size(); i++) {
                output.writeBytes(7, tags_.getByteString(i));
            }
            if (((bitField0_ & 0x00000040) == 0x00000040)) {
                output.writeFloat(8, ttl_);
            }
            getUnknownFields().writeTo(output);
        }

        private int memoizedSerializedSize = -1;

        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1) {
                return size;
            }

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.spotify.ffwd.protobuf250.CodedOutputStream.computeInt64Size(1, time_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.spotify.ffwd.protobuf250.CodedOutputStream.computeBytesSize(2,
                    getStateBytes());
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                size += com.spotify.ffwd.protobuf250.CodedOutputStream.computeBytesSize(3,
                    getServiceBytes());
            }
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                size += com.spotify.ffwd.protobuf250.CodedOutputStream.computeBytesSize(4,
                    getHostBytes());
            }
            if (((bitField0_ & 0x00000010) == 0x00000010)) {
                size += com.spotify.ffwd.protobuf250.CodedOutputStream.computeBytesSize(5,
                    getDescriptionBytes());
            }
            if (((bitField0_ & 0x00000020) == 0x00000020)) {
                size += com.spotify.ffwd.protobuf250.CodedOutputStream.computeBoolSize(6, once_);
            }
            {
                int dataSize = 0;
                for (int i = 0; i < tags_.size(); i++) {
                    dataSize +=
                        com.spotify.ffwd.protobuf250.CodedOutputStream.computeBytesSizeNoTag(
                            tags_.getByteString(i));
                }
                size += dataSize;
                size += 1 * getTagsList().size();
            }
            if (((bitField0_ & 0x00000040) == 0x00000040)) {
                size += com.spotify.ffwd.protobuf250.CodedOutputStream.computeFloatSize(8, ttl_);
            }
            size += getUnknownFields().getSerializedSize();
            memoizedSerializedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;

        @java.lang.Override
        protected java.lang.Object writeReplace() throws java.io.ObjectStreamException {
            return super.writeReplace();
        }

        public static com.aphyr.riemann.Proto.State parseFrom(
            com.spotify.ffwd.protobuf250.ByteString data
        ) throws com.spotify.ffwd.protobuf250.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static com.aphyr.riemann.Proto.State parseFrom(
            com.spotify.ffwd.protobuf250.ByteString data,
            com.spotify.ffwd.protobuf250.ExtensionRegistryLite extensionRegistry
        ) throws com.spotify.ffwd.protobuf250.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.aphyr.riemann.Proto.State parseFrom(byte[] data)
            throws com.spotify.ffwd.protobuf250.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static com.aphyr.riemann.Proto.State parseFrom(
            byte[] data, com.spotify.ffwd.protobuf250.ExtensionRegistryLite extensionRegistry
        ) throws com.spotify.ffwd.protobuf250.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.aphyr.riemann.Proto.State parseFrom(java.io.InputStream input)
            throws java.io.IOException {
            return PARSER.parseFrom(input);
        }

        public static com.aphyr.riemann.Proto.State parseFrom(
            java.io.InputStream input,
            com.spotify.ffwd.protobuf250.ExtensionRegistryLite extensionRegistry
        ) throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }

        public static com.aphyr.riemann.Proto.State parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input);
        }

        public static com.aphyr.riemann.Proto.State parseDelimitedFrom(
            java.io.InputStream input,
            com.spotify.ffwd.protobuf250.ExtensionRegistryLite extensionRegistry
        ) throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static com.aphyr.riemann.Proto.State parseFrom(
            com.spotify.ffwd.protobuf250.CodedInputStream input
        ) throws java.io.IOException {
            return PARSER.parseFrom(input);
        }

        public static com.aphyr.riemann.Proto.State parseFrom(
            com.spotify.ffwd.protobuf250.CodedInputStream input,
            com.spotify.ffwd.protobuf250.ExtensionRegistryLite extensionRegistry
        ) throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(com.aphyr.riemann.Proto.State prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
            com.spotify.ffwd.protobuf250.GeneratedMessage.BuilderParent parent
        ) {
            Builder builder = new Builder(parent);
            return builder;
        }

        /**
         * Protobuf type {@code State}
         * <p>
         * <pre>
         * Deprecated; state was used by early versions of the protocol, but not any
         * more.
         * </pre>
         */
        public static final class Builder
            extends com.spotify.ffwd.protobuf250.GeneratedMessage.Builder<Builder>
            implements com.aphyr.riemann.Proto.StateOrBuilder {
            public static final com.spotify.ffwd.protobuf250.Descriptors.Descriptor getDescriptor
            () {
                return com.aphyr.riemann.Proto.internal_static_State_descriptor;
            }

            protected com.spotify.ffwd.protobuf250.GeneratedMessage.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return com.aphyr.riemann.Proto.internal_static_State_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                    com.aphyr.riemann.Proto.State.class,
                    com.aphyr.riemann.Proto.State.Builder.class);
            }

            // Construct using com.aphyr.riemann.Proto.State.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                com.spotify.ffwd.protobuf250.GeneratedMessage.BuilderParent parent
            ) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.spotify.ffwd.protobuf250.GeneratedMessage.alwaysUseFieldBuilders) {
                }
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                time_ = 0L;
                bitField0_ = (bitField0_ & ~0x00000001);
                state_ = "";
                bitField0_ = (bitField0_ & ~0x00000002);
                service_ = "";
                bitField0_ = (bitField0_ & ~0x00000004);
                host_ = "";
                bitField0_ = (bitField0_ & ~0x00000008);
                description_ = "";
                bitField0_ = (bitField0_ & ~0x00000010);
                once_ = false;
                bitField0_ = (bitField0_ & ~0x00000020);
                tags_ = com.spotify.ffwd.protobuf250.LazyStringArrayList.EMPTY;
                bitField0_ = (bitField0_ & ~0x00000040);
                ttl_ = 0F;
                bitField0_ = (bitField0_ & ~0x00000080);
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public com.spotify.ffwd.protobuf250.Descriptors.Descriptor getDescriptorForType() {
                return com.aphyr.riemann.Proto.internal_static_State_descriptor;
            }

            public com.aphyr.riemann.Proto.State getDefaultInstanceForType() {
                return com.aphyr.riemann.Proto.State.getDefaultInstance();
            }

            public com.aphyr.riemann.Proto.State build() {
                com.aphyr.riemann.Proto.State result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public com.aphyr.riemann.Proto.State buildPartial() {
                com.aphyr.riemann.Proto.State result = new com.aphyr.riemann.Proto.State(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.time_ = time_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.state_ = state_;
                if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                    to_bitField0_ |= 0x00000004;
                }
                result.service_ = service_;
                if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
                    to_bitField0_ |= 0x00000008;
                }
                result.host_ = host_;
                if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
                    to_bitField0_ |= 0x00000010;
                }
                result.description_ = description_;
                if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
                    to_bitField0_ |= 0x00000020;
                }
                result.once_ = once_;
                if (((bitField0_ & 0x00000040) == 0x00000040)) {
                    tags_ = new com.spotify.ffwd.protobuf250.UnmodifiableLazyStringList(tags_);
                    bitField0_ = (bitField0_ & ~0x00000040);
                }
                result.tags_ = tags_;
                if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
                    to_bitField0_ |= 0x00000040;
                }
                result.ttl_ = ttl_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(com.spotify.ffwd.protobuf250.Message other) {
                if (other instanceof com.aphyr.riemann.Proto.State) {
                    return mergeFrom((com.aphyr.riemann.Proto.State) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.aphyr.riemann.Proto.State other) {
                if (other == com.aphyr.riemann.Proto.State.getDefaultInstance()) {
                    return this;
                }
                if (other.hasTime()) {
                    setTime(other.getTime());
                }
                if (other.hasState()) {
                    bitField0_ |= 0x00000002;
                    state_ = other.state_;
                    onChanged();
                }
                if (other.hasService()) {
                    bitField0_ |= 0x00000004;
                    service_ = other.service_;
                    onChanged();
                }
                if (other.hasHost()) {
                    bitField0_ |= 0x00000008;
                    host_ = other.host_;
                    onChanged();
                }
                if (other.hasDescription()) {
                    bitField0_ |= 0x00000010;
                    description_ = other.description_;
                    onChanged();
                }
                if (other.hasOnce()) {
                    setOnce(other.getOnce());
                }
                if (!other.tags_.isEmpty()) {
                    if (tags_.isEmpty()) {
                        tags_ = other.tags_;
                        bitField0_ = (bitField0_ & ~0x00000040);
                    } else {
                        ensureTagsIsMutable();
                        tags_.addAll(other.tags_);
                    }
                    onChanged();
                }
                if (other.hasTtl()) {
                    setTtl(other.getTtl());
                }
                this.mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                com.spotify.ffwd.protobuf250.CodedInputStream input,
                com.spotify.ffwd.protobuf250.ExtensionRegistryLite extensionRegistry
            ) throws java.io.IOException {
                com.aphyr.riemann.Proto.State parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.spotify.ffwd.protobuf250.InvalidProtocolBufferException e) {
                    parsedMessage = (com.aphyr.riemann.Proto.State) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int bitField0_;

            // optional int64 time = 1;
            private long time_;

            /**
             * <code>optional int64 time = 1;</code>
             */
            public boolean hasTime() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }

            /**
             * <code>optional int64 time = 1;</code>
             */
            public long getTime() {
                return time_;
            }

            /**
             * <code>optional int64 time = 1;</code>
             */
            public Builder setTime(long value) {
                bitField0_ |= 0x00000001;
                time_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>optional int64 time = 1;</code>
             */
            public Builder clearTime() {
                bitField0_ = (bitField0_ & ~0x00000001);
                time_ = 0L;
                onChanged();
                return this;
            }

            // optional string state = 2;
            private java.lang.Object state_ = "";

            /**
             * <code>optional string state = 2;</code>
             */
            public boolean hasState() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }

            /**
             * <code>optional string state = 2;</code>
             */
            public java.lang.String getState() {
                java.lang.Object ref = state_;
                if (!(ref instanceof java.lang.String)) {
                    java.lang.String s =
                        ((com.spotify.ffwd.protobuf250.ByteString) ref).toStringUtf8();
                    state_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>optional string state = 2;</code>
             */
            public com.spotify.ffwd.protobuf250.ByteString getStateBytes() {
                java.lang.Object ref = state_;
                if (ref instanceof String) {
                    com.spotify.ffwd.protobuf250.ByteString b =
                        com.spotify.ffwd.protobuf250.ByteString.copyFromUtf8(
                            (java.lang.String) ref);
                    state_ = b;
                    return b;
                } else {
                    return (com.spotify.ffwd.protobuf250.ByteString) ref;
                }
            }

            /**
             * <code>optional string state = 2;</code>
             */
            public Builder setState(
                java.lang.String value
            ) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000002;
                state_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>optional string state = 2;</code>
             */
            public Builder clearState() {
                bitField0_ = (bitField0_ & ~0x00000002);
                state_ = getDefaultInstance().getState();
                onChanged();
                return this;
            }

            /**
             * <code>optional string state = 2;</code>
             */
            public Builder setStateBytes(
                com.spotify.ffwd.protobuf250.ByteString value
            ) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000002;
                state_ = value;
                onChanged();
                return this;
            }

            // optional string service = 3;
            private java.lang.Object service_ = "";

            /**
             * <code>optional string service = 3;</code>
             */
            public boolean hasService() {
                return ((bitField0_ & 0x00000004) == 0x00000004);
            }

            /**
             * <code>optional string service = 3;</code>
             */
            public java.lang.String getService() {
                java.lang.Object ref = service_;
                if (!(ref instanceof java.lang.String)) {
                    java.lang.String s =
                        ((com.spotify.ffwd.protobuf250.ByteString) ref).toStringUtf8();
                    service_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>optional string service = 3;</code>
             */
            public com.spotify.ffwd.protobuf250.ByteString getServiceBytes() {
                java.lang.Object ref = service_;
                if (ref instanceof String) {
                    com.spotify.ffwd.protobuf250.ByteString b =
                        com.spotify.ffwd.protobuf250.ByteString.copyFromUtf8(
                            (java.lang.String) ref);
                    service_ = b;
                    return b;
                } else {
                    return (com.spotify.ffwd.protobuf250.ByteString) ref;
                }
            }

            /**
             * <code>optional string service = 3;</code>
             */
            public Builder setService(
                java.lang.String value
            ) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000004;
                service_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>optional string service = 3;</code>
             */
            public Builder clearService() {
                bitField0_ = (bitField0_ & ~0x00000004);
                service_ = getDefaultInstance().getService();
                onChanged();
                return this;
            }

            /**
             * <code>optional string service = 3;</code>
             */
            public Builder setServiceBytes(
                com.spotify.ffwd.protobuf250.ByteString value
            ) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000004;
                service_ = value;
                onChanged();
                return this;
            }

            // optional string host = 4;
            private java.lang.Object host_ = "";

            /**
             * <code>optional string host = 4;</code>
             */
            public boolean hasHost() {
                return ((bitField0_ & 0x00000008) == 0x00000008);
            }

            /**
             * <code>optional string host = 4;</code>
             */
            public java.lang.String getHost() {
                java.lang.Object ref = host_;
                if (!(ref instanceof java.lang.String)) {
                    java.lang.String s =
                        ((com.spotify.ffwd.protobuf250.ByteString) ref).toStringUtf8();
                    host_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>optional string host = 4;</code>
             */
            public com.spotify.ffwd.protobuf250.ByteString getHostBytes() {
                java.lang.Object ref = host_;
                if (ref instanceof String) {
                    com.spotify.ffwd.protobuf250.ByteString b =
                        com.spotify.ffwd.protobuf250.ByteString.copyFromUtf8(
                            (java.lang.String) ref);
                    host_ = b;
                    return b;
                } else {
                    return (com.spotify.ffwd.protobuf250.ByteString) ref;
                }
            }

            /**
             * <code>optional string host = 4;</code>
             */
            public Builder setHost(
                java.lang.String value
            ) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000008;
                host_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>optional string host = 4;</code>
             */
            public Builder clearHost() {
                bitField0_ = (bitField0_ & ~0x00000008);
                host_ = getDefaultInstance().getHost();
                onChanged();
                return this;
            }

            /**
             * <code>optional string host = 4;</code>
             */
            public Builder setHostBytes(
                com.spotify.ffwd.protobuf250.ByteString value
            ) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000008;
                host_ = value;
                onChanged();
                return this;
            }

            // optional string description = 5;
            private java.lang.Object description_ = "";

            /**
             * <code>optional string description = 5;</code>
             */
            public boolean hasDescription() {
                return ((bitField0_ & 0x00000010) == 0x00000010);
            }

            /**
             * <code>optional string description = 5;</code>
             */
            public java.lang.String getDescription() {
                java.lang.Object ref = description_;
                if (!(ref instanceof java.lang.String)) {
                    java.lang.String s =
                        ((com.spotify.ffwd.protobuf250.ByteString) ref).toStringUtf8();
                    description_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>optional string description = 5;</code>
             */
            public com.spotify.ffwd.protobuf250.ByteString getDescriptionBytes() {
                java.lang.Object ref = description_;
                if (ref instanceof String) {
                    com.spotify.ffwd.protobuf250.ByteString b =
                        com.spotify.ffwd.protobuf250.ByteString.copyFromUtf8(
                            (java.lang.String) ref);
                    description_ = b;
                    return b;
                } else {
                    return (com.spotify.ffwd.protobuf250.ByteString) ref;
                }
            }

            /**
             * <code>optional string description = 5;</code>
             */
            public Builder setDescription(
                java.lang.String value
            ) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000010;
                description_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>optional string description = 5;</code>
             */
            public Builder clearDescription() {
                bitField0_ = (bitField0_ & ~0x00000010);
                description_ = getDefaultInstance().getDescription();
                onChanged();
                return this;
            }

            /**
             * <code>optional string description = 5;</code>
             */
            public Builder setDescriptionBytes(
                com.spotify.ffwd.protobuf250.ByteString value
            ) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000010;
                description_ = value;
                onChanged();
                return this;
            }

            // optional bool once = 6;
            private boolean once_;

            /**
             * <code>optional bool once = 6;</code>
             */
            public boolean hasOnce() {
                return ((bitField0_ & 0x00000020) == 0x00000020);
            }

            /**
             * <code>optional bool once = 6;</code>
             */
            public boolean getOnce() {
                return once_;
            }

            /**
             * <code>optional bool once = 6;</code>
             */
            public Builder setOnce(boolean value) {
                bitField0_ |= 0x00000020;
                once_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>optional bool once = 6;</code>
             */
            public Builder clearOnce() {
                bitField0_ = (bitField0_ & ~0x00000020);
                once_ = false;
                onChanged();
                return this;
            }

            // repeated string tags = 7;
            private com.spotify.ffwd.protobuf250.LazyStringList tags_ =
                com.spotify.ffwd.protobuf250.LazyStringArrayList.EMPTY;

            private void ensureTagsIsMutable() {
                if (!((bitField0_ & 0x00000040) == 0x00000040)) {
                    tags_ = new com.spotify.ffwd.protobuf250.LazyStringArrayList(tags_);
                    bitField0_ |= 0x00000040;
                }
            }

            /**
             * <code>repeated string tags = 7;</code>
             */
            public java.util.List<java.lang.String> getTagsList() {
                return java.util.Collections.unmodifiableList(tags_);
            }

            /**
             * <code>repeated string tags = 7;</code>
             */
            public int getTagsCount() {
                return tags_.size();
            }

            /**
             * <code>repeated string tags = 7;</code>
             */
            public java.lang.String getTags(int index) {
                return tags_.get(index);
            }

            /**
             * <code>repeated string tags = 7;</code>
             */
            public com.spotify.ffwd.protobuf250.ByteString getTagsBytes(int index) {
                return tags_.getByteString(index);
            }

            /**
             * <code>repeated string tags = 7;</code>
             */
            public Builder setTags(
                int index, java.lang.String value
            ) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureTagsIsMutable();
                tags_.set(index, value);
                onChanged();
                return this;
            }

            /**
             * <code>repeated string tags = 7;</code>
             */
            public Builder addTags(
                java.lang.String value
            ) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureTagsIsMutable();
                tags_.add(value);
                onChanged();
                return this;
            }

            /**
             * <code>repeated string tags = 7;</code>
             */
            public Builder addAllTags(
                java.lang.Iterable<java.lang.String> values
            ) {
                ensureTagsIsMutable();
                super.addAll(values, tags_);
                onChanged();
                return this;
            }

            /**
             * <code>repeated string tags = 7;</code>
             */
            public Builder clearTags() {
                tags_ = com.spotify.ffwd.protobuf250.LazyStringArrayList.EMPTY;
                bitField0_ = (bitField0_ & ~0x00000040);
                onChanged();
                return this;
            }

            /**
             * <code>repeated string tags = 7;</code>
             */
            public Builder addTagsBytes(
                com.spotify.ffwd.protobuf250.ByteString value
            ) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureTagsIsMutable();
                tags_.add(value);
                onChanged();
                return this;
            }

            // optional float ttl = 8;
            private float ttl_;

            /**
             * <code>optional float ttl = 8;</code>
             */
            public boolean hasTtl() {
                return ((bitField0_ & 0x00000080) == 0x00000080);
            }

            /**
             * <code>optional float ttl = 8;</code>
             */
            public float getTtl() {
                return ttl_;
            }

            /**
             * <code>optional float ttl = 8;</code>
             */
            public Builder setTtl(float value) {
                bitField0_ |= 0x00000080;
                ttl_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>optional float ttl = 8;</code>
             */
            public Builder clearTtl() {
                bitField0_ = (bitField0_ & ~0x00000080);
                ttl_ = 0F;
                onChanged();
                return this;
            }

            // @@protoc_insertion_point(builder_scope:State)
        }

        static {
            defaultInstance = new State(true);
            defaultInstance.initFields();
        }

        // @@protoc_insertion_point(class_scope:State)
    }

    public interface EventOrBuilder extends com.spotify.ffwd.protobuf250.MessageOrBuilder {

        // optional int64 time = 1;

        /**
         * <code>optional int64 time = 1;</code>
         */
        boolean hasTime();

        /**
         * <code>optional int64 time = 1;</code>
         */
        long getTime();

        // optional string state = 2;

        /**
         * <code>optional string state = 2;</code>
         */
        boolean hasState();

        /**
         * <code>optional string state = 2;</code>
         */
        java.lang.String getState();

        /**
         * <code>optional string state = 2;</code>
         */
        com.spotify.ffwd.protobuf250.ByteString getStateBytes();

        // optional string service = 3;

        /**
         * <code>optional string service = 3;</code>
         */
        boolean hasService();

        /**
         * <code>optional string service = 3;</code>
         */
        java.lang.String getService();

        /**
         * <code>optional string service = 3;</code>
         */
        com.spotify.ffwd.protobuf250.ByteString getServiceBytes();

        // optional string host = 4;

        /**
         * <code>optional string host = 4;</code>
         */
        boolean hasHost();

        /**
         * <code>optional string host = 4;</code>
         */
        java.lang.String getHost();

        /**
         * <code>optional string host = 4;</code>
         */
        com.spotify.ffwd.protobuf250.ByteString getHostBytes();

        // optional string description = 5;

        /**
         * <code>optional string description = 5;</code>
         */
        boolean hasDescription();

        /**
         * <code>optional string description = 5;</code>
         */
        java.lang.String getDescription();

        /**
         * <code>optional string description = 5;</code>
         */
        com.spotify.ffwd.protobuf250.ByteString getDescriptionBytes();

        // repeated string tags = 7;

        /**
         * <code>repeated string tags = 7;</code>
         */
        java.util.List<java.lang.String> getTagsList();

        /**
         * <code>repeated string tags = 7;</code>
         */
        int getTagsCount();

        /**
         * <code>repeated string tags = 7;</code>
         */
        java.lang.String getTags(int index);

        /**
         * <code>repeated string tags = 7;</code>
         */
        com.spotify.ffwd.protobuf250.ByteString getTagsBytes(int index);

        // optional float ttl = 8;

        /**
         * <code>optional float ttl = 8;</code>
         */
        boolean hasTtl();

        /**
         * <code>optional float ttl = 8;</code>
         */
        float getTtl();

        // repeated .Attribute attributes = 9;

        /**
         * <code>repeated .Attribute attributes = 9;</code>
         */
        java.util.List<com.aphyr.riemann.Proto.Attribute> getAttributesList();

        /**
         * <code>repeated .Attribute attributes = 9;</code>
         */
        com.aphyr.riemann.Proto.Attribute getAttributes(int index);

        /**
         * <code>repeated .Attribute attributes = 9;</code>
         */
        int getAttributesCount();

        /**
         * <code>repeated .Attribute attributes = 9;</code>
         */
        java.util.List<? extends com.aphyr.riemann.Proto.AttributeOrBuilder>
        getAttributesOrBuilderList();

        /**
         * <code>repeated .Attribute attributes = 9;</code>
         */
        com.aphyr.riemann.Proto.AttributeOrBuilder getAttributesOrBuilder(
            int index
        );

        // optional sint64 metric_sint64 = 13;

        /**
         * <code>optional sint64 metric_sint64 = 13;</code>
         */
        boolean hasMetricSint64();

        /**
         * <code>optional sint64 metric_sint64 = 13;</code>
         */
        long getMetricSint64();

        // optional double metric_d = 14;

        /**
         * <code>optional double metric_d = 14;</code>
         */
        boolean hasMetricD();

        /**
         * <code>optional double metric_d = 14;</code>
         */
        double getMetricD();

        // optional float metric_f = 15;

        /**
         * <code>optional float metric_f = 15;</code>
         */
        boolean hasMetricF();

        /**
         * <code>optional float metric_f = 15;</code>
         */
        float getMetricF();
    }

    /**
     * Protobuf type {@code Event}
     */
    public static final class Event extends com.spotify.ffwd.protobuf250.GeneratedMessage
        implements EventOrBuilder {
        // Use Event.newBuilder() to construct.
        private Event(com.spotify.ffwd.protobuf250.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.unknownFields = builder.getUnknownFields();
        }

        private Event(boolean noInit) {
            this.unknownFields = com.spotify.ffwd.protobuf250.UnknownFieldSet.getDefaultInstance();
        }

        private static final Event defaultInstance;

        public static Event getDefaultInstance() {
            return defaultInstance;
        }

        public Event getDefaultInstanceForType() {
            return defaultInstance;
        }

        private final com.spotify.ffwd.protobuf250.UnknownFieldSet unknownFields;

        @java.lang.Override
        public final com.spotify.ffwd.protobuf250.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private Event(
            com.spotify.ffwd.protobuf250.CodedInputStream input,
            com.spotify.ffwd.protobuf250.ExtensionRegistryLite extensionRegistry
        ) throws com.spotify.ffwd.protobuf250.InvalidProtocolBufferException {
            initFields();
            int mutable_bitField0_ = 0;
            com.spotify.ffwd.protobuf250.UnknownFieldSet.Builder unknownFields =
                com.spotify.ffwd.protobuf250.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 8: {
                            bitField0_ |= 0x00000001;
                            time_ = input.readInt64();
                            break;
                        }
                        case 18: {
                            bitField0_ |= 0x00000002;
                            state_ = input.readBytes();
                            break;
                        }
                        case 26: {
                            bitField0_ |= 0x00000004;
                            service_ = input.readBytes();
                            break;
                        }
                        case 34: {
                            bitField0_ |= 0x00000008;
                            host_ = input.readBytes();
                            break;
                        }
                        case 42: {
                            bitField0_ |= 0x00000010;
                            description_ = input.readBytes();
                            break;
                        }
                        case 58: {
                            if (!((mutable_bitField0_ & 0x00000020) == 0x00000020)) {
                                tags_ = new com.spotify.ffwd.protobuf250.LazyStringArrayList();
                                mutable_bitField0_ |= 0x00000020;
                            }
                            tags_.add(input.readBytes());
                            break;
                        }
                        case 69: {
                            bitField0_ |= 0x00000020;
                            ttl_ = input.readFloat();
                            break;
                        }
                        case 74: {
                            if (!((mutable_bitField0_ & 0x00000080) == 0x00000080)) {
                                attributes_ =
                                    new java.util.ArrayList<com.aphyr.riemann.Proto.Attribute>();
                                mutable_bitField0_ |= 0x00000080;
                            }
                            attributes_.add(
                                input.readMessage(com.aphyr.riemann.Proto.Attribute.PARSER,
                                    extensionRegistry));
                            break;
                        }
                        case 104: {
                            bitField0_ |= 0x00000040;
                            metricSint64_ = input.readSInt64();
                            break;
                        }
                        case 113: {
                            bitField0_ |= 0x00000080;
                            metricD_ = input.readDouble();
                            break;
                        }
                        case 125: {
                            bitField0_ |= 0x00000100;
                            metricF_ = input.readFloat();
                            break;
                        }
                    }
                }
            } catch (com.spotify.ffwd.protobuf250.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.spotify.ffwd.protobuf250.InvalidProtocolBufferException(
                    e.getMessage()).setUnfinishedMessage(this);
            } finally {
                if (((mutable_bitField0_ & 0x00000020) == 0x00000020)) {
                    tags_ = new com.spotify.ffwd.protobuf250.UnmodifiableLazyStringList(tags_);
                }
                if (((mutable_bitField0_ & 0x00000080) == 0x00000080)) {
                    attributes_ = java.util.Collections.unmodifiableList(attributes_);
                }
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final com.spotify.ffwd.protobuf250.Descriptors.Descriptor getDescriptor() {
            return com.aphyr.riemann.Proto.internal_static_Event_descriptor;
        }

        protected com.spotify.ffwd.protobuf250.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.aphyr.riemann.Proto.internal_static_Event_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.aphyr.riemann.Proto.Event.class, com.aphyr.riemann.Proto.Event.Builder.class);
        }

        public static com.spotify.ffwd.protobuf250.Parser<Event> PARSER =
            new com.spotify.ffwd.protobuf250.AbstractParser<Event>() {
                public Event parsePartialFrom(
                    com.spotify.ffwd.protobuf250.CodedInputStream input,
                    com.spotify.ffwd.protobuf250.ExtensionRegistryLite extensionRegistry
                ) throws com.spotify.ffwd.protobuf250.InvalidProtocolBufferException {
                    return new Event(input, extensionRegistry);
                }
            };

        @java.lang.Override
        public com.spotify.ffwd.protobuf250.Parser<Event> getParserForType() {
            return PARSER;
        }

        private int bitField0_;
        // optional int64 time = 1;
        public static final int TIME_FIELD_NUMBER = 1;
        private long time_;

        /**
         * <code>optional int64 time = 1;</code>
         */
        public boolean hasTime() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }

        /**
         * <code>optional int64 time = 1;</code>
         */
        public long getTime() {
            return time_;
        }

        // optional string state = 2;
        public static final int STATE_FIELD_NUMBER = 2;
        private java.lang.Object state_;

        /**
         * <code>optional string state = 2;</code>
         */
        public boolean hasState() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }

        /**
         * <code>optional string state = 2;</code>
         */
        public java.lang.String getState() {
            java.lang.Object ref = state_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.spotify.ffwd.protobuf250.ByteString bs =
                    (com.spotify.ffwd.protobuf250.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    state_ = s;
                }
                return s;
            }
        }

        /**
         * <code>optional string state = 2;</code>
         */
        public com.spotify.ffwd.protobuf250.ByteString getStateBytes() {
            java.lang.Object ref = state_;
            if (ref instanceof java.lang.String) {
                com.spotify.ffwd.protobuf250.ByteString b =
                    com.spotify.ffwd.protobuf250.ByteString.copyFromUtf8((java.lang.String) ref);
                state_ = b;
                return b;
            } else {
                return (com.spotify.ffwd.protobuf250.ByteString) ref;
            }
        }

        // optional string service = 3;
        public static final int SERVICE_FIELD_NUMBER = 3;
        private java.lang.Object service_;

        /**
         * <code>optional string service = 3;</code>
         */
        public boolean hasService() {
            return ((bitField0_ & 0x00000004) == 0x00000004);
        }

        /**
         * <code>optional string service = 3;</code>
         */
        public java.lang.String getService() {
            java.lang.Object ref = service_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.spotify.ffwd.protobuf250.ByteString bs =
                    (com.spotify.ffwd.protobuf250.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    service_ = s;
                }
                return s;
            }
        }

        /**
         * <code>optional string service = 3;</code>
         */
        public com.spotify.ffwd.protobuf250.ByteString getServiceBytes() {
            java.lang.Object ref = service_;
            if (ref instanceof java.lang.String) {
                com.spotify.ffwd.protobuf250.ByteString b =
                    com.spotify.ffwd.protobuf250.ByteString.copyFromUtf8((java.lang.String) ref);
                service_ = b;
                return b;
            } else {
                return (com.spotify.ffwd.protobuf250.ByteString) ref;
            }
        }

        // optional string host = 4;
        public static final int HOST_FIELD_NUMBER = 4;
        private java.lang.Object host_;

        /**
         * <code>optional string host = 4;</code>
         */
        public boolean hasHost() {
            return ((bitField0_ & 0x00000008) == 0x00000008);
        }

        /**
         * <code>optional string host = 4;</code>
         */
        public java.lang.String getHost() {
            java.lang.Object ref = host_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.spotify.ffwd.protobuf250.ByteString bs =
                    (com.spotify.ffwd.protobuf250.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    host_ = s;
                }
                return s;
            }
        }

        /**
         * <code>optional string host = 4;</code>
         */
        public com.spotify.ffwd.protobuf250.ByteString getHostBytes() {
            java.lang.Object ref = host_;
            if (ref instanceof java.lang.String) {
                com.spotify.ffwd.protobuf250.ByteString b =
                    com.spotify.ffwd.protobuf250.ByteString.copyFromUtf8((java.lang.String) ref);
                host_ = b;
                return b;
            } else {
                return (com.spotify.ffwd.protobuf250.ByteString) ref;
            }
        }

        // optional string description = 5;
        public static final int DESCRIPTION_FIELD_NUMBER = 5;
        private java.lang.Object description_;

        /**
         * <code>optional string description = 5;</code>
         */
        public boolean hasDescription() {
            return ((bitField0_ & 0x00000010) == 0x00000010);
        }

        /**
         * <code>optional string description = 5;</code>
         */
        public java.lang.String getDescription() {
            java.lang.Object ref = description_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.spotify.ffwd.protobuf250.ByteString bs =
                    (com.spotify.ffwd.protobuf250.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    description_ = s;
                }
                return s;
            }
        }

        /**
         * <code>optional string description = 5;</code>
         */
        public com.spotify.ffwd.protobuf250.ByteString getDescriptionBytes() {
            java.lang.Object ref = description_;
            if (ref instanceof java.lang.String) {
                com.spotify.ffwd.protobuf250.ByteString b =
                    com.spotify.ffwd.protobuf250.ByteString.copyFromUtf8((java.lang.String) ref);
                description_ = b;
                return b;
            } else {
                return (com.spotify.ffwd.protobuf250.ByteString) ref;
            }
        }

        // repeated string tags = 7;
        public static final int TAGS_FIELD_NUMBER = 7;
        private com.spotify.ffwd.protobuf250.LazyStringList tags_;

        /**
         * <code>repeated string tags = 7;</code>
         */
        public java.util.List<java.lang.String> getTagsList() {
            return tags_;
        }

        /**
         * <code>repeated string tags = 7;</code>
         */
        public int getTagsCount() {
            return tags_.size();
        }

        /**
         * <code>repeated string tags = 7;</code>
         */
        public java.lang.String getTags(int index) {
            return tags_.get(index);
        }

        /**
         * <code>repeated string tags = 7;</code>
         */
        public com.spotify.ffwd.protobuf250.ByteString getTagsBytes(int index) {
            return tags_.getByteString(index);
        }

        // optional float ttl = 8;
        public static final int TTL_FIELD_NUMBER = 8;
        private float ttl_;

        /**
         * <code>optional float ttl = 8;</code>
         */
        public boolean hasTtl() {
            return ((bitField0_ & 0x00000020) == 0x00000020);
        }

        /**
         * <code>optional float ttl = 8;</code>
         */
        public float getTtl() {
            return ttl_;
        }

        // repeated .Attribute attributes = 9;
        public static final int ATTRIBUTES_FIELD_NUMBER = 9;
        private java.util.List<com.aphyr.riemann.Proto.Attribute> attributes_;

        /**
         * <code>repeated .Attribute attributes = 9;</code>
         */
        public java.util.List<com.aphyr.riemann.Proto.Attribute> getAttributesList() {
            return attributes_;
        }

        /**
         * <code>repeated .Attribute attributes = 9;</code>
         */
        public java.util.List<? extends com.aphyr.riemann.Proto.AttributeOrBuilder>
        getAttributesOrBuilderList() {
            return attributes_;
        }

        /**
         * <code>repeated .Attribute attributes = 9;</code>
         */
        public int getAttributesCount() {
            return attributes_.size();
        }

        /**
         * <code>repeated .Attribute attributes = 9;</code>
         */
        public com.aphyr.riemann.Proto.Attribute getAttributes(int index) {
            return attributes_.get(index);
        }

        /**
         * <code>repeated .Attribute attributes = 9;</code>
         */
        public com.aphyr.riemann.Proto.AttributeOrBuilder getAttributesOrBuilder(
            int index
        ) {
            return attributes_.get(index);
        }

        // optional sint64 metric_sint64 = 13;
        public static final int METRIC_SINT64_FIELD_NUMBER = 13;
        private long metricSint64_;

        /**
         * <code>optional sint64 metric_sint64 = 13;</code>
         */
        public boolean hasMetricSint64() {
            return ((bitField0_ & 0x00000040) == 0x00000040);
        }

        /**
         * <code>optional sint64 metric_sint64 = 13;</code>
         */
        public long getMetricSint64() {
            return metricSint64_;
        }

        // optional double metric_d = 14;
        public static final int METRIC_D_FIELD_NUMBER = 14;
        private double metricD_;

        /**
         * <code>optional double metric_d = 14;</code>
         */
        public boolean hasMetricD() {
            return ((bitField0_ & 0x00000080) == 0x00000080);
        }

        /**
         * <code>optional double metric_d = 14;</code>
         */
        public double getMetricD() {
            return metricD_;
        }

        // optional float metric_f = 15;
        public static final int METRIC_F_FIELD_NUMBER = 15;
        private float metricF_;

        /**
         * <code>optional float metric_f = 15;</code>
         */
        public boolean hasMetricF() {
            return ((bitField0_ & 0x00000100) == 0x00000100);
        }

        /**
         * <code>optional float metric_f = 15;</code>
         */
        public float getMetricF() {
            return metricF_;
        }

        private void initFields() {
            time_ = 0L;
            state_ = "";
            service_ = "";
            host_ = "";
            description_ = "";
            tags_ = com.spotify.ffwd.protobuf250.LazyStringArrayList.EMPTY;
            ttl_ = 0F;
            attributes_ = java.util.Collections.emptyList();
            metricSint64_ = 0L;
            metricD_ = 0D;
            metricF_ = 0F;
        }

        private byte memoizedIsInitialized = -1;

        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized != -1) {
                return isInitialized == 1;
            }

            for (int i = 0; i < getAttributesCount(); i++) {
                if (!getAttributes(i).isInitialized()) {
                    memoizedIsInitialized = 0;
                    return false;
                }
            }
            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.spotify.ffwd.protobuf250.CodedOutputStream output)
            throws java.io.IOException {
            getSerializedSize();
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeInt64(1, time_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeBytes(2, getStateBytes());
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                output.writeBytes(3, getServiceBytes());
            }
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                output.writeBytes(4, getHostBytes());
            }
            if (((bitField0_ & 0x00000010) == 0x00000010)) {
                output.writeBytes(5, getDescriptionBytes());
            }
            for (int i = 0; i < tags_.size(); i++) {
                output.writeBytes(7, tags_.getByteString(i));
            }
            if (((bitField0_ & 0x00000020) == 0x00000020)) {
                output.writeFloat(8, ttl_);
            }
            for (int i = 0; i < attributes_.size(); i++) {
                output.writeMessage(9, attributes_.get(i));
            }
            if (((bitField0_ & 0x00000040) == 0x00000040)) {
                output.writeSInt64(13, metricSint64_);
            }
            if (((bitField0_ & 0x00000080) == 0x00000080)) {
                output.writeDouble(14, metricD_);
            }
            if (((bitField0_ & 0x00000100) == 0x00000100)) {
                output.writeFloat(15, metricF_);
            }
            getUnknownFields().writeTo(output);
        }

        private int memoizedSerializedSize = -1;

        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1) {
                return size;
            }

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.spotify.ffwd.protobuf250.CodedOutputStream.computeInt64Size(1, time_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.spotify.ffwd.protobuf250.CodedOutputStream.computeBytesSize(2,
                    getStateBytes());
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                size += com.spotify.ffwd.protobuf250.CodedOutputStream.computeBytesSize(3,
                    getServiceBytes());
            }
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                size += com.spotify.ffwd.protobuf250.CodedOutputStream.computeBytesSize(4,
                    getHostBytes());
            }
            if (((bitField0_ & 0x00000010) == 0x00000010)) {
                size += com.spotify.ffwd.protobuf250.CodedOutputStream.computeBytesSize(5,
                    getDescriptionBytes());
            }
            {
                int dataSize = 0;
                for (int i = 0; i < tags_.size(); i++) {
                    dataSize +=
                        com.spotify.ffwd.protobuf250.CodedOutputStream.computeBytesSizeNoTag(
                            tags_.getByteString(i));
                }
                size += dataSize;
                size += 1 * getTagsList().size();
            }
            if (((bitField0_ & 0x00000020) == 0x00000020)) {
                size += com.spotify.ffwd.protobuf250.CodedOutputStream.computeFloatSize(8, ttl_);
            }
            for (int i = 0; i < attributes_.size(); i++) {
                size += com.spotify.ffwd.protobuf250.CodedOutputStream.computeMessageSize(9,
                    attributes_.get(i));
            }
            if (((bitField0_ & 0x00000040) == 0x00000040)) {
                size += com.spotify.ffwd.protobuf250.CodedOutputStream.computeSInt64Size(13,
                    metricSint64_);
            }
            if (((bitField0_ & 0x00000080) == 0x00000080)) {
                size +=
                    com.spotify.ffwd.protobuf250.CodedOutputStream.computeDoubleSize(14, metricD_);
            }
            if (((bitField0_ & 0x00000100) == 0x00000100)) {
                size +=
                    com.spotify.ffwd.protobuf250.CodedOutputStream.computeFloatSize(15, metricF_);
            }
            size += getUnknownFields().getSerializedSize();
            memoizedSerializedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;

        @java.lang.Override
        protected java.lang.Object writeReplace() throws java.io.ObjectStreamException {
            return super.writeReplace();
        }

        public static com.aphyr.riemann.Proto.Event parseFrom(
            com.spotify.ffwd.protobuf250.ByteString data
        ) throws com.spotify.ffwd.protobuf250.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static com.aphyr.riemann.Proto.Event parseFrom(
            com.spotify.ffwd.protobuf250.ByteString data,
            com.spotify.ffwd.protobuf250.ExtensionRegistryLite extensionRegistry
        ) throws com.spotify.ffwd.protobuf250.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.aphyr.riemann.Proto.Event parseFrom(byte[] data)
            throws com.spotify.ffwd.protobuf250.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static com.aphyr.riemann.Proto.Event parseFrom(
            byte[] data, com.spotify.ffwd.protobuf250.ExtensionRegistryLite extensionRegistry
        ) throws com.spotify.ffwd.protobuf250.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.aphyr.riemann.Proto.Event parseFrom(java.io.InputStream input)
            throws java.io.IOException {
            return PARSER.parseFrom(input);
        }

        public static com.aphyr.riemann.Proto.Event parseFrom(
            java.io.InputStream input,
            com.spotify.ffwd.protobuf250.ExtensionRegistryLite extensionRegistry
        ) throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }

        public static com.aphyr.riemann.Proto.Event parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input);
        }

        public static com.aphyr.riemann.Proto.Event parseDelimitedFrom(
            java.io.InputStream input,
            com.spotify.ffwd.protobuf250.ExtensionRegistryLite extensionRegistry
        ) throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static com.aphyr.riemann.Proto.Event parseFrom(
            com.spotify.ffwd.protobuf250.CodedInputStream input
        ) throws java.io.IOException {
            return PARSER.parseFrom(input);
        }

        public static com.aphyr.riemann.Proto.Event parseFrom(
            com.spotify.ffwd.protobuf250.CodedInputStream input,
            com.spotify.ffwd.protobuf250.ExtensionRegistryLite extensionRegistry
        ) throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(com.aphyr.riemann.Proto.Event prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
            com.spotify.ffwd.protobuf250.GeneratedMessage.BuilderParent parent
        ) {
            Builder builder = new Builder(parent);
            return builder;
        }

        /**
         * Protobuf type {@code Event}
         */
        public static final class Builder
            extends com.spotify.ffwd.protobuf250.GeneratedMessage.Builder<Builder>
            implements com.aphyr.riemann.Proto.EventOrBuilder {
            public static final com.spotify.ffwd.protobuf250.Descriptors.Descriptor getDescriptor
                () {
                return com.aphyr.riemann.Proto.internal_static_Event_descriptor;
            }

            protected com.spotify.ffwd.protobuf250.GeneratedMessage.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return com.aphyr.riemann.Proto.internal_static_Event_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                    com.aphyr.riemann.Proto.Event.class,
                    com.aphyr.riemann.Proto.Event.Builder.class);
            }

            // Construct using com.aphyr.riemann.Proto.Event.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                com.spotify.ffwd.protobuf250.GeneratedMessage.BuilderParent parent
            ) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.spotify.ffwd.protobuf250.GeneratedMessage.alwaysUseFieldBuilders) {
                    getAttributesFieldBuilder();
                }
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                time_ = 0L;
                bitField0_ = (bitField0_ & ~0x00000001);
                state_ = "";
                bitField0_ = (bitField0_ & ~0x00000002);
                service_ = "";
                bitField0_ = (bitField0_ & ~0x00000004);
                host_ = "";
                bitField0_ = (bitField0_ & ~0x00000008);
                description_ = "";
                bitField0_ = (bitField0_ & ~0x00000010);
                tags_ = com.spotify.ffwd.protobuf250.LazyStringArrayList.EMPTY;
                bitField0_ = (bitField0_ & ~0x00000020);
                ttl_ = 0F;
                bitField0_ = (bitField0_ & ~0x00000040);
                if (attributesBuilder_ == null) {
                    attributes_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000080);
                } else {
                    attributesBuilder_.clear();
                }
                metricSint64_ = 0L;
                bitField0_ = (bitField0_ & ~0x00000100);
                metricD_ = 0D;
                bitField0_ = (bitField0_ & ~0x00000200);
                metricF_ = 0F;
                bitField0_ = (bitField0_ & ~0x00000400);
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public com.spotify.ffwd.protobuf250.Descriptors.Descriptor getDescriptorForType() {
                return com.aphyr.riemann.Proto.internal_static_Event_descriptor;
            }

            public com.aphyr.riemann.Proto.Event getDefaultInstanceForType() {
                return com.aphyr.riemann.Proto.Event.getDefaultInstance();
            }

            public com.aphyr.riemann.Proto.Event build() {
                com.aphyr.riemann.Proto.Event result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public com.aphyr.riemann.Proto.Event buildPartial() {
                com.aphyr.riemann.Proto.Event result = new com.aphyr.riemann.Proto.Event(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.time_ = time_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.state_ = state_;
                if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                    to_bitField0_ |= 0x00000004;
                }
                result.service_ = service_;
                if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
                    to_bitField0_ |= 0x00000008;
                }
                result.host_ = host_;
                if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
                    to_bitField0_ |= 0x00000010;
                }
                result.description_ = description_;
                if (((bitField0_ & 0x00000020) == 0x00000020)) {
                    tags_ = new com.spotify.ffwd.protobuf250.UnmodifiableLazyStringList(tags_);
                    bitField0_ = (bitField0_ & ~0x00000020);
                }
                result.tags_ = tags_;
                if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
                    to_bitField0_ |= 0x00000020;
                }
                result.ttl_ = ttl_;
                if (attributesBuilder_ == null) {
                    if (((bitField0_ & 0x00000080) == 0x00000080)) {
                        attributes_ = java.util.Collections.unmodifiableList(attributes_);
                        bitField0_ = (bitField0_ & ~0x00000080);
                    }
                    result.attributes_ = attributes_;
                } else {
                    result.attributes_ = attributesBuilder_.build();
                }
                if (((from_bitField0_ & 0x00000100) == 0x00000100)) {
                    to_bitField0_ |= 0x00000040;
                }
                result.metricSint64_ = metricSint64_;
                if (((from_bitField0_ & 0x00000200) == 0x00000200)) {
                    to_bitField0_ |= 0x00000080;
                }
                result.metricD_ = metricD_;
                if (((from_bitField0_ & 0x00000400) == 0x00000400)) {
                    to_bitField0_ |= 0x00000100;
                }
                result.metricF_ = metricF_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(com.spotify.ffwd.protobuf250.Message other) {
                if (other instanceof com.aphyr.riemann.Proto.Event) {
                    return mergeFrom((com.aphyr.riemann.Proto.Event) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.aphyr.riemann.Proto.Event other) {
                if (other == com.aphyr.riemann.Proto.Event.getDefaultInstance()) {
                    return this;
                }
                if (other.hasTime()) {
                    setTime(other.getTime());
                }
                if (other.hasState()) {
                    bitField0_ |= 0x00000002;
                    state_ = other.state_;
                    onChanged();
                }
                if (other.hasService()) {
                    bitField0_ |= 0x00000004;
                    service_ = other.service_;
                    onChanged();
                }
                if (other.hasHost()) {
                    bitField0_ |= 0x00000008;
                    host_ = other.host_;
                    onChanged();
                }
                if (other.hasDescription()) {
                    bitField0_ |= 0x00000010;
                    description_ = other.description_;
                    onChanged();
                }
                if (!other.tags_.isEmpty()) {
                    if (tags_.isEmpty()) {
                        tags_ = other.tags_;
                        bitField0_ = (bitField0_ & ~0x00000020);
                    } else {
                        ensureTagsIsMutable();
                        tags_.addAll(other.tags_);
                    }
                    onChanged();
                }
                if (other.hasTtl()) {
                    setTtl(other.getTtl());
                }
                if (attributesBuilder_ == null) {
                    if (!other.attributes_.isEmpty()) {
                        if (attributes_.isEmpty()) {
                            attributes_ = other.attributes_;
                            bitField0_ = (bitField0_ & ~0x00000080);
                        } else {
                            ensureAttributesIsMutable();
                            attributes_.addAll(other.attributes_);
                        }
                        onChanged();
                    }
                } else {
                    if (!other.attributes_.isEmpty()) {
                        if (attributesBuilder_.isEmpty()) {
                            attributesBuilder_.dispose();
                            attributesBuilder_ = null;
                            attributes_ = other.attributes_;
                            bitField0_ = (bitField0_ & ~0x00000080);
                            attributesBuilder_ =
                                com.spotify.ffwd.protobuf250.GeneratedMessage.alwaysUseFieldBuilders
                                    ? getAttributesFieldBuilder() : null;
                        } else {
                            attributesBuilder_.addAllMessages(other.attributes_);
                        }
                    }
                }
                if (other.hasMetricSint64()) {
                    setMetricSint64(other.getMetricSint64());
                }
                if (other.hasMetricD()) {
                    setMetricD(other.getMetricD());
                }
                if (other.hasMetricF()) {
                    setMetricF(other.getMetricF());
                }
                this.mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                for (int i = 0; i < getAttributesCount(); i++) {
                    if (!getAttributes(i).isInitialized()) {

                        return false;
                    }
                }
                return true;
            }

            public Builder mergeFrom(
                com.spotify.ffwd.protobuf250.CodedInputStream input,
                com.spotify.ffwd.protobuf250.ExtensionRegistryLite extensionRegistry
            ) throws java.io.IOException {
                com.aphyr.riemann.Proto.Event parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.spotify.ffwd.protobuf250.InvalidProtocolBufferException e) {
                    parsedMessage = (com.aphyr.riemann.Proto.Event) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int bitField0_;

            // optional int64 time = 1;
            private long time_;

            /**
             * <code>optional int64 time = 1;</code>
             */
            public boolean hasTime() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }

            /**
             * <code>optional int64 time = 1;</code>
             */
            public long getTime() {
                return time_;
            }

            /**
             * <code>optional int64 time = 1;</code>
             */
            public Builder setTime(long value) {
                bitField0_ |= 0x00000001;
                time_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>optional int64 time = 1;</code>
             */
            public Builder clearTime() {
                bitField0_ = (bitField0_ & ~0x00000001);
                time_ = 0L;
                onChanged();
                return this;
            }

            // optional string state = 2;
            private java.lang.Object state_ = "";

            /**
             * <code>optional string state = 2;</code>
             */
            public boolean hasState() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }

            /**
             * <code>optional string state = 2;</code>
             */
            public java.lang.String getState() {
                java.lang.Object ref = state_;
                if (!(ref instanceof java.lang.String)) {
                    java.lang.String s =
                        ((com.spotify.ffwd.protobuf250.ByteString) ref).toStringUtf8();
                    state_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>optional string state = 2;</code>
             */
            public com.spotify.ffwd.protobuf250.ByteString getStateBytes() {
                java.lang.Object ref = state_;
                if (ref instanceof String) {
                    com.spotify.ffwd.protobuf250.ByteString b =
                        com.spotify.ffwd.protobuf250.ByteString.copyFromUtf8(
                            (java.lang.String) ref);
                    state_ = b;
                    return b;
                } else {
                    return (com.spotify.ffwd.protobuf250.ByteString) ref;
                }
            }

            /**
             * <code>optional string state = 2;</code>
             */
            public Builder setState(
                java.lang.String value
            ) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000002;
                state_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>optional string state = 2;</code>
             */
            public Builder clearState() {
                bitField0_ = (bitField0_ & ~0x00000002);
                state_ = getDefaultInstance().getState();
                onChanged();
                return this;
            }

            /**
             * <code>optional string state = 2;</code>
             */
            public Builder setStateBytes(
                com.spotify.ffwd.protobuf250.ByteString value
            ) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000002;
                state_ = value;
                onChanged();
                return this;
            }

            // optional string service = 3;
            private java.lang.Object service_ = "";

            /**
             * <code>optional string service = 3;</code>
             */
            public boolean hasService() {
                return ((bitField0_ & 0x00000004) == 0x00000004);
            }

            /**
             * <code>optional string service = 3;</code>
             */
            public java.lang.String getService() {
                java.lang.Object ref = service_;
                if (!(ref instanceof java.lang.String)) {
                    java.lang.String s =
                        ((com.spotify.ffwd.protobuf250.ByteString) ref).toStringUtf8();
                    service_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>optional string service = 3;</code>
             */
            public com.spotify.ffwd.protobuf250.ByteString getServiceBytes() {
                java.lang.Object ref = service_;
                if (ref instanceof String) {
                    com.spotify.ffwd.protobuf250.ByteString b =
                        com.spotify.ffwd.protobuf250.ByteString.copyFromUtf8(
                            (java.lang.String) ref);
                    service_ = b;
                    return b;
                } else {
                    return (com.spotify.ffwd.protobuf250.ByteString) ref;
                }
            }

            /**
             * <code>optional string service = 3;</code>
             */
            public Builder setService(
                java.lang.String value
            ) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000004;
                service_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>optional string service = 3;</code>
             */
            public Builder clearService() {
                bitField0_ = (bitField0_ & ~0x00000004);
                service_ = getDefaultInstance().getService();
                onChanged();
                return this;
            }

            /**
             * <code>optional string service = 3;</code>
             */
            public Builder setServiceBytes(
                com.spotify.ffwd.protobuf250.ByteString value
            ) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000004;
                service_ = value;
                onChanged();
                return this;
            }

            // optional string host = 4;
            private java.lang.Object host_ = "";

            /**
             * <code>optional string host = 4;</code>
             */
            public boolean hasHost() {
                return ((bitField0_ & 0x00000008) == 0x00000008);
            }

            /**
             * <code>optional string host = 4;</code>
             */
            public java.lang.String getHost() {
                java.lang.Object ref = host_;
                if (!(ref instanceof java.lang.String)) {
                    java.lang.String s =
                        ((com.spotify.ffwd.protobuf250.ByteString) ref).toStringUtf8();
                    host_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>optional string host = 4;</code>
             */
            public com.spotify.ffwd.protobuf250.ByteString getHostBytes() {
                java.lang.Object ref = host_;
                if (ref instanceof String) {
                    com.spotify.ffwd.protobuf250.ByteString b =
                        com.spotify.ffwd.protobuf250.ByteString.copyFromUtf8(
                            (java.lang.String) ref);
                    host_ = b;
                    return b;
                } else {
                    return (com.spotify.ffwd.protobuf250.ByteString) ref;
                }
            }

            /**
             * <code>optional string host = 4;</code>
             */
            public Builder setHost(
                java.lang.String value
            ) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000008;
                host_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>optional string host = 4;</code>
             */
            public Builder clearHost() {
                bitField0_ = (bitField0_ & ~0x00000008);
                host_ = getDefaultInstance().getHost();
                onChanged();
                return this;
            }

            /**
             * <code>optional string host = 4;</code>
             */
            public Builder setHostBytes(
                com.spotify.ffwd.protobuf250.ByteString value
            ) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000008;
                host_ = value;
                onChanged();
                return this;
            }

            // optional string description = 5;
            private java.lang.Object description_ = "";

            /**
             * <code>optional string description = 5;</code>
             */
            public boolean hasDescription() {
                return ((bitField0_ & 0x00000010) == 0x00000010);
            }

            /**
             * <code>optional string description = 5;</code>
             */
            public java.lang.String getDescription() {
                java.lang.Object ref = description_;
                if (!(ref instanceof java.lang.String)) {
                    java.lang.String s =
                        ((com.spotify.ffwd.protobuf250.ByteString) ref).toStringUtf8();
                    description_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>optional string description = 5;</code>
             */
            public com.spotify.ffwd.protobuf250.ByteString getDescriptionBytes() {
                java.lang.Object ref = description_;
                if (ref instanceof String) {
                    com.spotify.ffwd.protobuf250.ByteString b =
                        com.spotify.ffwd.protobuf250.ByteString.copyFromUtf8(
                            (java.lang.String) ref);
                    description_ = b;
                    return b;
                } else {
                    return (com.spotify.ffwd.protobuf250.ByteString) ref;
                }
            }

            /**
             * <code>optional string description = 5;</code>
             */
            public Builder setDescription(
                java.lang.String value
            ) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000010;
                description_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>optional string description = 5;</code>
             */
            public Builder clearDescription() {
                bitField0_ = (bitField0_ & ~0x00000010);
                description_ = getDefaultInstance().getDescription();
                onChanged();
                return this;
            }

            /**
             * <code>optional string description = 5;</code>
             */
            public Builder setDescriptionBytes(
                com.spotify.ffwd.protobuf250.ByteString value
            ) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000010;
                description_ = value;
                onChanged();
                return this;
            }

            // repeated string tags = 7;
            private com.spotify.ffwd.protobuf250.LazyStringList tags_ =
                com.spotify.ffwd.protobuf250.LazyStringArrayList.EMPTY;

            private void ensureTagsIsMutable() {
                if (!((bitField0_ & 0x00000020) == 0x00000020)) {
                    tags_ = new com.spotify.ffwd.protobuf250.LazyStringArrayList(tags_);
                    bitField0_ |= 0x00000020;
                }
            }

            /**
             * <code>repeated string tags = 7;</code>
             */
            public java.util.List<java.lang.String> getTagsList() {
                return java.util.Collections.unmodifiableList(tags_);
            }

            /**
             * <code>repeated string tags = 7;</code>
             */
            public int getTagsCount() {
                return tags_.size();
            }

            /**
             * <code>repeated string tags = 7;</code>
             */
            public java.lang.String getTags(int index) {
                return tags_.get(index);
            }

            /**
             * <code>repeated string tags = 7;</code>
             */
            public com.spotify.ffwd.protobuf250.ByteString getTagsBytes(int index) {
                return tags_.getByteString(index);
            }

            /**
             * <code>repeated string tags = 7;</code>
             */
            public Builder setTags(
                int index, java.lang.String value
            ) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureTagsIsMutable();
                tags_.set(index, value);
                onChanged();
                return this;
            }

            /**
             * <code>repeated string tags = 7;</code>
             */
            public Builder addTags(
                java.lang.String value
            ) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureTagsIsMutable();
                tags_.add(value);
                onChanged();
                return this;
            }

            /**
             * <code>repeated string tags = 7;</code>
             */
            public Builder addAllTags(
                java.lang.Iterable<java.lang.String> values
            ) {
                ensureTagsIsMutable();
                super.addAll(values, tags_);
                onChanged();
                return this;
            }

            /**
             * <code>repeated string tags = 7;</code>
             */
            public Builder clearTags() {
                tags_ = com.spotify.ffwd.protobuf250.LazyStringArrayList.EMPTY;
                bitField0_ = (bitField0_ & ~0x00000020);
                onChanged();
                return this;
            }

            /**
             * <code>repeated string tags = 7;</code>
             */
            public Builder addTagsBytes(
                com.spotify.ffwd.protobuf250.ByteString value
            ) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureTagsIsMutable();
                tags_.add(value);
                onChanged();
                return this;
            }

            // optional float ttl = 8;
            private float ttl_;

            /**
             * <code>optional float ttl = 8;</code>
             */
            public boolean hasTtl() {
                return ((bitField0_ & 0x00000040) == 0x00000040);
            }

            /**
             * <code>optional float ttl = 8;</code>
             */
            public float getTtl() {
                return ttl_;
            }

            /**
             * <code>optional float ttl = 8;</code>
             */
            public Builder setTtl(float value) {
                bitField0_ |= 0x00000040;
                ttl_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>optional float ttl = 8;</code>
             */
            public Builder clearTtl() {
                bitField0_ = (bitField0_ & ~0x00000040);
                ttl_ = 0F;
                onChanged();
                return this;
            }

            // repeated .Attribute attributes = 9;
            private java.util.List<com.aphyr.riemann.Proto.Attribute> attributes_ =
                java.util.Collections.emptyList();

            private void ensureAttributesIsMutable() {
                if (!((bitField0_ & 0x00000080) == 0x00000080)) {
                    attributes_ =
                        new java.util.ArrayList<com.aphyr.riemann.Proto.Attribute>(attributes_);
                    bitField0_ |= 0x00000080;
                }
            }

            private com.spotify.ffwd.protobuf250.RepeatedFieldBuilder<com.aphyr.riemann.Proto
            .Attribute, com.aphyr.riemann.Proto.Attribute.Builder, com.aphyr.riemann.Proto
            .AttributeOrBuilder>
                attributesBuilder_;

            /**
             * <code>repeated .Attribute attributes = 9;</code>
             */
            public java.util.List<com.aphyr.riemann.Proto.Attribute> getAttributesList() {
                if (attributesBuilder_ == null) {
                    return java.util.Collections.unmodifiableList(attributes_);
                } else {
                    return attributesBuilder_.getMessageList();
                }
            }

            /**
             * <code>repeated .Attribute attributes = 9;</code>
             */
            public int getAttributesCount() {
                if (attributesBuilder_ == null) {
                    return attributes_.size();
                } else {
                    return attributesBuilder_.getCount();
                }
            }

            /**
             * <code>repeated .Attribute attributes = 9;</code>
             */
            public com.aphyr.riemann.Proto.Attribute getAttributes(int index) {
                if (attributesBuilder_ == null) {
                    return attributes_.get(index);
                } else {
                    return attributesBuilder_.getMessage(index);
                }
            }

            /**
             * <code>repeated .Attribute attributes = 9;</code>
             */
            public Builder setAttributes(
                int index, com.aphyr.riemann.Proto.Attribute value
            ) {
                if (attributesBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureAttributesIsMutable();
                    attributes_.set(index, value);
                    onChanged();
                } else {
                    attributesBuilder_.setMessage(index, value);
                }
                return this;
            }

            /**
             * <code>repeated .Attribute attributes = 9;</code>
             */
            public Builder setAttributes(
                int index, com.aphyr.riemann.Proto.Attribute.Builder builderForValue
            ) {
                if (attributesBuilder_ == null) {
                    ensureAttributesIsMutable();
                    attributes_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    attributesBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }

            /**
             * <code>repeated .Attribute attributes = 9;</code>
             */
            public Builder addAttributes(com.aphyr.riemann.Proto.Attribute value) {
                if (attributesBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureAttributesIsMutable();
                    attributes_.add(value);
                    onChanged();
                } else {
                    attributesBuilder_.addMessage(value);
                }
                return this;
            }

            /**
             * <code>repeated .Attribute attributes = 9;</code>
             */
            public Builder addAttributes(
                int index, com.aphyr.riemann.Proto.Attribute value
            ) {
                if (attributesBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureAttributesIsMutable();
                    attributes_.add(index, value);
                    onChanged();
                } else {
                    attributesBuilder_.addMessage(index, value);
                }
                return this;
            }

            /**
             * <code>repeated .Attribute attributes = 9;</code>
             */
            public Builder addAttributes(
                com.aphyr.riemann.Proto.Attribute.Builder builderForValue
            ) {
                if (attributesBuilder_ == null) {
                    ensureAttributesIsMutable();
                    attributes_.add(builderForValue.build());
                    onChanged();
                } else {
                    attributesBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }

            /**
             * <code>repeated .Attribute attributes = 9;</code>
             */
            public Builder addAttributes(
                int index, com.aphyr.riemann.Proto.Attribute.Builder builderForValue
            ) {
                if (attributesBuilder_ == null) {
                    ensureAttributesIsMutable();
                    attributes_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    attributesBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }

            /**
             * <code>repeated .Attribute attributes = 9;</code>
             */
            public Builder addAllAttributes(
                java.lang.Iterable<? extends com.aphyr.riemann.Proto.Attribute> values
            ) {
                if (attributesBuilder_ == null) {
                    ensureAttributesIsMutable();
                    super.addAll(values, attributes_);
                    onChanged();
                } else {
                    attributesBuilder_.addAllMessages(values);
                }
                return this;
            }

            /**
             * <code>repeated .Attribute attributes = 9;</code>
             */
            public Builder clearAttributes() {
                if (attributesBuilder_ == null) {
                    attributes_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000080);
                    onChanged();
                } else {
                    attributesBuilder_.clear();
                }
                return this;
            }

            /**
             * <code>repeated .Attribute attributes = 9;</code>
             */
            public Builder removeAttributes(int index) {
                if (attributesBuilder_ == null) {
                    ensureAttributesIsMutable();
                    attributes_.remove(index);
                    onChanged();
                } else {
                    attributesBuilder_.remove(index);
                }
                return this;
            }

            /**
             * <code>repeated .Attribute attributes = 9;</code>
             */
            public com.aphyr.riemann.Proto.Attribute.Builder getAttributesBuilder(
                int index
            ) {
                return getAttributesFieldBuilder().getBuilder(index);
            }

            /**
             * <code>repeated .Attribute attributes = 9;</code>
             */
            public com.aphyr.riemann.Proto.AttributeOrBuilder getAttributesOrBuilder(
                int index
            ) {
                if (attributesBuilder_ == null) {
                    return attributes_.get(index);
                } else {
                    return attributesBuilder_.getMessageOrBuilder(index);
                }
            }

            /**
             * <code>repeated .Attribute attributes = 9;</code>
             */
            public java.util.List<? extends com.aphyr.riemann.Proto.AttributeOrBuilder>
            getAttributesOrBuilderList() {
                if (attributesBuilder_ != null) {
                    return attributesBuilder_.getMessageOrBuilderList();
                } else {
                    return java.util.Collections.unmodifiableList(attributes_);
                }
            }

            /**
             * <code>repeated .Attribute attributes = 9;</code>
             */
            public com.aphyr.riemann.Proto.Attribute.Builder addAttributesBuilder() {
                return getAttributesFieldBuilder().addBuilder(
                    com.aphyr.riemann.Proto.Attribute.getDefaultInstance());
            }

            /**
             * <code>repeated .Attribute attributes = 9;</code>
             */
            public com.aphyr.riemann.Proto.Attribute.Builder addAttributesBuilder(
                int index
            ) {
                return getAttributesFieldBuilder().addBuilder(index,
                    com.aphyr.riemann.Proto.Attribute.getDefaultInstance());
            }

            /**
             * <code>repeated .Attribute attributes = 9;</code>
             */
            public java.util.List<com.aphyr.riemann.Proto.Attribute.Builder>
            getAttributesBuilderList() {
                return getAttributesFieldBuilder().getBuilderList();
            }

            private com.spotify.ffwd.protobuf250.RepeatedFieldBuilder<com.aphyr.riemann.Proto
                .Attribute, com.aphyr.riemann.Proto.Attribute.Builder, com.aphyr.riemann.Proto
            .AttributeOrBuilder> getAttributesFieldBuilder() {
                if (attributesBuilder_ == null) {
                    attributesBuilder_ =
                        new com.spotify.ffwd.protobuf250.RepeatedFieldBuilder<com.aphyr.riemann
                        .Proto.Attribute, com.aphyr.riemann.Proto.Attribute.Builder, com.aphyr
                        .riemann.Proto.AttributeOrBuilder>(
                            attributes_, ((bitField0_ & 0x00000080) == 0x00000080),
                            getParentForChildren(), isClean());
                    attributes_ = null;
                }
                return attributesBuilder_;
            }

            // optional sint64 metric_sint64 = 13;
            private long metricSint64_;

            /**
             * <code>optional sint64 metric_sint64 = 13;</code>
             */
            public boolean hasMetricSint64() {
                return ((bitField0_ & 0x00000100) == 0x00000100);
            }

            /**
             * <code>optional sint64 metric_sint64 = 13;</code>
             */
            public long getMetricSint64() {
                return metricSint64_;
            }

            /**
             * <code>optional sint64 metric_sint64 = 13;</code>
             */
            public Builder setMetricSint64(long value) {
                bitField0_ |= 0x00000100;
                metricSint64_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>optional sint64 metric_sint64 = 13;</code>
             */
            public Builder clearMetricSint64() {
                bitField0_ = (bitField0_ & ~0x00000100);
                metricSint64_ = 0L;
                onChanged();
                return this;
            }

            // optional double metric_d = 14;
            private double metricD_;

            /**
             * <code>optional double metric_d = 14;</code>
             */
            public boolean hasMetricD() {
                return ((bitField0_ & 0x00000200) == 0x00000200);
            }

            /**
             * <code>optional double metric_d = 14;</code>
             */
            public double getMetricD() {
                return metricD_;
            }

            /**
             * <code>optional double metric_d = 14;</code>
             */
            public Builder setMetricD(double value) {
                bitField0_ |= 0x00000200;
                metricD_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>optional double metric_d = 14;</code>
             */
            public Builder clearMetricD() {
                bitField0_ = (bitField0_ & ~0x00000200);
                metricD_ = 0D;
                onChanged();
                return this;
            }

            // optional float metric_f = 15;
            private float metricF_;

            /**
             * <code>optional float metric_f = 15;</code>
             */
            public boolean hasMetricF() {
                return ((bitField0_ & 0x00000400) == 0x00000400);
            }

            /**
             * <code>optional float metric_f = 15;</code>
             */
            public float getMetricF() {
                return metricF_;
            }

            /**
             * <code>optional float metric_f = 15;</code>
             */
            public Builder setMetricF(float value) {
                bitField0_ |= 0x00000400;
                metricF_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>optional float metric_f = 15;</code>
             */
            public Builder clearMetricF() {
                bitField0_ = (bitField0_ & ~0x00000400);
                metricF_ = 0F;
                onChanged();
                return this;
            }

            // @@protoc_insertion_point(builder_scope:Event)
        }

        static {
            defaultInstance = new Event(true);
            defaultInstance.initFields();
        }

        // @@protoc_insertion_point(class_scope:Event)
    }

    public interface QueryOrBuilder extends com.spotify.ffwd.protobuf250.MessageOrBuilder {

        // optional string string = 1;

        /**
         * <code>optional string string = 1;</code>
         */
        boolean hasString();

        /**
         * <code>optional string string = 1;</code>
         */
        java.lang.String getString();

        /**
         * <code>optional string string = 1;</code>
         */
        com.spotify.ffwd.protobuf250.ByteString getStringBytes();
    }

    /**
     * Protobuf type {@code Query}
     */
    public static final class Query extends com.spotify.ffwd.protobuf250.GeneratedMessage
        implements QueryOrBuilder {
        // Use Query.newBuilder() to construct.
        private Query(com.spotify.ffwd.protobuf250.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.unknownFields = builder.getUnknownFields();
        }

        private Query(boolean noInit) {
            this.unknownFields = com.spotify.ffwd.protobuf250.UnknownFieldSet.getDefaultInstance();
        }

        private static final Query defaultInstance;

        public static Query getDefaultInstance() {
            return defaultInstance;
        }

        public Query getDefaultInstanceForType() {
            return defaultInstance;
        }

        private final com.spotify.ffwd.protobuf250.UnknownFieldSet unknownFields;

        @java.lang.Override
        public final com.spotify.ffwd.protobuf250.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private Query(
            com.spotify.ffwd.protobuf250.CodedInputStream input,
            com.spotify.ffwd.protobuf250.ExtensionRegistryLite extensionRegistry
        ) throws com.spotify.ffwd.protobuf250.InvalidProtocolBufferException {
            initFields();
            int mutable_bitField0_ = 0;
            com.spotify.ffwd.protobuf250.UnknownFieldSet.Builder unknownFields =
                com.spotify.ffwd.protobuf250.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 10: {
                            bitField0_ |= 0x00000001;
                            string_ = input.readBytes();
                            break;
                        }
                    }
                }
            } catch (com.spotify.ffwd.protobuf250.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.spotify.ffwd.protobuf250.InvalidProtocolBufferException(
                    e.getMessage()).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final com.spotify.ffwd.protobuf250.Descriptors.Descriptor getDescriptor() {
            return com.aphyr.riemann.Proto.internal_static_Query_descriptor;
        }

        protected com.spotify.ffwd.protobuf250.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.aphyr.riemann.Proto.internal_static_Query_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.aphyr.riemann.Proto.Query.class, com.aphyr.riemann.Proto.Query.Builder.class);
        }

        public static com.spotify.ffwd.protobuf250.Parser<Query> PARSER =
            new com.spotify.ffwd.protobuf250.AbstractParser<Query>() {
                public Query parsePartialFrom(
                    com.spotify.ffwd.protobuf250.CodedInputStream input,
                    com.spotify.ffwd.protobuf250.ExtensionRegistryLite extensionRegistry
                ) throws com.spotify.ffwd.protobuf250.InvalidProtocolBufferException {
                    return new Query(input, extensionRegistry);
                }
            };

        @java.lang.Override
        public com.spotify.ffwd.protobuf250.Parser<Query> getParserForType() {
            return PARSER;
        }

        private int bitField0_;
        // optional string string = 1;
        public static final int STRING_FIELD_NUMBER = 1;
        private java.lang.Object string_;

        /**
         * <code>optional string string = 1;</code>
         */
        public boolean hasString() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }

        /**
         * <code>optional string string = 1;</code>
         */
        public java.lang.String getString() {
            java.lang.Object ref = string_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.spotify.ffwd.protobuf250.ByteString bs =
                    (com.spotify.ffwd.protobuf250.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    string_ = s;
                }
                return s;
            }
        }

        /**
         * <code>optional string string = 1;</code>
         */
        public com.spotify.ffwd.protobuf250.ByteString getStringBytes() {
            java.lang.Object ref = string_;
            if (ref instanceof java.lang.String) {
                com.spotify.ffwd.protobuf250.ByteString b =
                    com.spotify.ffwd.protobuf250.ByteString.copyFromUtf8((java.lang.String) ref);
                string_ = b;
                return b;
            } else {
                return (com.spotify.ffwd.protobuf250.ByteString) ref;
            }
        }

        private void initFields() {
            string_ = "";
        }

        private byte memoizedIsInitialized = -1;

        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized != -1) {
                return isInitialized == 1;
            }

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.spotify.ffwd.protobuf250.CodedOutputStream output)
            throws java.io.IOException {
            getSerializedSize();
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeBytes(1, getStringBytes());
            }
            getUnknownFields().writeTo(output);
        }

        private int memoizedSerializedSize = -1;

        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1) {
                return size;
            }

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.spotify.ffwd.protobuf250.CodedOutputStream.computeBytesSize(1,
                    getStringBytes());
            }
            size += getUnknownFields().getSerializedSize();
            memoizedSerializedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;

        @java.lang.Override
        protected java.lang.Object writeReplace() throws java.io.ObjectStreamException {
            return super.writeReplace();
        }

        public static com.aphyr.riemann.Proto.Query parseFrom(
            com.spotify.ffwd.protobuf250.ByteString data
        ) throws com.spotify.ffwd.protobuf250.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static com.aphyr.riemann.Proto.Query parseFrom(
            com.spotify.ffwd.protobuf250.ByteString data,
            com.spotify.ffwd.protobuf250.ExtensionRegistryLite extensionRegistry
        ) throws com.spotify.ffwd.protobuf250.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.aphyr.riemann.Proto.Query parseFrom(byte[] data)
            throws com.spotify.ffwd.protobuf250.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static com.aphyr.riemann.Proto.Query parseFrom(
            byte[] data, com.spotify.ffwd.protobuf250.ExtensionRegistryLite extensionRegistry
        ) throws com.spotify.ffwd.protobuf250.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.aphyr.riemann.Proto.Query parseFrom(java.io.InputStream input)
            throws java.io.IOException {
            return PARSER.parseFrom(input);
        }

        public static com.aphyr.riemann.Proto.Query parseFrom(
            java.io.InputStream input,
            com.spotify.ffwd.protobuf250.ExtensionRegistryLite extensionRegistry
        ) throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }

        public static com.aphyr.riemann.Proto.Query parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input);
        }

        public static com.aphyr.riemann.Proto.Query parseDelimitedFrom(
            java.io.InputStream input,
            com.spotify.ffwd.protobuf250.ExtensionRegistryLite extensionRegistry
        ) throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static com.aphyr.riemann.Proto.Query parseFrom(
            com.spotify.ffwd.protobuf250.CodedInputStream input
        ) throws java.io.IOException {
            return PARSER.parseFrom(input);
        }

        public static com.aphyr.riemann.Proto.Query parseFrom(
            com.spotify.ffwd.protobuf250.CodedInputStream input,
            com.spotify.ffwd.protobuf250.ExtensionRegistryLite extensionRegistry
        ) throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(com.aphyr.riemann.Proto.Query prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
            com.spotify.ffwd.protobuf250.GeneratedMessage.BuilderParent parent
        ) {
            Builder builder = new Builder(parent);
            return builder;
        }

        /**
         * Protobuf type {@code Query}
         */
        public static final class Builder
            extends com.spotify.ffwd.protobuf250.GeneratedMessage.Builder<Builder>
            implements com.aphyr.riemann.Proto.QueryOrBuilder {
            public static final com.spotify.ffwd.protobuf250.Descriptors.Descriptor getDescriptor
            () {
                return com.aphyr.riemann.Proto.internal_static_Query_descriptor;
            }

            protected com.spotify.ffwd.protobuf250.GeneratedMessage.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return com.aphyr.riemann.Proto.internal_static_Query_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                    com.aphyr.riemann.Proto.Query.class,
                    com.aphyr.riemann.Proto.Query.Builder.class);
            }

            // Construct using com.aphyr.riemann.Proto.Query.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                com.spotify.ffwd.protobuf250.GeneratedMessage.BuilderParent parent
            ) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.spotify.ffwd.protobuf250.GeneratedMessage.alwaysUseFieldBuilders) {
                }
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                string_ = "";
                bitField0_ = (bitField0_ & ~0x00000001);
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public com.spotify.ffwd.protobuf250.Descriptors.Descriptor getDescriptorForType() {
                return com.aphyr.riemann.Proto.internal_static_Query_descriptor;
            }

            public com.aphyr.riemann.Proto.Query getDefaultInstanceForType() {
                return com.aphyr.riemann.Proto.Query.getDefaultInstance();
            }

            public com.aphyr.riemann.Proto.Query build() {
                com.aphyr.riemann.Proto.Query result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public com.aphyr.riemann.Proto.Query buildPartial() {
                com.aphyr.riemann.Proto.Query result = new com.aphyr.riemann.Proto.Query(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.string_ = string_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(com.spotify.ffwd.protobuf250.Message other) {
                if (other instanceof com.aphyr.riemann.Proto.Query) {
                    return mergeFrom((com.aphyr.riemann.Proto.Query) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.aphyr.riemann.Proto.Query other) {
                if (other == com.aphyr.riemann.Proto.Query.getDefaultInstance()) {
                    return this;
                }
                if (other.hasString()) {
                    bitField0_ |= 0x00000001;
                    string_ = other.string_;
                    onChanged();
                }
                this.mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                com.spotify.ffwd.protobuf250.CodedInputStream input,
                com.spotify.ffwd.protobuf250.ExtensionRegistryLite extensionRegistry
            ) throws java.io.IOException {
                com.aphyr.riemann.Proto.Query parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.spotify.ffwd.protobuf250.InvalidProtocolBufferException e) {
                    parsedMessage = (com.aphyr.riemann.Proto.Query) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int bitField0_;

            // optional string string = 1;
            private java.lang.Object string_ = "";

            /**
             * <code>optional string string = 1;</code>
             */
            public boolean hasString() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }

            /**
             * <code>optional string string = 1;</code>
             */
            public java.lang.String getString() {
                java.lang.Object ref = string_;
                if (!(ref instanceof java.lang.String)) {
                    java.lang.String s =
                        ((com.spotify.ffwd.protobuf250.ByteString) ref).toStringUtf8();
                    string_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>optional string string = 1;</code>
             */
            public com.spotify.ffwd.protobuf250.ByteString getStringBytes() {
                java.lang.Object ref = string_;
                if (ref instanceof String) {
                    com.spotify.ffwd.protobuf250.ByteString b =
                        com.spotify.ffwd.protobuf250.ByteString.copyFromUtf8(
                            (java.lang.String) ref);
                    string_ = b;
                    return b;
                } else {
                    return (com.spotify.ffwd.protobuf250.ByteString) ref;
                }
            }

            /**
             * <code>optional string string = 1;</code>
             */
            public Builder setString(
                java.lang.String value
            ) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000001;
                string_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>optional string string = 1;</code>
             */
            public Builder clearString() {
                bitField0_ = (bitField0_ & ~0x00000001);
                string_ = getDefaultInstance().getString();
                onChanged();
                return this;
            }

            /**
             * <code>optional string string = 1;</code>
             */
            public Builder setStringBytes(
                com.spotify.ffwd.protobuf250.ByteString value
            ) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000001;
                string_ = value;
                onChanged();
                return this;
            }

            // @@protoc_insertion_point(builder_scope:Query)
        }

        static {
            defaultInstance = new Query(true);
            defaultInstance.initFields();
        }

        // @@protoc_insertion_point(class_scope:Query)
    }

    public interface MsgOrBuilder extends com.spotify.ffwd.protobuf250.MessageOrBuilder {

        // optional bool ok = 2;

        /**
         * <code>optional bool ok = 2;</code>
         */
        boolean hasOk();

        /**
         * <code>optional bool ok = 2;</code>
         */
        boolean getOk();

        // optional string error = 3;

        /**
         * <code>optional string error = 3;</code>
         */
        boolean hasError();

        /**
         * <code>optional string error = 3;</code>
         */
        java.lang.String getError();

        /**
         * <code>optional string error = 3;</code>
         */
        com.spotify.ffwd.protobuf250.ByteString getErrorBytes();

        // repeated .State states = 4;

        /**
         * <code>repeated .State states = 4;</code>
         */
        java.util.List<com.aphyr.riemann.Proto.State> getStatesList();

        /**
         * <code>repeated .State states = 4;</code>
         */
        com.aphyr.riemann.Proto.State getStates(int index);

        /**
         * <code>repeated .State states = 4;</code>
         */
        int getStatesCount();

        /**
         * <code>repeated .State states = 4;</code>
         */
        java.util.List<? extends com.aphyr.riemann.Proto.StateOrBuilder> getStatesOrBuilderList();

        /**
         * <code>repeated .State states = 4;</code>
         */
        com.aphyr.riemann.Proto.StateOrBuilder getStatesOrBuilder(
            int index
        );

        // optional .Query query = 5;

        /**
         * <code>optional .Query query = 5;</code>
         */
        boolean hasQuery();

        /**
         * <code>optional .Query query = 5;</code>
         */
        com.aphyr.riemann.Proto.Query getQuery();

        /**
         * <code>optional .Query query = 5;</code>
         */
        com.aphyr.riemann.Proto.QueryOrBuilder getQueryOrBuilder();

        // repeated .Event events = 6;

        /**
         * <code>repeated .Event events = 6;</code>
         */
        java.util.List<com.aphyr.riemann.Proto.Event> getEventsList();

        /**
         * <code>repeated .Event events = 6;</code>
         */
        com.aphyr.riemann.Proto.Event getEvents(int index);

        /**
         * <code>repeated .Event events = 6;</code>
         */
        int getEventsCount();

        /**
         * <code>repeated .Event events = 6;</code>
         */
        java.util.List<? extends com.aphyr.riemann.Proto.EventOrBuilder> getEventsOrBuilderList();

        /**
         * <code>repeated .Event events = 6;</code>
         */
        com.aphyr.riemann.Proto.EventOrBuilder getEventsOrBuilder(
            int index
        );
    }

    /**
     * Protobuf type {@code Msg}
     */
    public static final class Msg extends com.spotify.ffwd.protobuf250.GeneratedMessage
        implements MsgOrBuilder {
        // Use Msg.newBuilder() to construct.
        private Msg(com.spotify.ffwd.protobuf250.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.unknownFields = builder.getUnknownFields();
        }

        private Msg(boolean noInit) {
            this.unknownFields = com.spotify.ffwd.protobuf250.UnknownFieldSet.getDefaultInstance();
        }

        private static final Msg defaultInstance;

        public static Msg getDefaultInstance() {
            return defaultInstance;
        }

        public Msg getDefaultInstanceForType() {
            return defaultInstance;
        }

        private final com.spotify.ffwd.protobuf250.UnknownFieldSet unknownFields;

        @java.lang.Override
        public final com.spotify.ffwd.protobuf250.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private Msg(
            com.spotify.ffwd.protobuf250.CodedInputStream input,
            com.spotify.ffwd.protobuf250.ExtensionRegistryLite extensionRegistry
        ) throws com.spotify.ffwd.protobuf250.InvalidProtocolBufferException {
            initFields();
            int mutable_bitField0_ = 0;
            com.spotify.ffwd.protobuf250.UnknownFieldSet.Builder unknownFields =
                com.spotify.ffwd.protobuf250.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 16: {
                            bitField0_ |= 0x00000001;
                            ok_ = input.readBool();
                            break;
                        }
                        case 26: {
                            bitField0_ |= 0x00000002;
                            error_ = input.readBytes();
                            break;
                        }
                        case 34: {
                            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
                                states_ = new java.util.ArrayList<com.aphyr.riemann.Proto.State>();
                                mutable_bitField0_ |= 0x00000004;
                            }
                            states_.add(input.readMessage(com.aphyr.riemann.Proto.State.PARSER,
                                extensionRegistry));
                            break;
                        }
                        case 42: {
                            com.aphyr.riemann.Proto.Query.Builder subBuilder = null;
                            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                                subBuilder = query_.toBuilder();
                            }
                            query_ = input.readMessage(com.aphyr.riemann.Proto.Query.PARSER,
                                extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(query_);
                                query_ = subBuilder.buildPartial();
                            }
                            bitField0_ |= 0x00000004;
                            break;
                        }
                        case 50: {
                            if (!((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
                                events_ = new java.util.ArrayList<com.aphyr.riemann.Proto.Event>();
                                mutable_bitField0_ |= 0x00000010;
                            }
                            events_.add(input.readMessage(com.aphyr.riemann.Proto.Event.PARSER,
                                extensionRegistry));
                            break;
                        }
                    }
                }
            } catch (com.spotify.ffwd.protobuf250.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.spotify.ffwd.protobuf250.InvalidProtocolBufferException(
                    e.getMessage()).setUnfinishedMessage(this);
            } finally {
                if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
                    states_ = java.util.Collections.unmodifiableList(states_);
                }
                if (((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
                    events_ = java.util.Collections.unmodifiableList(events_);
                }
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final com.spotify.ffwd.protobuf250.Descriptors.Descriptor getDescriptor() {
            return com.aphyr.riemann.Proto.internal_static_Msg_descriptor;
        }

        protected com.spotify.ffwd.protobuf250.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.aphyr.riemann.Proto.internal_static_Msg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.aphyr.riemann.Proto.Msg.class, com.aphyr.riemann.Proto.Msg.Builder.class);
        }

        public static com.spotify.ffwd.protobuf250.Parser<Msg> PARSER =
            new com.spotify.ffwd.protobuf250.AbstractParser<Msg>() {
                public Msg parsePartialFrom(
                    com.spotify.ffwd.protobuf250.CodedInputStream input,
                    com.spotify.ffwd.protobuf250.ExtensionRegistryLite extensionRegistry
                ) throws com.spotify.ffwd.protobuf250.InvalidProtocolBufferException {
                    return new Msg(input, extensionRegistry);
                }
            };

        @java.lang.Override
        public com.spotify.ffwd.protobuf250.Parser<Msg> getParserForType() {
            return PARSER;
        }

        private int bitField0_;
        // optional bool ok = 2;
        public static final int OK_FIELD_NUMBER = 2;
        private boolean ok_;

        /**
         * <code>optional bool ok = 2;</code>
         */
        public boolean hasOk() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }

        /**
         * <code>optional bool ok = 2;</code>
         */
        public boolean getOk() {
            return ok_;
        }

        // optional string error = 3;
        public static final int ERROR_FIELD_NUMBER = 3;
        private java.lang.Object error_;

        /**
         * <code>optional string error = 3;</code>
         */
        public boolean hasError() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }

        /**
         * <code>optional string error = 3;</code>
         */
        public java.lang.String getError() {
            java.lang.Object ref = error_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.spotify.ffwd.protobuf250.ByteString bs =
                    (com.spotify.ffwd.protobuf250.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    error_ = s;
                }
                return s;
            }
        }

        /**
         * <code>optional string error = 3;</code>
         */
        public com.spotify.ffwd.protobuf250.ByteString getErrorBytes() {
            java.lang.Object ref = error_;
            if (ref instanceof java.lang.String) {
                com.spotify.ffwd.protobuf250.ByteString b =
                    com.spotify.ffwd.protobuf250.ByteString.copyFromUtf8((java.lang.String) ref);
                error_ = b;
                return b;
            } else {
                return (com.spotify.ffwd.protobuf250.ByteString) ref;
            }
        }

        // repeated .State states = 4;
        public static final int STATES_FIELD_NUMBER = 4;
        private java.util.List<com.aphyr.riemann.Proto.State> states_;

        /**
         * <code>repeated .State states = 4;</code>
         */
        public java.util.List<com.aphyr.riemann.Proto.State> getStatesList() {
            return states_;
        }

        /**
         * <code>repeated .State states = 4;</code>
         */
        public java.util.List<? extends com.aphyr.riemann.Proto.StateOrBuilder>
        getStatesOrBuilderList() {
            return states_;
        }

        /**
         * <code>repeated .State states = 4;</code>
         */
        public int getStatesCount() {
            return states_.size();
        }

        /**
         * <code>repeated .State states = 4;</code>
         */
        public com.aphyr.riemann.Proto.State getStates(int index) {
            return states_.get(index);
        }

        /**
         * <code>repeated .State states = 4;</code>
         */
        public com.aphyr.riemann.Proto.StateOrBuilder getStatesOrBuilder(
            int index
        ) {
            return states_.get(index);
        }

        // optional .Query query = 5;
        public static final int QUERY_FIELD_NUMBER = 5;
        private com.aphyr.riemann.Proto.Query query_;

        /**
         * <code>optional .Query query = 5;</code>
         */
        public boolean hasQuery() {
            return ((bitField0_ & 0x00000004) == 0x00000004);
        }

        /**
         * <code>optional .Query query = 5;</code>
         */
        public com.aphyr.riemann.Proto.Query getQuery() {
            return query_;
        }

        /**
         * <code>optional .Query query = 5;</code>
         */
        public com.aphyr.riemann.Proto.QueryOrBuilder getQueryOrBuilder() {
            return query_;
        }

        // repeated .Event events = 6;
        public static final int EVENTS_FIELD_NUMBER = 6;
        private java.util.List<com.aphyr.riemann.Proto.Event> events_;

        /**
         * <code>repeated .Event events = 6;</code>
         */
        public java.util.List<com.aphyr.riemann.Proto.Event> getEventsList() {
            return events_;
        }

        /**
         * <code>repeated .Event events = 6;</code>
         */
        public java.util.List<? extends com.aphyr.riemann.Proto.EventOrBuilder>
        getEventsOrBuilderList() {
            return events_;
        }

        /**
         * <code>repeated .Event events = 6;</code>
         */
        public int getEventsCount() {
            return events_.size();
        }

        /**
         * <code>repeated .Event events = 6;</code>
         */
        public com.aphyr.riemann.Proto.Event getEvents(int index) {
            return events_.get(index);
        }

        /**
         * <code>repeated .Event events = 6;</code>
         */
        public com.aphyr.riemann.Proto.EventOrBuilder getEventsOrBuilder(
            int index
        ) {
            return events_.get(index);
        }

        private void initFields() {
            ok_ = false;
            error_ = "";
            states_ = java.util.Collections.emptyList();
            query_ = com.aphyr.riemann.Proto.Query.getDefaultInstance();
            events_ = java.util.Collections.emptyList();
        }

        private byte memoizedIsInitialized = -1;

        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized != -1) {
                return isInitialized == 1;
            }

            for (int i = 0; i < getEventsCount(); i++) {
                if (!getEvents(i).isInitialized()) {
                    memoizedIsInitialized = 0;
                    return false;
                }
            }
            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.spotify.ffwd.protobuf250.CodedOutputStream output)
            throws java.io.IOException {
            getSerializedSize();
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeBool(2, ok_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeBytes(3, getErrorBytes());
            }
            for (int i = 0; i < states_.size(); i++) {
                output.writeMessage(4, states_.get(i));
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                output.writeMessage(5, query_);
            }
            for (int i = 0; i < events_.size(); i++) {
                output.writeMessage(6, events_.get(i));
            }
            getUnknownFields().writeTo(output);
        }

        private int memoizedSerializedSize = -1;

        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1) {
                return size;
            }

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.spotify.ffwd.protobuf250.CodedOutputStream.computeBoolSize(2, ok_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.spotify.ffwd.protobuf250.CodedOutputStream.computeBytesSize(3,
                    getErrorBytes());
            }
            for (int i = 0; i < states_.size(); i++) {
                size += com.spotify.ffwd.protobuf250.CodedOutputStream.computeMessageSize(4,
                    states_.get(i));
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                size +=
                    com.spotify.ffwd.protobuf250.CodedOutputStream.computeMessageSize(5, query_);
            }
            for (int i = 0; i < events_.size(); i++) {
                size += com.spotify.ffwd.protobuf250.CodedOutputStream.computeMessageSize(6,
                    events_.get(i));
            }
            size += getUnknownFields().getSerializedSize();
            memoizedSerializedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;

        @java.lang.Override
        protected java.lang.Object writeReplace() throws java.io.ObjectStreamException {
            return super.writeReplace();
        }

        public static com.aphyr.riemann.Proto.Msg parseFrom(
            com.spotify.ffwd.protobuf250.ByteString data
        ) throws com.spotify.ffwd.protobuf250.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static com.aphyr.riemann.Proto.Msg parseFrom(
            com.spotify.ffwd.protobuf250.ByteString data,
            com.spotify.ffwd.protobuf250.ExtensionRegistryLite extensionRegistry
        ) throws com.spotify.ffwd.protobuf250.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.aphyr.riemann.Proto.Msg parseFrom(byte[] data)
            throws com.spotify.ffwd.protobuf250.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static com.aphyr.riemann.Proto.Msg parseFrom(
            byte[] data, com.spotify.ffwd.protobuf250.ExtensionRegistryLite extensionRegistry
        ) throws com.spotify.ffwd.protobuf250.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.aphyr.riemann.Proto.Msg parseFrom(java.io.InputStream input)
            throws java.io.IOException {
            return PARSER.parseFrom(input);
        }

        public static com.aphyr.riemann.Proto.Msg parseFrom(
            java.io.InputStream input,
            com.spotify.ffwd.protobuf250.ExtensionRegistryLite extensionRegistry
        ) throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }

        public static com.aphyr.riemann.Proto.Msg parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input);
        }

        public static com.aphyr.riemann.Proto.Msg parseDelimitedFrom(
            java.io.InputStream input,
            com.spotify.ffwd.protobuf250.ExtensionRegistryLite extensionRegistry
        ) throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static com.aphyr.riemann.Proto.Msg parseFrom(
            com.spotify.ffwd.protobuf250.CodedInputStream input
        ) throws java.io.IOException {
            return PARSER.parseFrom(input);
        }

        public static com.aphyr.riemann.Proto.Msg parseFrom(
            com.spotify.ffwd.protobuf250.CodedInputStream input,
            com.spotify.ffwd.protobuf250.ExtensionRegistryLite extensionRegistry
        ) throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(com.aphyr.riemann.Proto.Msg prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
            com.spotify.ffwd.protobuf250.GeneratedMessage.BuilderParent parent
        ) {
            Builder builder = new Builder(parent);
            return builder;
        }

        /**
         * Protobuf type {@code Msg}
         */
        public static final class Builder
            extends com.spotify.ffwd.protobuf250.GeneratedMessage.Builder<Builder>
            implements com.aphyr.riemann.Proto.MsgOrBuilder {
            public static final com.spotify.ffwd.protobuf250.Descriptors.Descriptor getDescriptor
            () {
                return com.aphyr.riemann.Proto.internal_static_Msg_descriptor;
            }

            protected com.spotify.ffwd.protobuf250.GeneratedMessage.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return com.aphyr.riemann.Proto.internal_static_Msg_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                    com.aphyr.riemann.Proto.Msg.class, com.aphyr.riemann.Proto.Msg.Builder.class);
            }

            // Construct using com.aphyr.riemann.Proto.Msg.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                com.spotify.ffwd.protobuf250.GeneratedMessage.BuilderParent parent
            ) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.spotify.ffwd.protobuf250.GeneratedMessage.alwaysUseFieldBuilders) {
                    getStatesFieldBuilder();
                    getQueryFieldBuilder();
                    getEventsFieldBuilder();
                }
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                ok_ = false;
                bitField0_ = (bitField0_ & ~0x00000001);
                error_ = "";
                bitField0_ = (bitField0_ & ~0x00000002);
                if (statesBuilder_ == null) {
                    states_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000004);
                } else {
                    statesBuilder_.clear();
                }
                if (queryBuilder_ == null) {
                    query_ = com.aphyr.riemann.Proto.Query.getDefaultInstance();
                } else {
                    queryBuilder_.clear();
                }
                bitField0_ = (bitField0_ & ~0x00000008);
                if (eventsBuilder_ == null) {
                    events_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000010);
                } else {
                    eventsBuilder_.clear();
                }
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public com.spotify.ffwd.protobuf250.Descriptors.Descriptor getDescriptorForType() {
                return com.aphyr.riemann.Proto.internal_static_Msg_descriptor;
            }

            public com.aphyr.riemann.Proto.Msg getDefaultInstanceForType() {
                return com.aphyr.riemann.Proto.Msg.getDefaultInstance();
            }

            public com.aphyr.riemann.Proto.Msg build() {
                com.aphyr.riemann.Proto.Msg result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public com.aphyr.riemann.Proto.Msg buildPartial() {
                com.aphyr.riemann.Proto.Msg result = new com.aphyr.riemann.Proto.Msg(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.ok_ = ok_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.error_ = error_;
                if (statesBuilder_ == null) {
                    if (((bitField0_ & 0x00000004) == 0x00000004)) {
                        states_ = java.util.Collections.unmodifiableList(states_);
                        bitField0_ = (bitField0_ & ~0x00000004);
                    }
                    result.states_ = states_;
                } else {
                    result.states_ = statesBuilder_.build();
                }
                if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
                    to_bitField0_ |= 0x00000004;
                }
                if (queryBuilder_ == null) {
                    result.query_ = query_;
                } else {
                    result.query_ = queryBuilder_.build();
                }
                if (eventsBuilder_ == null) {
                    if (((bitField0_ & 0x00000010) == 0x00000010)) {
                        events_ = java.util.Collections.unmodifiableList(events_);
                        bitField0_ = (bitField0_ & ~0x00000010);
                    }
                    result.events_ = events_;
                } else {
                    result.events_ = eventsBuilder_.build();
                }
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(com.spotify.ffwd.protobuf250.Message other) {
                if (other instanceof com.aphyr.riemann.Proto.Msg) {
                    return mergeFrom((com.aphyr.riemann.Proto.Msg) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.aphyr.riemann.Proto.Msg other) {
                if (other == com.aphyr.riemann.Proto.Msg.getDefaultInstance()) {
                    return this;
                }
                if (other.hasOk()) {
                    setOk(other.getOk());
                }
                if (other.hasError()) {
                    bitField0_ |= 0x00000002;
                    error_ = other.error_;
                    onChanged();
                }
                if (statesBuilder_ == null) {
                    if (!other.states_.isEmpty()) {
                        if (states_.isEmpty()) {
                            states_ = other.states_;
                            bitField0_ = (bitField0_ & ~0x00000004);
                        } else {
                            ensureStatesIsMutable();
                            states_.addAll(other.states_);
                        }
                        onChanged();
                    }
                } else {
                    if (!other.states_.isEmpty()) {
                        if (statesBuilder_.isEmpty()) {
                            statesBuilder_.dispose();
                            statesBuilder_ = null;
                            states_ = other.states_;
                            bitField0_ = (bitField0_ & ~0x00000004);
                            statesBuilder_ =
                                com.spotify.ffwd.protobuf250.GeneratedMessage.alwaysUseFieldBuilders
                                    ? getStatesFieldBuilder() : null;
                        } else {
                            statesBuilder_.addAllMessages(other.states_);
                        }
                    }
                }
                if (other.hasQuery()) {
                    mergeQuery(other.getQuery());
                }
                if (eventsBuilder_ == null) {
                    if (!other.events_.isEmpty()) {
                        if (events_.isEmpty()) {
                            events_ = other.events_;
                            bitField0_ = (bitField0_ & ~0x00000010);
                        } else {
                            ensureEventsIsMutable();
                            events_.addAll(other.events_);
                        }
                        onChanged();
                    }
                } else {
                    if (!other.events_.isEmpty()) {
                        if (eventsBuilder_.isEmpty()) {
                            eventsBuilder_.dispose();
                            eventsBuilder_ = null;
                            events_ = other.events_;
                            bitField0_ = (bitField0_ & ~0x00000010);
                            eventsBuilder_ =
                                com.spotify.ffwd.protobuf250.GeneratedMessage.alwaysUseFieldBuilders
                                    ? getEventsFieldBuilder() : null;
                        } else {
                            eventsBuilder_.addAllMessages(other.events_);
                        }
                    }
                }
                this.mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                for (int i = 0; i < getEventsCount(); i++) {
                    if (!getEvents(i).isInitialized()) {

                        return false;
                    }
                }
                return true;
            }

            public Builder mergeFrom(
                com.spotify.ffwd.protobuf250.CodedInputStream input,
                com.spotify.ffwd.protobuf250.ExtensionRegistryLite extensionRegistry
            ) throws java.io.IOException {
                com.aphyr.riemann.Proto.Msg parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.spotify.ffwd.protobuf250.InvalidProtocolBufferException e) {
                    parsedMessage = (com.aphyr.riemann.Proto.Msg) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int bitField0_;

            // optional bool ok = 2;
            private boolean ok_;

            /**
             * <code>optional bool ok = 2;</code>
             */
            public boolean hasOk() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }

            /**
             * <code>optional bool ok = 2;</code>
             */
            public boolean getOk() {
                return ok_;
            }

            /**
             * <code>optional bool ok = 2;</code>
             */
            public Builder setOk(boolean value) {
                bitField0_ |= 0x00000001;
                ok_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>optional bool ok = 2;</code>
             */
            public Builder clearOk() {
                bitField0_ = (bitField0_ & ~0x00000001);
                ok_ = false;
                onChanged();
                return this;
            }

            // optional string error = 3;
            private java.lang.Object error_ = "";

            /**
             * <code>optional string error = 3;</code>
             */
            public boolean hasError() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }

            /**
             * <code>optional string error = 3;</code>
             */
            public java.lang.String getError() {
                java.lang.Object ref = error_;
                if (!(ref instanceof java.lang.String)) {
                    java.lang.String s =
                        ((com.spotify.ffwd.protobuf250.ByteString) ref).toStringUtf8();
                    error_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>optional string error = 3;</code>
             */
            public com.spotify.ffwd.protobuf250.ByteString getErrorBytes() {
                java.lang.Object ref = error_;
                if (ref instanceof String) {
                    com.spotify.ffwd.protobuf250.ByteString b =
                        com.spotify.ffwd.protobuf250.ByteString.copyFromUtf8(
                            (java.lang.String) ref);
                    error_ = b;
                    return b;
                } else {
                    return (com.spotify.ffwd.protobuf250.ByteString) ref;
                }
            }

            /**
             * <code>optional string error = 3;</code>
             */
            public Builder setError(
                java.lang.String value
            ) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000002;
                error_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>optional string error = 3;</code>
             */
            public Builder clearError() {
                bitField0_ = (bitField0_ & ~0x00000002);
                error_ = getDefaultInstance().getError();
                onChanged();
                return this;
            }

            /**
             * <code>optional string error = 3;</code>
             */
            public Builder setErrorBytes(
                com.spotify.ffwd.protobuf250.ByteString value
            ) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000002;
                error_ = value;
                onChanged();
                return this;
            }

            // repeated .State states = 4;
            private java.util.List<com.aphyr.riemann.Proto.State> states_ =
                java.util.Collections.emptyList();

            private void ensureStatesIsMutable() {
                if (!((bitField0_ & 0x00000004) == 0x00000004)) {
                    states_ = new java.util.ArrayList<com.aphyr.riemann.Proto.State>(states_);
                    bitField0_ |= 0x00000004;
                }
            }

            private com.spotify.ffwd.protobuf250.RepeatedFieldBuilder<com.aphyr.riemann.Proto
            .State, com.aphyr.riemann.Proto.State.Builder, com.aphyr.riemann.Proto.StateOrBuilder>
                statesBuilder_;

            /**
             * <code>repeated .State states = 4;</code>
             */
            public java.util.List<com.aphyr.riemann.Proto.State> getStatesList() {
                if (statesBuilder_ == null) {
                    return java.util.Collections.unmodifiableList(states_);
                } else {
                    return statesBuilder_.getMessageList();
                }
            }

            /**
             * <code>repeated .State states = 4;</code>
             */
            public int getStatesCount() {
                if (statesBuilder_ == null) {
                    return states_.size();
                } else {
                    return statesBuilder_.getCount();
                }
            }

            /**
             * <code>repeated .State states = 4;</code>
             */
            public com.aphyr.riemann.Proto.State getStates(int index) {
                if (statesBuilder_ == null) {
                    return states_.get(index);
                } else {
                    return statesBuilder_.getMessage(index);
                }
            }

            /**
             * <code>repeated .State states = 4;</code>
             */
            public Builder setStates(
                int index, com.aphyr.riemann.Proto.State value
            ) {
                if (statesBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureStatesIsMutable();
                    states_.set(index, value);
                    onChanged();
                } else {
                    statesBuilder_.setMessage(index, value);
                }
                return this;
            }

            /**
             * <code>repeated .State states = 4;</code>
             */
            public Builder setStates(
                int index, com.aphyr.riemann.Proto.State.Builder builderForValue
            ) {
                if (statesBuilder_ == null) {
                    ensureStatesIsMutable();
                    states_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    statesBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }

            /**
             * <code>repeated .State states = 4;</code>
             */
            public Builder addStates(com.aphyr.riemann.Proto.State value) {
                if (statesBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureStatesIsMutable();
                    states_.add(value);
                    onChanged();
                } else {
                    statesBuilder_.addMessage(value);
                }
                return this;
            }

            /**
             * <code>repeated .State states = 4;</code>
             */
            public Builder addStates(
                int index, com.aphyr.riemann.Proto.State value
            ) {
                if (statesBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureStatesIsMutable();
                    states_.add(index, value);
                    onChanged();
                } else {
                    statesBuilder_.addMessage(index, value);
                }
                return this;
            }

            /**
             * <code>repeated .State states = 4;</code>
             */
            public Builder addStates(
                com.aphyr.riemann.Proto.State.Builder builderForValue
            ) {
                if (statesBuilder_ == null) {
                    ensureStatesIsMutable();
                    states_.add(builderForValue.build());
                    onChanged();
                } else {
                    statesBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }

            /**
             * <code>repeated .State states = 4;</code>
             */
            public Builder addStates(
                int index, com.aphyr.riemann.Proto.State.Builder builderForValue
            ) {
                if (statesBuilder_ == null) {
                    ensureStatesIsMutable();
                    states_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    statesBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }

            /**
             * <code>repeated .State states = 4;</code>
             */
            public Builder addAllStates(
                java.lang.Iterable<? extends com.aphyr.riemann.Proto.State> values
            ) {
                if (statesBuilder_ == null) {
                    ensureStatesIsMutable();
                    super.addAll(values, states_);
                    onChanged();
                } else {
                    statesBuilder_.addAllMessages(values);
                }
                return this;
            }

            /**
             * <code>repeated .State states = 4;</code>
             */
            public Builder clearStates() {
                if (statesBuilder_ == null) {
                    states_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000004);
                    onChanged();
                } else {
                    statesBuilder_.clear();
                }
                return this;
            }

            /**
             * <code>repeated .State states = 4;</code>
             */
            public Builder removeStates(int index) {
                if (statesBuilder_ == null) {
                    ensureStatesIsMutable();
                    states_.remove(index);
                    onChanged();
                } else {
                    statesBuilder_.remove(index);
                }
                return this;
            }

            /**
             * <code>repeated .State states = 4;</code>
             */
            public com.aphyr.riemann.Proto.State.Builder getStatesBuilder(
                int index
            ) {
                return getStatesFieldBuilder().getBuilder(index);
            }

            /**
             * <code>repeated .State states = 4;</code>
             */
            public com.aphyr.riemann.Proto.StateOrBuilder getStatesOrBuilder(
                int index
            ) {
                if (statesBuilder_ == null) {
                    return states_.get(index);
                } else {
                    return statesBuilder_.getMessageOrBuilder(index);
                }
            }

            /**
             * <code>repeated .State states = 4;</code>
             */
            public java.util.List<? extends com.aphyr.riemann.Proto.StateOrBuilder>
            getStatesOrBuilderList() {
                if (statesBuilder_ != null) {
                    return statesBuilder_.getMessageOrBuilderList();
                } else {
                    return java.util.Collections.unmodifiableList(states_);
                }
            }

            /**
             * <code>repeated .State states = 4;</code>
             */
            public com.aphyr.riemann.Proto.State.Builder addStatesBuilder() {
                return getStatesFieldBuilder().addBuilder(
                    com.aphyr.riemann.Proto.State.getDefaultInstance());
            }

            /**
             * <code>repeated .State states = 4;</code>
             */
            public com.aphyr.riemann.Proto.State.Builder addStatesBuilder(
                int index
            ) {
                return getStatesFieldBuilder().addBuilder(index,
                    com.aphyr.riemann.Proto.State.getDefaultInstance());
            }

            /**
             * <code>repeated .State states = 4;</code>
             */
            public java.util.List<com.aphyr.riemann.Proto.State.Builder> getStatesBuilderList() {
                return getStatesFieldBuilder().getBuilderList();
            }

            private com.spotify.ffwd.protobuf250.RepeatedFieldBuilder<com.aphyr.riemann.Proto
            .State, com.aphyr.riemann.Proto.State.Builder, com.aphyr.riemann.Proto
            .StateOrBuilder> getStatesFieldBuilder() {
                if (statesBuilder_ == null) {
                    statesBuilder_ =
                        new com.spotify.ffwd.protobuf250.RepeatedFieldBuilder<com.aphyr.riemann
                        .Proto.State, com.aphyr.riemann.Proto.State.Builder, com.aphyr.riemann
                            .Proto.StateOrBuilder>(
                            states_, ((bitField0_ & 0x00000004) == 0x00000004),
                            getParentForChildren(), isClean());
                    states_ = null;
                }
                return statesBuilder_;
            }

            // optional .Query query = 5;
            private com.aphyr.riemann.Proto.Query query_ =
                com.aphyr.riemann.Proto.Query.getDefaultInstance();
            private com.spotify.ffwd.protobuf250.SingleFieldBuilder<com.aphyr.riemann.Proto
            .Query, com.aphyr.riemann.Proto.Query.Builder, com.aphyr.riemann.Proto.QueryOrBuilder>
                queryBuilder_;

            /**
             * <code>optional .Query query = 5;</code>
             */
            public boolean hasQuery() {
                return ((bitField0_ & 0x00000008) == 0x00000008);
            }

            /**
             * <code>optional .Query query = 5;</code>
             */
            public com.aphyr.riemann.Proto.Query getQuery() {
                if (queryBuilder_ == null) {
                    return query_;
                } else {
                    return queryBuilder_.getMessage();
                }
            }

            /**
             * <code>optional .Query query = 5;</code>
             */
            public Builder setQuery(com.aphyr.riemann.Proto.Query value) {
                if (queryBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    query_ = value;
                    onChanged();
                } else {
                    queryBuilder_.setMessage(value);
                }
                bitField0_ |= 0x00000008;
                return this;
            }

            /**
             * <code>optional .Query query = 5;</code>
             */
            public Builder setQuery(
                com.aphyr.riemann.Proto.Query.Builder builderForValue
            ) {
                if (queryBuilder_ == null) {
                    query_ = builderForValue.build();
                    onChanged();
                } else {
                    queryBuilder_.setMessage(builderForValue.build());
                }
                bitField0_ |= 0x00000008;
                return this;
            }

            /**
             * <code>optional .Query query = 5;</code>
             */
            public Builder mergeQuery(com.aphyr.riemann.Proto.Query value) {
                if (queryBuilder_ == null) {
                    if (((bitField0_ & 0x00000008) == 0x00000008) &&
                        query_ != com.aphyr.riemann.Proto.Query.getDefaultInstance()) {
                        query_ = com.aphyr.riemann.Proto.Query
                            .newBuilder(query_)
                            .mergeFrom(value)
                            .buildPartial();
                    } else {
                        query_ = value;
                    }
                    onChanged();
                } else {
                    queryBuilder_.mergeFrom(value);
                }
                bitField0_ |= 0x00000008;
                return this;
            }

            /**
             * <code>optional .Query query = 5;</code>
             */
            public Builder clearQuery() {
                if (queryBuilder_ == null) {
                    query_ = com.aphyr.riemann.Proto.Query.getDefaultInstance();
                    onChanged();
                } else {
                    queryBuilder_.clear();
                }
                bitField0_ = (bitField0_ & ~0x00000008);
                return this;
            }

            /**
             * <code>optional .Query query = 5;</code>
             */
            public com.aphyr.riemann.Proto.Query.Builder getQueryBuilder() {
                bitField0_ |= 0x00000008;
                onChanged();
                return getQueryFieldBuilder().getBuilder();
            }

            /**
             * <code>optional .Query query = 5;</code>
             */
            public com.aphyr.riemann.Proto.QueryOrBuilder getQueryOrBuilder() {
                if (queryBuilder_ != null) {
                    return queryBuilder_.getMessageOrBuilder();
                } else {
                    return query_;
                }
            }

            /**
             * <code>optional .Query query = 5;</code>
             */
            private com.spotify.ffwd.protobuf250.SingleFieldBuilder<com.aphyr.riemann.Proto
            .Query, com.aphyr.riemann.Proto.Query.Builder, com.aphyr.riemann.Proto
            .QueryOrBuilder> getQueryFieldBuilder() {
                if (queryBuilder_ == null) {
                    queryBuilder_ =
                        new com.spotify.ffwd.protobuf250.SingleFieldBuilder<com.aphyr.riemann
                        .Proto.Query, com.aphyr.riemann.Proto.Query.Builder, com.aphyr.riemann
                        .Proto.QueryOrBuilder>(
                            query_, getParentForChildren(), isClean());
                    query_ = null;
                }
                return queryBuilder_;
            }

            // repeated .Event events = 6;
            private java.util.List<com.aphyr.riemann.Proto.Event> events_ =
                java.util.Collections.emptyList();

            private void ensureEventsIsMutable() {
                if (!((bitField0_ & 0x00000010) == 0x00000010)) {
                    events_ = new java.util.ArrayList<com.aphyr.riemann.Proto.Event>(events_);
                    bitField0_ |= 0x00000010;
                }
            }

            private com.spotify.ffwd.protobuf250.RepeatedFieldBuilder<com.aphyr.riemann.Proto
            .Event, com.aphyr.riemann.Proto.Event.Builder, com.aphyr.riemann.Proto.EventOrBuilder>
                eventsBuilder_;

            /**
             * <code>repeated .Event events = 6;</code>
             */
            public java.util.List<com.aphyr.riemann.Proto.Event> getEventsList() {
                if (eventsBuilder_ == null) {
                    return java.util.Collections.unmodifiableList(events_);
                } else {
                    return eventsBuilder_.getMessageList();
                }
            }

            /**
             * <code>repeated .Event events = 6;</code>
             */
            public int getEventsCount() {
                if (eventsBuilder_ == null) {
                    return events_.size();
                } else {
                    return eventsBuilder_.getCount();
                }
            }

            /**
             * <code>repeated .Event events = 6;</code>
             */
            public com.aphyr.riemann.Proto.Event getEvents(int index) {
                if (eventsBuilder_ == null) {
                    return events_.get(index);
                } else {
                    return eventsBuilder_.getMessage(index);
                }
            }

            /**
             * <code>repeated .Event events = 6;</code>
             */
            public Builder setEvents(
                int index, com.aphyr.riemann.Proto.Event value
            ) {
                if (eventsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureEventsIsMutable();
                    events_.set(index, value);
                    onChanged();
                } else {
                    eventsBuilder_.setMessage(index, value);
                }
                return this;
            }

            /**
             * <code>repeated .Event events = 6;</code>
             */
            public Builder setEvents(
                int index, com.aphyr.riemann.Proto.Event.Builder builderForValue
            ) {
                if (eventsBuilder_ == null) {
                    ensureEventsIsMutable();
                    events_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    eventsBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }

            /**
             * <code>repeated .Event events = 6;</code>
             */
            public Builder addEvents(com.aphyr.riemann.Proto.Event value) {
                if (eventsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureEventsIsMutable();
                    events_.add(value);
                    onChanged();
                } else {
                    eventsBuilder_.addMessage(value);
                }
                return this;
            }

            /**
             * <code>repeated .Event events = 6;</code>
             */
            public Builder addEvents(
                int index, com.aphyr.riemann.Proto.Event value
            ) {
                if (eventsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureEventsIsMutable();
                    events_.add(index, value);
                    onChanged();
                } else {
                    eventsBuilder_.addMessage(index, value);
                }
                return this;
            }

            /**
             * <code>repeated .Event events = 6;</code>
             */
            public Builder addEvents(
                com.aphyr.riemann.Proto.Event.Builder builderForValue
            ) {
                if (eventsBuilder_ == null) {
                    ensureEventsIsMutable();
                    events_.add(builderForValue.build());
                    onChanged();
                } else {
                    eventsBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }

            /**
             * <code>repeated .Event events = 6;</code>
             */
            public Builder addEvents(
                int index, com.aphyr.riemann.Proto.Event.Builder builderForValue
            ) {
                if (eventsBuilder_ == null) {
                    ensureEventsIsMutable();
                    events_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    eventsBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }

            /**
             * <code>repeated .Event events = 6;</code>
             */
            public Builder addAllEvents(
                java.lang.Iterable<? extends com.aphyr.riemann.Proto.Event> values
            ) {
                if (eventsBuilder_ == null) {
                    ensureEventsIsMutable();
                    super.addAll(values, events_);
                    onChanged();
                } else {
                    eventsBuilder_.addAllMessages(values);
                }
                return this;
            }

            /**
             * <code>repeated .Event events = 6;</code>
             */
            public Builder clearEvents() {
                if (eventsBuilder_ == null) {
                    events_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000010);
                    onChanged();
                } else {
                    eventsBuilder_.clear();
                }
                return this;
            }

            /**
             * <code>repeated .Event events = 6;</code>
             */
            public Builder removeEvents(int index) {
                if (eventsBuilder_ == null) {
                    ensureEventsIsMutable();
                    events_.remove(index);
                    onChanged();
                } else {
                    eventsBuilder_.remove(index);
                }
                return this;
            }

            /**
             * <code>repeated .Event events = 6;</code>
             */
            public com.aphyr.riemann.Proto.Event.Builder getEventsBuilder(
                int index
            ) {
                return getEventsFieldBuilder().getBuilder(index);
            }

            /**
             * <code>repeated .Event events = 6;</code>
             */
            public com.aphyr.riemann.Proto.EventOrBuilder getEventsOrBuilder(
                int index
            ) {
                if (eventsBuilder_ == null) {
                    return events_.get(index);
                } else {
                    return eventsBuilder_.getMessageOrBuilder(index);
                }
            }

            /**
             * <code>repeated .Event events = 6;</code>
             */
            public java.util.List<? extends com.aphyr.riemann.Proto.EventOrBuilder> getEventsOrBuilderList() {
                if (eventsBuilder_ != null) {
                    return eventsBuilder_.getMessageOrBuilderList();
                } else {
                    return java.util.Collections.unmodifiableList(events_);
                }
            }

            /**
             * <code>repeated .Event events = 6;</code>
             */
            public com.aphyr.riemann.Proto.Event.Builder addEventsBuilder() {
                return getEventsFieldBuilder().addBuilder(
                    com.aphyr.riemann.Proto.Event.getDefaultInstance());
            }

            /**
             * <code>repeated .Event events = 6;</code>
             */
            public com.aphyr.riemann.Proto.Event.Builder addEventsBuilder(
                int index
            ) {
                return getEventsFieldBuilder().addBuilder(index,
                    com.aphyr.riemann.Proto.Event.getDefaultInstance());
            }

            /**
             * <code>repeated .Event events = 6;</code>
             */
            public java.util.List<com.aphyr.riemann.Proto.Event.Builder> getEventsBuilderList() {
                return getEventsFieldBuilder().getBuilderList();
            }

            private com.spotify.ffwd.protobuf250.RepeatedFieldBuilder<com.aphyr.riemann.Proto.Event, com.aphyr.riemann.Proto.Event.Builder, com.aphyr.riemann.Proto.EventOrBuilder> getEventsFieldBuilder() {
                if (eventsBuilder_ == null) {
                    eventsBuilder_ =
                        new com.spotify.ffwd.protobuf250.RepeatedFieldBuilder<com.aphyr.riemann.Proto.Event, com.aphyr.riemann.Proto.Event.Builder, com.aphyr.riemann.Proto.EventOrBuilder>(
                            events_, ((bitField0_ & 0x00000010) == 0x00000010),
                            getParentForChildren(), isClean());
                    events_ = null;
                }
                return eventsBuilder_;
            }

            // @@protoc_insertion_point(builder_scope:Msg)
        }

        static {
            defaultInstance = new Msg(true);
            defaultInstance.initFields();
        }

        // @@protoc_insertion_point(class_scope:Msg)
    }

    public interface AttributeOrBuilder extends com.spotify.ffwd.protobuf250.MessageOrBuilder {

        // required string key = 1;

        /**
         * <code>required string key = 1;</code>
         */
        boolean hasKey();

        /**
         * <code>required string key = 1;</code>
         */
        java.lang.String getKey();

        /**
         * <code>required string key = 1;</code>
         */
        com.spotify.ffwd.protobuf250.ByteString getKeyBytes();

        // optional string value = 2;

        /**
         * <code>optional string value = 2;</code>
         */
        boolean hasValue();

        /**
         * <code>optional string value = 2;</code>
         */
        java.lang.String getValue();

        /**
         * <code>optional string value = 2;</code>
         */
        com.spotify.ffwd.protobuf250.ByteString getValueBytes();
    }

    /**
     * Protobuf type {@code Attribute}
     */
    public static final class Attribute extends com.spotify.ffwd.protobuf250.GeneratedMessage
        implements AttributeOrBuilder {
        // Use Attribute.newBuilder() to construct.
        private Attribute(com.spotify.ffwd.protobuf250.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.unknownFields = builder.getUnknownFields();
        }

        private Attribute(boolean noInit) {
            this.unknownFields = com.spotify.ffwd.protobuf250.UnknownFieldSet.getDefaultInstance();
        }

        private static final Attribute defaultInstance;

        public static Attribute getDefaultInstance() {
            return defaultInstance;
        }

        public Attribute getDefaultInstanceForType() {
            return defaultInstance;
        }

        private final com.spotify.ffwd.protobuf250.UnknownFieldSet unknownFields;

        @java.lang.Override
        public final com.spotify.ffwd.protobuf250.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private Attribute(
            com.spotify.ffwd.protobuf250.CodedInputStream input,
            com.spotify.ffwd.protobuf250.ExtensionRegistryLite extensionRegistry
        ) throws com.spotify.ffwd.protobuf250.InvalidProtocolBufferException {
            initFields();
            int mutable_bitField0_ = 0;
            com.spotify.ffwd.protobuf250.UnknownFieldSet.Builder unknownFields =
                com.spotify.ffwd.protobuf250.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 10: {
                            bitField0_ |= 0x00000001;
                            key_ = input.readBytes();
                            break;
                        }
                        case 18: {
                            bitField0_ |= 0x00000002;
                            value_ = input.readBytes();
                            break;
                        }
                    }
                }
            } catch (com.spotify.ffwd.protobuf250.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.spotify.ffwd.protobuf250.InvalidProtocolBufferException(
                    e.getMessage()).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final com.spotify.ffwd.protobuf250.Descriptors.Descriptor getDescriptor() {
            return com.aphyr.riemann.Proto.internal_static_Attribute_descriptor;
        }

        protected com.spotify.ffwd.protobuf250.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return com.aphyr.riemann.Proto.internal_static_Attribute_fieldAccessorTable.ensureFieldAccessorsInitialized(
                com.aphyr.riemann.Proto.Attribute.class,
                com.aphyr.riemann.Proto.Attribute.Builder.class);
        }

        public static com.spotify.ffwd.protobuf250.Parser<Attribute> PARSER =
            new com.spotify.ffwd.protobuf250.AbstractParser<Attribute>() {
                public Attribute parsePartialFrom(
                    com.spotify.ffwd.protobuf250.CodedInputStream input,
                    com.spotify.ffwd.protobuf250.ExtensionRegistryLite extensionRegistry
                ) throws com.spotify.ffwd.protobuf250.InvalidProtocolBufferException {
                    return new Attribute(input, extensionRegistry);
                }
            };

        @java.lang.Override
        public com.spotify.ffwd.protobuf250.Parser<Attribute> getParserForType() {
            return PARSER;
        }

        private int bitField0_;
        // required string key = 1;
        public static final int KEY_FIELD_NUMBER = 1;
        private java.lang.Object key_;

        /**
         * <code>required string key = 1;</code>
         */
        public boolean hasKey() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }

        /**
         * <code>required string key = 1;</code>
         */
        public java.lang.String getKey() {
            java.lang.Object ref = key_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.spotify.ffwd.protobuf250.ByteString bs =
                    (com.spotify.ffwd.protobuf250.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    key_ = s;
                }
                return s;
            }
        }

        /**
         * <code>required string key = 1;</code>
         */
        public com.spotify.ffwd.protobuf250.ByteString getKeyBytes() {
            java.lang.Object ref = key_;
            if (ref instanceof java.lang.String) {
                com.spotify.ffwd.protobuf250.ByteString b =
                    com.spotify.ffwd.protobuf250.ByteString.copyFromUtf8((java.lang.String) ref);
                key_ = b;
                return b;
            } else {
                return (com.spotify.ffwd.protobuf250.ByteString) ref;
            }
        }

        // optional string value = 2;
        public static final int VALUE_FIELD_NUMBER = 2;
        private java.lang.Object value_;

        /**
         * <code>optional string value = 2;</code>
         */
        public boolean hasValue() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }

        /**
         * <code>optional string value = 2;</code>
         */
        public java.lang.String getValue() {
            java.lang.Object ref = value_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.spotify.ffwd.protobuf250.ByteString bs =
                    (com.spotify.ffwd.protobuf250.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    value_ = s;
                }
                return s;
            }
        }

        /**
         * <code>optional string value = 2;</code>
         */
        public com.spotify.ffwd.protobuf250.ByteString getValueBytes() {
            java.lang.Object ref = value_;
            if (ref instanceof java.lang.String) {
                com.spotify.ffwd.protobuf250.ByteString b =
                    com.spotify.ffwd.protobuf250.ByteString.copyFromUtf8((java.lang.String) ref);
                value_ = b;
                return b;
            } else {
                return (com.spotify.ffwd.protobuf250.ByteString) ref;
            }
        }

        private void initFields() {
            key_ = "";
            value_ = "";
        }

        private byte memoizedIsInitialized = -1;

        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized != -1) {
                return isInitialized == 1;
            }

            if (!hasKey()) {
                memoizedIsInitialized = 0;
                return false;
            }
            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.spotify.ffwd.protobuf250.CodedOutputStream output)
            throws java.io.IOException {
            getSerializedSize();
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeBytes(1, getKeyBytes());
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeBytes(2, getValueBytes());
            }
            getUnknownFields().writeTo(output);
        }

        private int memoizedSerializedSize = -1;

        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1) {
                return size;
            }

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.spotify.ffwd.protobuf250.CodedOutputStream.computeBytesSize(1,
                    getKeyBytes());
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.spotify.ffwd.protobuf250.CodedOutputStream.computeBytesSize(2,
                    getValueBytes());
            }
            size += getUnknownFields().getSerializedSize();
            memoizedSerializedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;

        @java.lang.Override
        protected java.lang.Object writeReplace() throws java.io.ObjectStreamException {
            return super.writeReplace();
        }

        public static com.aphyr.riemann.Proto.Attribute parseFrom(
            com.spotify.ffwd.protobuf250.ByteString data
        ) throws com.spotify.ffwd.protobuf250.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static com.aphyr.riemann.Proto.Attribute parseFrom(
            com.spotify.ffwd.protobuf250.ByteString data,
            com.spotify.ffwd.protobuf250.ExtensionRegistryLite extensionRegistry
        ) throws com.spotify.ffwd.protobuf250.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.aphyr.riemann.Proto.Attribute parseFrom(byte[] data)
            throws com.spotify.ffwd.protobuf250.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static com.aphyr.riemann.Proto.Attribute parseFrom(
            byte[] data, com.spotify.ffwd.protobuf250.ExtensionRegistryLite extensionRegistry
        ) throws com.spotify.ffwd.protobuf250.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.aphyr.riemann.Proto.Attribute parseFrom(java.io.InputStream input)
            throws java.io.IOException {
            return PARSER.parseFrom(input);
        }

        public static com.aphyr.riemann.Proto.Attribute parseFrom(
            java.io.InputStream input,
            com.spotify.ffwd.protobuf250.ExtensionRegistryLite extensionRegistry
        ) throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }

        public static com.aphyr.riemann.Proto.Attribute parseDelimitedFrom(
            java.io.InputStream input
        ) throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input);
        }

        public static com.aphyr.riemann.Proto.Attribute parseDelimitedFrom(
            java.io.InputStream input,
            com.spotify.ffwd.protobuf250.ExtensionRegistryLite extensionRegistry
        ) throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static com.aphyr.riemann.Proto.Attribute parseFrom(
            com.spotify.ffwd.protobuf250.CodedInputStream input
        ) throws java.io.IOException {
            return PARSER.parseFrom(input);
        }

        public static com.aphyr.riemann.Proto.Attribute parseFrom(
            com.spotify.ffwd.protobuf250.CodedInputStream input,
            com.spotify.ffwd.protobuf250.ExtensionRegistryLite extensionRegistry
        ) throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(com.aphyr.riemann.Proto.Attribute prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
            com.spotify.ffwd.protobuf250.GeneratedMessage.BuilderParent parent
        ) {
            Builder builder = new Builder(parent);
            return builder;
        }

        /**
         * Protobuf type {@code Attribute}
         */
        public static final class Builder
            extends com.spotify.ffwd.protobuf250.GeneratedMessage.Builder<Builder>
            implements com.aphyr.riemann.Proto.AttributeOrBuilder {
            public static final com.spotify.ffwd.protobuf250.Descriptors.Descriptor getDescriptor() {
                return com.aphyr.riemann.Proto.internal_static_Attribute_descriptor;
            }

            protected com.spotify.ffwd.protobuf250.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return com.aphyr.riemann.Proto.internal_static_Attribute_fieldAccessorTable.ensureFieldAccessorsInitialized(
                    com.aphyr.riemann.Proto.Attribute.class,
                    com.aphyr.riemann.Proto.Attribute.Builder.class);
            }

            // Construct using com.aphyr.riemann.Proto.Attribute.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                com.spotify.ffwd.protobuf250.GeneratedMessage.BuilderParent parent
            ) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.spotify.ffwd.protobuf250.GeneratedMessage.alwaysUseFieldBuilders) {
                }
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                key_ = "";
                bitField0_ = (bitField0_ & ~0x00000001);
                value_ = "";
                bitField0_ = (bitField0_ & ~0x00000002);
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public com.spotify.ffwd.protobuf250.Descriptors.Descriptor getDescriptorForType() {
                return com.aphyr.riemann.Proto.internal_static_Attribute_descriptor;
            }

            public com.aphyr.riemann.Proto.Attribute getDefaultInstanceForType() {
                return com.aphyr.riemann.Proto.Attribute.getDefaultInstance();
            }

            public com.aphyr.riemann.Proto.Attribute build() {
                com.aphyr.riemann.Proto.Attribute result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public com.aphyr.riemann.Proto.Attribute buildPartial() {
                com.aphyr.riemann.Proto.Attribute result =
                    new com.aphyr.riemann.Proto.Attribute(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.key_ = key_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.value_ = value_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(com.spotify.ffwd.protobuf250.Message other) {
                if (other instanceof com.aphyr.riemann.Proto.Attribute) {
                    return mergeFrom((com.aphyr.riemann.Proto.Attribute) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.aphyr.riemann.Proto.Attribute other) {
                if (other == com.aphyr.riemann.Proto.Attribute.getDefaultInstance()) {
                    return this;
                }
                if (other.hasKey()) {
                    bitField0_ |= 0x00000001;
                    key_ = other.key_;
                    onChanged();
                }
                if (other.hasValue()) {
                    bitField0_ |= 0x00000002;
                    value_ = other.value_;
                    onChanged();
                }
                this.mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasKey()) {

                    return false;
                }
                return true;
            }

            public Builder mergeFrom(
                com.spotify.ffwd.protobuf250.CodedInputStream input,
                com.spotify.ffwd.protobuf250.ExtensionRegistryLite extensionRegistry
            ) throws java.io.IOException {
                com.aphyr.riemann.Proto.Attribute parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.spotify.ffwd.protobuf250.InvalidProtocolBufferException e) {
                    parsedMessage = (com.aphyr.riemann.Proto.Attribute) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int bitField0_;

            // required string key = 1;
            private java.lang.Object key_ = "";

            /**
             * <code>required string key = 1;</code>
             */
            public boolean hasKey() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }

            /**
             * <code>required string key = 1;</code>
             */
            public java.lang.String getKey() {
                java.lang.Object ref = key_;
                if (!(ref instanceof java.lang.String)) {
                    java.lang.String s =
                        ((com.spotify.ffwd.protobuf250.ByteString) ref).toStringUtf8();
                    key_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>required string key = 1;</code>
             */
            public com.spotify.ffwd.protobuf250.ByteString getKeyBytes() {
                java.lang.Object ref = key_;
                if (ref instanceof String) {
                    com.spotify.ffwd.protobuf250.ByteString b =
                        com.spotify.ffwd.protobuf250.ByteString.copyFromUtf8(
                            (java.lang.String) ref);
                    key_ = b;
                    return b;
                } else {
                    return (com.spotify.ffwd.protobuf250.ByteString) ref;
                }
            }

            /**
             * <code>required string key = 1;</code>
             */
            public Builder setKey(
                java.lang.String value
            ) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000001;
                key_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>required string key = 1;</code>
             */
            public Builder clearKey() {
                bitField0_ = (bitField0_ & ~0x00000001);
                key_ = getDefaultInstance().getKey();
                onChanged();
                return this;
            }

            /**
             * <code>required string key = 1;</code>
             */
            public Builder setKeyBytes(
                com.spotify.ffwd.protobuf250.ByteString value
            ) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000001;
                key_ = value;
                onChanged();
                return this;
            }

            // optional string value = 2;
            private java.lang.Object value_ = "";

            /**
             * <code>optional string value = 2;</code>
             */
            public boolean hasValue() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }

            /**
             * <code>optional string value = 2;</code>
             */
            public java.lang.String getValue() {
                java.lang.Object ref = value_;
                if (!(ref instanceof java.lang.String)) {
                    java.lang.String s =
                        ((com.spotify.ffwd.protobuf250.ByteString) ref).toStringUtf8();
                    value_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>optional string value = 2;</code>
             */
            public com.spotify.ffwd.protobuf250.ByteString getValueBytes() {
                java.lang.Object ref = value_;
                if (ref instanceof String) {
                    com.spotify.ffwd.protobuf250.ByteString b =
                        com.spotify.ffwd.protobuf250.ByteString.copyFromUtf8(
                            (java.lang.String) ref);
                    value_ = b;
                    return b;
                } else {
                    return (com.spotify.ffwd.protobuf250.ByteString) ref;
                }
            }

            /**
             * <code>optional string value = 2;</code>
             */
            public Builder setValue(
                java.lang.String value
            ) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000002;
                value_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>optional string value = 2;</code>
             */
            public Builder clearValue() {
                bitField0_ = (bitField0_ & ~0x00000002);
                value_ = getDefaultInstance().getValue();
                onChanged();
                return this;
            }

            /**
             * <code>optional string value = 2;</code>
             */
            public Builder setValueBytes(
                com.spotify.ffwd.protobuf250.ByteString value
            ) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000002;
                value_ = value;
                onChanged();
                return this;
            }

            // @@protoc_insertion_point(builder_scope:Attribute)
        }

        static {
            defaultInstance = new Attribute(true);
            defaultInstance.initFields();
        }

        // @@protoc_insertion_point(class_scope:Attribute)
    }

    private static com.spotify.ffwd.protobuf250.Descriptors.Descriptor
        internal_static_State_descriptor;
    private static com.spotify.ffwd.protobuf250.GeneratedMessage.FieldAccessorTable
        internal_static_State_fieldAccessorTable;
    private static com.spotify.ffwd.protobuf250.Descriptors.Descriptor
        internal_static_Event_descriptor;
    private static com.spotify.ffwd.protobuf250.GeneratedMessage.FieldAccessorTable
        internal_static_Event_fieldAccessorTable;
    private static com.spotify.ffwd.protobuf250.Descriptors.Descriptor
        internal_static_Query_descriptor;
    private static com.spotify.ffwd.protobuf250.GeneratedMessage.FieldAccessorTable
        internal_static_Query_fieldAccessorTable;
    private static com.spotify.ffwd.protobuf250.Descriptors.Descriptor
        internal_static_Msg_descriptor;
    private static com.spotify.ffwd.protobuf250.GeneratedMessage.FieldAccessorTable
        internal_static_Msg_fieldAccessorTable;
    private static com.spotify.ffwd.protobuf250.Descriptors.Descriptor
        internal_static_Attribute_descriptor;
    private static com.spotify.ffwd.protobuf250.GeneratedMessage.FieldAccessorTable
        internal_static_Attribute_fieldAccessorTable;

    public static com.spotify.ffwd.protobuf250.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.spotify.ffwd.protobuf250.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\023proto/riemann.proto\"\201\001\n\005State\022\014\n\004time\030" +
                "\001 \001(\003\022\r\n\005state\030\002 \001(\t\022\017\n\007service\030\003 \001(\t\022\014\n" +
                "\004host\030\004 \001(\t\022\023\n\013description\030\005 \001(\t\022\014\n\004once" +
                "\030\006 \001(\010\022\014\n\004tags\030\007 \003(\t\022\013\n\003ttl\030\010 \001(\002\"\316\001\n\005Ev" +
                "ent\022\014\n\004time\030\001 \001(\003\022\r\n\005state\030\002 \001(\t\022\017\n\007serv" +
                "ice\030\003 \001(\t\022\014\n\004host\030\004 \001(\t\022\023\n\013description\030\005" +
                " \001(\t\022\014\n\004tags\030\007 \003(\t\022\013\n\003ttl\030\010 \001(\002\022\036\n\nattri" +
                "butes\030\t \003(\0132\n.Attribute\022\025\n\rmetric_sint64" +
                "\030\r \001(\022\022\020\n\010metric_d\030\016 \001(\001\022\020\n\010metric_f\030\017 \001" +
                "(\002\"\027\n\005Query\022\016\n\006string\030\001 \001(\t\"g\n\003Msg\022\n\n\002ok",
            "\030\002 \001(\010\022\r\n\005error\030\003 \001(\t\022\026\n\006states\030\004 \003(\0132\006." +
                "State\022\025\n\005query\030\005 \001(\0132\006.Query\022\026\n\006events\030\006" +
                " \003(\0132\006.Event\"\'\n\tAttribute\022\013\n\003key\030\001 \002(\t\022\r" +
                "\n\005value\030\002 \001(\tB\032\n\021com.aphyr.riemannB\005Prot" + "o"
        };
        com.spotify.ffwd.protobuf250.Descriptors.FileDescriptor.InternalDescriptorAssigner
            assigner =
            new com.spotify.ffwd.protobuf250.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
                public com.spotify.ffwd.protobuf250.ExtensionRegistry assignDescriptors(
                    com.spotify.ffwd.protobuf250.Descriptors.FileDescriptor root
                ) {
                    descriptor = root;
                    internal_static_State_descriptor = getDescriptor().getMessageTypes().get(0);
                    internal_static_State_fieldAccessorTable =
                        new com.spotify.ffwd.protobuf250.GeneratedMessage.FieldAccessorTable(
                            internal_static_State_descriptor, new java.lang.String[]{
                            "Time", "State", "Service", "Host", "Description", "Once", "Tags",
                            "Ttl",
                        });
                    internal_static_Event_descriptor = getDescriptor().getMessageTypes().get(1);
                    internal_static_Event_fieldAccessorTable =
                        new com.spotify.ffwd.protobuf250.GeneratedMessage.FieldAccessorTable(
                            internal_static_Event_descriptor, new java.lang.String[]{
                            "Time", "State", "Service", "Host", "Description", "Tags", "Ttl",
                            "Attributes", "MetricSint64", "MetricD", "MetricF",
                        });
                    internal_static_Query_descriptor = getDescriptor().getMessageTypes().get(2);
                    internal_static_Query_fieldAccessorTable =
                        new com.spotify.ffwd.protobuf250.GeneratedMessage.FieldAccessorTable(
                            internal_static_Query_descriptor, new java.lang.String[]{"String",});
                    internal_static_Msg_descriptor = getDescriptor().getMessageTypes().get(3);
                    internal_static_Msg_fieldAccessorTable =
                        new com.spotify.ffwd.protobuf250.GeneratedMessage.FieldAccessorTable(
                            internal_static_Msg_descriptor,
                            new java.lang.String[]{"Ok", "Error", "States", "Query", "Events",});
                    internal_static_Attribute_descriptor = getDescriptor().getMessageTypes().get(4);
                    internal_static_Attribute_fieldAccessorTable =
                        new com.spotify.ffwd.protobuf250.GeneratedMessage.FieldAccessorTable(
                            internal_static_Attribute_descriptor,
                            new java.lang.String[]{"Key", "Value",});
                    return null;
                }
            };
        com.spotify.ffwd.protobuf250.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.spotify.ffwd.protobuf250.Descriptors.FileDescriptor[]{
            }, assigner);
    }

    // @@protoc_insertion_point(outer_class_scope)
}
