// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: qsn/entity/common/transaction/TransactionDto.proto

package org.qsn.api.rpc.grpc.proto.entity.common.transaction;

public interface TransactionDtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.qsn.protobuf.TransactionDto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 txType = 1;</code>
   * @return The txType.
   */
  int getTxType();

  /**
   * <code>.org.qsn.protobuf.TransactionDataDto txData = 2;</code>
   * @return Whether the txData field is set.
   */
  boolean hasTxData();
  /**
   * <code>.org.qsn.protobuf.TransactionDataDto txData = 2;</code>
   * @return The txData.
   */
  org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionDataDto getTxData();
  /**
   * <code>.org.qsn.protobuf.TransactionDataDto txData = 2;</code>
   */
  org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionDataDtoOrBuilder getTxDataOrBuilder();

  /**
   * <code>string smartContractName = 3;</code>
   * @return The smartContractName.
   */
  java.lang.String getSmartContractName();
  /**
   * <code>string smartContractName = 3;</code>
   * @return The bytes for smartContractName.
   */
  com.google.protobuf.ByteString
      getSmartContractNameBytes();

  /**
   * <code>string smartContractAction = 4;</code>
   * @return The smartContractAction.
   */
  java.lang.String getSmartContractAction();
  /**
   * <code>string smartContractAction = 4;</code>
   * @return The bytes for smartContractAction.
   */
  com.google.protobuf.ByteString
      getSmartContractActionBytes();

  /**
   * <code>repeated bytes smartContractArguments = 5;</code>
   * @return A list containing the smartContractArguments.
   */
  java.util.List<com.google.protobuf.ByteString> getSmartContractArgumentsList();
  /**
   * <code>repeated bytes smartContractArguments = 5;</code>
   * @return The count of smartContractArguments.
   */
  int getSmartContractArgumentsCount();
  /**
   * <code>repeated bytes smartContractArguments = 5;</code>
   * @param index The index of the element to return.
   * @return The smartContractArguments at the given index.
   */
  com.google.protobuf.ByteString getSmartContractArguments(int index);

  /**
   * <code>.org.qsn.protobuf.TransactionFeeDto fee = 6;</code>
   * @return Whether the fee field is set.
   */
  boolean hasFee();
  /**
   * <code>.org.qsn.protobuf.TransactionFeeDto fee = 6;</code>
   * @return The fee.
   */
  org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionFeeDto getFee();
  /**
   * <code>.org.qsn.protobuf.TransactionFeeDto fee = 6;</code>
   */
  org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionFeeDtoOrBuilder getFeeOrBuilder();

  /**
   * <code>bytes info = 7;</code>
   * @return The info.
   */
  com.google.protobuf.ByteString getInfo();

  /**
   * <code>repeated .org.qsn.protobuf.TransactionSignatureDto signatures = 8;</code>
   */
  java.util.List<org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionSignatureDto> 
      getSignaturesList();
  /**
   * <code>repeated .org.qsn.protobuf.TransactionSignatureDto signatures = 8;</code>
   */
  org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionSignatureDto getSignatures(int index);
  /**
   * <code>repeated .org.qsn.protobuf.TransactionSignatureDto signatures = 8;</code>
   */
  int getSignaturesCount();
  /**
   * <code>repeated .org.qsn.protobuf.TransactionSignatureDto signatures = 8;</code>
   */
  java.util.List<? extends org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionSignatureDtoOrBuilder> 
      getSignaturesOrBuilderList();
  /**
   * <code>repeated .org.qsn.protobuf.TransactionSignatureDto signatures = 8;</code>
   */
  org.qsn.api.rpc.grpc.proto.entity.common.transaction.TransactionSignatureDtoOrBuilder getSignaturesOrBuilder(
      int index);

  /**
   * <code>bytes hash = 9;</code>
   * @return The hash.
   */
  com.google.protobuf.ByteString getHash();
}
