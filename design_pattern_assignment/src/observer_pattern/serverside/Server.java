package observer_pattern.serverside;


import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;


public class Server implements IObservable {
    public final int port = 5000;
    public Socket client;
    ArrayList<IObserver> observers = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            try {
                System.out.println("Server Started");
                new Server().start();
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    public void start() throws Exception {
        ServerSocket server = new ServerSocket(port);
        while (true) {
            try {
                client = server.accept();
                ClientHandlar newClient = null;
                newClient = new ClientHandlar(client, this);
                newClient.start();
            } catch (Exception e) {
                throw new Error(e);
            }
        }
    }

    @Override
    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String msg) {
        for (var observer : observers) {
            try {
                observer.update(msg);
            } catch (Exception e) {
                System.out.println("Error: "+ e.getMessage());
            }
        }
    }

    @Override
    public void notifyObserver() {

    }
}
