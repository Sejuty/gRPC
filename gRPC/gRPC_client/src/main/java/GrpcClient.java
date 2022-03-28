import com.sejuty.grpc.LogInGrpc;
import com.sejuty.grpc.User;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
//import sun.security.util.Password;

import java.util.Scanner;


public class GrpcClient {
    public static void main(String[] args) {

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080)
                .usePlaintext()
                .build();

        //stubs - generate from proto files
        LogInGrpc.LogInBlockingStub userStub = LogInGrpc.newBlockingStub(channel);

        while (true) {
            System.out.println("1.Sign up\n2.Login");
            int a;
            Scanner scan = new Scanner(System.in);
            a = scan.nextInt();
            if (a == 1) {
                System.out.println("Enter\n1.First Name\n2.Last Name\n3.Email\n4.Password");
                Scanner sc = new Scanner(System.in);
                String FirstName = sc.nextLine();
                String LastName = sc.nextLine();
                String Email = sc.nextLine();
                String Password = sc.nextLine();
                User.UserModel signUpReq = User.UserModel.newBuilder().setFirstName(FirstName).setLastName(LastName).setEmail(Email).setPassword(Password).build();
                User.APIResponse response = userStub.signUp(signUpReq);
                System.out.println(response.getResponseMessage());
            } else if (a == 2) {
                System.out.println("Enter\n1.username\n2.Password");
                Scanner sc2 = new Scanner(System.in);
                String userName = sc2.nextLine();
                String LPassword = sc2.nextLine();
                User.LoginRequest loginRequest = User.LoginRequest.newBuilder().setUsername(userName).setPassword(LPassword).build();
                User.APIResponse response1 = userStub.login(loginRequest);
                System.out.println(response1.getResponseMessage());

            }
        }
    }
}
