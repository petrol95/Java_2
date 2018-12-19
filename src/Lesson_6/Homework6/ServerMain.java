package Lesson_6.Homework6;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {

    public static void main(String[] args) {

        try (ServerSocket serverSocket = new ServerSocket(8189)) {
            System.out.println("Server started... Waiting for clients");
            Socket socket = serverSocket.accept();
            System.out.println("Client connected");

            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());

            execute(in, out);

        } catch (IOException e) {
            System.out.println("Server initialization error");
            e.printStackTrace();
        }
    }

    private static void execute(DataInputStream in, DataOutputStream out) throws IOException {

        new Thread(() -> {
            System.out.println("Enter message from server:");
            while (true) {
                try {
                    BufferedReader keyboard;
                    keyboard = new BufferedReader(new InputStreamReader(System.in));
                    String msg = keyboard.readLine();
                    out.writeUTF(msg);
                    out.flush();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(() -> {
            while (true) {
                try {
                    String msg = in.readUTF();
                    if (msg.equals("/end"))
                        break;
                    out.writeUTF("echo: " + msg);
                    out.flush();
                    System.out.println("client: " + msg);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
