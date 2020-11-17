// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: qsn/entity/common/block/Block.proto

package org.qsn.api.rpc.grpc.proto.entity.common.block;

public interface LastCommitDtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.qsn.protobuf.LastCommitDto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 height = 1;</code>
   * @return The height.
   */
  long getHeight();

  /**
   * <code>bytes blockHash = 2;</code>
   * @return The blockHash.
   */
  com.google.protobuf.ByteString getBlockHash();

  /**
   * <code>repeated .org.qsn.protobuf.PrecommitDto precommits = 3;</code>
   */
  java.util.List<org.qsn.api.rpc.grpc.proto.entity.common.block.PrecommitDto> 
      getPrecommitsList();
  /**
   * <code>repeated .org.qsn.protobuf.PrecommitDto precommits = 3;</code>
   */
  org.qsn.api.rpc.grpc.proto.entity.common.block.PrecommitDto getPrecommits(int index);
  /**
   * <code>repeated .org.qsn.protobuf.PrecommitDto precommits = 3;</code>
   */
  int getPrecommitsCount();
  /**
   * <code>repeated .org.qsn.protobuf.PrecommitDto precommits = 3;</code>
   */
  java.util.List<? extends org.qsn.api.rpc.grpc.proto.entity.common.block.PrecommitDtoOrBuilder> 
      getPrecommitsOrBuilderList();
  /**
   * <code>repeated .org.qsn.protobuf.PrecommitDto precommits = 3;</code>
   */
  org.qsn.api.rpc.grpc.proto.entity.common.block.PrecommitDtoOrBuilder getPrecommitsOrBuilder(
      int index);
}