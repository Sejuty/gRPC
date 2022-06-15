package one_many;


import java.io.*;
import java.net.*;
import java.util.ArrayList;

/**
 * @author nihalshahria
 */
public class Server {
    public final int port = 5000;
    public Socket client;
    public BufferedReader inConsole;
    ArrayList<ClientHandlar> clients = new ArrayList<ClientHandlar>();

    public void start() throws IOException {
        inConsole = new BufferedReader(new InputStreamReader(System.in));
        ServerSocket server = new ServerSocket(port);
        new Thread(() -> {
            while (true) {
                try {
                    client = server.accept();
                    ClientHandlar newClient = null;
                    newClient = new ClientHandlar(client);
                    clients.add(newClient);
                    newClient.start();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }).start();
        while (true) {
            String msgOut = inConsole.readLine();
            msgOut = "Server--> " + msgOut;
            String[] args = msgOut.split(" ", 4);
            if ("-t".equals(args[1]) && args.length == 4) {
//            sendFile(args);
                sendOne(args);
            } else {
                System.out.println(msgOut);
                sendAll(msgOut);
            }
        }
    }

    public void sendOne(String[] args) throws IOException {
        String userName = args[2];
        for (int i = 0; i < clients.size(); i++) {
            ClientHandlar tmpClient = clients.get(i);
            if (tmpClient.userName.equals(userName)) {
                String msgOut = args[0] + " " + args[3];
                System.out.println(msgOut);
                tmpClient.dataOutputStream.writeUTF(msgOut);
                tmpClient.dataOutputStream.flush();
                break;
            }
        }
    }

    public void sendAll(String msgOut) throws IOException {
        for (int i = 0; i < clients.size(); i++) {
            ClientHandlar tmpClient = clients.get(i);
            tmpClient.dataOutputStream.writeUTF(msgOut);
            tmpClient.dataOutputStream.flush();
        }
    }


    public static void main(String[] args) throws IOException {
        new Server().start();
    }
}
