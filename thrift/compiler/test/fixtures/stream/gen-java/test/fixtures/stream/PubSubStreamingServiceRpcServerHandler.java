/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

package test.fixtures.stream;

import java.util.*;
import org.apache.thrift.protocol.*;
import com.facebook.thrift.util.Readers;

public class PubSubStreamingServiceRpcServerHandler 
  implements com.facebook.thrift.server.RpcServerHandler {

  private final java.util.Map<String, com.facebook.thrift.server.RpcServerHandler> _methodMap;

  private final PubSubStreamingService.Reactive _delegate;


  private final java.util.List<com.facebook.thrift.payload.Reader> _returnstreamReaders;
  private final com.facebook.thrift.server.generated.SingleRequestStreamResponseDelegate<Integer> _delegate_returnstream;
  private final com.facebook.thrift.server.generated.StreamResponseHandler<Integer> _handler_returnstream;
  private final java.util.List<com.facebook.thrift.payload.Reader> _streamthrowsReaders;
  private final com.facebook.thrift.server.generated.SingleRequestStreamResponseDelegate<Integer> _delegate_streamthrows;
  private final com.facebook.thrift.server.generated.StreamResponseHandler<Integer> _handler_streamthrows;
  private final java.util.List<com.facebook.thrift.payload.Reader> _servicethrowsReaders;
  private final com.facebook.thrift.server.generated.SingleRequestStreamResponseDelegate<Integer> _delegate_servicethrows;
  private final com.facebook.thrift.server.generated.StreamResponseHandler<Integer> _handler_servicethrows;
  private final java.util.List<com.facebook.thrift.payload.Reader> _boththrowsReaders;
  private final com.facebook.thrift.server.generated.SingleRequestStreamResponseDelegate<Integer> _delegate_boththrows;
  private final com.facebook.thrift.server.generated.StreamResponseHandler<Integer> _handler_boththrows;
  private final java.util.List<com.facebook.thrift.payload.Reader> _responseandstreamstreamthrowsReaders;
  private final com.facebook.thrift.server.generated.SingleRequestStreamResponseDelegate<com.facebook.thrift.model.StreamResponse<Integer,Integer>> _delegate_responseandstreamstreamthrows;
  private final com.facebook.thrift.server.generated.StreamWithFirstResponseHandler<Integer,Integer> _handler_responseandstreamstreamthrows;
  private final java.util.List<com.facebook.thrift.payload.Reader> _responseandstreamservicethrowsReaders;
  private final com.facebook.thrift.server.generated.SingleRequestStreamResponseDelegate<com.facebook.thrift.model.StreamResponse<Integer,Integer>> _delegate_responseandstreamservicethrows;
  private final com.facebook.thrift.server.generated.StreamWithFirstResponseHandler<Integer,Integer> _handler_responseandstreamservicethrows;
  private final java.util.List<com.facebook.thrift.payload.Reader> _responseandstreamboththrowsReaders;
  private final com.facebook.thrift.server.generated.SingleRequestStreamResponseDelegate<com.facebook.thrift.model.StreamResponse<Integer,Integer>> _delegate_responseandstreamboththrows;
  private final com.facebook.thrift.server.generated.StreamWithFirstResponseHandler<Integer,Integer> _handler_responseandstreamboththrows;
  private final java.util.List<com.facebook.thrift.payload.Reader> _returnstreamFastReaders;
  private final com.facebook.thrift.server.generated.SingleRequestStreamResponseDelegate<Integer> _delegate_returnstreamFast;
  private final com.facebook.thrift.server.generated.StreamResponseHandler<Integer> _handler_returnstreamFast;

  private final java.util.List<com.facebook.swift.service.ThriftEventHandler> _eventHandlers;

  public PubSubStreamingServiceRpcServerHandler(PubSubStreamingService _delegate,
                                    java.util.List<com.facebook.swift.service.ThriftEventHandler> _eventHandlers) {
    this(new PubSubStreamingServiceBlockingReactiveWrapper(_delegate), _eventHandlers);
  }

  public PubSubStreamingServiceRpcServerHandler(PubSubStreamingService.Async _delegate,
                                    java.util.List<com.facebook.swift.service.ThriftEventHandler> _eventHandlers) {
    this(new PubSubStreamingServiceAsyncReactiveWrapper(_delegate), _eventHandlers);
  }

  public PubSubStreamingServiceRpcServerHandler(PubSubStreamingService.Reactive _delegate,
                                    java.util.List<com.facebook.swift.service.ThriftEventHandler> _eventHandlers) {
    
    this._methodMap = new java.util.HashMap<>();
    this._delegate = _delegate;
    this._eventHandlers = _eventHandlers;


    _methodMap.put("returnstream", this);
    _returnstreamReaders = _create_returnstream_request_readers();
    _delegate_returnstream = (java.util.List<Object> _list) -> {
        java.util.Iterator _iterator = _list.iterator();
        int i32From = (int) _iterator.next();
        int i32To = (int) _iterator.next();

        return _delegate.returnstream(i32From, i32To);
    };

    _handler_returnstream =
    new com.facebook.thrift.server.generated.StreamResponseHandler<>(
      _delegate_returnstream,
      _ResponseWriterFactory_returnstream,
      _returnstreamReaders,
      "returnstream"    );

    _methodMap.put("streamthrows", this);
    _streamthrowsReaders = _create_streamthrows_request_readers();
    _delegate_streamthrows = (java.util.List<Object> _list) -> {
        java.util.Iterator _iterator = _list.iterator();
        int foo = (int) _iterator.next();

        return _delegate.streamthrows(foo);
    };

    _handler_streamthrows =
    new com.facebook.thrift.server.generated.StreamResponseHandler<>(
      _delegate_streamthrows,
      _ResponseWriterFactory_streamthrows,
      _streamthrowsReaders,
      "streamthrows"    );

    _methodMap.put("servicethrows", this);
    _servicethrowsReaders = _create_servicethrows_request_readers();
    _delegate_servicethrows = (java.util.List<Object> _list) -> {
        java.util.Iterator _iterator = _list.iterator();
        int foo = (int) _iterator.next();

        return _delegate.servicethrows(foo);
    };

    _handler_servicethrows =
    new com.facebook.thrift.server.generated.StreamResponseHandler<>(
      _delegate_servicethrows,
      _ResponseWriterFactory_servicethrows,
      _servicethrowsReaders,
      "servicethrows",
      test.fixtures.stream.FooEx.class
    );

    _methodMap.put("boththrows", this);
    _boththrowsReaders = _create_boththrows_request_readers();
    _delegate_boththrows = (java.util.List<Object> _list) -> {
        java.util.Iterator _iterator = _list.iterator();
        int foo = (int) _iterator.next();

        return _delegate.boththrows(foo);
    };

    _handler_boththrows =
    new com.facebook.thrift.server.generated.StreamResponseHandler<>(
      _delegate_boththrows,
      _ResponseWriterFactory_boththrows,
      _boththrowsReaders,
      "boththrows",
      test.fixtures.stream.FooEx.class
    );

    _methodMap.put("responseandstreamstreamthrows", this);
    _responseandstreamstreamthrowsReaders = _create_responseandstreamstreamthrows_request_readers();
    _delegate_responseandstreamstreamthrows = (java.util.List<Object> _list) -> {
        java.util.Iterator _iterator = _list.iterator();
        int foo = (int) _iterator.next();

        return _delegate.responseandstreamstreamthrows(foo);
    };

    _handler_responseandstreamstreamthrows =
    new com.facebook.thrift.server.generated.StreamWithFirstResponseHandler<>(
      _delegate_responseandstreamstreamthrows,
      _first_ResponseWriterFactory_responseandstreamstreamthrows,
      _ResponseWriterFactory_responseandstreamstreamthrows,
      _responseandstreamstreamthrowsReaders,
      "responseandstreamstreamthrows"    );

    _methodMap.put("responseandstreamservicethrows", this);
    _responseandstreamservicethrowsReaders = _create_responseandstreamservicethrows_request_readers();
    _delegate_responseandstreamservicethrows = (java.util.List<Object> _list) -> {
        java.util.Iterator _iterator = _list.iterator();
        int foo = (int) _iterator.next();

        return _delegate.responseandstreamservicethrows(foo);
    };

    _handler_responseandstreamservicethrows =
    new com.facebook.thrift.server.generated.StreamWithFirstResponseHandler<>(
      _delegate_responseandstreamservicethrows,
      _first_ResponseWriterFactory_responseandstreamservicethrows,
      _ResponseWriterFactory_responseandstreamservicethrows,
      _responseandstreamservicethrowsReaders,
      "responseandstreamservicethrows",
      test.fixtures.stream.FooEx.class
    );

    _methodMap.put("responseandstreamboththrows", this);
    _responseandstreamboththrowsReaders = _create_responseandstreamboththrows_request_readers();
    _delegate_responseandstreamboththrows = (java.util.List<Object> _list) -> {
        java.util.Iterator _iterator = _list.iterator();
        int foo = (int) _iterator.next();

        return _delegate.responseandstreamboththrows(foo);
    };

    _handler_responseandstreamboththrows =
    new com.facebook.thrift.server.generated.StreamWithFirstResponseHandler<>(
      _delegate_responseandstreamboththrows,
      _first_ResponseWriterFactory_responseandstreamboththrows,
      _ResponseWriterFactory_responseandstreamboththrows,
      _responseandstreamboththrowsReaders,
      "responseandstreamboththrows",
      test.fixtures.stream.FooEx.class
    );

    _methodMap.put("returnstreamFast", this);
    _returnstreamFastReaders = _create_returnstreamFast_request_readers();
    _delegate_returnstreamFast = (java.util.List<Object> _list) -> {
        java.util.Iterator _iterator = _list.iterator();
        int i32From = (int) _iterator.next();
        int i32To = (int) _iterator.next();

        return _delegate.returnstreamFast(i32From, i32To);
    };

    _handler_returnstreamFast =
    new com.facebook.thrift.server.generated.StreamResponseHandler<>(
      _delegate_returnstreamFast,
      _ResponseWriterFactory_returnstreamFast,
      _returnstreamFastReaders,
      "returnstreamFast"    );


  }

  private final static java.util.List<com.facebook.thrift.payload.Reader> _create_returnstream_request_readers() {
    java.util.List<com.facebook.thrift.payload.Reader> _readerList = new java.util.ArrayList<>();

    
    _readerList.add(Readers.i32Reader());
    
    _readerList.add(Readers.i32Reader());

    return _readerList;
  }

  private final static com.facebook.thrift.server.generated.ResponseWriterFactory _ResponseWriterFactory_returnstream = (java.lang.Object _o, com.facebook.swift.service.ContextChain _chain, com.facebook.thrift.payload.ServerRequestPayload _requestPayload) -> {
    return oprot -> {
      try {
        oprot.writeStructBegin(com.facebook.thrift.util.RpcPayloadUtil.TSTRUCT);

        
        int _iter0 = (int)_o;
        oprot.writeFieldBegin(com.facebook.thrift.util.RpcPayloadUtil.I32_FIELD);
oprot.writeI32(_iter0);
        oprot.writeFieldEnd();

        oprot.writeFieldStop();
        oprot.writeStructEnd();

        _chain.postWrite(_o);
      } catch (Throwable _e) {
        throw reactor.core.Exceptions.propagate(_e);
      }
    };
  };


  private final static java.util.List<com.facebook.thrift.payload.Reader> _create_streamthrows_request_readers() {
    java.util.List<com.facebook.thrift.payload.Reader> _readerList = new java.util.ArrayList<>();

    
    _readerList.add(Readers.i32Reader());

    return _readerList;
  }

  private final static com.facebook.thrift.server.generated.ResponseWriterFactory _ResponseWriterFactory_streamthrows = (java.lang.Object _o, com.facebook.swift.service.ContextChain _chain, com.facebook.thrift.payload.ServerRequestPayload _requestPayload) -> {
    return oprot -> {
      try {
        oprot.writeStructBegin(com.facebook.thrift.util.RpcPayloadUtil.TSTRUCT);

        
        int _iter0 = (int)_o;
        oprot.writeFieldBegin(com.facebook.thrift.util.RpcPayloadUtil.I32_FIELD);
oprot.writeI32(_iter0);
        oprot.writeFieldEnd();

        oprot.writeFieldStop();
        oprot.writeStructEnd();

        _chain.postWrite(_o);
      } catch (Throwable _e) {
        throw reactor.core.Exceptions.propagate(_e);
      }
    };
  };


  private final static java.util.List<com.facebook.thrift.payload.Reader> _create_servicethrows_request_readers() {
    java.util.List<com.facebook.thrift.payload.Reader> _readerList = new java.util.ArrayList<>();

    
    _readerList.add(Readers.i32Reader());

    return _readerList;
  }

  private final static com.facebook.thrift.server.generated.ResponseWriterFactory _ResponseWriterFactory_servicethrows = (java.lang.Object _o, com.facebook.swift.service.ContextChain _chain, com.facebook.thrift.payload.ServerRequestPayload _requestPayload) -> {
    return oprot -> {
      try {
        oprot.writeStructBegin(com.facebook.thrift.util.RpcPayloadUtil.TSTRUCT);

        
        int _iter0 = (int)_o;
        oprot.writeFieldBegin(com.facebook.thrift.util.RpcPayloadUtil.I32_FIELD);
oprot.writeI32(_iter0);
        oprot.writeFieldEnd();

        oprot.writeFieldStop();
        oprot.writeStructEnd();

        _chain.postWrite(_o);
      } catch (Throwable _e) {
        throw reactor.core.Exceptions.propagate(_e);
      }
    };
  };


  private final static java.util.List<com.facebook.thrift.payload.Reader> _create_boththrows_request_readers() {
    java.util.List<com.facebook.thrift.payload.Reader> _readerList = new java.util.ArrayList<>();

    
    _readerList.add(Readers.i32Reader());

    return _readerList;
  }

  private final static com.facebook.thrift.server.generated.ResponseWriterFactory _ResponseWriterFactory_boththrows = (java.lang.Object _o, com.facebook.swift.service.ContextChain _chain, com.facebook.thrift.payload.ServerRequestPayload _requestPayload) -> {
    return oprot -> {
      try {
        oprot.writeStructBegin(com.facebook.thrift.util.RpcPayloadUtil.TSTRUCT);

        
        int _iter0 = (int)_o;
        oprot.writeFieldBegin(com.facebook.thrift.util.RpcPayloadUtil.I32_FIELD);
oprot.writeI32(_iter0);
        oprot.writeFieldEnd();

        oprot.writeFieldStop();
        oprot.writeStructEnd();

        _chain.postWrite(_o);
      } catch (Throwable _e) {
        throw reactor.core.Exceptions.propagate(_e);
      }
    };
  };


  private final static java.util.List<com.facebook.thrift.payload.Reader> _create_responseandstreamstreamthrows_request_readers() {
    java.util.List<com.facebook.thrift.payload.Reader> _readerList = new java.util.ArrayList<>();

    
    _readerList.add(Readers.i32Reader());

    return _readerList;
  }

  private final static com.facebook.thrift.server.generated.ResponseWriterFactory _ResponseWriterFactory_responseandstreamstreamthrows = (java.lang.Object _o, com.facebook.swift.service.ContextChain _chain, com.facebook.thrift.payload.ServerRequestPayload _requestPayload) -> {
    return oprot -> {
      try {
        oprot.writeStructBegin(com.facebook.thrift.util.RpcPayloadUtil.TSTRUCT);

        
        int _iter0 = (int)_o;
        oprot.writeFieldBegin(com.facebook.thrift.util.RpcPayloadUtil.I32_FIELD);
oprot.writeI32(_iter0);
        oprot.writeFieldEnd();

        oprot.writeFieldStop();
        oprot.writeStructEnd();

        _chain.postWrite(_o);
      } catch (Throwable _e) {
        throw reactor.core.Exceptions.propagate(_e);
      }
    };
  };

  private final static com.facebook.thrift.server.generated.ResponseWriterFactory _first_ResponseWriterFactory_responseandstreamstreamthrows = (java.lang.Object _o, com.facebook.swift.service.ContextChain _chain, com.facebook.thrift.payload.ServerRequestPayload _requestPayload) -> {
    return oprot -> {
      try {
        oprot.writeStructBegin(com.facebook.thrift.util.RpcPayloadUtil.TSTRUCT);

        
        int _iter0 = (int)_o;
        oprot.writeFieldBegin(com.facebook.thrift.util.RpcPayloadUtil.I32_FIELD);
oprot.writeI32(_iter0);
        oprot.writeFieldEnd();

        oprot.writeFieldStop();
        oprot.writeStructEnd();

        _chain.postWrite(_o);
      } catch (Throwable _e) {
        throw reactor.core.Exceptions.propagate(_e);
      }
    };
  };


  private final static java.util.List<com.facebook.thrift.payload.Reader> _create_responseandstreamservicethrows_request_readers() {
    java.util.List<com.facebook.thrift.payload.Reader> _readerList = new java.util.ArrayList<>();

    
    _readerList.add(Readers.i32Reader());

    return _readerList;
  }

  private final static com.facebook.thrift.server.generated.ResponseWriterFactory _ResponseWriterFactory_responseandstreamservicethrows = (java.lang.Object _o, com.facebook.swift.service.ContextChain _chain, com.facebook.thrift.payload.ServerRequestPayload _requestPayload) -> {
    return oprot -> {
      try {
        oprot.writeStructBegin(com.facebook.thrift.util.RpcPayloadUtil.TSTRUCT);

        
        int _iter0 = (int)_o;
        oprot.writeFieldBegin(com.facebook.thrift.util.RpcPayloadUtil.I32_FIELD);
oprot.writeI32(_iter0);
        oprot.writeFieldEnd();

        oprot.writeFieldStop();
        oprot.writeStructEnd();

        _chain.postWrite(_o);
      } catch (Throwable _e) {
        throw reactor.core.Exceptions.propagate(_e);
      }
    };
  };

  private final static com.facebook.thrift.server.generated.ResponseWriterFactory _first_ResponseWriterFactory_responseandstreamservicethrows = (java.lang.Object _o, com.facebook.swift.service.ContextChain _chain, com.facebook.thrift.payload.ServerRequestPayload _requestPayload) -> {
    return oprot -> {
      try {
        oprot.writeStructBegin(com.facebook.thrift.util.RpcPayloadUtil.TSTRUCT);

        
        int _iter0 = (int)_o;
        oprot.writeFieldBegin(com.facebook.thrift.util.RpcPayloadUtil.I32_FIELD);
oprot.writeI32(_iter0);
        oprot.writeFieldEnd();

        oprot.writeFieldStop();
        oprot.writeStructEnd();

        _chain.postWrite(_o);
      } catch (Throwable _e) {
        throw reactor.core.Exceptions.propagate(_e);
      }
    };
  };


  private final static java.util.List<com.facebook.thrift.payload.Reader> _create_responseandstreamboththrows_request_readers() {
    java.util.List<com.facebook.thrift.payload.Reader> _readerList = new java.util.ArrayList<>();

    
    _readerList.add(Readers.i32Reader());

    return _readerList;
  }

  private final static com.facebook.thrift.server.generated.ResponseWriterFactory _ResponseWriterFactory_responseandstreamboththrows = (java.lang.Object _o, com.facebook.swift.service.ContextChain _chain, com.facebook.thrift.payload.ServerRequestPayload _requestPayload) -> {
    return oprot -> {
      try {
        oprot.writeStructBegin(com.facebook.thrift.util.RpcPayloadUtil.TSTRUCT);

        
        int _iter0 = (int)_o;
        oprot.writeFieldBegin(com.facebook.thrift.util.RpcPayloadUtil.I32_FIELD);
oprot.writeI32(_iter0);
        oprot.writeFieldEnd();

        oprot.writeFieldStop();
        oprot.writeStructEnd();

        _chain.postWrite(_o);
      } catch (Throwable _e) {
        throw reactor.core.Exceptions.propagate(_e);
      }
    };
  };

  private final static com.facebook.thrift.server.generated.ResponseWriterFactory _first_ResponseWriterFactory_responseandstreamboththrows = (java.lang.Object _o, com.facebook.swift.service.ContextChain _chain, com.facebook.thrift.payload.ServerRequestPayload _requestPayload) -> {
    return oprot -> {
      try {
        oprot.writeStructBegin(com.facebook.thrift.util.RpcPayloadUtil.TSTRUCT);

        
        int _iter0 = (int)_o;
        oprot.writeFieldBegin(com.facebook.thrift.util.RpcPayloadUtil.I32_FIELD);
oprot.writeI32(_iter0);
        oprot.writeFieldEnd();

        oprot.writeFieldStop();
        oprot.writeStructEnd();

        _chain.postWrite(_o);
      } catch (Throwable _e) {
        throw reactor.core.Exceptions.propagate(_e);
      }
    };
  };


  private final static java.util.List<com.facebook.thrift.payload.Reader> _create_returnstreamFast_request_readers() {
    java.util.List<com.facebook.thrift.payload.Reader> _readerList = new java.util.ArrayList<>();

    
    _readerList.add(Readers.i32Reader());
    
    _readerList.add(Readers.i32Reader());

    return _readerList;
  }

  private final static com.facebook.thrift.server.generated.ResponseWriterFactory _ResponseWriterFactory_returnstreamFast = (java.lang.Object _o, com.facebook.swift.service.ContextChain _chain, com.facebook.thrift.payload.ServerRequestPayload _requestPayload) -> {
    return oprot -> {
      try {
        oprot.writeStructBegin(com.facebook.thrift.util.RpcPayloadUtil.TSTRUCT);

        
        int _iter0 = (int)_o;
        oprot.writeFieldBegin(com.facebook.thrift.util.RpcPayloadUtil.I32_FIELD);
oprot.writeI32(_iter0);
        oprot.writeFieldEnd();

        oprot.writeFieldStop();
        oprot.writeStructEnd();

        _chain.postWrite(_o);
      } catch (Throwable _e) {
        throw reactor.core.Exceptions.propagate(_e);
      }
    };
  };





  @java.lang.Override
  public reactor.core.publisher.Flux<com.facebook.thrift.payload.ServerResponsePayload> singleRequestStreamingResponse(com.facebook.thrift.payload.ServerRequestPayload _payload) {
    final String _name = _payload.getRequestRpcMetadata().getName();

    com.facebook.swift.service.ContextChain _chain;
    try {
      _chain = new com.facebook.swift.service.ContextChain(_eventHandlers, _name, _payload.getRequestContext());
    } catch (Throwable _t) {
      org.apache.thrift.TApplicationException _tApplicationException = new org.apache.thrift.TApplicationException(_t.getMessage());
      com.facebook.thrift.payload.ServerResponsePayload _serverResponsePayload = com.facebook.thrift.util.RpcPayloadUtil.fromTApplicationException(_tApplicationException, _payload.getRequestRpcMetadata(), null);
      return reactor.core.publisher.Flux.just(_serverResponsePayload);
    }

    reactor.core.publisher.Flux<com.facebook.thrift.payload.ServerResponsePayload> _result;
    try {
      switch(_name) {
        case "returnstream":
          _result = _handler_returnstream.handleStream(_payload, _chain);
          break;
        case "streamthrows":
          _result = _handler_streamthrows.handleStream(_payload, _chain);
          break;
        case "servicethrows":
          _result = _handler_servicethrows.handleStream(_payload, _chain);
          break;
        case "boththrows":
          _result = _handler_boththrows.handleStream(_payload, _chain);
          break;
        case "responseandstreamstreamthrows":
          _result = _handler_responseandstreamstreamthrows.handleStream(_payload, _chain);
          break;
        case "responseandstreamservicethrows":
          _result = _handler_responseandstreamservicethrows.handleStream(_payload, _chain);
          break;
        case "responseandstreamboththrows":
          _result = _handler_responseandstreamboththrows.handleStream(_payload, _chain);
          break;
        case "returnstreamFast":
          _result = _handler_returnstreamFast.handleStream(_payload, _chain);
          break;
        default: {
            _chain.preRead();
            org.apache.thrift.TApplicationException _tApplicationException = new org.apache.thrift.TApplicationException(org.apache.thrift.TApplicationException.UNKNOWN_METHOD, "no method found with name " + _name);
            com.facebook.thrift.payload.ServerResponsePayload _serverResponsePayload = com.facebook.thrift.util.RpcPayloadUtil.fromTApplicationException(_tApplicationException, _payload.getRequestRpcMetadata(), _chain);
            return reactor.core.publisher.Flux.just(_serverResponsePayload);
        }
      }
    } catch (org.apache.thrift.TApplicationException _tApplicationException) {
      com.facebook.thrift.payload.ServerResponsePayload _serverResponsePayload = com.facebook.thrift.util.RpcPayloadUtil.fromTApplicationException(_tApplicationException, _payload.getRequestRpcMetadata(), _chain);
      return reactor.core.publisher.Flux.just(_serverResponsePayload);
    } catch (Throwable _t) {
      _result = reactor.core.publisher.Flux.error(_t);
    }
    return _result;
  }

  @java.lang.Override
  public reactor.core.publisher.Mono<com.facebook.thrift.payload.ServerResponsePayload> singleRequestSingleResponse(com.facebook.thrift.payload.ServerRequestPayload _payload) {
    final String _name = _payload.getRequestRpcMetadata().getName();

    com.facebook.swift.service.ContextChain _chain;
    try {
      _chain = new com.facebook.swift.service.ContextChain(_eventHandlers, _name, _payload.getRequestContext());
    } catch (Throwable _t) {
      org.apache.thrift.TApplicationException _tApplicationException = new org.apache.thrift.TApplicationException(_t.getMessage());
      com.facebook.thrift.payload.ServerResponsePayload _serverResponsePayload = com.facebook.thrift.util.RpcPayloadUtil.fromTApplicationException(_tApplicationException, _payload.getRequestRpcMetadata(), null);
      return reactor.core.publisher.Mono.just(_serverResponsePayload);
    }

    reactor.core.publisher.Mono<com.facebook.thrift.payload.ServerResponsePayload> _result;
    try {
      switch (_name) {
        default: {
            _chain.preRead();
            org.apache.thrift.TApplicationException _tApplicationException = new org.apache.thrift.TApplicationException(org.apache.thrift.TApplicationException.UNKNOWN_METHOD, "no method found with name " + _name);
            com.facebook.thrift.payload.ServerResponsePayload _serverResponsePayload = com.facebook.thrift.util.RpcPayloadUtil.fromTApplicationException(_tApplicationException, _payload.getRequestRpcMetadata(), _chain);
            return reactor.core.publisher.Mono.just(_serverResponsePayload);
        }
      }
    } catch (org.apache.thrift.TApplicationException _tApplicationException) {
      com.facebook.thrift.payload.ServerResponsePayload _serverResponsePayload = com.facebook.thrift.util.RpcPayloadUtil.fromTApplicationException(_tApplicationException, _payload.getRequestRpcMetadata(), _chain);
      return reactor.core.publisher.Mono.just(_serverResponsePayload);
    } catch (Throwable _t) {
      _result = reactor.core.publisher.Mono.error(_t);
    }

    return _result;
  }

  @java.lang.Override
  public reactor.core.publisher.Mono<Void> singleRequestNoResponse(com.facebook.thrift.payload.ServerRequestPayload _payload) {
    final String _name = _payload.getRequestRpcMetadata().getName();

    com.facebook.swift.service.ContextChain _chain;
    try {
      _chain = new com.facebook.swift.service.ContextChain(_eventHandlers, _name, _payload.getRequestContext());
    } catch (Throwable _t) {
      return reactor.core.publisher.Mono.error(_t);
    }

    reactor.core.publisher.Mono<Void> _result;
    try {
      switch (_name) {
        default: {
          _result = reactor.core.publisher.Mono.error(new org.apache.thrift.TApplicationException(org.apache.thrift.TApplicationException.UNKNOWN_METHOD, "no method found with name " + _name));
        }
      }
    } catch (Throwable _t) {
      _result = reactor.core.publisher.Mono.error(_t);
    }

    return _result;
  }

  public java.util.Map<String, com.facebook.thrift.server.RpcServerHandler> getMethodMap() {
      return _methodMap;
  }

}
