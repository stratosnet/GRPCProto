// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: qsn/entity/customized/ValidatorTxDataDto.proto

package org.qsn.api.rpc.grpc.proto.entity.customized;

public interface ValidatorTxDataDtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.qsn.protobuf.ValidatorTxDataDto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bytes validatorAddress = 1;</code>
   * @return The validatorAddress.
   */
  com.google.protobuf.ByteString getValidatorAddress();

  /**
   * <code>bytes validatorPubKey = 2;</code>
   * @return The validatorPubKey.
   */
  com.google.protobuf.ByteString getValidatorPubKey();

  /**
   * <code>bytes delegationAddress = 3;</code>
   * @return The delegationAddress.
   */
  com.google.protobuf.ByteString getDelegationAddress();

  /**
   * <code>.org.qsn.protobuf.BInteger stake = 4;</code>
   * @return Whether the stake field is set.
   */
  boolean hasStake();
  /**
   * <code>.org.qsn.protobuf.BInteger stake = 4;</code>
   * @return The stake.
   */
  org.qsn.api.rpc.grpc.proto.entity.common.BInteger getStake();
  /**
   * <code>.org.qsn.protobuf.BInteger stake = 4;</code>
   */
  org.qsn.api.rpc.grpc.proto.entity.common.BIntegerOrBuilder getStakeOrBuilder();

  /**
   * <code>string name = 5;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 5;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
