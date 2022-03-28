package com.sejuty.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: user.proto")
public final class LogInGrpc {

  private LogInGrpc() {}

  public static final String SERVICE_NAME = "LogIn";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.sejuty.grpc.User.UserModel,
      com.sejuty.grpc.User.APIResponse> getSignUpMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "signUp",
      requestType = com.sejuty.grpc.User.UserModel.class,
      responseType = com.sejuty.grpc.User.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sejuty.grpc.User.UserModel,
      com.sejuty.grpc.User.APIResponse> getSignUpMethod() {
    io.grpc.MethodDescriptor<com.sejuty.grpc.User.UserModel, com.sejuty.grpc.User.APIResponse> getSignUpMethod;
    if ((getSignUpMethod = LogInGrpc.getSignUpMethod) == null) {
      synchronized (LogInGrpc.class) {
        if ((getSignUpMethod = LogInGrpc.getSignUpMethod) == null) {
          LogInGrpc.getSignUpMethod = getSignUpMethod =
              io.grpc.MethodDescriptor.<com.sejuty.grpc.User.UserModel, com.sejuty.grpc.User.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "LogIn", "signUp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sejuty.grpc.User.UserModel.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sejuty.grpc.User.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LogInMethodDescriptorSupplier("signUp"))
                  .build();
          }
        }
     }
     return getSignUpMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sejuty.grpc.User.LoginRequest,
      com.sejuty.grpc.User.APIResponse> getLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "login",
      requestType = com.sejuty.grpc.User.LoginRequest.class,
      responseType = com.sejuty.grpc.User.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sejuty.grpc.User.LoginRequest,
      com.sejuty.grpc.User.APIResponse> getLoginMethod() {
    io.grpc.MethodDescriptor<com.sejuty.grpc.User.LoginRequest, com.sejuty.grpc.User.APIResponse> getLoginMethod;
    if ((getLoginMethod = LogInGrpc.getLoginMethod) == null) {
      synchronized (LogInGrpc.class) {
        if ((getLoginMethod = LogInGrpc.getLoginMethod) == null) {
          LogInGrpc.getLoginMethod = getLoginMethod =
              io.grpc.MethodDescriptor.<com.sejuty.grpc.User.LoginRequest, com.sejuty.grpc.User.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "LogIn", "login"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sejuty.grpc.User.LoginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sejuty.grpc.User.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LogInMethodDescriptorSupplier("login"))
                  .build();
          }
        }
     }
     return getLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sejuty.grpc.User.Empty,
      com.sejuty.grpc.User.APIResponse> getLogoutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "logout",
      requestType = com.sejuty.grpc.User.Empty.class,
      responseType = com.sejuty.grpc.User.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sejuty.grpc.User.Empty,
      com.sejuty.grpc.User.APIResponse> getLogoutMethod() {
    io.grpc.MethodDescriptor<com.sejuty.grpc.User.Empty, com.sejuty.grpc.User.APIResponse> getLogoutMethod;
    if ((getLogoutMethod = LogInGrpc.getLogoutMethod) == null) {
      synchronized (LogInGrpc.class) {
        if ((getLogoutMethod = LogInGrpc.getLogoutMethod) == null) {
          LogInGrpc.getLogoutMethod = getLogoutMethod =
              io.grpc.MethodDescriptor.<com.sejuty.grpc.User.Empty, com.sejuty.grpc.User.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "LogIn", "logout"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sejuty.grpc.User.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sejuty.grpc.User.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LogInMethodDescriptorSupplier("logout"))
                  .build();
          }
        }
     }
     return getLogoutMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LogInStub newStub(io.grpc.Channel channel) {
    return new LogInStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LogInBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new LogInBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LogInFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new LogInFutureStub(channel);
  }

  /**
   */
  public static abstract class LogInImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *  define api
     * </pre>
     */
    public void signUp(com.sejuty.grpc.User.UserModel request,
        io.grpc.stub.StreamObserver<com.sejuty.grpc.User.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSignUpMethod(), responseObserver);
    }

    /**
     */
    public void login(com.sejuty.grpc.User.LoginRequest request,
        io.grpc.stub.StreamObserver<com.sejuty.grpc.User.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }

    /**
     */
    public void logout(com.sejuty.grpc.User.Empty request,
        io.grpc.stub.StreamObserver<com.sejuty.grpc.User.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLogoutMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSignUpMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.sejuty.grpc.User.UserModel,
                com.sejuty.grpc.User.APIResponse>(
                  this, METHODID_SIGN_UP)))
          .addMethod(
            getLoginMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.sejuty.grpc.User.LoginRequest,
                com.sejuty.grpc.User.APIResponse>(
                  this, METHODID_LOGIN)))
          .addMethod(
            getLogoutMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.sejuty.grpc.User.Empty,
                com.sejuty.grpc.User.APIResponse>(
                  this, METHODID_LOGOUT)))
          .build();
    }
  }

  /**
   */
  public static final class LogInStub extends io.grpc.stub.AbstractStub<LogInStub> {
    private LogInStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LogInStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected LogInStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LogInStub(channel, callOptions);
    }

    /**
     * <pre>
     *  define api
     * </pre>
     */
    public void signUp(com.sejuty.grpc.User.UserModel request,
        io.grpc.stub.StreamObserver<com.sejuty.grpc.User.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSignUpMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void login(com.sejuty.grpc.User.LoginRequest request,
        io.grpc.stub.StreamObserver<com.sejuty.grpc.User.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void logout(com.sejuty.grpc.User.Empty request,
        io.grpc.stub.StreamObserver<com.sejuty.grpc.User.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLogoutMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class LogInBlockingStub extends io.grpc.stub.AbstractStub<LogInBlockingStub> {
    private LogInBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LogInBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected LogInBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LogInBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *  define api
     * </pre>
     */
    public com.sejuty.grpc.User.APIResponse signUp(com.sejuty.grpc.User.UserModel request) {
      return blockingUnaryCall(
          getChannel(), getSignUpMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sejuty.grpc.User.APIResponse login(com.sejuty.grpc.User.LoginRequest request) {
      return blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sejuty.grpc.User.APIResponse logout(com.sejuty.grpc.User.Empty request) {
      return blockingUnaryCall(
          getChannel(), getLogoutMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class LogInFutureStub extends io.grpc.stub.AbstractStub<LogInFutureStub> {
    private LogInFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LogInFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected LogInFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LogInFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *  define api
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sejuty.grpc.User.APIResponse> signUp(
        com.sejuty.grpc.User.UserModel request) {
      return futureUnaryCall(
          getChannel().newCall(getSignUpMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sejuty.grpc.User.APIResponse> login(
        com.sejuty.grpc.User.LoginRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sejuty.grpc.User.APIResponse> logout(
        com.sejuty.grpc.User.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getLogoutMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SIGN_UP = 0;
  private static final int METHODID_LOGIN = 1;
  private static final int METHODID_LOGOUT = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LogInImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LogInImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SIGN_UP:
          serviceImpl.signUp((com.sejuty.grpc.User.UserModel) request,
              (io.grpc.stub.StreamObserver<com.sejuty.grpc.User.APIResponse>) responseObserver);
          break;
        case METHODID_LOGIN:
          serviceImpl.login((com.sejuty.grpc.User.LoginRequest) request,
              (io.grpc.stub.StreamObserver<com.sejuty.grpc.User.APIResponse>) responseObserver);
          break;
        case METHODID_LOGOUT:
          serviceImpl.logout((com.sejuty.grpc.User.Empty) request,
              (io.grpc.stub.StreamObserver<com.sejuty.grpc.User.APIResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class LogInBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LogInBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.sejuty.grpc.User.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LogIn");
    }
  }

  private static final class LogInFileDescriptorSupplier
      extends LogInBaseDescriptorSupplier {
    LogInFileDescriptorSupplier() {}
  }

  private static final class LogInMethodDescriptorSupplier
      extends LogInBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LogInMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (LogInGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LogInFileDescriptorSupplier())
              .addMethod(getSignUpMethod())
              .addMethod(getLoginMethod())
              .addMethod(getLogoutMethod())
              .build();
        }
      }
    }
    return result;
  }
}
