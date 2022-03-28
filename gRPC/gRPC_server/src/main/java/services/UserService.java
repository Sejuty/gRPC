package services;

import com.sejuty.grpc.LogInGrpc;
import com.sejuty.grpc.User;
import io.grpc.stub.StreamObserver;

import java.util.HashMap;
import java.util.Map;

public class UserService extends LogInGrpc.LogInImplBase {

    Map<String, String> map = new HashMap<String, String>();
    String firstName = null;
    String regPassword = null;
    int flag = 0;

    @Override
    public void signUp(User.UserModel request, StreamObserver<User.APIResponse> responseObserver) {
        System.out.println("Inside signUp");
        int f = 0;
        firstName = request.getFirstName();
        String lastName = request.getLastName();
        String email = request.getEmail();
        regPassword = request.getPassword();
        User.APIResponse.Builder response = User.APIResponse.newBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (firstName.equals(entry.getKey())) {
                f = 1;
                break;
            } else {
                f = 0;
            }
        }
        if (f == 1) {
            response.setResponseCode(500).setResponseMessage("user already exists!!");
        } else {
            map.put(firstName, regPassword);
            response.setResponseCode(200).setResponseMessage("Sign up Successful");
        }
        System.out.println(map);
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void login(User.LoginRequest request, StreamObserver<User.APIResponse> responseObserver) {
        System.out.println("Inside Login");
        String username = request.getUsername();
        String password = request.getPassword();

        User.APIResponse.Builder response = User.APIResponse.newBuilder();

        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (username.equals(entry.getKey()) && password.equals(entry.getValue())) {
                flag = 0;
                break;
            } else {
                flag = 1;
            }
        }
        if (flag == 0)
            response.setResponseCode(200).setResponseMessage("Login Successful");
        else
            response.setResponseCode(404).setResponseMessage("Failure");

        //response sending back to the client
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }
}
