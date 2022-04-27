/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

package test.fixtures.inheritance;

import com.facebook.nifty.client.RequestChannel;
import com.facebook.swift.codec.*;
import com.facebook.swift.service.*;
import com.facebook.swift.service.metadata.*;
import com.facebook.thrift.client.*;
import com.facebook.thrift.util.FutureUtil;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.*;
import java.lang.reflect.Method;
import java.util.*;
import org.apache.thrift.ProtocolId;
import reactor.core.publisher.Mono;

@SwiftGenerated
@Deprecated
public class MyNodeAsyncClientImpl extends test.fixtures.inheritance.MyRootAsyncClientImpl implements MyNode.Async {

    // Method Handlers
    private ThriftMethodHandler doMidMethodHandler;

    // Method Exceptions
    private static final Class[] doMidExceptions = new Class[] {
        org.apache.thrift.TException.class};

    public MyNodeAsyncClientImpl(
        RequestChannel channel,
        Map<Method, ThriftMethodHandler> methods,
        Map<String, String> headers,
        Map<String, String> persistentHeaders,
        List<? extends ThriftClientEventHandler> eventHandlers) {
      super(channel, methods, headers, persistentHeaders, eventHandlers);

      Map<String, ThriftMethodHandler> methodHandlerMap = new HashMap<>();
      methods.forEach(
          (key, value) -> {
            methodHandlerMap.put(key.getName(), value);
          });

      // Set method handlers
      doMidMethodHandler = methodHandlerMap.get("doMid");
    }

    public MyNodeAsyncClientImpl(
        Map<String, String> headers,
        Map<String, String> persistentHeaders,
        Mono<? extends RpcClient> rpcClient,
        ThriftServiceMetadata serviceMetadata,
        ThriftCodecManager codecManager,
        ProtocolId protocolId,
        Map<Method, ThriftMethodHandler> methods) {
      super(headers, persistentHeaders, rpcClient, serviceMetadata, codecManager, protocolId, methods);

      Map<String, ThriftMethodHandler> methodHandlerMap = new HashMap<>();
      methods.forEach(
          (key, value) -> {
            methodHandlerMap.put(key.getName(), value);
          });

      // Set method handlers
      doMidMethodHandler = methodHandlerMap.get("doMid");
    }

    @java.lang.Override
    public void close() {
        super.close();
    }


    @java.lang.Override
    public ListenableFuture<Void> doMid() {
        return doMid(RpcOptions.EMPTY);
    }

    @java.lang.Override
    public ListenableFuture<Void> doMid(
        RpcOptions rpcOptions) {
        return FutureUtil.transform(doMidWrapper(rpcOptions));
    }

    @java.lang.Override
    public ListenableFuture<ResponseWrapper<Void>> doMidWrapper(
        RpcOptions rpcOptions) {
        try {
          return executeWrapperWithOptions(doMidMethodHandler, doMidExceptions, rpcOptions);
        } catch (Throwable t) {
          throw new RuntimeTException(t.getMessage(), t);
        }
    }
}
