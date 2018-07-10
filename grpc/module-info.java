module io.grpc {

	
	requires com.google.protobuf;

	exports io.grpc;
	exports io.grpc.protobuf;
	exports io.grpc.internal;
	exports io.grpc.stub;
	exports io.grpc.util;
	
	requires java.logging;
	requires java.naming;
	requires static java.sql;
	requires static java.compiler;

	// requires error.prone.annotations;
	// requires guava;

	uses io.grpc.ManagedChannelProvider;
	uses io.grpc.NameResolverProvider;
	uses io.grpc.ServerProvider;

	provides io.grpc.NameResolverProvider with io.grpc.internal.DnsNameResolverProvider;

}