/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

package test.fixtures.inheritance;

import com.facebook.swift.codec.*;
import com.facebook.swift.codec.ThriftField.Requiredness;
import com.facebook.swift.service.*;
import com.facebook.thrift.client.*;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.*;
import java.util.*;
import reactor.core.publisher.Mono;

@SwiftGenerated
@com.facebook.swift.service.ThriftService("MyNode")
public interface MyNode extends java.io.Closeable, com.facebook.thrift.util.BlockingService, test.fixtures.inheritance.MyRoot {
    static com.facebook.thrift.server.RpcServerHandlerBuilder<MyNode> serverHandlerBuilder(MyNode _serverImpl) {
        return new com.facebook.thrift.server.RpcServerHandlerBuilder<MyNode>(_serverImpl) {
            @Override
            public com.facebook.thrift.server.RpcServerHandler build() {
                return new MyNodeRpcServerHandler(impl, eventHandlers);
            }
        };
    }

    @Deprecated
    static com.facebook.thrift.server.RpcServerHandler createRpcServerHandler(
        final MyNode _serviceImpl,
        final List<com.facebook.swift.service.ThriftEventHandler> _eventHandlers) {
        return new MyNodeRpcServerHandler(_serviceImpl, _eventHandlers);
    }

    @Deprecated
    static reactor.core.publisher.Mono<? extends com.facebook.thrift.server.ServerTransport> createServer(
        final com.facebook.swift.service.ThriftServerConfig _thriftServerConfig,
        final com.facebook.thrift.util.TransportType _transportType,
        final MyNode _serviceImpl,
        final List<com.facebook.swift.service.ThriftEventHandler> _eventHandlers) {

        final com.facebook.thrift.server.RpcServerHandler _serverHandler = createRpcServerHandler(_serviceImpl, _eventHandlers);

        return com.facebook.thrift.util.RpcServerUtils.createServerTransport(_thriftServerConfig, _transportType, _serverHandler);
    }

    static com.facebook.thrift.client.ClientBuilder<MyNode> clientBuilder() {
        return new ClientBuilder<MyNode>() {
            @Override
            public MyNode build(Mono<RpcClient> rpcClientMono) {
                MyNode.Reactive _delegate =
                    new MyNodeReactiveClient(protocolId, rpcClientMono, headers, persistentHeaders);
                return new MyNodeReactiveBlockingWrapper(_delegate);
            }
        };
    }

    @com.facebook.swift.service.ThriftService("MyNode")
    public interface Async extends java.io.Closeable, com.facebook.thrift.util.AsyncService, test.fixtures.inheritance.MyRoot.Async {
        static com.facebook.thrift.server.RpcServerHandlerBuilder<MyNode.Async> serverHandlerBuilder(MyNode.Async _serverImpl) {
            return new com.facebook.thrift.server.RpcServerHandlerBuilder<MyNode.Async>(_serverImpl) {
                @Override
                public com.facebook.thrift.server.RpcServerHandler build() {
                    return new MyNodeRpcServerHandler(impl, eventHandlers);
                }
            };
        }

        @Deprecated
        static com.facebook.thrift.server.RpcServerHandler createRpcServerHandler(
        final MyNode.Async _serviceImpl,
        final List<com.facebook.swift.service.ThriftEventHandler> _eventHandlers) {
            return new MyNodeRpcServerHandler(_serviceImpl, _eventHandlers);
        }

        @Deprecated
        static reactor.core.publisher.Mono<? extends com.facebook.thrift.server.ServerTransport> createServer(
            final com.facebook.swift.service.ThriftServerConfig _thriftServerConfig,
            final com.facebook.thrift.util.TransportType _transportType,
            final MyNode.Async _serviceImpl,
            final List<com.facebook.swift.service.ThriftEventHandler> _eventHandlers) {

            final com.facebook.thrift.server.RpcServerHandler _serverHandler = createRpcServerHandler(_serviceImpl, _eventHandlers);

            return com.facebook.thrift.util.RpcServerUtils.createServerTransport(_thriftServerConfig, _transportType, _serverHandler);
        }

        static com.facebook.thrift.client.ClientBuilder<MyNode.Async> clientBuilder() {
            return new ClientBuilder<MyNode.Async>() {
                @Override
                public MyNode.Async build(Mono<RpcClient> rpcClientMono) {
                    MyNode.Reactive _delegate =
                        new MyNodeReactiveClient(protocolId, rpcClientMono, headers, persistentHeaders);
                    return new MyNodeReactiveAsyncWrapper(_delegate);
                }
            };
        }

        @java.lang.Override void close();

        @ThriftMethod(value = "do_mid")
        ListenableFuture<Void> doMid();

        default ListenableFuture<Void> doMid(
            RpcOptions rpcOptions) {
            throw new UnsupportedOperationException();
        }

        default ListenableFuture<ResponseWrapper<Void>> doMidWrapper(
            RpcOptions rpcOptions) {
            throw new UnsupportedOperationException();
        }
    }
    @java.lang.Override void close();

    @ThriftMethod(value = "do_mid")
    void doMid() throws org.apache.thrift.TException;

    default void doMid(
        RpcOptions rpcOptions) throws org.apache.thrift.TException {
        throw new UnsupportedOperationException();
    }

    default ResponseWrapper<Void> doMidWrapper(
        RpcOptions rpcOptions) throws org.apache.thrift.TException {
        throw new UnsupportedOperationException();
    }

    @com.facebook.swift.service.ThriftService("MyNode")
    interface Reactive extends reactor.core.Disposable, com.facebook.thrift.util.ReactiveService, test.fixtures.inheritance.MyRoot.Reactive {
        static com.facebook.thrift.server.RpcServerHandlerBuilder<MyNode.Reactive> serverHandlerBuilder(MyNode.Reactive _serverImpl) {
            return new com.facebook.thrift.server.RpcServerHandlerBuilder<MyNode.Reactive>(_serverImpl) {
                @Override
                public com.facebook.thrift.server.RpcServerHandler build() {
                    return new MyNodeRpcServerHandler(impl, eventHandlers);
                }
            };
        }

        @Deprecated
        static com.facebook.thrift.server.RpcServerHandler createRpcServerHandler(
        final MyNode.Reactive _serviceImpl,
        final List<com.facebook.swift.service.ThriftEventHandler> _eventHandlers) {
            return new MyNodeRpcServerHandler(_serviceImpl, _eventHandlers);
        }

        @Deprecated
        static reactor.core.publisher.Mono<? extends com.facebook.thrift.server.ServerTransport> createServer(
            final com.facebook.swift.service.ThriftServerConfig _thriftServerConfig,
            final com.facebook.thrift.util.TransportType _transportType,
            final MyNode.Reactive _serviceImpl,
            final List<com.facebook.swift.service.ThriftEventHandler> _eventHandlers) {

            final com.facebook.thrift.server.RpcServerHandler _serverHandler = createRpcServerHandler(_serviceImpl, _eventHandlers);

            return com.facebook.thrift.util.RpcServerUtils.createServerTransport(_thriftServerConfig, _transportType, _serverHandler);
        }

        static com.facebook.thrift.client.ClientBuilder<MyNode.Reactive> clientBuilder() {
            return new ClientBuilder<MyNode.Reactive>() {
                @Override
                public MyNode.Reactive build(Mono<RpcClient> rpcClientMono) {
                    return new MyNodeReactiveClient(protocolId, rpcClientMono, headers, persistentHeaders);
                }
            };
        }

        @ThriftMethod(value = "do_mid")
        reactor.core.publisher.Mono<Void> doMid();

        default reactor.core.publisher.Mono<Void> doMid(RpcOptions rpcOptions) {
            throw new UnsupportedOperationException();
        }

        default reactor.core.publisher.Mono<ResponseWrapper<Void>> doMidWrapper(RpcOptions rpcOptions) {
            throw new UnsupportedOperationException();
        }

    }
}
