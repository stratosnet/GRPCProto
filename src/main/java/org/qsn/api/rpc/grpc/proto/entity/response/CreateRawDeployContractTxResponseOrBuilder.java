// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: qsn/entity/response/TransactionResponses.proto

package org.qsn.api.rpc.grpc.proto.entity.response;

public interface CreateRawDeployContractTxResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.qsn.protobuf.CreateRawDeployContractTxResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.org.qsn.protobuf.Result result = 1;</code>
   * @return Whether the result field is set.
   */
  boolean hasResult();
  /**
   * <code>.org.qsn.protobuf.Result result = 1;</code>
   * @return The result.
   */
  org.qsn.api.rpc.grpc.proto.entity.common.Result getResult();
  /**
   * <code>.org.qsn.protobuf.Result result = 1;</code>
   */
  org.qsn.api.rpc.grpc.proto.entity.common.ResultOrBuilder getResultOrBuilder();

  /**
   * <code>.org.qsn.protobuf.TransactionDto transaction = 2;</code>
   * @return Whether the transaction field is set.
   */
  boolean hasTransaction();
  /**
   * <code>.org.qsn.protobuf.TransactionDto transaction = 2;</code>
   * @return The transaction.
   */
  org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionDto getTransaction();
  /**
   * <code>.org.qsn.protobuf.TransactionDto transaction = 2;</code>
   */
  org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionDtoOrBuilder getTransactionOrBuilder();
}
