module io.grpc {

	exports io.grpc;
	exports io.grpc.protobuf;
	exports io.grpc.internal;
	exports io.grpc.stub;
	exports io.grpc.util;
	
	requires com.google.protobuf;
	
	requires java.logging;
	requires java.naming;

	// requires error.prone.annotations;
	// requires guava;

	uses io.grpc.ManagedChannelProvider;
	uses io.grpc.NameResolverProvider;
	uses io.grpc.ServerProvider;

	provides io.grpc.NameResolverProvider with io.grpc.internal.DnsNameResolverProvider;

}