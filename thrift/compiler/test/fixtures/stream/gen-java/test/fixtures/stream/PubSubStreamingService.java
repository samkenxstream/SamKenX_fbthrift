/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

package test.fixtures.stream;

import com.facebook.swift.codec.*;
import com.facebook.swift.codec.ThriftField.Requiredness;
import com.facebook.swift.service.*;
import com.facebook.thrift.client.*;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.*;
import java.util.*;

@SwiftGenerated
@com.facebook.swift.service.ThriftService("PubSubStreamingService")
public interface PubSubStreamingService extends java.io.Closeable, com.facebook.thrift.util.BlockingService {
    static com.facebook.thrift.server.RpcServerHandler createRpcServerHandler(
        final PubSubStreamingService _serviceImpl,
        final List<com.facebook.swift.service.ThriftEventHandler> _eventHandlers) {
        return new PubSubStreamingServiceRpcServerHandler(_serviceImpl, _eventHandlers);
    }

    static reactor.core.publisher.Mono<? extends com.facebook.thrift.server.ServerTransport> createServer(
        final com.facebook.swift.service.ThriftServerConfig _thriftServerConfig,
        final com.facebook.thrift.util.TransportType _transportType,
        final PubSubStreamingService _serviceImpl,
        final List<com.facebook.swift.service.ThriftEventHandler> _eventHandlers) {

        final com.facebook.thrift.server.RpcServerHandler _serverHandler = createRpcServerHandler(_serviceImpl, _eventHandlers);

        return com.facebook.thrift.util.RpcServerUtils.createServerTransport(_thriftServerConfig, _transportType, _serverHandler);
    }

    static PubSubStreamingService createClient(
      final com.facebook.thrift.client.RpcClientFactory _rpcClientFactory,
      final java.net.SocketAddress _socketAddress,
      final org.apache.thrift.ProtocolId _protocolId) {
        PubSubStreamingService.Reactive _delegate = Reactive.createClient(
            _rpcClientFactory,
            _socketAddress,
            _protocolId);
        return new PubSubStreamingServiceReactiveBlockingWrapper(_delegate);
    }

    static PubSubStreamingService createClient(
      final com.facebook.thrift.client.RpcClientFactory _rpcClientFactory,
      final java.net.SocketAddress _socketAddress,
      final org.apache.thrift.ProtocolId _protocolId,
      final java.util.Map<String, String> _headers,
      final java.util.Map<String, String> _persistentHeaders) {
        PubSubStreamingService.Reactive _delegate = Reactive.createClient(
            _rpcClientFactory,
            _socketAddress,
            _protocolId,
            _headers,
            _persistentHeaders);
        return new PubSubStreamingServiceReactiveBlockingWrapper(_delegate);
    }

    static PubSubStreamingService createClient(
      final reactor.core.publisher.Mono<com.facebook.thrift.client.RpcClient> _rpcClientMono,
      final org.apache.thrift.ProtocolId _protocolId) {
        PubSubStreamingService.Reactive _delegate = Reactive.createClient(
            _rpcClientMono,
            _protocolId);
        return new PubSubStreamingServiceReactiveBlockingWrapper(_delegate);
    }

    static PubSubStreamingService createClient(
      final reactor.core.publisher.Mono<com.facebook.thrift.client.RpcClient> _rpcClientMono,
      final org.apache.thrift.ProtocolId _protocolId,
      final java.util.Map<String, String> _headers,
      final java.util.Map<String, String> _persistentHeaders) {
        PubSubStreamingService.Reactive _delegate = Reactive.createClient(
            _rpcClientMono,
            _protocolId,
            _headers,
            _persistentHeaders);
        return new PubSubStreamingServiceReactiveBlockingWrapper(_delegate);
    }

    @com.facebook.swift.service.ThriftService("PubSubStreamingService")
    public interface Async extends java.io.Closeable, com.facebook.thrift.util.AsyncService {
        static com.facebook.thrift.server.RpcServerHandler createRpcServerHandler(
        final PubSubStreamingService.Async _serviceImpl,
        final List<com.facebook.swift.service.ThriftEventHandler> _eventHandlers) {
            return new PubSubStreamingServiceRpcServerHandler(_serviceImpl, _eventHandlers);
        }

        static reactor.core.publisher.Mono<? extends com.facebook.thrift.server.ServerTransport> createServer(
            final com.facebook.swift.service.ThriftServerConfig _thriftServerConfig,
            final com.facebook.thrift.util.TransportType _transportType,
            final PubSubStreamingService.Async _serviceImpl,
            final List<com.facebook.swift.service.ThriftEventHandler> _eventHandlers) {

            final com.facebook.thrift.server.RpcServerHandler _serverHandler = createRpcServerHandler(_serviceImpl, _eventHandlers);

            return com.facebook.thrift.util.RpcServerUtils.createServerTransport(_thriftServerConfig, _transportType, _serverHandler);
        }

        static PubSubStreamingService.Async createClient(
            final com.facebook.thrift.client.RpcClientFactory _rpcClientFactory,
            final java.net.SocketAddress _socketAddress,
            final org.apache.thrift.ProtocolId _protocolId) {
                PubSubStreamingService.Reactive _delegate = Reactive.createClient(
                    _rpcClientFactory,
                    _socketAddress,
                    _protocolId);
                return new PubSubStreamingServiceReactiveAsyncWrapper(_delegate);
        }

        static PubSubStreamingService.Async createClient(
            final com.facebook.thrift.client.RpcClientFactory _rpcClientFactory,
            final java.net.SocketAddress _socketAddress,
            final org.apache.thrift.ProtocolId _protocolId,
            final java.util.Map<String, String> _headers,
            final java.util.Map<String, String> _persistentHeaders) {
                PubSubStreamingService.Reactive _delegate = Reactive.createClient(
                    _rpcClientFactory,
                    _socketAddress,
                    _protocolId,
                    _headers,
                    _persistentHeaders);
                return new PubSubStreamingServiceReactiveAsyncWrapper(_delegate);
        }

        static PubSubStreamingService.Async createClient(
            final reactor.core.publisher.Mono<com.facebook.thrift.client.RpcClient> _rpcClientMono,
            final org.apache.thrift.ProtocolId _protocolId) {
                PubSubStreamingService.Reactive _delegate = Reactive.createClient(
                    _rpcClientMono,
                    _protocolId);
                return new PubSubStreamingServiceReactiveAsyncWrapper(_delegate);
        }

        static PubSubStreamingService.Async createClient(
            final reactor.core.publisher.Mono<com.facebook.thrift.client.RpcClient> _rpcClientMono,
            final org.apache.thrift.ProtocolId _protocolId,
            final java.util.Map<String, String> _headers,
            final java.util.Map<String, String> _persistentHeaders) {
                PubSubStreamingService.Reactive _delegate = Reactive.createClient(
                    _rpcClientMono,
                    _protocolId,
                    _headers,
                    _persistentHeaders);
                return new PubSubStreamingServiceReactiveAsyncWrapper(_delegate);
        }

        @java.lang.Override void close();

    }
    @java.lang.Override void close();

    @com.facebook.swift.service.ThriftService("PubSubStreamingService")
    interface Reactive extends reactor.core.Disposable, com.facebook.thrift.util.ReactiveService {
        static com.facebook.thrift.server.RpcServerHandler createRpcServerHandler(
        final PubSubStreamingService.Reactive _serviceImpl,
        final List<com.facebook.swift.service.ThriftEventHandler> _eventHandlers) {
            return new PubSubStreamingServiceRpcServerHandler(_serviceImpl, _eventHandlers);
        }

        static reactor.core.publisher.Mono<? extends com.facebook.thrift.server.ServerTransport> createServer(
            final com.facebook.swift.service.ThriftServerConfig _thriftServerConfig,
            final com.facebook.thrift.util.TransportType _transportType,
            final PubSubStreamingService.Reactive _serviceImpl,
            final List<com.facebook.swift.service.ThriftEventHandler> _eventHandlers) {

            final com.facebook.thrift.server.RpcServerHandler _serverHandler = createRpcServerHandler(_serviceImpl, _eventHandlers);

            return com.facebook.thrift.util.RpcServerUtils.createServerTransport(_thriftServerConfig, _transportType, _serverHandler);
        }

        static PubSubStreamingService.Reactive createClient(
            final com.facebook.thrift.client.RpcClientFactory _rpcClientFactory,
            final java.net.SocketAddress _socketAddress,
            final org.apache.thrift.ProtocolId _protocolId) {
                return new PubSubStreamingServiceReactiveClient(
                    _protocolId,
                    _rpcClientFactory.createRpcClient(_socketAddress),
                    java.util.Collections.emptyMap(),
                    java.util.Collections.emptyMap());
        }

        static PubSubStreamingService.Reactive createClient(
            final com.facebook.thrift.client.RpcClientFactory _rpcClientFactory,
            final java.net.SocketAddress _socketAddress,
            final org.apache.thrift.ProtocolId _protocolId,
            final java.util.Map<String, String> _headers,
            final java.util.Map<String, String> _persistentHeaders
            ) {
                return new PubSubStreamingServiceReactiveClient(
                    _protocolId,
                    _rpcClientFactory.createRpcClient(_socketAddress),
                    _headers,
                    _persistentHeaders);
        }

        static PubSubStreamingService.Reactive createClient(
            final reactor.core.publisher.Mono<com.facebook.thrift.client.RpcClient> _rpcClientMono,
            final org.apache.thrift.ProtocolId _protocolId) {
                return new PubSubStreamingServiceReactiveClient(
                    _protocolId,
                    _rpcClientMono,
                    java.util.Collections.emptyMap(),
                    java.util.Collections.emptyMap());
        }

        static PubSubStreamingService.Reactive createClient(
            final reactor.core.publisher.Mono<com.facebook.thrift.client.RpcClient> _rpcClientMono,
            final org.apache.thrift.ProtocolId _protocolId,
            final java.util.Map<String, String> _headers,
            final java.util.Map<String, String> _persistentHeaders
            ) {
                return new PubSubStreamingServiceReactiveClient(
                    _protocolId,
                    _rpcClientMono,
                    _headers,
                    _persistentHeaders);
        }

        reactor.core.publisher.Flux<Integer> returnstream(final int i32From, final int i32To);

        default reactor.core.publisher.Flux<Integer> returnstream(final int i32From, final int i32To, RpcOptions rpcOptions) {
            throw new UnsupportedOperationException();
        }

        default reactor.core.publisher.Flux<ResponseWrapper<Integer>> returnstreamWrapper(final int i32From, final int i32To, RpcOptions rpcOptions) {
            throw new UnsupportedOperationException();
        }

        reactor.core.publisher.Flux<Integer> streamthrows(final int foo);

        default reactor.core.publisher.Flux<Integer> streamthrows(final int foo, RpcOptions rpcOptions) {
            throw new UnsupportedOperationException();
        }

        default reactor.core.publisher.Flux<ResponseWrapper<Integer>> streamthrowsWrapper(final int foo, RpcOptions rpcOptions) {
            throw new UnsupportedOperationException();
        }

        reactor.core.publisher.Flux<Integer> boththrows(final int foo);

        default reactor.core.publisher.Flux<Integer> boththrows(final int foo, RpcOptions rpcOptions) {
            throw new UnsupportedOperationException();
        }

        default reactor.core.publisher.Flux<ResponseWrapper<Integer>> boththrowsWrapper(final int foo, RpcOptions rpcOptions) {
            throw new UnsupportedOperationException();
        }

        reactor.core.publisher.Flux<com.facebook.thrift.model.StreamResponse<Integer,Integer>> responseandstreamthrows(final int foo);

        default reactor.core.publisher.Flux<com.facebook.thrift.model.StreamResponse<Integer,Integer>> responseandstreamthrows(final int foo, RpcOptions rpcOptions) {
            throw new UnsupportedOperationException();
        }

        default reactor.core.publisher.Flux<ResponseWrapper<com.facebook.thrift.model.StreamResponse<Integer,Integer>>> responseandstreamthrowsWrapper(final int foo, RpcOptions rpcOptions) {
            throw new UnsupportedOperationException();
        }

        reactor.core.publisher.Flux<Integer> returnstreamFast(final int i32From, final int i32To);

        default reactor.core.publisher.Flux<Integer> returnstreamFast(final int i32From, final int i32To, RpcOptions rpcOptions) {
            throw new UnsupportedOperationException();
        }

        default reactor.core.publisher.Flux<ResponseWrapper<Integer>> returnstreamFastWrapper(final int i32From, final int i32To, RpcOptions rpcOptions) {
            throw new UnsupportedOperationException();
        }

    }
}
