package one_one;

import java.io.*;
import java.net.*;

/**
 * @author nihalshahria
 */
public class ClientNoUi extends ChatHandlar {
    public final int port = 6666;

    @Override
    public void start() throws IOException {
        super.socket = new Socket("localhost", port);
        initializer("Shahria");
        run();
    }

    public static void main(String[] args) throws IOException {
        new ClientNoUi().start();
    }
}