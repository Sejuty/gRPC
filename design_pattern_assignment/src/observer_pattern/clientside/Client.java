package observer_pattern.clientside;

import java.io.*;
import java.net.Socket;

public class Client {
    public final int port = 5000;
    public Socket socket;
    public DataInputStream dataInputStream;
    public DataOutputStream dataOutputStream;
    public BufferedReader inConsole;
    String userName;

    public void start() throws Exception {
        socket = new Socket("localhost", port);
        dataInputStream = new DataInputStream(socket.getInputStream());
        dataOutputStream = new DataOutputStream(socket.getOutputStream());
        inConsole = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your name: ");
        userName = inConsole.readLine();
        dataOutputStream.writeUTF(userName);
        run();
    }

    public void sendMessage() throws Exception {
        String msgOut = inConsole.readLine();   //read input from terminal
        msgOut = userName + "--> " + msgOut;
        dataOutputStream.writeUTF(msgOut);
        dataOutputStream.flush();
    }

    public void receiveMessage() throws Exception {
        String msgIn = dataInputStream.readUTF();
        System.out.println(msgIn);
    }

    public void run() {
        new Thread(() -> {
            while (true) {
                try {
                    sendMessage();
                } catch (Exception ex) {
                    System.out.println("Error: " + ex.getMessage());
                    break;
                }
            }
        }).start();
        while (true) {
            try {
                receiveMessage();
            } catch (Exception ex) {
                System.out.println("Error: " + ex.getMessage());
                break;
            }
        }
    }

    public static void main(String[] args) {
        while (true) {
            try {
                new Client().start();
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
