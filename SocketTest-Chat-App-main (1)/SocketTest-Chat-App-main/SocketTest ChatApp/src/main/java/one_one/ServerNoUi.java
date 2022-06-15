package one_one;

import java.io.*;
import java.net.*;

/**
 * @author nihalshahria
 */
public class ServerNoUi extends ChatHandlar {
    public final int port = 6666;

    @Override
    public void start() throws IOException {
        ServerSocket server = new ServerSocket(port);
        super.socket = server.accept();
        initializer("Nihal");
        run();
    }

    public static void main(String[] args) throws IOException {
        new ServerNoUi().start();
    }
}
