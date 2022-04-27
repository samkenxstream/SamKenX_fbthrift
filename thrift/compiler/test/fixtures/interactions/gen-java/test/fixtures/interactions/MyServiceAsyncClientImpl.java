/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

package test.fixtures.interactions;

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
public class MyServiceAsyncClientImpl extends AbstractThriftClient implements MyService.Async {

    // Method Handlers
    private ThriftMethodHandler fooMethodHandler;
    private ThriftMethodHandler interactMethodHandler;
    private ThriftMethodHandler interactFastMethodHandler;
    // Interaction Handlers
    private ThriftMethodHandler frobnicateIMethodHandler;
    private ThriftMethodHandler pingIMethodHandler;
    // Interaction Handlers
    private ThriftMethodHandler frobnicateIMethodHandler;
    private ThriftMethodHandler pingIMethodHandler;
    // Interaction Handlers
    private ThriftMethodHandler frobnicateIMethodHandler;

    // Method Exceptions
    private static final Class[] fooExceptions = new Class[] {
        org.apache.thrift.TException.class};
    private static final Class[] interactExceptions = new Class[] {
        org.apache.thrift.TException.class};
    private static final Class[] interactFastExceptions = new Class[] {
        org.apache.thrift.TException.class};
    // Interaction Exceptions
    private static final Class[] frobnicateIExceptions = new Class[] {
        test.fixtures.interactions.CustomException.class, org.apache.thrift.TException.class};
    private static final Class[] pingIExceptions = new Class[] {
        org.apache.thrift.TException.class};
    // Interaction Exceptions
    private static final Class[] frobnicateIExceptions = new Class[] {
        org.apache.thrift.TException.class};
    private static final Class[] pingIExceptions = new Class[] {
        org.apache.thrift.TException.class};
    // Interaction Exceptions
    private static final Class[] frobnicateIExceptions = new Class[] {
        org.apache.thrift.TException.class};

    public MyServiceAsyncClientImpl(
        RequestChannel channel,
        Map<Method, ThriftMethodHandler> methods,
        Map<String, String> headers,
        Map<String, String> persistentHeaders,
        List<? extends ThriftClientEventHandler> eventHandlers) {
      super(channel, headers, persistentHeaders, eventHandlers);

      Map<String, ThriftMethodHandler> methodHandlerMap = new HashMap<>();
      methods.forEach(
          (key, value) -> {
            methodHandlerMap.put(key.getName(), value);
          });

      // Set method handlers
      fooMethodHandler = methodHandlerMap.get("foo");
      interactMethodHandler = methodHandlerMap.get("interact");
      interactFastMethodHandler = methodHandlerMap.get("interactFast");
      // Set interaction handlers
      frobnicateIMethodHandler = methodHandlerMap.get("frobnicate");
      pingIMethodHandler = methodHandlerMap.get("ping");
      // Set interaction handlers
      frobnicateIMethodHandler = methodHandlerMap.get("frobnicate");
      pingIMethodHandler = methodHandlerMap.get("ping");
      // Set interaction handlers
      frobnicateIMethodHandler = methodHandlerMap.get("frobnicate");
    }

    public MyServiceAsyncClientImpl(
        Map<String, String> headers,
        Map<String, String> persistentHeaders,
        Mono<? extends RpcClient> rpcClient,
        ThriftServiceMetadata serviceMetadata,
        ThriftCodecManager codecManager,
        ProtocolId protocolId,
        Map<Method, ThriftMethodHandler> methods) {
      super(headers, persistentHeaders, rpcClient, serviceMetadata, codecManager, protocolId);

      Map<String, ThriftMethodHandler> methodHandlerMap = new HashMap<>();
      methods.forEach(
          (key, value) -> {
            methodHandlerMap.put(key.getName(), value);
          });

      // Set method handlers
      fooMethodHandler = methodHandlerMap.get("foo");
      interactMethodHandler = methodHandlerMap.get("interact");
      interactFastMethodHandler = methodHandlerMap.get("interactFast");
      // Set interaction handlers
      frobnicateIMethodHandler = methodHandlerMap.get("frobnicate");
      pingIMethodHandler = methodHandlerMap.get("ping");
      // Set interaction handlers
      frobnicateIMethodHandler = methodHandlerMap.get("frobnicate");
      pingIMethodHandler = methodHandlerMap.get("ping");
      // Set interaction handlers
      frobnicateIMethodHandler = methodHandlerMap.get("frobnicate");
    }

    @java.lang.Override
    public void close() {
        super.close();
    }


    @java.lang.Override
    public ListenableFuture<Void> foo() {
        return foo(RpcOptions.EMPTY);
    }

    @java.lang.Override
    public ListenableFuture<Void> foo(
        RpcOptions rpcOptions) {
        return FutureUtil.transform(fooWrapper(rpcOptions));
    }

    @java.lang.Override
    public ListenableFuture<ResponseWrapper<Void>> fooWrapper(
        RpcOptions rpcOptions) {
        try {
          return executeWrapperWithOptions(fooMethodHandler, fooExceptions, rpcOptions);
        } catch (Throwable t) {
          throw new RuntimeTException(t.getMessage(), t);
        }
    }

    @java.lang.Override
    public ListenableFuture<Void> interact(
        int arg) {
        return interact(arg, RpcOptions.EMPTY);
    }

    @java.lang.Override
    public ListenableFuture<Void> interact(
        int arg,
        RpcOptions rpcOptions) {
        return FutureUtil.transform(interactWrapper(arg, rpcOptions));
    }

    @java.lang.Override
    public ListenableFuture<ResponseWrapper<Void>> interactWrapper(
        int arg,
        RpcOptions rpcOptions) {
        try {
          return executeWrapperWithOptions(interactMethodHandler, interactExceptions, rpcOptions, arg);
        } catch (Throwable t) {
          throw new RuntimeTException(t.getMessage(), t);
        }
    }

    @java.lang.Override
    public ListenableFuture<Integer> interactFast() {
        return interactFast(RpcOptions.EMPTY);
    }

    @java.lang.Override
    public ListenableFuture<Integer> interactFast(
        RpcOptions rpcOptions) {
        return FutureUtil.transform(interactFastWrapper(rpcOptions));
    }

    @java.lang.Override
    public ListenableFuture<ResponseWrapper<Integer>> interactFastWrapper(
        RpcOptions rpcOptions) {
        try {
          return executeWrapperWithOptions(interactFastMethodHandler, interactFastExceptions, rpcOptions);
        } catch (Throwable t) {
          throw new RuntimeTException(t.getMessage(), t);
        }
    }

    public class MyInteractionImpl implements MyInteraction {
      private final long interactionId;

      MyInteractionImpl(long interactionId) {
        this.interactionId = interactionId;
      }

      @java.lang.Override
      public ListenableFuture<Integer> frobnicate(
          RpcOptions rpcOptions) {
          return FutureUtil.transform(frobnicateWrapper(rpcOptions));
      }

      @java.lang.Override
      public ListenableFuture<Integer> frobnicate() {
        return FutureUtil.transform(frobnicateWrapper(RpcOptions.EMPTY));
      }

      @java.lang.Override
      public ListenableFuture<ResponseWrapper<Integer>> frobnicateWrapper(
        RpcOptions _rpcOptions) {
        try {
          RpcOptions rpcOptions = updateRpcOptions(_rpcOptions);
          return executeWrapperWithOptions(frobnicateIMethodHandler, frobnicateIExceptions, rpcOptions);
        } catch (Throwable t) {
          throw new RuntimeTException(t.getMessage(), t);
        }
      }

      @java.lang.Override
      public ListenableFuture<Void> ping(
          RpcOptions rpcOptions) {
          return FutureUtil.transform(pingWrapper(rpcOptions));
      }

      @java.lang.Override
      public ListenableFuture<Void> ping() {
        return FutureUtil.transform(pingWrapper(RpcOptions.EMPTY));
      }

      @java.lang.Override
      public ListenableFuture<ResponseWrapper<Void>> pingWrapper(
        RpcOptions _rpcOptions) {
        try {
          RpcOptions rpcOptions = updateRpcOptions(_rpcOptions);
          return executeWrapperWithOptions(pingIMethodHandler, pingIExceptions, rpcOptions);
        } catch (Throwable t) {
          throw new RuntimeTException(t.getMessage(), t);
        }
      }

      @java.lang.Override
      public void close() {
        activeInteractions.remove(interactionId);
      }

      private RpcOptions updateRpcOptions(RpcOptions _rpcOptions) {
        RpcOptions.Builder builder = new RpcOptions.Builder(_rpcOptions);
        if (activeInteractions.contains(interactionId)) {
          builder.setInteractionId(interactionId);
        } else {
          builder.setCreateInteractionId(interactionId).setInteractionId(0L);
          activeInteractions.add(interactionId);
        }
        return builder.build();
      }
    }

    public MyInteraction createMyInteraction() {
        return new MyInteractionImpl(interactionCounter.incrementAndGet());
    }


    public class MyInteractionFastImpl implements MyInteractionFast {
      private final long interactionId;

      MyInteractionFastImpl(long interactionId) {
        this.interactionId = interactionId;
      }

      @java.lang.Override
      public ListenableFuture<Integer> frobnicate(
          RpcOptions rpcOptions) {
          return FutureUtil.transform(frobnicateWrapper(rpcOptions));
      }

      @java.lang.Override
      public ListenableFuture<Integer> frobnicate() {
        return FutureUtil.transform(frobnicateWrapper(RpcOptions.EMPTY));
      }

      @java.lang.Override
      public ListenableFuture<ResponseWrapper<Integer>> frobnicateWrapper(
        RpcOptions _rpcOptions) {
        try {
          RpcOptions rpcOptions = updateRpcOptions(_rpcOptions);
          return executeWrapperWithOptions(frobnicateIMethodHandler, frobnicateIExceptions, rpcOptions);
        } catch (Throwable t) {
          throw new RuntimeTException(t.getMessage(), t);
        }
      }

      @java.lang.Override
      public ListenableFuture<Void> ping(
          RpcOptions rpcOptions) {
          return FutureUtil.transform(pingWrapper(rpcOptions));
      }

      @java.lang.Override
      public ListenableFuture<Void> ping() {
        return FutureUtil.transform(pingWrapper(RpcOptions.EMPTY));
      }

      @java.lang.Override
      public ListenableFuture<ResponseWrapper<Void>> pingWrapper(
        RpcOptions _rpcOptions) {
        try {
          RpcOptions rpcOptions = updateRpcOptions(_rpcOptions);
          return executeWrapperWithOptions(pingIMethodHandler, pingIExceptions, rpcOptions);
        } catch (Throwable t) {
          throw new RuntimeTException(t.getMessage(), t);
        }
      }

      @java.lang.Override
      public void close() {
        activeInteractions.remove(interactionId);
      }

      private RpcOptions updateRpcOptions(RpcOptions _rpcOptions) {
        RpcOptions.Builder builder = new RpcOptions.Builder(_rpcOptions);
        if (activeInteractions.contains(interactionId)) {
          builder.setInteractionId(interactionId);
        } else {
          builder.setCreateInteractionId(interactionId).setInteractionId(0L);
          activeInteractions.add(interactionId);
        }
        return builder.build();
      }
    }

    public MyInteractionFast createMyInteractionFast() {
        return new MyInteractionFastImpl(interactionCounter.incrementAndGet());
    }


    public class SerialInteractionImpl implements SerialInteraction {
      private final long interactionId;

      SerialInteractionImpl(long interactionId) {
        this.interactionId = interactionId;
      }

      @java.lang.Override
      public ListenableFuture<Void> frobnicate(
          RpcOptions rpcOptions) {
          return FutureUtil.transform(frobnicateWrapper(rpcOptions));
      }

      @java.lang.Override
      public ListenableFuture<Void> frobnicate() {
        return FutureUtil.transform(frobnicateWrapper(RpcOptions.EMPTY));
      }

      @java.lang.Override
      public ListenableFuture<ResponseWrapper<Void>> frobnicateWrapper(
        RpcOptions _rpcOptions) {
        try {
          RpcOptions rpcOptions = updateRpcOptions(_rpcOptions);
          return executeWrapperWithOptions(frobnicateIMethodHandler, frobnicateIExceptions, rpcOptions);
        } catch (Throwable t) {
          throw new RuntimeTException(t.getMessage(), t);
        }
      }

      @java.lang.Override
      public void close() {
        activeInteractions.remove(interactionId);
      }

      private RpcOptions updateRpcOptions(RpcOptions _rpcOptions) {
        RpcOptions.Builder builder = new RpcOptions.Builder(_rpcOptions);
        if (activeInteractions.contains(interactionId)) {
          builder.setInteractionId(interactionId);
        } else {
          builder.setCreateInteractionId(interactionId).setInteractionId(0L);
          activeInteractions.add(interactionId);
        }
        return builder.build();
      }
    }

    public SerialInteraction createSerialInteraction() {
        return new SerialInteractionImpl(interactionCounter.incrementAndGet());
    }
}
