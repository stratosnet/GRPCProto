// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TransactionRpc.proto

package org.qsn.api.rpc.grpc.proto;

public final class TransactionRpcOuterClass {
  private TransactionRpcOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024TransactionRpc.proto\022\020org.qsn.protobuf" +
      "\032,qsn/entity/request/TransactionRequests" +
      ".proto\032.qsn/entity/response/TransactionR" +
      "esponses.proto2\313\003\n\016TransactionRpc\022f\n\017sen" +
      "dTransaction\022(.org.qsn.protobuf.SendTran" +
      "sactionRequest\032).org.qsn.protobuf.SendTr" +
      "ansactionResponse\022x\n\025getTransactionRecei" +
      "pt\022..org.qsn.protobuf.GetTransactionRece" +
      "iptRequest\032/.org.qsn.protobuf.GetTransac" +
      "tionReceiptResponse\022c\n\016getTransaction\022\'." +
      "org.qsn.protobuf.GetTransactionRequest\032(" +
      ".org.qsn.protobuf.GetTransactionResponse" +
      "\022r\n\023createRawTransferTx\022,.org.qsn.protob" +
      "uf.CreateRawTransferTxRequest\032-.org.qsn." +
      "protobuf.CreateRawTransferTxResponseB\036\n\032" +
      "org.qsn.api.rpc.grpc.protoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.qsn.api.rpc.grpc.proto.entity.request.TransactionRequests.getDescriptor(),
          org.qsn.api.rpc.grpc.proto.entity.response.TransactionResponses.getDescriptor(),
        });
    org.qsn.api.rpc.grpc.proto.entity.request.TransactionRequests.getDescriptor();
    org.qsn.api.rpc.grpc.proto.entity.response.TransactionResponses.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
