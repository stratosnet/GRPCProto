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
      "\032/qsn/entity/request/SendTransactionRequ" +
      "est.proto\0321qsn/entity/response/SendTrans" +
      "actionResponse.proto\0325qsn/entity/request" +
      "/GetTransactionReceiptRequest.proto\0327qsn" +
      "/entity/response/GetTransactionReceiptRe" +
      "sponse.proto2\362\001\n\016TransactionRpc\022f\n\017sendT" +
      "ransaction\022(.org.qsn.protobuf.SendTransa" +
      "ctionRequest\032).org.qsn.protobuf.SendTran" +
      "sactionResponse\022x\n\025getTransactionReceipt" +
      "\022..org.qsn.protobuf.GetTransactionReceip" +
      "tRequest\032/.org.qsn.protobuf.GetTransacti" +
      "onReceiptResponseB\036\n\032org.qsn.api.rpc.grp" +
      "c.protoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.qsn.api.rpc.grpc.proto.entity.request.SendTransactionRequestOuterClass.getDescriptor(),
          org.qsn.api.rpc.grpc.proto.entity.response.SendTransactionResponseOuterClass.getDescriptor(),
          org.qsn.api.rpc.grpc.proto.entity.request.GetTransactionReceiptRequestOuterClass.getDescriptor(),
          org.qsn.api.rpc.grpc.proto.entity.response.GetTransactionReceiptResponseOuterClass.getDescriptor(),
        });
    org.qsn.api.rpc.grpc.proto.entity.request.SendTransactionRequestOuterClass.getDescriptor();
    org.qsn.api.rpc.grpc.proto.entity.response.SendTransactionResponseOuterClass.getDescriptor();
    org.qsn.api.rpc.grpc.proto.entity.request.GetTransactionReceiptRequestOuterClass.getDescriptor();
    org.qsn.api.rpc.grpc.proto.entity.response.GetTransactionReceiptResponseOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
