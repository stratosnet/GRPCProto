# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from qsn.entity.request import BlockRequests_pb2 as qsn_dot_entity_dot_request_dot_BlockRequests__pb2
from qsn.entity.response import BlockResponses_pb2 as qsn_dot_entity_dot_response_dot_BlockResponses__pb2


class BlockRpcStub(object):
    """Missing associated documentation comment in .proto file."""

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.getBlockHeaderByHash = channel.unary_unary(
                '/org.qsn.protobuf.BlockRpc/getBlockHeaderByHash',
                request_serializer=qsn_dot_entity_dot_request_dot_BlockRequests__pb2.GetBlockHeaderByHashRequest.SerializeToString,
                response_deserializer=qsn_dot_entity_dot_response_dot_BlockResponses__pb2.GetBlockHeaderByHashResponse.FromString,
                )
        self.getBlockHeaderByHeight = channel.unary_unary(
                '/org.qsn.protobuf.BlockRpc/getBlockHeaderByHeight',
                request_serializer=qsn_dot_entity_dot_request_dot_BlockRequests__pb2.GetBlockHeaderByHeightRequest.SerializeToString,
                response_deserializer=qsn_dot_entity_dot_response_dot_BlockResponses__pb2.GetBlockHeaderByHeightResponse.FromString,
                )
        self.getBlockByHash = channel.unary_unary(
                '/org.qsn.protobuf.BlockRpc/getBlockByHash',
                request_serializer=qsn_dot_entity_dot_request_dot_BlockRequests__pb2.GetBlockByHashRequest.SerializeToString,
                response_deserializer=qsn_dot_entity_dot_response_dot_BlockResponses__pb2.GetBlockByHashResponse.FromString,
                )
        self.getBlockByHeight = channel.unary_unary(
                '/org.qsn.protobuf.BlockRpc/getBlockByHeight',
                request_serializer=qsn_dot_entity_dot_request_dot_BlockRequests__pb2.GetBlockByHeightRequest.SerializeToString,
                response_deserializer=qsn_dot_entity_dot_response_dot_BlockResponses__pb2.GetBlockByHeightResponse.FromString,
                )
        self.getBlockHeight = channel.unary_unary(
                '/org.qsn.protobuf.BlockRpc/getBlockHeight',
                request_serializer=qsn_dot_entity_dot_request_dot_BlockRequests__pb2.GetBlockHeightRequest.SerializeToString,
                response_deserializer=qsn_dot_entity_dot_response_dot_BlockResponses__pb2.GetBlockHeightResponse.FromString,
                )


class BlockRpcServicer(object):
    """Missing associated documentation comment in .proto file."""

    def getBlockHeaderByHash(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def getBlockHeaderByHeight(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def getBlockByHash(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def getBlockByHeight(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def getBlockHeight(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_BlockRpcServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'getBlockHeaderByHash': grpc.unary_unary_rpc_method_handler(
                    servicer.getBlockHeaderByHash,
                    request_deserializer=qsn_dot_entity_dot_request_dot_BlockRequests__pb2.GetBlockHeaderByHashRequest.FromString,
                    response_serializer=qsn_dot_entity_dot_response_dot_BlockResponses__pb2.GetBlockHeaderByHashResponse.SerializeToString,
            ),
            'getBlockHeaderByHeight': grpc.unary_unary_rpc_method_handler(
                    servicer.getBlockHeaderByHeight,
                    request_deserializer=qsn_dot_entity_dot_request_dot_BlockRequests__pb2.GetBlockHeaderByHeightRequest.FromString,
                    response_serializer=qsn_dot_entity_dot_response_dot_BlockResponses__pb2.GetBlockHeaderByHeightResponse.SerializeToString,
            ),
            'getBlockByHash': grpc.unary_unary_rpc_method_handler(
                    servicer.getBlockByHash,
                    request_deserializer=qsn_dot_entity_dot_request_dot_BlockRequests__pb2.GetBlockByHashRequest.FromString,
                    response_serializer=qsn_dot_entity_dot_response_dot_BlockResponses__pb2.GetBlockByHashResponse.SerializeToString,
            ),
            'getBlockByHeight': grpc.unary_unary_rpc_method_handler(
                    servicer.getBlockByHeight,
                    request_deserializer=qsn_dot_entity_dot_request_dot_BlockRequests__pb2.GetBlockByHeightRequest.FromString,
                    response_serializer=qsn_dot_entity_dot_response_dot_BlockResponses__pb2.GetBlockByHeightResponse.SerializeToString,
            ),
            'getBlockHeight': grpc.unary_unary_rpc_method_handler(
                    servicer.getBlockHeight,
                    request_deserializer=qsn_dot_entity_dot_request_dot_BlockRequests__pb2.GetBlockHeightRequest.FromString,
                    response_serializer=qsn_dot_entity_dot_response_dot_BlockResponses__pb2.GetBlockHeightResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'org.qsn.protobuf.BlockRpc', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class BlockRpc(object):
    """Missing associated documentation comment in .proto file."""

    @staticmethod
    def getBlockHeaderByHash(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/org.qsn.protobuf.BlockRpc/getBlockHeaderByHash',
            qsn_dot_entity_dot_request_dot_BlockRequests__pb2.GetBlockHeaderByHashRequest.SerializeToString,
            qsn_dot_entity_dot_response_dot_BlockResponses__pb2.GetBlockHeaderByHashResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def getBlockHeaderByHeight(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/org.qsn.protobuf.BlockRpc/getBlockHeaderByHeight',
            qsn_dot_entity_dot_request_dot_BlockRequests__pb2.GetBlockHeaderByHeightRequest.SerializeToString,
            qsn_dot_entity_dot_response_dot_BlockResponses__pb2.GetBlockHeaderByHeightResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def getBlockByHash(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/org.qsn.protobuf.BlockRpc/getBlockByHash',
            qsn_dot_entity_dot_request_dot_BlockRequests__pb2.GetBlockByHashRequest.SerializeToString,
            qsn_dot_entity_dot_response_dot_BlockResponses__pb2.GetBlockByHashResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def getBlockByHeight(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/org.qsn.protobuf.BlockRpc/getBlockByHeight',
            qsn_dot_entity_dot_request_dot_BlockRequests__pb2.GetBlockByHeightRequest.SerializeToString,
            qsn_dot_entity_dot_response_dot_BlockResponses__pb2.GetBlockByHeightResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def getBlockHeight(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/org.qsn.protobuf.BlockRpc/getBlockHeight',
            qsn_dot_entity_dot_request_dot_BlockRequests__pb2.GetBlockHeightRequest.SerializeToString,
            qsn_dot_entity_dot_response_dot_BlockResponses__pb2.GetBlockHeightResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)