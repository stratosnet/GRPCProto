# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: qsn/entity/common/BaseRequest.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor.FileDescriptor(
  name='qsn/entity/common/BaseRequest.proto',
  package='org.qsn.protobuf',
  syntax='proto3',
  serialized_options=b'\n(org.qsn.api.rpc.grpc.proto.entity.commonP\001',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n#qsn/entity/common/BaseRequest.proto\x12\x10org.qsn.protobuf\"\x1e\n\x0b\x42\x61seRequest\x12\x0f\n\x07version\x18\x01 \x01(\tB,\n(org.qsn.api.rpc.grpc.proto.entity.commonP\x01\x62\x06proto3'
)




_BASEREQUEST = _descriptor.Descriptor(
  name='BaseRequest',
  full_name='org.qsn.protobuf.BaseRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='version', full_name='org.qsn.protobuf.BaseRequest.version', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=57,
  serialized_end=87,
)

DESCRIPTOR.message_types_by_name['BaseRequest'] = _BASEREQUEST
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

BaseRequest = _reflection.GeneratedProtocolMessageType('BaseRequest', (_message.Message,), {
  'DESCRIPTOR' : _BASEREQUEST,
  '__module__' : 'qsn.entity.common.BaseRequest_pb2'
  # @@protoc_insertion_point(class_scope:org.qsn.protobuf.BaseRequest)
  })
_sym_db.RegisterMessage(BaseRequest)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
