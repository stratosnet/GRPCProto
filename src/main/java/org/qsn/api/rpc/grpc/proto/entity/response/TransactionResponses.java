// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: qsn/entity/response/TransactionResponses.proto

package org.qsn.api.rpc.grpc.proto.entity.response;

public final class TransactionResponses {
  private TransactionResponses() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_qsn_protobuf_SendTransactionResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_qsn_protobuf_SendTransactionResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_qsn_protobuf_GetTransactionReceiptResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_qsn_protobuf_GetTransactionReceiptResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_qsn_protobuf_GetTransactionResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_qsn_protobuf_GetTransactionResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_qsn_protobuf_CreateRawTransferTxResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_qsn_protobuf_CreateRawTransferTxResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_qsn_protobuf_CreateRawDeployContractTxResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_qsn_protobuf_CreateRawDeployContractTxResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_qsn_protobuf_CreateRawValidatorTxResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_qsn_protobuf_CreateRawValidatorTxResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_qsn_protobuf_CreateRawWithdrawTxResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_qsn_protobuf_CreateRawWithdrawTxResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_qsn_protobuf_SendTransactionBatchResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_qsn_protobuf_SendTransactionBatchResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.qsn/entity/response/TransactionRespons" +
      "es.proto\022\020org.qsn.protobuf\032\036qsn/entity/c" +
      "ommon/Result.proto\0329qsn/entity/common/tr" +
      "ansaction/TransactionReceiptDto.proto\0322q" +
      "sn/entity/common/transaction/Transaction" +
      "Dto.proto\"C\n\027SendTransactionResponse\022(\n\006" +
      "result\030\001 \001(\0132\030.org.qsn.protobuf.Result\"\216" +
      "\001\n\035GetTransactionReceiptResponse\022(\n\006resu" +
      "lt\030\001 \001(\0132\030.org.qsn.protobuf.Result\022C\n\022tr" +
      "ansactionReceipt\030\002 \001(\0132\'.org.qsn.protobu" +
      "f.TransactionReceiptDto\"y\n\026GetTransactio" +
      "nResponse\022(\n\006result\030\001 \001(\0132\030.org.qsn.prot" +
      "obuf.Result\0225\n\013transaction\030\002 \001(\0132 .org.q" +
      "sn.protobuf.TransactionDto\"~\n\033CreateRawT" +
      "ransferTxResponse\022(\n\006result\030\001 \001(\0132\030.org." +
      "qsn.protobuf.Result\0225\n\013transaction\030\002 \001(\013" +
      "2 .org.qsn.protobuf.TransactionDto\"\204\001\n!C" +
      "reateRawDeployContractTxResponse\022(\n\006resu" +
      "lt\030\001 \001(\0132\030.org.qsn.protobuf.Result\0225\n\013tr" +
      "ansaction\030\002 \001(\0132 .org.qsn.protobuf.Trans" +
      "actionDto\"\177\n\034CreateRawValidatorTxRespons" +
      "e\022(\n\006result\030\001 \001(\0132\030.org.qsn.protobuf.Res" +
      "ult\0225\n\013transaction\030\002 \001(\0132 .org.qsn.proto" +
      "buf.TransactionDto\"~\n\033CreateRawWithdrawT" +
      "xResponse\022(\n\006result\030\001 \001(\0132\030.org.qsn.prot" +
      "obuf.Result\0225\n\013transaction\030\002 \001(\0132 .org.q" +
      "sn.protobuf.TransactionDto\"H\n\034SendTransa" +
      "ctionBatchResponse\022(\n\006result\030\001 \001(\0132\030.org" +
      ".qsn.protobuf.ResultB.\n*org.qsn.api.rpc." +
      "grpc.proto.entity.responseP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.qsn.api.rpc.grpc.proto.entity.common.ResultOuterClass.getDescriptor(),
          org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionReceiptDtoOuterClass.getDescriptor(),
          org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionDtoOuterClass.getDescriptor(),
        });
    internal_static_org_qsn_protobuf_SendTransactionResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_org_qsn_protobuf_SendTransactionResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_qsn_protobuf_SendTransactionResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_org_qsn_protobuf_GetTransactionReceiptResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_org_qsn_protobuf_GetTransactionReceiptResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_qsn_protobuf_GetTransactionReceiptResponse_descriptor,
        new java.lang.String[] { "Result", "TransactionReceipt", });
    internal_static_org_qsn_protobuf_GetTransactionResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_org_qsn_protobuf_GetTransactionResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_qsn_protobuf_GetTransactionResponse_descriptor,
        new java.lang.String[] { "Result", "Transaction", });
    internal_static_org_qsn_protobuf_CreateRawTransferTxResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_org_qsn_protobuf_CreateRawTransferTxResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_qsn_protobuf_CreateRawTransferTxResponse_descriptor,
        new java.lang.String[] { "Result", "Transaction", });
    internal_static_org_qsn_protobuf_CreateRawDeployContractTxResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_org_qsn_protobuf_CreateRawDeployContractTxResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_qsn_protobuf_CreateRawDeployContractTxResponse_descriptor,
        new java.lang.String[] { "Result", "Transaction", });
    internal_static_org_qsn_protobuf_CreateRawValidatorTxResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_org_qsn_protobuf_CreateRawValidatorTxResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_qsn_protobuf_CreateRawValidatorTxResponse_descriptor,
        new java.lang.String[] { "Result", "Transaction", });
    internal_static_org_qsn_protobuf_CreateRawWithdrawTxResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_org_qsn_protobuf_CreateRawWithdrawTxResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_qsn_protobuf_CreateRawWithdrawTxResponse_descriptor,
        new java.lang.String[] { "Result", "Transaction", });
    internal_static_org_qsn_protobuf_SendTransactionBatchResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_org_qsn_protobuf_SendTransactionBatchResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_qsn_protobuf_SendTransactionBatchResponse_descriptor,
        new java.lang.String[] { "Result", });
    org.qsn.api.rpc.grpc.proto.entity.common.ResultOuterClass.getDescriptor();
    org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionReceiptDtoOuterClass.getDescriptor();
    org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionDtoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
