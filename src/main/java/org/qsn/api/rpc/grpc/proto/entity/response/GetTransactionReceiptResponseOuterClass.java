// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: qsn/entity/response/GetTransactionReceiptResponse.proto

package org.qsn.api.rpc.grpc.proto.entity.response;

public final class GetTransactionReceiptResponseOuterClass {
  private GetTransactionReceiptResponseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_qsn_protobuf_GetTransactionReceiptResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_qsn_protobuf_GetTransactionReceiptResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n7qsn/entity/response/GetTransactionRece" +
      "iptResponse.proto\022\020org.qsn.protobuf\032\036qsn" +
      "/entity/common/Result.proto\032@qsn/entity/" +
      "common/transactionReceipt/TransactionRec" +
      "eiptDto.proto\"\216\001\n\035GetTransactionReceiptR" +
      "esponse\022(\n\006result\030\001 \001(\0132\030.org.qsn.protob" +
      "uf.Result\022C\n\022transactionReceipt\030\002 \001(\0132\'." +
      "org.qsn.protobuf.TransactionReceiptDtoB." +
      "\n*org.qsn.api.rpc.grpc.proto.entity.resp" +
      "onseP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.qsn.api.rpc.grpc.proto.entity.common.ResultOuterClass.getDescriptor(),
          org.qsn.api.rpc.grpc.proto.entity.common.transactionReceipt.TransactionReceiptDtoOuterClass.getDescriptor(),
        });
    internal_static_org_qsn_protobuf_GetTransactionReceiptResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_org_qsn_protobuf_GetTransactionReceiptResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_qsn_protobuf_GetTransactionReceiptResponse_descriptor,
        new java.lang.String[] { "Result", "TransactionReceipt", });
    org.qsn.api.rpc.grpc.proto.entity.common.ResultOuterClass.getDescriptor();
    org.qsn.api.rpc.grpc.proto.entity.common.transactionReceipt.TransactionReceiptDtoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
