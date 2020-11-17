// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: qsn/entity/response/AccountResponses.proto

package org.qsn.api.rpc.grpc.proto.entity.response;

/**
 * Protobuf type {@code org.qsn.protobuf.GetAccountBalanceResponse}
 */
public final class GetAccountBalanceResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:org.qsn.protobuf.GetAccountBalanceResponse)
    GetAccountBalanceResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetAccountBalanceResponse.newBuilder() to construct.
  private GetAccountBalanceResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetAccountBalanceResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetAccountBalanceResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetAccountBalanceResponse(
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
            org.qsn.api.rpc.grpc.proto.entity.common.BInteger.Builder subBuilder = null;
            if (balance_ != null) {
              subBuilder = balance_.toBuilder();
            }
            balance_ = input.readMessage(org.qsn.api.rpc.grpc.proto.entity.common.BInteger.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(balance_);
              balance_ = subBuilder.buildPartial();
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
    return org.qsn.api.rpc.grpc.proto.entity.response.AccountResponses.internal_static_org_qsn_protobuf_GetAccountBalanceResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.qsn.api.rpc.grpc.proto.entity.response.AccountResponses.internal_static_org_qsn_protobuf_GetAccountBalanceResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.qsn.api.rpc.grpc.proto.entity.response.GetAccountBalanceResponse.class, org.qsn.api.rpc.grpc.proto.entity.response.GetAccountBalanceResponse.Builder.class);
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

  public static final int BALANCE_FIELD_NUMBER = 2;
  private org.qsn.api.rpc.grpc.proto.entity.common.BInteger balance_;
  /**
   * <code>.org.qsn.protobuf.BInteger balance = 2;</code>
   * @return Whether the balance field is set.
   */
  @java.lang.Override
  public boolean hasBalance() {
    return balance_ != null;
  }
  /**
   * <code>.org.qsn.protobuf.BInteger balance = 2;</code>
   * @return The balance.
   */
  @java.lang.Override
  public org.qsn.api.rpc.grpc.proto.entity.common.BInteger getBalance() {
    return balance_ == null ? org.qsn.api.rpc.grpc.proto.entity.common.BInteger.getDefaultInstance() : balance_;
  }
  /**
   * <code>.org.qsn.protobuf.BInteger balance = 2;</code>
   */
  @java.lang.Override
  public org.qsn.api.rpc.grpc.proto.entity.common.BIntegerOrBuilder getBalanceOrBuilder() {
    return getBalance();
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
    if (balance_ != null) {
      output.writeMessage(2, getBalance());
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
    if (balance_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getBalance());
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
    if (!(obj instanceof org.qsn.api.rpc.grpc.proto.entity.response.GetAccountBalanceResponse)) {
      return super.equals(obj);
    }
    org.qsn.api.rpc.grpc.proto.entity.response.GetAccountBalanceResponse other = (org.qsn.api.rpc.grpc.proto.entity.response.GetAccountBalanceResponse) obj;

    if (hasResult() != other.hasResult()) return false;
    if (hasResult()) {
      if (!getResult()
          .equals(other.getResult())) return false;
    }
    if (hasBalance() != other.hasBalance()) return false;
    if (hasBalance()) {
      if (!getBalance()
          .equals(other.getBalance())) return false;
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
    if (hasBalance()) {
      hash = (37 * hash) + BALANCE_FIELD_NUMBER;
      hash = (53 * hash) + getBalance().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.qsn.api.rpc.grpc.proto.entity.response.GetAccountBalanceResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.qsn.api.rpc.grpc.proto.entity.response.GetAccountBalanceResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.qsn.api.rpc.grpc.proto.entity.response.GetAccountBalanceResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.qsn.api.rpc.grpc.proto.entity.response.GetAccountBalanceResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.qsn.api.rpc.grpc.proto.entity.response.GetAccountBalanceResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.qsn.api.rpc.grpc.proto.entity.response.GetAccountBalanceResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.qsn.api.rpc.grpc.proto.entity.response.GetAccountBalanceResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.qsn.api.rpc.grpc.proto.entity.response.GetAccountBalanceResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.qsn.api.rpc.grpc.proto.entity.response.GetAccountBalanceResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.qsn.api.rpc.grpc.proto.entity.response.GetAccountBalanceResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.qsn.api.rpc.grpc.proto.entity.response.GetAccountBalanceResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.qsn.api.rpc.grpc.proto.entity.response.GetAccountBalanceResponse parseFrom(
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
  public static Builder newBuilder(org.qsn.api.rpc.grpc.proto.entity.response.GetAccountBalanceResponse prototype) {
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
   * Protobuf type {@code org.qsn.protobuf.GetAccountBalanceResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.qsn.protobuf.GetAccountBalanceResponse)
      org.qsn.api.rpc.grpc.proto.entity.response.GetAccountBalanceResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.qsn.api.rpc.grpc.proto.entity.response.AccountResponses.internal_static_org_qsn_protobuf_GetAccountBalanceResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.qsn.api.rpc.grpc.proto.entity.response.AccountResponses.internal_static_org_qsn_protobuf_GetAccountBalanceResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.qsn.api.rpc.grpc.proto.entity.response.GetAccountBalanceResponse.class, org.qsn.api.rpc.grpc.proto.entity.response.GetAccountBalanceResponse.Builder.class);
    }

    // Construct using org.qsn.api.rpc.grpc.proto.entity.response.GetAccountBalanceResponse.newBuilder()
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
      if (balanceBuilder_ == null) {
        balance_ = null;
      } else {
        balance_ = null;
        balanceBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.qsn.api.rpc.grpc.proto.entity.response.AccountResponses.internal_static_org_qsn_protobuf_GetAccountBalanceResponse_descriptor;
    }

    @java.lang.Override
    public org.qsn.api.rpc.grpc.proto.entity.response.GetAccountBalanceResponse getDefaultInstanceForType() {
      return org.qsn.api.rpc.grpc.proto.entity.response.GetAccountBalanceResponse.getDefaultInstance();
    }

    @java.lang.Override
    public org.qsn.api.rpc.grpc.proto.entity.response.GetAccountBalanceResponse build() {
      org.qsn.api.rpc.grpc.proto.entity.response.GetAccountBalanceResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.qsn.api.rpc.grpc.proto.entity.response.GetAccountBalanceResponse buildPartial() {
      org.qsn.api.rpc.grpc.proto.entity.response.GetAccountBalanceResponse result = new org.qsn.api.rpc.grpc.proto.entity.response.GetAccountBalanceResponse(this);
      if (resultBuilder_ == null) {
        result.result_ = result_;
      } else {
        result.result_ = resultBuilder_.build();
      }
      if (balanceBuilder_ == null) {
        result.balance_ = balance_;
      } else {
        result.balance_ = balanceBuilder_.build();
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
      if (other instanceof org.qsn.api.rpc.grpc.proto.entity.response.GetAccountBalanceResponse) {
        return mergeFrom((org.qsn.api.rpc.grpc.proto.entity.response.GetAccountBalanceResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.qsn.api.rpc.grpc.proto.entity.response.GetAccountBalanceResponse other) {
      if (other == org.qsn.api.rpc.grpc.proto.entity.response.GetAccountBalanceResponse.getDefaultInstance()) return this;
      if (other.hasResult()) {
        mergeResult(other.getResult());
      }
      if (other.hasBalance()) {
        mergeBalance(other.getBalance());
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
      org.qsn.api.rpc.grpc.proto.entity.response.GetAccountBalanceResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.qsn.api.rpc.grpc.proto.entity.response.GetAccountBalanceResponse) e.getUnfinishedMessage();
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

    private org.qsn.api.rpc.grpc.proto.entity.common.BInteger balance_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.qsn.api.rpc.grpc.proto.entity.common.BInteger, org.qsn.api.rpc.grpc.proto.entity.common.BInteger.Builder, org.qsn.api.rpc.grpc.proto.entity.common.BIntegerOrBuilder> balanceBuilder_;
    /**
     * <code>.org.qsn.protobuf.BInteger balance = 2;</code>
     * @return Whether the balance field is set.
     */
    public boolean hasBalance() {
      return balanceBuilder_ != null || balance_ != null;
    }
    /**
     * <code>.org.qsn.protobuf.BInteger balance = 2;</code>
     * @return The balance.
     */
    public org.qsn.api.rpc.grpc.proto.entity.common.BInteger getBalance() {
      if (balanceBuilder_ == null) {
        return balance_ == null ? org.qsn.api.rpc.grpc.proto.entity.common.BInteger.getDefaultInstance() : balance_;
      } else {
        return balanceBuilder_.getMessage();
      }
    }
    /**
     * <code>.org.qsn.protobuf.BInteger balance = 2;</code>
     */
    public Builder setBalance(org.qsn.api.rpc.grpc.proto.entity.common.BInteger value) {
      if (balanceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        balance_ = value;
        onChanged();
      } else {
        balanceBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.org.qsn.protobuf.BInteger balance = 2;</code>
     */
    public Builder setBalance(
        org.qsn.api.rpc.grpc.proto.entity.common.BInteger.Builder builderForValue) {
      if (balanceBuilder_ == null) {
        balance_ = builderForValue.build();
        onChanged();
      } else {
        balanceBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.org.qsn.protobuf.BInteger balance = 2;</code>
     */
    public Builder mergeBalance(org.qsn.api.rpc.grpc.proto.entity.common.BInteger value) {
      if (balanceBuilder_ == null) {
        if (balance_ != null) {
          balance_ =
            org.qsn.api.rpc.grpc.proto.entity.common.BInteger.newBuilder(balance_).mergeFrom(value).buildPartial();
        } else {
          balance_ = value;
        }
        onChanged();
      } else {
        balanceBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.org.qsn.protobuf.BInteger balance = 2;</code>
     */
    public Builder clearBalance() {
      if (balanceBuilder_ == null) {
        balance_ = null;
        onChanged();
      } else {
        balance_ = null;
        balanceBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.org.qsn.protobuf.BInteger balance = 2;</code>
     */
    public org.qsn.api.rpc.grpc.proto.entity.common.BInteger.Builder getBalanceBuilder() {
      
      onChanged();
      return getBalanceFieldBuilder().getBuilder();
    }
    /**
     * <code>.org.qsn.protobuf.BInteger balance = 2;</code>
     */
    public org.qsn.api.rpc.grpc.proto.entity.common.BIntegerOrBuilder getBalanceOrBuilder() {
      if (balanceBuilder_ != null) {
        return balanceBuilder_.getMessageOrBuilder();
      } else {
        return balance_ == null ?
            org.qsn.api.rpc.grpc.proto.entity.common.BInteger.getDefaultInstance() : balance_;
      }
    }
    /**
     * <code>.org.qsn.protobuf.BInteger balance = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.qsn.api.rpc.grpc.proto.entity.common.BInteger, org.qsn.api.rpc.grpc.proto.entity.common.BInteger.Builder, org.qsn.api.rpc.grpc.proto.entity.common.BIntegerOrBuilder> 
        getBalanceFieldBuilder() {
      if (balanceBuilder_ == null) {
        balanceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.qsn.api.rpc.grpc.proto.entity.common.BInteger, org.qsn.api.rpc.grpc.proto.entity.common.BInteger.Builder, org.qsn.api.rpc.grpc.proto.entity.common.BIntegerOrBuilder>(
                getBalance(),
                getParentForChildren(),
                isClean());
        balance_ = null;
      }
      return balanceBuilder_;
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


    // @@protoc_insertion_point(builder_scope:org.qsn.protobuf.GetAccountBalanceResponse)
  }

  // @@protoc_insertion_point(class_scope:org.qsn.protobuf.GetAccountBalanceResponse)
  private static final org.qsn.api.rpc.grpc.proto.entity.response.GetAccountBalanceResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.qsn.api.rpc.grpc.proto.entity.response.GetAccountBalanceResponse();
  }

  public static org.qsn.api.rpc.grpc.proto.entity.response.GetAccountBalanceResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetAccountBalanceResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetAccountBalanceResponse>() {
    @java.lang.Override
    public GetAccountBalanceResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetAccountBalanceResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetAccountBalanceResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetAccountBalanceResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.qsn.api.rpc.grpc.proto.entity.response.GetAccountBalanceResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

