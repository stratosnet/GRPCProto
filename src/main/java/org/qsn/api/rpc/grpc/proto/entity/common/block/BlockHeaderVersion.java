// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: qsn/entity/common/block/Block.proto

package org.qsn.api.rpc.grpc.proto.entity.common.block;

/**
 * Protobuf type {@code org.qsn.protobuf.BlockHeaderVersion}
 */
public final class BlockHeaderVersion extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:org.qsn.protobuf.BlockHeaderVersion)
    BlockHeaderVersionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BlockHeaderVersion.newBuilder() to construct.
  private BlockHeaderVersion(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BlockHeaderVersion() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BlockHeaderVersion();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BlockHeaderVersion(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            block_ = input.readInt32();
            break;
          }
          case 16: {

            app_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.qsn.api.rpc.grpc.proto.entity.common.block.Block.internal_static_org_qsn_protobuf_BlockHeaderVersion_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.qsn.api.rpc.grpc.proto.entity.common.block.Block.internal_static_org_qsn_protobuf_BlockHeaderVersion_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.qsn.api.rpc.grpc.proto.entity.common.block.BlockHeaderVersion.class, org.qsn.api.rpc.grpc.proto.entity.common.block.BlockHeaderVersion.Builder.class);
  }

  public static final int BLOCK_FIELD_NUMBER = 1;
  private int block_;
  /**
   * <code>int32 block = 1;</code>
   * @return The block.
   */
  @java.lang.Override
  public int getBlock() {
    return block_;
  }

  public static final int APP_FIELD_NUMBER = 2;
  private int app_;
  /**
   * <code>int32 app = 2;</code>
   * @return The app.
   */
  @java.lang.Override
  public int getApp() {
    return app_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (block_ != 0) {
      output.writeInt32(1, block_);
    }
    if (app_ != 0) {
      output.writeInt32(2, app_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (block_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, block_);
    }
    if (app_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, app_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.qsn.api.rpc.grpc.proto.entity.common.block.BlockHeaderVersion)) {
      return super.equals(obj);
    }
    org.qsn.api.rpc.grpc.proto.entity.common.block.BlockHeaderVersion other = (org.qsn.api.rpc.grpc.proto.entity.common.block.BlockHeaderVersion) obj;

    if (getBlock()
        != other.getBlock()) return false;
    if (getApp()
        != other.getApp()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + BLOCK_FIELD_NUMBER;
    hash = (53 * hash) + getBlock();
    hash = (37 * hash) + APP_FIELD_NUMBER;
    hash = (53 * hash) + getApp();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.qsn.api.rpc.grpc.proto.entity.common.block.BlockHeaderVersion parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.qsn.api.rpc.grpc.proto.entity.common.block.BlockHeaderVersion parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.qsn.api.rpc.grpc.proto.entity.common.block.BlockHeaderVersion parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.qsn.api.rpc.grpc.proto.entity.common.block.BlockHeaderVersion parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.qsn.api.rpc.grpc.proto.entity.common.block.BlockHeaderVersion parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.qsn.api.rpc.grpc.proto.entity.common.block.BlockHeaderVersion parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.qsn.api.rpc.grpc.proto.entity.common.block.BlockHeaderVersion parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.qsn.api.rpc.grpc.proto.entity.common.block.BlockHeaderVersion parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.qsn.api.rpc.grpc.proto.entity.common.block.BlockHeaderVersion parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.qsn.api.rpc.grpc.proto.entity.common.block.BlockHeaderVersion parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.qsn.api.rpc.grpc.proto.entity.common.block.BlockHeaderVersion parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.qsn.api.rpc.grpc.proto.entity.common.block.BlockHeaderVersion parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.qsn.api.rpc.grpc.proto.entity.common.block.BlockHeaderVersion prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code org.qsn.protobuf.BlockHeaderVersion}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.qsn.protobuf.BlockHeaderVersion)
      org.qsn.api.rpc.grpc.proto.entity.common.block.BlockHeaderVersionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.qsn.api.rpc.grpc.proto.entity.common.block.Block.internal_static_org_qsn_protobuf_BlockHeaderVersion_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.qsn.api.rpc.grpc.proto.entity.common.block.Block.internal_static_org_qsn_protobuf_BlockHeaderVersion_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.qsn.api.rpc.grpc.proto.entity.common.block.BlockHeaderVersion.class, org.qsn.api.rpc.grpc.proto.entity.common.block.BlockHeaderVersion.Builder.class);
    }

    // Construct using org.qsn.api.rpc.grpc.proto.entity.common.block.BlockHeaderVersion.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      block_ = 0;

      app_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.qsn.api.rpc.grpc.proto.entity.common.block.Block.internal_static_org_qsn_protobuf_BlockHeaderVersion_descriptor;
    }

    @java.lang.Override
    public org.qsn.api.rpc.grpc.proto.entity.common.block.BlockHeaderVersion getDefaultInstanceForType() {
      return org.qsn.api.rpc.grpc.proto.entity.common.block.BlockHeaderVersion.getDefaultInstance();
    }

    @java.lang.Override
    public org.qsn.api.rpc.grpc.proto.entity.common.block.BlockHeaderVersion build() {
      org.qsn.api.rpc.grpc.proto.entity.common.block.BlockHeaderVersion result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.qsn.api.rpc.grpc.proto.entity.common.block.BlockHeaderVersion buildPartial() {
      org.qsn.api.rpc.grpc.proto.entity.common.block.BlockHeaderVersion result = new org.qsn.api.rpc.grpc.proto.entity.common.block.BlockHeaderVersion(this);
      result.block_ = block_;
      result.app_ = app_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.qsn.api.rpc.grpc.proto.entity.common.block.BlockHeaderVersion) {
        return mergeFrom((org.qsn.api.rpc.grpc.proto.entity.common.block.BlockHeaderVersion)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.qsn.api.rpc.grpc.proto.entity.common.block.BlockHeaderVersion other) {
      if (other == org.qsn.api.rpc.grpc.proto.entity.common.block.BlockHeaderVersion.getDefaultInstance()) return this;
      if (other.getBlock() != 0) {
        setBlock(other.getBlock());
      }
      if (other.getApp() != 0) {
        setApp(other.getApp());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.qsn.api.rpc.grpc.proto.entity.common.block.BlockHeaderVersion parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.qsn.api.rpc.grpc.proto.entity.common.block.BlockHeaderVersion) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int block_ ;
    /**
     * <code>int32 block = 1;</code>
     * @return The block.
     */
    @java.lang.Override
    public int getBlock() {
      return block_;
    }
    /**
     * <code>int32 block = 1;</code>
     * @param value The block to set.
     * @return This builder for chaining.
     */
    public Builder setBlock(int value) {
      
      block_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 block = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearBlock() {
      
      block_ = 0;
      onChanged();
      return this;
    }

    private int app_ ;
    /**
     * <code>int32 app = 2;</code>
     * @return The app.
     */
    @java.lang.Override
    public int getApp() {
      return app_;
    }
    /**
     * <code>int32 app = 2;</code>
     * @param value The app to set.
     * @return This builder for chaining.
     */
    public Builder setApp(int value) {
      
      app_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 app = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearApp() {
      
      app_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:org.qsn.protobuf.BlockHeaderVersion)
  }

  // @@protoc_insertion_point(class_scope:org.qsn.protobuf.BlockHeaderVersion)
  private static final org.qsn.api.rpc.grpc.proto.entity.common.block.BlockHeaderVersion DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.qsn.api.rpc.grpc.proto.entity.common.block.BlockHeaderVersion();
  }

  public static org.qsn.api.rpc.grpc.proto.entity.common.block.BlockHeaderVersion getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BlockHeaderVersion>
      PARSER = new com.google.protobuf.AbstractParser<BlockHeaderVersion>() {
    @java.lang.Override
    public BlockHeaderVersion parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BlockHeaderVersion(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BlockHeaderVersion> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BlockHeaderVersion> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.qsn.api.rpc.grpc.proto.entity.common.block.BlockHeaderVersion getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

