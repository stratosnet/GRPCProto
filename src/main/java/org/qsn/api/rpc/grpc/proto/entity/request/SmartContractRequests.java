// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: qsn/entity/request/SmartContractRequests.proto

package org.qsn.api.rpc.grpc.proto.entity.request;

public final class SmartContractRequests {
  private SmartContractRequests() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_qsn_protobuf_SmartContractViewOnlyRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_qsn_protobuf_SmartContractViewOnlyRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.qsn/entity/request/SmartContractReques" +
      "ts.proto\022\020org.qsn.protobuf\032#qsn/entity/c" +
      "ommon/BaseRequest.proto\"\233\001\n\034SmartContrac" +
      "tViewOnlyRequest\0222\n\013baseRequest\030\001 \001(\0132\035." +
      "org.qsn.protobuf.BaseRequest\022\024\n\014contract" +
      "Name\030\002 \001(\t\022\026\n\016contractAction\030\003 \001(\t\022\031\n\021co" +
      "ntractArguments\030\004 \003(\014B-\n)org.qsn.api.rpc" +
      ".grpc.proto.entity.requestP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.qsn.api.rpc.grpc.proto.entity.common.BaseRequestOuterClass.getDescriptor(),
        });
    internal_static_org_qsn_protobuf_SmartContractViewOnlyRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_org_qsn_protobuf_SmartContractViewOnlyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_qsn_protobuf_SmartContractViewOnlyRequest_descriptor,
        new java.lang.String[] { "BaseRequest", "ContractName", "ContractAction", "ContractArguments", });
    org.qsn.api.rpc.grpc.proto.entity.common.BaseRequestOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
