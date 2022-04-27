/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

package test.fixtures.basicannotations;

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
public class MyServicePrioChildAsyncClientImpl extends test.fixtures.basicannotations.MyServicePrioParentAsyncClientImpl implements MyServicePrioChild.Async {

    // Method Handlers
    private ThriftMethodHandler pangMethodHandler;

    // Method Exceptions
    private static final Class[] pangExceptions = new Class[] {
        org.apache.thrift.TException.class};

    public MyServicePrioChildAsyncClientImpl(
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
      pangMethodHandler = methodHandlerMap.get("pang");
    }

    public MyServicePrioChildAsyncClientImpl(
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
      pangMethodHandler = methodHandlerMap.get("pang");
    }

    @java.lang.Override
    public void close() {
        super.close();
    }


    @java.lang.Override
    public ListenableFuture<Void> pang() {
        return pang(RpcOptions.EMPTY);
    }

    @java.lang.Override
    public ListenableFuture<Void> pang(
        RpcOptions rpcOptions) {
        return FutureUtil.transform(pangWrapper(rpcOptions));
    }

    @java.lang.Override
    public ListenableFuture<ResponseWrapper<Void>> pangWrapper(
        RpcOptions rpcOptions) {
        try {
          return executeWrapperWithOptions(pangMethodHandler, pangExceptions, rpcOptions);
        } catch (Throwable t) {
          throw new RuntimeTException(t.getMessage(), t);
        }
    }
}
