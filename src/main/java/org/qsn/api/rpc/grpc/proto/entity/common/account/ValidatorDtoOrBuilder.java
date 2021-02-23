// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: qsn/entity/common/validator/ValidatorDto.proto

package org.qsn.api.rpc.grpc.proto.entity.common.account;

public interface ValidatorDtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.qsn.protobuf.ValidatorDto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bytes address = 1;</code>
   * @return The address.
   */
  com.google.protobuf.ByteString getAddress();

  /**
   * <code>bytes publicKey = 2;</code>
   * @return The publicKey.
   */
  com.google.protobuf.ByteString getPublicKey();

  /**
   * <code>bytes coinBase = 3;</code>
   * @return The coinBase.
   */
  com.google.protobuf.ByteString getCoinBase();

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

  /**
   * <code>.org.qsn.protobuf.BInteger power = 6;</code>
   * @return Whether the power field is set.
   */
  boolean hasPower();
  /**
   * <code>.org.qsn.protobuf.BInteger power = 6;</code>
   * @return The power.
   */
  org.qsn.api.rpc.grpc.proto.entity.common.BInteger getPower();
  /**
   * <code>.org.qsn.protobuf.BInteger power = 6;</code>
   */
  org.qsn.api.rpc.grpc.proto.entity.common.BIntegerOrBuilder getPowerOrBuilder();
}
