// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: qsn/entity/request/TransactionRequests.proto

package org.qsn.api.rpc.grpc.proto.entity.request;

/**
 * Protobuf type {@code org.qsn.protobuf.SendTransactionRequest}
 */
public final class SendTransactionRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:org.qsn.protobuf.SendTransactionRequest)
    SendTransactionRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SendTransactionRequest.newBuilder() to construct.
  private SendTransactionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SendTransactionRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SendTransactionRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SendTransactionRequest(
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
            org.qsn.api.rpc.grpc.proto.entity.common.BaseRequest.Builder subBuilder = null;
            if (baseRequest_ != null) {
              subBuilder = baseRequest_.toBuilder();
            }
            baseRequest_ = input.readMessage(org.qsn.api.rpc.grpc.proto.entity.common.BaseRequest.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(baseRequest_);
              baseRequest_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionDto.Builder subBuilder = null;
            if (transactionDto_ != null) {
              subBuilder = transactionDto_.toBuilder();
            }
            transactionDto_ = input.readMessage(org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionDto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(transactionDto_);
              transactionDto_ = subBuilder.buildPartial();
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
    return org.qsn.api.rpc.grpc.proto.entity.request.TransactionRequests.internal_static_org_qsn_protobuf_SendTransactionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.qsn.api.rpc.grpc.proto.entity.request.TransactionRequests.internal_static_org_qsn_protobuf_SendTransactionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.qsn.api.rpc.grpc.proto.entity.request.SendTransactionRequest.class, org.qsn.api.rpc.grpc.proto.entity.request.SendTransactionRequest.Builder.class);
  }

  public static final int BASEREQUEST_FIELD_NUMBER = 1;
  private org.qsn.api.rpc.grpc.proto.entity.common.BaseRequest baseRequest_;
  /**
   * <code>.org.qsn.protobuf.BaseRequest baseRequest = 1;</code>
   * @return Whether the baseRequest field is set.
   */
  @java.lang.Override
  public boolean hasBaseRequest() {
    return baseRequest_ != null;
  }
  /**
   * <code>.org.qsn.protobuf.BaseRequest baseRequest = 1;</code>
   * @return The baseRequest.
   */
  @java.lang.Override
  public org.qsn.api.rpc.grpc.proto.entity.common.BaseRequest getBaseRequest() {
    return baseRequest_ == null ? org.qsn.api.rpc.grpc.proto.entity.common.BaseRequest.getDefaultInstance() : baseRequest_;
  }
  /**
   * <code>.org.qsn.protobuf.BaseRequest baseRequest = 1;</code>
   */
  @java.lang.Override
  public org.qsn.api.rpc.grpc.proto.entity.common.BaseRequestOrBuilder getBaseRequestOrBuilder() {
    return getBaseRequest();
  }

  public static final int TRANSACTIONDTO_FIELD_NUMBER = 2;
  private org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionDto transactionDto_;
  /**
   * <code>.org.qsn.protobuf.TransactionDto transactionDto = 2;</code>
   * @return Whether the transactionDto field is set.
   */
  @java.lang.Override
  public boolean hasTransactionDto() {
    return transactionDto_ != null;
  }
  /**
   * <code>.org.qsn.protobuf.TransactionDto transactionDto = 2;</code>
   * @return The transactionDto.
   */
  @java.lang.Override
  public org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionDto getTransactionDto() {
    return transactionDto_ == null ? org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionDto.getDefaultInstance() : transactionDto_;
  }
  /**
   * <code>.org.qsn.protobuf.TransactionDto transactionDto = 2;</code>
   */
  @java.lang.Override
  public org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionDtoOrBuilder getTransactionDtoOrBuilder() {
    return getTransactionDto();
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
    if (baseRequest_ != null) {
      output.writeMessage(1, getBaseRequest());
    }
    if (transactionDto_ != null) {
      output.writeMessage(2, getTransactionDto());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (baseRequest_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getBaseRequest());
    }
    if (transactionDto_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getTransactionDto());
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
    if (!(obj instanceof org.qsn.api.rpc.grpc.proto.entity.request.SendTransactionRequest)) {
      return super.equals(obj);
    }
    org.qsn.api.rpc.grpc.proto.entity.request.SendTransactionRequest other = (org.qsn.api.rpc.grpc.proto.entity.request.SendTransactionRequest) obj;

    if (hasBaseRequest() != other.hasBaseRequest()) return false;
    if (hasBaseRequest()) {
      if (!getBaseRequest()
          .equals(other.getBaseRequest())) return false;
    }
    if (hasTransactionDto() != other.hasTransactionDto()) return false;
    if (hasTransactionDto()) {
      if (!getTransactionDto()
          .equals(other.getTransactionDto())) return false;
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
    if (hasBaseRequest()) {
      hash = (37 * hash) + BASEREQUEST_FIELD_NUMBER;
      hash = (53 * hash) + getBaseRequest().hashCode();
    }
    if (hasTransactionDto()) {
      hash = (37 * hash) + TRANSACTIONDTO_FIELD_NUMBER;
      hash = (53 * hash) + getTransactionDto().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.qsn.api.rpc.grpc.proto.entity.request.SendTransactionRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.qsn.api.rpc.grpc.proto.entity.request.SendTransactionRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.qsn.api.rpc.grpc.proto.entity.request.SendTransactionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.qsn.api.rpc.grpc.proto.entity.request.SendTransactionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.qsn.api.rpc.grpc.proto.entity.request.SendTransactionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.qsn.api.rpc.grpc.proto.entity.request.SendTransactionRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.qsn.api.rpc.grpc.proto.entity.request.SendTransactionRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.qsn.api.rpc.grpc.proto.entity.request.SendTransactionRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.qsn.api.rpc.grpc.proto.entity.request.SendTransactionRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.qsn.api.rpc.grpc.proto.entity.request.SendTransactionRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.qsn.api.rpc.grpc.proto.entity.request.SendTransactionRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.qsn.api.rpc.grpc.proto.entity.request.SendTransactionRequest parseFrom(
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
  public static Builder newBuilder(org.qsn.api.rpc.grpc.proto.entity.request.SendTransactionRequest prototype) {
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
   * Protobuf type {@code org.qsn.protobuf.SendTransactionRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.qsn.protobuf.SendTransactionRequest)
      org.qsn.api.rpc.grpc.proto.entity.request.SendTransactionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.qsn.api.rpc.grpc.proto.entity.request.TransactionRequests.internal_static_org_qsn_protobuf_SendTransactionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.qsn.api.rpc.grpc.proto.entity.request.TransactionRequests.internal_static_org_qsn_protobuf_SendTransactionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.qsn.api.rpc.grpc.proto.entity.request.SendTransactionRequest.class, org.qsn.api.rpc.grpc.proto.entity.request.SendTransactionRequest.Builder.class);
    }

    // Construct using org.qsn.api.rpc.grpc.proto.entity.request.SendTransactionRequest.newBuilder()
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
      if (baseRequestBuilder_ == null) {
        baseRequest_ = null;
      } else {
        baseRequest_ = null;
        baseRequestBuilder_ = null;
      }
      if (transactionDtoBuilder_ == null) {
        transactionDto_ = null;
      } else {
        transactionDto_ = null;
        transactionDtoBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.qsn.api.rpc.grpc.proto.entity.request.TransactionRequests.internal_static_org_qsn_protobuf_SendTransactionRequest_descriptor;
    }

    @java.lang.Override
    public org.qsn.api.rpc.grpc.proto.entity.request.SendTransactionRequest getDefaultInstanceForType() {
      return org.qsn.api.rpc.grpc.proto.entity.request.SendTransactionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public org.qsn.api.rpc.grpc.proto.entity.request.SendTransactionRequest build() {
      org.qsn.api.rpc.grpc.proto.entity.request.SendTransactionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.qsn.api.rpc.grpc.proto.entity.request.SendTransactionRequest buildPartial() {
      org.qsn.api.rpc.grpc.proto.entity.request.SendTransactionRequest result = new org.qsn.api.rpc.grpc.proto.entity.request.SendTransactionRequest(this);
      if (baseRequestBuilder_ == null) {
        result.baseRequest_ = baseRequest_;
      } else {
        result.baseRequest_ = baseRequestBuilder_.build();
      }
      if (transactionDtoBuilder_ == null) {
        result.transactionDto_ = transactionDto_;
      } else {
        result.transactionDto_ = transactionDtoBuilder_.build();
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
      if (other instanceof org.qsn.api.rpc.grpc.proto.entity.request.SendTransactionRequest) {
        return mergeFrom((org.qsn.api.rpc.grpc.proto.entity.request.SendTransactionRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.qsn.api.rpc.grpc.proto.entity.request.SendTransactionRequest other) {
      if (other == org.qsn.api.rpc.grpc.proto.entity.request.SendTransactionRequest.getDefaultInstance()) return this;
      if (other.hasBaseRequest()) {
        mergeBaseRequest(other.getBaseRequest());
      }
      if (other.hasTransactionDto()) {
        mergeTransactionDto(other.getTransactionDto());
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
      org.qsn.api.rpc.grpc.proto.entity.request.SendTransactionRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.qsn.api.rpc.grpc.proto.entity.request.SendTransactionRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private org.qsn.api.rpc.grpc.proto.entity.common.BaseRequest baseRequest_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.qsn.api.rpc.grpc.proto.entity.common.BaseRequest, org.qsn.api.rpc.grpc.proto.entity.common.BaseRequest.Builder, org.qsn.api.rpc.grpc.proto.entity.common.BaseRequestOrBuilder> baseRequestBuilder_;
    /**
     * <code>.org.qsn.protobuf.BaseRequest baseRequest = 1;</code>
     * @return Whether the baseRequest field is set.
     */
    public boolean hasBaseRequest() {
      return baseRequestBuilder_ != null || baseRequest_ != null;
    }
    /**
     * <code>.org.qsn.protobuf.BaseRequest baseRequest = 1;</code>
     * @return The baseRequest.
     */
    public org.qsn.api.rpc.grpc.proto.entity.common.BaseRequest getBaseRequest() {
      if (baseRequestBuilder_ == null) {
        return baseRequest_ == null ? org.qsn.api.rpc.grpc.proto.entity.common.BaseRequest.getDefaultInstance() : baseRequest_;
      } else {
        return baseRequestBuilder_.getMessage();
      }
    }
    /**
     * <code>.org.qsn.protobuf.BaseRequest baseRequest = 1;</code>
     */
    public Builder setBaseRequest(org.qsn.api.rpc.grpc.proto.entity.common.BaseRequest value) {
      if (baseRequestBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        baseRequest_ = value;
        onChanged();
      } else {
        baseRequestBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.org.qsn.protobuf.BaseRequest baseRequest = 1;</code>
     */
    public Builder setBaseRequest(
        org.qsn.api.rpc.grpc.proto.entity.common.BaseRequest.Builder builderForValue) {
      if (baseRequestBuilder_ == null) {
        baseRequest_ = builderForValue.build();
        onChanged();
      } else {
        baseRequestBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.org.qsn.protobuf.BaseRequest baseRequest = 1;</code>
     */
    public Builder mergeBaseRequest(org.qsn.api.rpc.grpc.proto.entity.common.BaseRequest value) {
      if (baseRequestBuilder_ == null) {
        if (baseRequest_ != null) {
          baseRequest_ =
            org.qsn.api.rpc.grpc.proto.entity.common.BaseRequest.newBuilder(baseRequest_).mergeFrom(value).buildPartial();
        } else {
          baseRequest_ = value;
        }
        onChanged();
      } else {
        baseRequestBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.org.qsn.protobuf.BaseRequest baseRequest = 1;</code>
     */
    public Builder clearBaseRequest() {
      if (baseRequestBuilder_ == null) {
        baseRequest_ = null;
        onChanged();
      } else {
        baseRequest_ = null;
        baseRequestBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.org.qsn.protobuf.BaseRequest baseRequest = 1;</code>
     */
    public org.qsn.api.rpc.grpc.proto.entity.common.BaseRequest.Builder getBaseRequestBuilder() {
      
      onChanged();
      return getBaseRequestFieldBuilder().getBuilder();
    }
    /**
     * <code>.org.qsn.protobuf.BaseRequest baseRequest = 1;</code>
     */
    public org.qsn.api.rpc.grpc.proto.entity.common.BaseRequestOrBuilder getBaseRequestOrBuilder() {
      if (baseRequestBuilder_ != null) {
        return baseRequestBuilder_.getMessageOrBuilder();
      } else {
        return baseRequest_ == null ?
            org.qsn.api.rpc.grpc.proto.entity.common.BaseRequest.getDefaultInstance() : baseRequest_;
      }
    }
    /**
     * <code>.org.qsn.protobuf.BaseRequest baseRequest = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.qsn.api.rpc.grpc.proto.entity.common.BaseRequest, org.qsn.api.rpc.grpc.proto.entity.common.BaseRequest.Builder, org.qsn.api.rpc.grpc.proto.entity.common.BaseRequestOrBuilder> 
        getBaseRequestFieldBuilder() {
      if (baseRequestBuilder_ == null) {
        baseRequestBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.qsn.api.rpc.grpc.proto.entity.common.BaseRequest, org.qsn.api.rpc.grpc.proto.entity.common.BaseRequest.Builder, org.qsn.api.rpc.grpc.proto.entity.common.BaseRequestOrBuilder>(
                getBaseRequest(),
                getParentForChildren(),
                isClean());
        baseRequest_ = null;
      }
      return baseRequestBuilder_;
    }

    private org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionDto transactionDto_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionDto, org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionDto.Builder, org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionDtoOrBuilder> transactionDtoBuilder_;
    /**
     * <code>.org.qsn.protobuf.TransactionDto transactionDto = 2;</code>
     * @return Whether the transactionDto field is set.
     */
    public boolean hasTransactionDto() {
      return transactionDtoBuilder_ != null || transactionDto_ != null;
    }
    /**
     * <code>.org.qsn.protobuf.TransactionDto transactionDto = 2;</code>
     * @return The transactionDto.
     */
    public org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionDto getTransactionDto() {
      if (transactionDtoBuilder_ == null) {
        return transactionDto_ == null ? org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionDto.getDefaultInstance() : transactionDto_;
      } else {
        return transactionDtoBuilder_.getMessage();
      }
    }
    /**
     * <code>.org.qsn.protobuf.TransactionDto transactionDto = 2;</code>
     */
    public Builder setTransactionDto(org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionDto value) {
      if (transactionDtoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        transactionDto_ = value;
        onChanged();
      } else {
        transactionDtoBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.org.qsn.protobuf.TransactionDto transactionDto = 2;</code>
     */
    public Builder setTransactionDto(
        org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionDto.Builder builderForValue) {
      if (transactionDtoBuilder_ == null) {
        transactionDto_ = builderForValue.build();
        onChanged();
      } else {
        transactionDtoBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.org.qsn.protobuf.TransactionDto transactionDto = 2;</code>
     */
    public Builder mergeTransactionDto(org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionDto value) {
      if (transactionDtoBuilder_ == null) {
        if (transactionDto_ != null) {
          transactionDto_ =
            org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionDto.newBuilder(transactionDto_).mergeFrom(value).buildPartial();
        } else {
          transactionDto_ = value;
        }
        onChanged();
      } else {
        transactionDtoBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.org.qsn.protobuf.TransactionDto transactionDto = 2;</code>
     */
    public Builder clearTransactionDto() {
      if (transactionDtoBuilder_ == null) {
        transactionDto_ = null;
        onChanged();
      } else {
        transactionDto_ = null;
        transactionDtoBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.org.qsn.protobuf.TransactionDto transactionDto = 2;</code>
     */
    public org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionDto.Builder getTransactionDtoBuilder() {
      
      onChanged();
      return getTransactionDtoFieldBuilder().getBuilder();
    }
    /**
     * <code>.org.qsn.protobuf.TransactionDto transactionDto = 2;</code>
     */
    public org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionDtoOrBuilder getTransactionDtoOrBuilder() {
      if (transactionDtoBuilder_ != null) {
        return transactionDtoBuilder_.getMessageOrBuilder();
      } else {
        return transactionDto_ == null ?
            org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionDto.getDefaultInstance() : transactionDto_;
      }
    }
    /**
     * <code>.org.qsn.protobuf.TransactionDto transactionDto = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionDto, org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionDto.Builder, org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionDtoOrBuilder> 
        getTransactionDtoFieldBuilder() {
      if (transactionDtoBuilder_ == null) {
        transactionDtoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionDto, org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionDto.Builder, org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionDtoOrBuilder>(
                getTransactionDto(),
                getParentForChildren(),
                isClean());
        transactionDto_ = null;
      }
      return transactionDtoBuilder_;
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


    // @@protoc_insertion_point(builder_scope:org.qsn.protobuf.SendTransactionRequest)
  }

  // @@protoc_insertion_point(class_scope:org.qsn.protobuf.SendTransactionRequest)
  private static final org.qsn.api.rpc.grpc.proto.entity.request.SendTransactionRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.qsn.api.rpc.grpc.proto.entity.request.SendTransactionRequest();
  }

  public static org.qsn.api.rpc.grpc.proto.entity.request.SendTransactionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SendTransactionRequest>
      PARSER = new com.google.protobuf.AbstractParser<SendTransactionRequest>() {
    @java.lang.Override
    public SendTransactionRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SendTransactionRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SendTransactionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SendTransactionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.qsn.api.rpc.grpc.proto.entity.request.SendTransactionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

