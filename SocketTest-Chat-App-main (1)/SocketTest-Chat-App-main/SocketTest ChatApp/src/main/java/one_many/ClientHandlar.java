package one_many;

import java.io.*;
import java.net.*;

public class ClientHandlar extends Thread {
    public String folderPath;
    public String userName;
    public Socket socket;
    public DataInputStream dataInputStream;
    public DataOutputStream dataOutputStream;
    public BufferedReader inConsole;

    public ClientHandlar(Socket socket) throws IOException {
        this.socket = socket;
        dataInputStream = new DataInputStream(socket.getInputStream());
        dataOutputStream = new DataOutputStream(socket.getOutputStream());
        inConsole = new BufferedReader(new InputStreamReader(System.in));
    }

//    private void mkDir() {
//        String user = System.getProperty("user.name");
//        String os = System.getProperty("os.name");
//        String[] oss = os.split(" ", 2);
//        if ("Windows".equals(oss[0])) {
//            folderPath = "C:\\Users\\" + user + "\\Downloads\\SocketApp\\" + userName + "\\"; //folderPath to save incoming files
//        } else {
//            folderPath = "/home/" + user + "/SocketApp/Server/" + userName + "/"; //folderPath to save incoming files
//        }
//        File dir = new File(folderPath);
//        if (dir.exists()) {
//            return;
//        }
//        dir.mkdirs();
//    }

    public void sendMessage() throws IOException {
        String msgOut = inConsole.readLine();   //read input from terminal
        msgOut = userName + "--> " + msgOut;
        String[] args = msgOut.split(" ", 3);
        // if(msgOut starts with "-f ", that means next part of the msg will contain path of the file)

        if ("-f".equals(args[1]) && args.length == 3) {
//            sendFile(args);
        } else {
            System.out.println(msgOut);
            dataOutputStream.writeUTF(msgOut);
        }
        dataOutputStream.flush();
    }

//    public void sendFile(String[] args) throws IOException {
//        String path = args[2];
//        File file = new File(path);
//        if (file.exists()) {
//            System.out.println("Sent " + file.getPath());
//            String msgOut = userName + "--> " + "-f " + file.getName();
//            out.writeUTF(msgOut); // send fileName
//            FileInputStream fileIn = new FileInputStream(file);
//            byte[] buffer = new byte[(int) file.length()];
//            fileIn.read(buffer);
//
//            out.writeInt(buffer.length);
//            out.write(buffer); // send file
//        } else {
//            System.out.println("File doesn't exist");
//        }
//    }

    public void receiveMessage() throws IOException {
        String msgIn = dataInputStream.readUTF();
        String[] args = msgIn.split(" ", 3);
        // if(msgIn starts with "-f ", that means next part of the msg will contain name of the file)
        if ("-f".equals(args[1]) && args.length == 3) {
//            receiveFile(args);   //file receive
            msgIn = args[0] + " " + args[2];
        }
        System.out.println(msgIn);
    }

//    public void receiveFile(String[] args) throws IOException {
//        File file = new File(folderPath + args[2]);
//        FileOutputStream fileOut;
//        int fileLength = in.readInt();
//        if (fileLength > 0) {
//            byte[] buffer = new byte[fileLength];
//            in.readFully(buffer, 0, fileLength);
//            fileOut = new FileOutputStream(file);
//            fileOut.write(buffer, 0, fileLength);
//            fileOut.close();
//            System.out.println("File received");
//            System.out.println("Saved in " + file.getAbsolutePath());
//        }
//    }

    @Override
    public void run() {
        try {
            userName = dataInputStream.readUTF();
            System.out.println(userName + " Connected");
//            new Thread(() -> {
//                while (true) {
//                    try {
//                        sendMessage();
//                    } catch (IOException ex) {
//                        System.out.println(ex.getMessage());
//                    }
//                }
//            }).start();
            new Thread(() -> {
                while (true) {
                    try {
                        receiveMessage();
                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }
                }
            }).start();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
//        mkDir();

    }

}
