// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: qsn/entity/customized/TokenIssueTxDataDto.proto

package org.qsn.api.rpc.grpc.proto.entity.customized;

/**
 * Protobuf type {@code org.qsn.protobuf.TokenIssueTxDataDto}
 */
public final class TokenIssueTxDataDto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:org.qsn.protobuf.TokenIssueTxDataDto)
    TokenIssueTxDataDtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TokenIssueTxDataDto.newBuilder() to construct.
  private TokenIssueTxDataDto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TokenIssueTxDataDto() {
    address_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TokenIssueTxDataDto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TokenIssueTxDataDto(
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

            address_ = input.readBytes();
            break;
          }
          case 18: {
            org.qsn.api.rpc.grpc.proto.entity.common.BInteger.Builder subBuilder = null;
            if (amount_ != null) {
              subBuilder = amount_.toBuilder();
            }
            amount_ = input.readMessage(org.qsn.api.rpc.grpc.proto.entity.common.BInteger.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(amount_);
              amount_ = subBuilder.buildPartial();
            }

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
    return org.qsn.api.rpc.grpc.proto.entity.customized.TokenIssueTxDataDtoOuterClass.internal_static_org_qsn_protobuf_TokenIssueTxDataDto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.qsn.api.rpc.grpc.proto.entity.customized.TokenIssueTxDataDtoOuterClass.internal_static_org_qsn_protobuf_TokenIssueTxDataDto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.qsn.api.rpc.grpc.proto.entity.customized.TokenIssueTxDataDto.class, org.qsn.api.rpc.grpc.proto.entity.customized.TokenIssueTxDataDto.Builder.class);
  }

  public static final int ADDRESS_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString address_;
  /**
   * <code>bytes address = 1;</code>
   * @return The address.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getAddress() {
    return address_;
  }

  public static final int AMOUNT_FIELD_NUMBER = 2;
  private org.qsn.api.rpc.grpc.proto.entity.common.BInteger amount_;
  /**
   * <code>.org.qsn.protobuf.BInteger amount = 2;</code>
   * @return Whether the amount field is set.
   */
  @java.lang.Override
  public boolean hasAmount() {
    return amount_ != null;
  }
  /**
   * <code>.org.qsn.protobuf.BInteger amount = 2;</code>
   * @return The amount.
   */
  @java.lang.Override
  public org.qsn.api.rpc.grpc.proto.entity.common.BInteger getAmount() {
    return amount_ == null ? org.qsn.api.rpc.grpc.proto.entity.common.BInteger.getDefaultInstance() : amount_;
  }
  /**
   * <code>.org.qsn.protobuf.BInteger amount = 2;</code>
   */
  @java.lang.Override
  public org.qsn.api.rpc.grpc.proto.entity.common.BIntegerOrBuilder getAmountOrBuilder() {
    return getAmount();
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
    if (!address_.isEmpty()) {
      output.writeBytes(1, address_);
    }
    if (amount_ != null) {
      output.writeMessage(2, getAmount());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!address_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, address_);
    }
    if (amount_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getAmount());
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
    if (!(obj instanceof org.qsn.api.rpc.grpc.proto.entity.customized.TokenIssueTxDataDto)) {
      return super.equals(obj);
    }
    org.qsn.api.rpc.grpc.proto.entity.customized.TokenIssueTxDataDto other = (org.qsn.api.rpc.grpc.proto.entity.customized.TokenIssueTxDataDto) obj;

    if (!getAddress()
        .equals(other.getAddress())) return false;
    if (hasAmount() != other.hasAmount()) return false;
    if (hasAmount()) {
      if (!getAmount()
          .equals(other.getAmount())) return false;
    }
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
    hash = (37 * hash) + ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getAddress().hashCode();
    if (hasAmount()) {
      hash = (37 * hash) + AMOUNT_FIELD_NUMBER;
      hash = (53 * hash) + getAmount().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.qsn.api.rpc.grpc.proto.entity.customized.TokenIssueTxDataDto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.qsn.api.rpc.grpc.proto.entity.customized.TokenIssueTxDataDto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.qsn.api.rpc.grpc.proto.entity.customized.TokenIssueTxDataDto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.qsn.api.rpc.grpc.proto.entity.customized.TokenIssueTxDataDto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.qsn.api.rpc.grpc.proto.entity.customized.TokenIssueTxDataDto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.qsn.api.rpc.grpc.proto.entity.customized.TokenIssueTxDataDto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.qsn.api.rpc.grpc.proto.entity.customized.TokenIssueTxDataDto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.qsn.api.rpc.grpc.proto.entity.customized.TokenIssueTxDataDto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.qsn.api.rpc.grpc.proto.entity.customized.TokenIssueTxDataDto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.qsn.api.rpc.grpc.proto.entity.customized.TokenIssueTxDataDto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.qsn.api.rpc.grpc.proto.entity.customized.TokenIssueTxDataDto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.qsn.api.rpc.grpc.proto.entity.customized.TokenIssueTxDataDto parseFrom(
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
  public static Builder newBuilder(org.qsn.api.rpc.grpc.proto.entity.customized.TokenIssueTxDataDto prototype) {
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
   * Protobuf type {@code org.qsn.protobuf.TokenIssueTxDataDto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.qsn.protobuf.TokenIssueTxDataDto)
      org.qsn.api.rpc.grpc.proto.entity.customized.TokenIssueTxDataDtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.qsn.api.rpc.grpc.proto.entity.customized.TokenIssueTxDataDtoOuterClass.internal_static_org_qsn_protobuf_TokenIssueTxDataDto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.qsn.api.rpc.grpc.proto.entity.customized.TokenIssueTxDataDtoOuterClass.internal_static_org_qsn_protobuf_TokenIssueTxDataDto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.qsn.api.rpc.grpc.proto.entity.customized.TokenIssueTxDataDto.class, org.qsn.api.rpc.grpc.proto.entity.customized.TokenIssueTxDataDto.Builder.class);
    }

    // Construct using org.qsn.api.rpc.grpc.proto.entity.customized.TokenIssueTxDataDto.newBuilder()
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
      address_ = com.google.protobuf.ByteString.EMPTY;

      if (amountBuilder_ == null) {
        amount_ = null;
      } else {
        amount_ = null;
        amountBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.qsn.api.rpc.grpc.proto.entity.customized.TokenIssueTxDataDtoOuterClass.internal_static_org_qsn_protobuf_TokenIssueTxDataDto_descriptor;
    }

    @java.lang.Override
    public org.qsn.api.rpc.grpc.proto.entity.customized.TokenIssueTxDataDto getDefaultInstanceForType() {
      return org.qsn.api.rpc.grpc.proto.entity.customized.TokenIssueTxDataDto.getDefaultInstance();
    }

    @java.lang.Override
    public org.qsn.api.rpc.grpc.proto.entity.customized.TokenIssueTxDataDto build() {
      org.qsn.api.rpc.grpc.proto.entity.customized.TokenIssueTxDataDto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.qsn.api.rpc.grpc.proto.entity.customized.TokenIssueTxDataDto buildPartial() {
      org.qsn.api.rpc.grpc.proto.entity.customized.TokenIssueTxDataDto result = new org.qsn.api.rpc.grpc.proto.entity.customized.TokenIssueTxDataDto(this);
      result.address_ = address_;
      if (amountBuilder_ == null) {
        result.amount_ = amount_;
      } else {
        result.amount_ = amountBuilder_.build();
      }
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
      if (other instanceof org.qsn.api.rpc.grpc.proto.entity.customized.TokenIssueTxDataDto) {
        return mergeFrom((org.qsn.api.rpc.grpc.proto.entity.customized.TokenIssueTxDataDto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.qsn.api.rpc.grpc.proto.entity.customized.TokenIssueTxDataDto other) {
      if (other == org.qsn.api.rpc.grpc.proto.entity.customized.TokenIssueTxDataDto.getDefaultInstance()) return this;
      if (other.getAddress() != com.google.protobuf.ByteString.EMPTY) {
        setAddress(other.getAddress());
      }
      if (other.hasAmount()) {
        mergeAmount(other.getAmount());
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
      org.qsn.api.rpc.grpc.proto.entity.customized.TokenIssueTxDataDto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.qsn.api.rpc.grpc.proto.entity.customized.TokenIssueTxDataDto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.ByteString address_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes address = 1;</code>
     * @return The address.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getAddress() {
      return address_;
    }
    /**
     * <code>bytes address = 1;</code>
     * @param value The address to set.
     * @return This builder for chaining.
     */
    public Builder setAddress(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      address_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes address = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAddress() {
      
      address_ = getDefaultInstance().getAddress();
      onChanged();
      return this;
    }

    private org.qsn.api.rpc.grpc.proto.entity.common.BInteger amount_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.qsn.api.rpc.grpc.proto.entity.common.BInteger, org.qsn.api.rpc.grpc.proto.entity.common.BInteger.Builder, org.qsn.api.rpc.grpc.proto.entity.common.BIntegerOrBuilder> amountBuilder_;
    /**
     * <code>.org.qsn.protobuf.BInteger amount = 2;</code>
     * @return Whether the amount field is set.
     */
    public boolean hasAmount() {
      return amountBuilder_ != null || amount_ != null;
    }
    /**
     * <code>.org.qsn.protobuf.BInteger amount = 2;</code>
     * @return The amount.
     */
    public org.qsn.api.rpc.grpc.proto.entity.common.BInteger getAmount() {
      if (amountBuilder_ == null) {
        return amount_ == null ? org.qsn.api.rpc.grpc.proto.entity.common.BInteger.getDefaultInstance() : amount_;
      } else {
        return amountBuilder_.getMessage();
      }
    }
    /**
     * <code>.org.qsn.protobuf.BInteger amount = 2;</code>
     */
    public Builder setAmount(org.qsn.api.rpc.grpc.proto.entity.common.BInteger value) {
      if (amountBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        amount_ = value;
        onChanged();
      } else {
        amountBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.org.qsn.protobuf.BInteger amount = 2;</code>
     */
    public Builder setAmount(
        org.qsn.api.rpc.grpc.proto.entity.common.BInteger.Builder builderForValue) {
      if (amountBuilder_ == null) {
        amount_ = builderForValue.build();
        onChanged();
      } else {
        amountBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.org.qsn.protobuf.BInteger amount = 2;</code>
     */
    public Builder mergeAmount(org.qsn.api.rpc.grpc.proto.entity.common.BInteger value) {
      if (amountBuilder_ == null) {
        if (amount_ != null) {
          amount_ =
            org.qsn.api.rpc.grpc.proto.entity.common.BInteger.newBuilder(amount_).mergeFrom(value).buildPartial();
        } else {
          amount_ = value;
        }
        onChanged();
      } else {
        amountBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.org.qsn.protobuf.BInteger amount = 2;</code>
     */
    public Builder clearAmount() {
      if (amountBuilder_ == null) {
        amount_ = null;
        onChanged();
      } else {
        amount_ = null;
        amountBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.org.qsn.protobuf.BInteger amount = 2;</code>
     */
    public org.qsn.api.rpc.grpc.proto.entity.common.BInteger.Builder getAmountBuilder() {
      
      onChanged();
      return getAmountFieldBuilder().getBuilder();
    }
    /**
     * <code>.org.qsn.protobuf.BInteger amount = 2;</code>
     */
    public org.qsn.api.rpc.grpc.proto.entity.common.BIntegerOrBuilder getAmountOrBuilder() {
      if (amountBuilder_ != null) {
        return amountBuilder_.getMessageOrBuilder();
      } else {
        return amount_ == null ?
            org.qsn.api.rpc.grpc.proto.entity.common.BInteger.getDefaultInstance() : amount_;
      }
    }
    /**
     * <code>.org.qsn.protobuf.BInteger amount = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.qsn.api.rpc.grpc.proto.entity.common.BInteger, org.qsn.api.rpc.grpc.proto.entity.common.BInteger.Builder, org.qsn.api.rpc.grpc.proto.entity.common.BIntegerOrBuilder> 
        getAmountFieldBuilder() {
      if (amountBuilder_ == null) {
        amountBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.qsn.api.rpc.grpc.proto.entity.common.BInteger, org.qsn.api.rpc.grpc.proto.entity.common.BInteger.Builder, org.qsn.api.rpc.grpc.proto.entity.common.BIntegerOrBuilder>(
                getAmount(),
                getParentForChildren(),
                isClean());
        amount_ = null;
      }
      return amountBuilder_;
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


    // @@protoc_insertion_point(builder_scope:org.qsn.protobuf.TokenIssueTxDataDto)
  }

  // @@protoc_insertion_point(class_scope:org.qsn.protobuf.TokenIssueTxDataDto)
  private static final org.qsn.api.rpc.grpc.proto.entity.customized.TokenIssueTxDataDto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.qsn.api.rpc.grpc.proto.entity.customized.TokenIssueTxDataDto();
  }

  public static org.qsn.api.rpc.grpc.proto.entity.customized.TokenIssueTxDataDto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TokenIssueTxDataDto>
      PARSER = new com.google.protobuf.AbstractParser<TokenIssueTxDataDto>() {
    @java.lang.Override
    public TokenIssueTxDataDto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TokenIssueTxDataDto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TokenIssueTxDataDto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TokenIssueTxDataDto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.qsn.api.rpc.grpc.proto.entity.customized.TokenIssueTxDataDto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

