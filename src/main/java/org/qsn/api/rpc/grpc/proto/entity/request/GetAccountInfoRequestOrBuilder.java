// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: qsn/entity/request/GetAccountInfoRequest.proto

package org.qsn.api.rpc.grpc.proto.entity.request;

public interface GetAccountInfoRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.qsn.protobuf.GetAccountInfoRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.org.qsn.protobuf.BaseRequest baseRequest = 1;</code>
   * @return Whether the baseRequest field is set.
   */
  boolean hasBaseRequest();
  /**
   * <code>.org.qsn.protobuf.BaseRequest baseRequest = 1;</code>
   * @return The baseRequest.
   */
  org.qsn.api.rpc.grpc.proto.entity.common.BaseRequest getBaseRequest();
  /**
   * <code>.org.qsn.protobuf.BaseRequest baseRequest = 1;</code>
   */
  org.qsn.api.rpc.grpc.proto.entity.common.BaseRequestOrBuilder getBaseRequestOrBuilder();

  /**
   * <code>bytes address = 2;</code>
   * @return The address.
   */
  com.google.protobuf.ByteString getAddress();
}
