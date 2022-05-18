/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

package dev.test.namespace_from_package_without_module_name;

import com.facebook.swift.codec.*;
import com.facebook.swift.codec.ThriftField.Requiredness;
import com.facebook.swift.service.*;
import com.facebook.thrift.client.*;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.*;
import java.util.*;
import reactor.core.publisher.Mono;

@SwiftGenerated
@com.facebook.swift.service.ThriftService("TestService")
public interface TestService extends java.io.Closeable, com.facebook.thrift.util.BlockingService {
    static com.facebook.thrift.server.RpcServerHandlerBuilder<TestService> serverHandlerBuilder(TestService _serverImpl) {
        return new com.facebook.thrift.server.RpcServerHandlerBuilder<TestService>(_serverImpl) {
            @Override
            public com.facebook.thrift.server.RpcServerHandler build() {
                return new TestServiceRpcServerHandler(impl, eventHandlers);
            }
        };
    }

    @Deprecated
    static com.facebook.thrift.server.RpcServerHandler createRpcServerHandler(
        final TestService _serviceImpl,
        final List<com.facebook.swift.service.ThriftEventHandler> _eventHandlers) {
        return new TestServiceRpcServerHandler(_serviceImpl, _eventHandlers);
    }

    @Deprecated
    static reactor.core.publisher.Mono<? extends com.facebook.thrift.server.ServerTransport> createServer(
        final com.facebook.swift.service.ThriftServerConfig _thriftServerConfig,
        final com.facebook.thrift.util.TransportType _transportType,
        final TestService _serviceImpl,
        final List<com.facebook.swift.service.ThriftEventHandler> _eventHandlers) {

        final com.facebook.thrift.server.RpcServerHandler _serverHandler = createRpcServerHandler(_serviceImpl, _eventHandlers);

        return com.facebook.thrift.util.RpcServerUtils.createServerTransport(_thriftServerConfig, _transportType, _serverHandler);
    }

    static com.facebook.thrift.client.ClientBuilder<TestService> clientBuilder() {
        return new ClientBuilder<TestService>() {
            @Override
            public TestService build(Mono<RpcClient> rpcClientMono) {
                TestService.Reactive _delegate =
                    new TestServiceReactiveClient(protocolId, rpcClientMono, headers, persistentHeaders);
                return new TestServiceReactiveBlockingWrapper(_delegate);
            }
        };
    }

    @com.facebook.swift.service.ThriftService("TestService")
    public interface Async extends java.io.Closeable, com.facebook.thrift.util.AsyncService {
        static com.facebook.thrift.server.RpcServerHandlerBuilder<TestService.Async> serverHandlerBuilder(TestService.Async _serverImpl) {
            return new com.facebook.thrift.server.RpcServerHandlerBuilder<TestService.Async>(_serverImpl) {
                @Override
                public com.facebook.thrift.server.RpcServerHandler build() {
                    return new TestServiceRpcServerHandler(impl, eventHandlers);
                }
            };
        }

        @Deprecated
        static com.facebook.thrift.server.RpcServerHandler createRpcServerHandler(
        final TestService.Async _serviceImpl,
        final List<com.facebook.swift.service.ThriftEventHandler> _eventHandlers) {
            return new TestServiceRpcServerHandler(_serviceImpl, _eventHandlers);
        }

        @Deprecated
        static reactor.core.publisher.Mono<? extends com.facebook.thrift.server.ServerTransport> createServer(
            final com.facebook.swift.service.ThriftServerConfig _thriftServerConfig,
            final com.facebook.thrift.util.TransportType _transportType,
            final TestService.Async _serviceImpl,
            final List<com.facebook.swift.service.ThriftEventHandler> _eventHandlers) {

            final com.facebook.thrift.server.RpcServerHandler _serverHandler = createRpcServerHandler(_serviceImpl, _eventHandlers);

            return com.facebook.thrift.util.RpcServerUtils.createServerTransport(_thriftServerConfig, _transportType, _serverHandler);
        }

        static com.facebook.thrift.client.ClientBuilder<TestService.Async> clientBuilder() {
            return new ClientBuilder<TestService.Async>() {
                @Override
                public TestService.Async build(Mono<RpcClient> rpcClientMono) {
                    TestService.Reactive _delegate =
                        new TestServiceReactiveClient(protocolId, rpcClientMono, headers, persistentHeaders);
                    return new TestServiceReactiveAsyncWrapper(_delegate);
                }
            };
        }

        @java.lang.Override void close();

        @ThriftMethod(value = "init")
        ListenableFuture<Long> init(
            @com.facebook.swift.codec.ThriftField(value=1, name="int1", requiredness=Requiredness.NONE) final long int1);

        default ListenableFuture<Long> init(
            @com.facebook.swift.codec.ThriftField(value=1, name="int1", requiredness=Requiredness.NONE) final long int1,
            RpcOptions rpcOptions) {
            throw new UnsupportedOperationException();
        }

        default ListenableFuture<ResponseWrapper<Long>> initWrapper(
            @com.facebook.swift.codec.ThriftField(value=1, name="int1", requiredness=Requiredness.NONE) final long int1,
            RpcOptions rpcOptions) {
            throw new UnsupportedOperationException();
        }
    }
    @java.lang.Override void close();

    @ThriftMethod(value = "init")
    long init(
        @com.facebook.swift.codec.ThriftField(value=1, name="int1", requiredness=Requiredness.NONE) final long int1) throws org.apache.thrift.TException;

    default long init(
        @com.facebook.swift.codec.ThriftField(value=1, name="int1", requiredness=Requiredness.NONE) final long int1,
        RpcOptions rpcOptions) throws org.apache.thrift.TException {
        throw new UnsupportedOperationException();
    }

    default ResponseWrapper<Long> initWrapper(
        @com.facebook.swift.codec.ThriftField(value=1, name="int1", requiredness=Requiredness.NONE) final long int1,
        RpcOptions rpcOptions) throws org.apache.thrift.TException {
        throw new UnsupportedOperationException();
    }

    @com.facebook.swift.service.ThriftService("TestService")
    interface Reactive extends reactor.core.Disposable, com.facebook.thrift.util.ReactiveService {
        static com.facebook.thrift.server.RpcServerHandlerBuilder<TestService.Reactive> serverHandlerBuilder(TestService.Reactive _serverImpl) {
            return new com.facebook.thrift.server.RpcServerHandlerBuilder<TestService.Reactive>(_serverImpl) {
                @Override
                public com.facebook.thrift.server.RpcServerHandler build() {
                    return new TestServiceRpcServerHandler(impl, eventHandlers);
                }
            };
        }

        @Deprecated
        static com.facebook.thrift.server.RpcServerHandler createRpcServerHandler(
        final TestService.Reactive _serviceImpl,
        final List<com.facebook.swift.service.ThriftEventHandler> _eventHandlers) {
            return new TestServiceRpcServerHandler(_serviceImpl, _eventHandlers);
        }

        @Deprecated
        static reactor.core.publisher.Mono<? extends com.facebook.thrift.server.ServerTransport> createServer(
            final com.facebook.swift.service.ThriftServerConfig _thriftServerConfig,
            final com.facebook.thrift.util.TransportType _transportType,
            final TestService.Reactive _serviceImpl,
            final List<com.facebook.swift.service.ThriftEventHandler> _eventHandlers) {

            final com.facebook.thrift.server.RpcServerHandler _serverHandler = createRpcServerHandler(_serviceImpl, _eventHandlers);

            return com.facebook.thrift.util.RpcServerUtils.createServerTransport(_thriftServerConfig, _transportType, _serverHandler);
        }

        static com.facebook.thrift.client.ClientBuilder<TestService.Reactive> clientBuilder() {
            return new ClientBuilder<TestService.Reactive>() {
                @Override
                public TestService.Reactive build(Mono<RpcClient> rpcClientMono) {
                    return new TestServiceReactiveClient(protocolId, rpcClientMono, headers, persistentHeaders);
                }
            };
        }

        @ThriftMethod(value = "init")
        reactor.core.publisher.Mono<Long> init(final long int1);

        default reactor.core.publisher.Mono<Long> init(final long int1, RpcOptions rpcOptions) {
            throw new UnsupportedOperationException();
        }

        default reactor.core.publisher.Mono<ResponseWrapper<Long>> initWrapper(final long int1, RpcOptions rpcOptions) {
            throw new UnsupportedOperationException();
        }

    }
}
