// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: qsn/entity/common/transaction/AttachmentDto.proto

package org.qsn.api.rpc.grpc.proto.entity.common.transaction;

public final class AttachmentDtoOuterClass {
  private AttachmentDtoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_qsn_protobuf_AttachmentDto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_qsn_protobuf_AttachmentDto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1qsn/entity/common/transaction/Attachme" +
      "ntDto.proto\022\020org.qsn.protobuf\"4\n\rAttachm" +
      "entDto\022\020\n\010dataHash\030\001 \001(\014\022\021\n\tsignature\030\002 " +
      "\001(\014B8\n4org.qsn.api.rpc.grpc.proto.entity" +
      ".common.transactionP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_org_qsn_protobuf_AttachmentDto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_org_qsn_protobuf_AttachmentDto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_qsn_protobuf_AttachmentDto_descriptor,
        new java.lang.String[] { "DataHash", "Signature", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
