// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: qsn/entity/common/transaction/AttachmentDto.proto

package org.qsn.api.rpc.grpc.proto.entity.common.transaction;

/**
 * Protobuf type {@code org.qsn.protobuf.AttachmentDto}
 */
public final class AttachmentDto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:org.qsn.protobuf.AttachmentDto)
    AttachmentDtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AttachmentDto.newBuilder() to construct.
  private AttachmentDto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AttachmentDto() {
    dataHash_ = com.google.protobuf.ByteString.EMPTY;
    signature_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AttachmentDto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AttachmentDto(
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
          case 10: {

            dataHash_ = input.readBytes();
            break;
          }
          case 18: {

            signature_ = input.readBytes();
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
    return org.qsn.api.rpc.grpc.proto.entity.common.transaction.AttachmentDtoOuterClass.internal_static_org_qsn_protobuf_AttachmentDto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.qsn.api.rpc.grpc.proto.entity.common.transaction.AttachmentDtoOuterClass.internal_static_org_qsn_protobuf_AttachmentDto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.qsn.api.rpc.grpc.proto.entity.common.transaction.AttachmentDto.class, org.qsn.api.rpc.grpc.proto.entity.common.transaction.AttachmentDto.Builder.class);
  }

  public static final int DATAHASH_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString dataHash_;
  /**
   * <code>bytes dataHash = 1;</code>
   * @return The dataHash.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDataHash() {
    return dataHash_;
  }

  public static final int SIGNATURE_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString signature_;
  /**
   * <code>bytes signature = 2;</code>
   * @return The signature.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSignature() {
    return signature_;
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
    if (!dataHash_.isEmpty()) {
      output.writeBytes(1, dataHash_);
    }
    if (!signature_.isEmpty()) {
      output.writeBytes(2, signature_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!dataHash_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, dataHash_);
    }
    if (!signature_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, signature_);
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
    if (!(obj instanceof org.qsn.api.rpc.grpc.proto.entity.common.transaction.AttachmentDto)) {
      return super.equals(obj);
    }
    org.qsn.api.rpc.grpc.proto.entity.common.transaction.AttachmentDto other = (org.qsn.api.rpc.grpc.proto.entity.common.transaction.AttachmentDto) obj;

    if (!getDataHash()
        .equals(other.getDataHash())) return false;
    if (!getSignature()
        .equals(other.getSignature())) return false;
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
    hash = (37 * hash) + DATAHASH_FIELD_NUMBER;
    hash = (53 * hash) + getDataHash().hashCode();
    hash = (37 * hash) + SIGNATURE_FIELD_NUMBER;
    hash = (53 * hash) + getSignature().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.qsn.api.rpc.grpc.proto.entity.common.transaction.AttachmentDto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.qsn.api.rpc.grpc.proto.entity.common.transaction.AttachmentDto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.qsn.api.rpc.grpc.proto.entity.common.transaction.AttachmentDto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.qsn.api.rpc.grpc.proto.entity.common.transaction.AttachmentDto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.qsn.api.rpc.grpc.proto.entity.common.transaction.AttachmentDto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.qsn.api.rpc.grpc.proto.entity.common.transaction.AttachmentDto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.qsn.api.rpc.grpc.proto.entity.common.transaction.AttachmentDto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.qsn.api.rpc.grpc.proto.entity.common.transaction.AttachmentDto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.qsn.api.rpc.grpc.proto.entity.common.transaction.AttachmentDto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.qsn.api.rpc.grpc.proto.entity.common.transaction.AttachmentDto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.qsn.api.rpc.grpc.proto.entity.common.transaction.AttachmentDto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.qsn.api.rpc.grpc.proto.entity.common.transaction.AttachmentDto parseFrom(
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
  public static Builder newBuilder(org.qsn.api.rpc.grpc.proto.entity.common.transaction.AttachmentDto prototype) {
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
   * Protobuf type {@code org.qsn.protobuf.AttachmentDto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.qsn.protobuf.AttachmentDto)
      org.qsn.api.rpc.grpc.proto.entity.common.transaction.AttachmentDtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.qsn.api.rpc.grpc.proto.entity.common.transaction.AttachmentDtoOuterClass.internal_static_org_qsn_protobuf_AttachmentDto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.qsn.api.rpc.grpc.proto.entity.common.transaction.AttachmentDtoOuterClass.internal_static_org_qsn_protobuf_AttachmentDto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.qsn.api.rpc.grpc.proto.entity.common.transaction.AttachmentDto.class, org.qsn.api.rpc.grpc.proto.entity.common.transaction.AttachmentDto.Builder.class);
    }

    // Construct using org.qsn.api.rpc.grpc.proto.entity.common.transaction.AttachmentDto.newBuilder()
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
      dataHash_ = com.google.protobuf.ByteString.EMPTY;

      signature_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.qsn.api.rpc.grpc.proto.entity.common.transaction.AttachmentDtoOuterClass.internal_static_org_qsn_protobuf_AttachmentDto_descriptor;
    }

    @java.lang.Override
    public org.qsn.api.rpc.grpc.proto.entity.common.transaction.AttachmentDto getDefaultInstanceForType() {
      return org.qsn.api.rpc.grpc.proto.entity.common.transaction.AttachmentDto.getDefaultInstance();
    }

    @java.lang.Override
    public org.qsn.api.rpc.grpc.proto.entity.common.transaction.AttachmentDto build() {
      org.qsn.api.rpc.grpc.proto.entity.common.transaction.AttachmentDto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.qsn.api.rpc.grpc.proto.entity.common.transaction.AttachmentDto buildPartial() {
      org.qsn.api.rpc.grpc.proto.entity.common.transaction.AttachmentDto result = new org.qsn.api.rpc.grpc.proto.entity.common.transaction.AttachmentDto(this);
      result.dataHash_ = dataHash_;
      result.signature_ = signature_;
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
      if (other instanceof org.qsn.api.rpc.grpc.proto.entity.common.transaction.AttachmentDto) {
        return mergeFrom((org.qsn.api.rpc.grpc.proto.entity.common.transaction.AttachmentDto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.qsn.api.rpc.grpc.proto.entity.common.transaction.AttachmentDto other) {
      if (other == org.qsn.api.rpc.grpc.proto.entity.common.transaction.AttachmentDto.getDefaultInstance()) return this;
      if (other.getDataHash() != com.google.protobuf.ByteString.EMPTY) {
        setDataHash(other.getDataHash());
      }
      if (other.getSignature() != com.google.protobuf.ByteString.EMPTY) {
        setSignature(other.getSignature());
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
      org.qsn.api.rpc.grpc.proto.entity.common.transaction.AttachmentDto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.qsn.api.rpc.grpc.proto.entity.common.transaction.AttachmentDto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.ByteString dataHash_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes dataHash = 1;</code>
     * @return The dataHash.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getDataHash() {
      return dataHash_;
    }
    /**
     * <code>bytes dataHash = 1;</code>
     * @param value The dataHash to set.
     * @return This builder for chaining.
     */
    public Builder setDataHash(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      dataHash_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes dataHash = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDataHash() {
      
      dataHash_ = getDefaultInstance().getDataHash();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString signature_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes signature = 2;</code>
     * @return The signature.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getSignature() {
      return signature_;
    }
    /**
     * <code>bytes signature = 2;</code>
     * @param value The signature to set.
     * @return This builder for chaining.
     */
    public Builder setSignature(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      signature_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes signature = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSignature() {
      
      signature_ = getDefaultInstance().getSignature();
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


    // @@protoc_insertion_point(builder_scope:org.qsn.protobuf.AttachmentDto)
  }

  // @@protoc_insertion_point(class_scope:org.qsn.protobuf.AttachmentDto)
  private static final org.qsn.api.rpc.grpc.proto.entity.common.transaction.AttachmentDto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.qsn.api.rpc.grpc.proto.entity.common.transaction.AttachmentDto();
  }

  public static org.qsn.api.rpc.grpc.proto.entity.common.transaction.AttachmentDto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AttachmentDto>
      PARSER = new com.google.protobuf.AbstractParser<AttachmentDto>() {
    @java.lang.Override
    public AttachmentDto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AttachmentDto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AttachmentDto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AttachmentDto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.qsn.api.rpc.grpc.proto.entity.common.transaction.AttachmentDto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

