// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package cn.javayong.idgenerator.proto;

public final class idgeneratorservice {
  private idgeneratorservice() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sharding_IdRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sharding_IdRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sharding_IdResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sharding_IdResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rservice.proto\022\010sharding\" \n\tIdRequest\022\023" +
      "\n\013shardingKey\030\001 \001(\t\"5\n\010IdResult\022\014\n\004code\030" +
      "\001 \001(\005\022\017\n\007message\030\002 \001(\t\022\n\n\002id\030\003 \001(\0032I\n\022Id" +
      "GeneratorService\0223\n\010getSeqId\022\023.sharding." +
      "IdRequest\032\022.sharding.IdResultB5\n\035cn.java" +
      "yong.idgenerator.protoB\022idgeneratorservi" +
      "ceP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_sharding_IdRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_sharding_IdRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sharding_IdRequest_descriptor,
        new java.lang.String[] { "ShardingKey", });
    internal_static_sharding_IdResult_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_sharding_IdResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sharding_IdResult_descriptor,
        new java.lang.String[] { "Code", "Message", "Id", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}