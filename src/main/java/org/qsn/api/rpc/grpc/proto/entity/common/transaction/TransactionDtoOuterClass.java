// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: qsn/entity/common/transaction/TransactionDto.proto

package org.qsn.api.rpc.grpc.proto.entity.common.transaction;

public final class TransactionDtoOuterClass {
  private TransactionDtoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_qsn_protobuf_TransactionDto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_qsn_protobuf_TransactionDto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n2qsn/entity/common/transaction/Transact" +
      "ionDto.proto\022\020org.qsn.protobuf\0325qsn/enti" +
      "ty/common/transaction/TransactionFeeDto." +
      "proto\032;qsn/entity/common/transaction/Tra" +
      "nsactionSignatureDto.proto\0326qsn/entity/c" +
      "ommon/transaction/TransactionDataDto.pro" +
      "to\0321qsn/entity/common/transaction/Attach" +
      "mentDto.proto\"\342\002\n\016TransactionDto\022\016\n\006txTy" +
      "pe\030\001 \001(\005\0224\n\006txData\030\002 \001(\0132$.org.qsn.proto" +
      "buf.TransactionDataDto\022\031\n\021smartContractN" +
      "ame\030\003 \001(\t\022\033\n\023smartContractAction\030\004 \001(\t\022\036" +
      "\n\026smartContractArguments\030\005 \003(\014\0220\n\003fee\030\006 " +
      "\001(\0132#.org.qsn.protobuf.TransactionFeeDto" +
      "\022\014\n\004info\030\007 \001(\014\0223\n\nattachment\030\010 \001(\0132\037.org" +
      ".qsn.protobuf.AttachmentDto\022=\n\nsignature" +
      "s\030\t \003(\0132).org.qsn.protobuf.TransactionSi" +
      "gnatureDtoB8\n4org.qsn.api.rpc.grpc.proto" +
      ".entity.common.transactionP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionFeeDtoOuterClass.getDescriptor(),
          org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionSignatureDtoOuterClass.getDescriptor(),
          org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionDataDtoOuterClass.getDescriptor(),
          org.qsn.api.rpc.grpc.proto.entity.common.transaction.AttachmentDtoOuterClass.getDescriptor(),
        });
    internal_static_org_qsn_protobuf_TransactionDto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_org_qsn_protobuf_TransactionDto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_qsn_protobuf_TransactionDto_descriptor,
        new java.lang.String[] { "TxType", "TxData", "SmartContractName", "SmartContractAction", "SmartContractArguments", "Fee", "Info", "Attachment", "Signatures", });
    org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionFeeDtoOuterClass.getDescriptor();
    org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionSignatureDtoOuterClass.getDescriptor();
    org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionDataDtoOuterClass.getDescriptor();
    org.qsn.api.rpc.grpc.proto.entity.common.transaction.AttachmentDtoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
