package observer_pattern.serverside;

import java.io.*;
import java.net.Socket;

public class ClientHandlar extends Thread implements IObserver {
    public String userName;
    public Socket socket;
    public DataInputStream dataInputStream;
    public DataOutputStream dataOutputStream;
    private IObservable server;
    private String msgOut;

    public ClientHandlar(Socket socket, IObservable server) throws Exception {
        this.socket = socket;
        this.server = server;
        dataInputStream = new DataInputStream(socket.getInputStream());
        dataOutputStream = new DataOutputStream(socket.getOutputStream());
    }
    
    public void sendMessage(String msgOut) throws Exception {
        dataOutputStream.writeUTF(msgOut);
        dataOutputStream.flush();
    }
    
    public void receiveMessage() throws Exception {
        String msgIn = dataInputStream.readUTF();
        String[] args = msgIn.split(" ", 3);
        server.notifyObservers(msgIn);
    }

    @Override
    public void run() {
        try {
            userName = dataInputStream.readUTF();
            String msg = userName + " Connected";
            System.out.println(msg);
            server.notifyObservers(msg);
            server.addObserver(this);
            new Thread(() -> {
                while (true) {
                    try {
                        receiveMessage();
                    } catch (Exception ex) {
                        try {
                            String msgOut = userName + " Disconnected";
                            server.removeObserver(this);
                            server.notifyObservers(msgOut);
                            System.out.println(msgOut);
                            break;
                        } catch (IOException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                    }
                }
            }).start();
        } catch (IOException e) {
            throw new Error(e.getMessage());
        }
    }

    @Override
    public void update(String msg) throws Exception {
        sendMessage(msg);
    }
}
