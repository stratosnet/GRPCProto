// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: qsn/entity/response/GetTransactionReceiptResponse.proto

package org.qsn.api.rpc.grpc.proto.entity.response;

/**
 * Protobuf type {@code org.qsn.protobuf.GetTransactionReceiptResponse}
 */
public final class GetTransactionReceiptResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:org.qsn.protobuf.GetTransactionReceiptResponse)
    GetTransactionReceiptResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetTransactionReceiptResponse.newBuilder() to construct.
  private GetTransactionReceiptResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetTransactionReceiptResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetTransactionReceiptResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetTransactionReceiptResponse(
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
            org.qsn.api.rpc.grpc.proto.entity.common.Result.Builder subBuilder = null;
            if (result_ != null) {
              subBuilder = result_.toBuilder();
            }
            result_ = input.readMessage(org.qsn.api.rpc.grpc.proto.entity.common.Result.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(result_);
              result_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionReceiptDto.Builder subBuilder = null;
            if (transactionReceipt_ != null) {
              subBuilder = transactionReceipt_.toBuilder();
            }
            transactionReceipt_ = input.readMessage(org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionReceiptDto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(transactionReceipt_);
              transactionReceipt_ = subBuilder.buildPartial();
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
    return org.qsn.api.rpc.grpc.proto.entity.response.GetTransactionReceiptResponseOuterClass.internal_static_org_qsn_protobuf_GetTransactionReceiptResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.qsn.api.rpc.grpc.proto.entity.response.GetTransactionReceiptResponseOuterClass.internal_static_org_qsn_protobuf_GetTransactionReceiptResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.qsn.api.rpc.grpc.proto.entity.response.GetTransactionReceiptResponse.class, org.qsn.api.rpc.grpc.proto.entity.response.GetTransactionReceiptResponse.Builder.class);
  }

  public static final int RESULT_FIELD_NUMBER = 1;
  private org.qsn.api.rpc.grpc.proto.entity.common.Result result_;
  /**
   * <code>.org.qsn.protobuf.Result result = 1;</code>
   * @return Whether the result field is set.
   */
  @java.lang.Override
  public boolean hasResult() {
    return result_ != null;
  }
  /**
   * <code>.org.qsn.protobuf.Result result = 1;</code>
   * @return The result.
   */
  @java.lang.Override
  public org.qsn.api.rpc.grpc.proto.entity.common.Result getResult() {
    return result_ == null ? org.qsn.api.rpc.grpc.proto.entity.common.Result.getDefaultInstance() : result_;
  }
  /**
   * <code>.org.qsn.protobuf.Result result = 1;</code>
   */
  @java.lang.Override
  public org.qsn.api.rpc.grpc.proto.entity.common.ResultOrBuilder getResultOrBuilder() {
    return getResult();
  }

  public static final int TRANSACTIONRECEIPT_FIELD_NUMBER = 2;
  private org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionReceiptDto transactionReceipt_;
  /**
   * <code>.org.qsn.protobuf.TransactionReceiptDto transactionReceipt = 2;</code>
   * @return Whether the transactionReceipt field is set.
   */
  @java.lang.Override
  public boolean hasTransactionReceipt() {
    return transactionReceipt_ != null;
  }
  /**
   * <code>.org.qsn.protobuf.TransactionReceiptDto transactionReceipt = 2;</code>
   * @return The transactionReceipt.
   */
  @java.lang.Override
  public org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionReceiptDto getTransactionReceipt() {
    return transactionReceipt_ == null ? org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionReceiptDto.getDefaultInstance() : transactionReceipt_;
  }
  /**
   * <code>.org.qsn.protobuf.TransactionReceiptDto transactionReceipt = 2;</code>
   */
  @java.lang.Override
  public org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionReceiptDtoOrBuilder getTransactionReceiptOrBuilder() {
    return getTransactionReceipt();
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
    if (result_ != null) {
      output.writeMessage(1, getResult());
    }
    if (transactionReceipt_ != null) {
      output.writeMessage(2, getTransactionReceipt());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (result_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getResult());
    }
    if (transactionReceipt_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getTransactionReceipt());
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
    if (!(obj instanceof org.qsn.api.rpc.grpc.proto.entity.response.GetTransactionReceiptResponse)) {
      return super.equals(obj);
    }
    org.qsn.api.rpc.grpc.proto.entity.response.GetTransactionReceiptResponse other = (org.qsn.api.rpc.grpc.proto.entity.response.GetTransactionReceiptResponse) obj;

    if (hasResult() != other.hasResult()) return false;
    if (hasResult()) {
      if (!getResult()
          .equals(other.getResult())) return false;
    }
    if (hasTransactionReceipt() != other.hasTransactionReceipt()) return false;
    if (hasTransactionReceipt()) {
      if (!getTransactionReceipt()
          .equals(other.getTransactionReceipt())) return false;
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
    if (hasResult()) {
      hash = (37 * hash) + RESULT_FIELD_NUMBER;
      hash = (53 * hash) + getResult().hashCode();
    }
    if (hasTransactionReceipt()) {
      hash = (37 * hash) + TRANSACTIONRECEIPT_FIELD_NUMBER;
      hash = (53 * hash) + getTransactionReceipt().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.qsn.api.rpc.grpc.proto.entity.response.GetTransactionReceiptResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.qsn.api.rpc.grpc.proto.entity.response.GetTransactionReceiptResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.qsn.api.rpc.grpc.proto.entity.response.GetTransactionReceiptResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.qsn.api.rpc.grpc.proto.entity.response.GetTransactionReceiptResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.qsn.api.rpc.grpc.proto.entity.response.GetTransactionReceiptResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.qsn.api.rpc.grpc.proto.entity.response.GetTransactionReceiptResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.qsn.api.rpc.grpc.proto.entity.response.GetTransactionReceiptResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.qsn.api.rpc.grpc.proto.entity.response.GetTransactionReceiptResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.qsn.api.rpc.grpc.proto.entity.response.GetTransactionReceiptResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.qsn.api.rpc.grpc.proto.entity.response.GetTransactionReceiptResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.qsn.api.rpc.grpc.proto.entity.response.GetTransactionReceiptResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.qsn.api.rpc.grpc.proto.entity.response.GetTransactionReceiptResponse parseFrom(
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
  public static Builder newBuilder(org.qsn.api.rpc.grpc.proto.entity.response.GetTransactionReceiptResponse prototype) {
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
   * Protobuf type {@code org.qsn.protobuf.GetTransactionReceiptResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.qsn.protobuf.GetTransactionReceiptResponse)
      org.qsn.api.rpc.grpc.proto.entity.response.GetTransactionReceiptResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.qsn.api.rpc.grpc.proto.entity.response.GetTransactionReceiptResponseOuterClass.internal_static_org_qsn_protobuf_GetTransactionReceiptResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.qsn.api.rpc.grpc.proto.entity.response.GetTransactionReceiptResponseOuterClass.internal_static_org_qsn_protobuf_GetTransactionReceiptResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.qsn.api.rpc.grpc.proto.entity.response.GetTransactionReceiptResponse.class, org.qsn.api.rpc.grpc.proto.entity.response.GetTransactionReceiptResponse.Builder.class);
    }

    // Construct using org.qsn.api.rpc.grpc.proto.entity.response.GetTransactionReceiptResponse.newBuilder()
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
      if (resultBuilder_ == null) {
        result_ = null;
      } else {
        result_ = null;
        resultBuilder_ = null;
      }
      if (transactionReceiptBuilder_ == null) {
        transactionReceipt_ = null;
      } else {
        transactionReceipt_ = null;
        transactionReceiptBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.qsn.api.rpc.grpc.proto.entity.response.GetTransactionReceiptResponseOuterClass.internal_static_org_qsn_protobuf_GetTransactionReceiptResponse_descriptor;
    }

    @java.lang.Override
    public org.qsn.api.rpc.grpc.proto.entity.response.GetTransactionReceiptResponse getDefaultInstanceForType() {
      return org.qsn.api.rpc.grpc.proto.entity.response.GetTransactionReceiptResponse.getDefaultInstance();
    }

    @java.lang.Override
    public org.qsn.api.rpc.grpc.proto.entity.response.GetTransactionReceiptResponse build() {
      org.qsn.api.rpc.grpc.proto.entity.response.GetTransactionReceiptResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.qsn.api.rpc.grpc.proto.entity.response.GetTransactionReceiptResponse buildPartial() {
      org.qsn.api.rpc.grpc.proto.entity.response.GetTransactionReceiptResponse result = new org.qsn.api.rpc.grpc.proto.entity.response.GetTransactionReceiptResponse(this);
      if (resultBuilder_ == null) {
        result.result_ = result_;
      } else {
        result.result_ = resultBuilder_.build();
      }
      if (transactionReceiptBuilder_ == null) {
        result.transactionReceipt_ = transactionReceipt_;
      } else {
        result.transactionReceipt_ = transactionReceiptBuilder_.build();
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
      if (other instanceof org.qsn.api.rpc.grpc.proto.entity.response.GetTransactionReceiptResponse) {
        return mergeFrom((org.qsn.api.rpc.grpc.proto.entity.response.GetTransactionReceiptResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.qsn.api.rpc.grpc.proto.entity.response.GetTransactionReceiptResponse other) {
      if (other == org.qsn.api.rpc.grpc.proto.entity.response.GetTransactionReceiptResponse.getDefaultInstance()) return this;
      if (other.hasResult()) {
        mergeResult(other.getResult());
      }
      if (other.hasTransactionReceipt()) {
        mergeTransactionReceipt(other.getTransactionReceipt());
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
      org.qsn.api.rpc.grpc.proto.entity.response.GetTransactionReceiptResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.qsn.api.rpc.grpc.proto.entity.response.GetTransactionReceiptResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private org.qsn.api.rpc.grpc.proto.entity.common.Result result_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.qsn.api.rpc.grpc.proto.entity.common.Result, org.qsn.api.rpc.grpc.proto.entity.common.Result.Builder, org.qsn.api.rpc.grpc.proto.entity.common.ResultOrBuilder> resultBuilder_;
    /**
     * <code>.org.qsn.protobuf.Result result = 1;</code>
     * @return Whether the result field is set.
     */
    public boolean hasResult() {
      return resultBuilder_ != null || result_ != null;
    }
    /**
     * <code>.org.qsn.protobuf.Result result = 1;</code>
     * @return The result.
     */
    public org.qsn.api.rpc.grpc.proto.entity.common.Result getResult() {
      if (resultBuilder_ == null) {
        return result_ == null ? org.qsn.api.rpc.grpc.proto.entity.common.Result.getDefaultInstance() : result_;
      } else {
        return resultBuilder_.getMessage();
      }
    }
    /**
     * <code>.org.qsn.protobuf.Result result = 1;</code>
     */
    public Builder setResult(org.qsn.api.rpc.grpc.proto.entity.common.Result value) {
      if (resultBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        result_ = value;
        onChanged();
      } else {
        resultBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.org.qsn.protobuf.Result result = 1;</code>
     */
    public Builder setResult(
        org.qsn.api.rpc.grpc.proto.entity.common.Result.Builder builderForValue) {
      if (resultBuilder_ == null) {
        result_ = builderForValue.build();
        onChanged();
      } else {
        resultBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.org.qsn.protobuf.Result result = 1;</code>
     */
    public Builder mergeResult(org.qsn.api.rpc.grpc.proto.entity.common.Result value) {
      if (resultBuilder_ == null) {
        if (result_ != null) {
          result_ =
            org.qsn.api.rpc.grpc.proto.entity.common.Result.newBuilder(result_).mergeFrom(value).buildPartial();
        } else {
          result_ = value;
        }
        onChanged();
      } else {
        resultBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.org.qsn.protobuf.Result result = 1;</code>
     */
    public Builder clearResult() {
      if (resultBuilder_ == null) {
        result_ = null;
        onChanged();
      } else {
        result_ = null;
        resultBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.org.qsn.protobuf.Result result = 1;</code>
     */
    public org.qsn.api.rpc.grpc.proto.entity.common.Result.Builder getResultBuilder() {
      
      onChanged();
      return getResultFieldBuilder().getBuilder();
    }
    /**
     * <code>.org.qsn.protobuf.Result result = 1;</code>
     */
    public org.qsn.api.rpc.grpc.proto.entity.common.ResultOrBuilder getResultOrBuilder() {
      if (resultBuilder_ != null) {
        return resultBuilder_.getMessageOrBuilder();
      } else {
        return result_ == null ?
            org.qsn.api.rpc.grpc.proto.entity.common.Result.getDefaultInstance() : result_;
      }
    }
    /**
     * <code>.org.qsn.protobuf.Result result = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.qsn.api.rpc.grpc.proto.entity.common.Result, org.qsn.api.rpc.grpc.proto.entity.common.Result.Builder, org.qsn.api.rpc.grpc.proto.entity.common.ResultOrBuilder> 
        getResultFieldBuilder() {
      if (resultBuilder_ == null) {
        resultBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.qsn.api.rpc.grpc.proto.entity.common.Result, org.qsn.api.rpc.grpc.proto.entity.common.Result.Builder, org.qsn.api.rpc.grpc.proto.entity.common.ResultOrBuilder>(
                getResult(),
                getParentForChildren(),
                isClean());
        result_ = null;
      }
      return resultBuilder_;
    }

    private org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionReceiptDto transactionReceipt_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionReceiptDto, org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionReceiptDto.Builder, org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionReceiptDtoOrBuilder> transactionReceiptBuilder_;
    /**
     * <code>.org.qsn.protobuf.TransactionReceiptDto transactionReceipt = 2;</code>
     * @return Whether the transactionReceipt field is set.
     */
    public boolean hasTransactionReceipt() {
      return transactionReceiptBuilder_ != null || transactionReceipt_ != null;
    }
    /**
     * <code>.org.qsn.protobuf.TransactionReceiptDto transactionReceipt = 2;</code>
     * @return The transactionReceipt.
     */
    public org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionReceiptDto getTransactionReceipt() {
      if (transactionReceiptBuilder_ == null) {
        return transactionReceipt_ == null ? org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionReceiptDto.getDefaultInstance() : transactionReceipt_;
      } else {
        return transactionReceiptBuilder_.getMessage();
      }
    }
    /**
     * <code>.org.qsn.protobuf.TransactionReceiptDto transactionReceipt = 2;</code>
     */
    public Builder setTransactionReceipt(org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionReceiptDto value) {
      if (transactionReceiptBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        transactionReceipt_ = value;
        onChanged();
      } else {
        transactionReceiptBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.org.qsn.protobuf.TransactionReceiptDto transactionReceipt = 2;</code>
     */
    public Builder setTransactionReceipt(
        org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionReceiptDto.Builder builderForValue) {
      if (transactionReceiptBuilder_ == null) {
        transactionReceipt_ = builderForValue.build();
        onChanged();
      } else {
        transactionReceiptBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.org.qsn.protobuf.TransactionReceiptDto transactionReceipt = 2;</code>
     */
    public Builder mergeTransactionReceipt(org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionReceiptDto value) {
      if (transactionReceiptBuilder_ == null) {
        if (transactionReceipt_ != null) {
          transactionReceipt_ =
            org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionReceiptDto.newBuilder(transactionReceipt_).mergeFrom(value).buildPartial();
        } else {
          transactionReceipt_ = value;
        }
        onChanged();
      } else {
        transactionReceiptBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.org.qsn.protobuf.TransactionReceiptDto transactionReceipt = 2;</code>
     */
    public Builder clearTransactionReceipt() {
      if (transactionReceiptBuilder_ == null) {
        transactionReceipt_ = null;
        onChanged();
      } else {
        transactionReceipt_ = null;
        transactionReceiptBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.org.qsn.protobuf.TransactionReceiptDto transactionReceipt = 2;</code>
     */
    public org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionReceiptDto.Builder getTransactionReceiptBuilder() {
      
      onChanged();
      return getTransactionReceiptFieldBuilder().getBuilder();
    }
    /**
     * <code>.org.qsn.protobuf.TransactionReceiptDto transactionReceipt = 2;</code>
     */
    public org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionReceiptDtoOrBuilder getTransactionReceiptOrBuilder() {
      if (transactionReceiptBuilder_ != null) {
        return transactionReceiptBuilder_.getMessageOrBuilder();
      } else {
        return transactionReceipt_ == null ?
            org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionReceiptDto.getDefaultInstance() : transactionReceipt_;
      }
    }
    /**
     * <code>.org.qsn.protobuf.TransactionReceiptDto transactionReceipt = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionReceiptDto, org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionReceiptDto.Builder, org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionReceiptDtoOrBuilder> 
        getTransactionReceiptFieldBuilder() {
      if (transactionReceiptBuilder_ == null) {
        transactionReceiptBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionReceiptDto, org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionReceiptDto.Builder, org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionReceiptDtoOrBuilder>(
                getTransactionReceipt(),
                getParentForChildren(),
                isClean());
        transactionReceipt_ = null;
      }
      return transactionReceiptBuilder_;
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


    // @@protoc_insertion_point(builder_scope:org.qsn.protobuf.GetTransactionReceiptResponse)
  }

  // @@protoc_insertion_point(class_scope:org.qsn.protobuf.GetTransactionReceiptResponse)
  private static final org.qsn.api.rpc.grpc.proto.entity.response.GetTransactionReceiptResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.qsn.api.rpc.grpc.proto.entity.response.GetTransactionReceiptResponse();
  }

  public static org.qsn.api.rpc.grpc.proto.entity.response.GetTransactionReceiptResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetTransactionReceiptResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetTransactionReceiptResponse>() {
    @java.lang.Override
    public GetTransactionReceiptResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetTransactionReceiptResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetTransactionReceiptResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetTransactionReceiptResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.qsn.api.rpc.grpc.proto.entity.response.GetTransactionReceiptResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
