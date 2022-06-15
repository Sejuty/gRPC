package services;


import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class GRPCServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(8080)
                .addService(new UserService()).build();
        server.start();
        System.out.println("Server started at "+server.getPort());
        server.awaitTermination(120, TimeUnit.MINUTES);
    }
}
