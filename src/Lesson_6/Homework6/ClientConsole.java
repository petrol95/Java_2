package Lesson_6.Homework6;

import java.io.*;
import java.net.Socket;

public class ClientConsole extends Thread {

    private final String SERVER_ADDR = "localhost";
    private final int SERVER_PORT = 8189;
    private Socket socket;
    private DataInputStream in;
    private DataOutputStream out;

    @Override
    public void run() {

        try {
            socket = new Socket(SERVER_ADDR, SERVER_PORT);
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());
        } catch (IOException e) {
            System.out.println("Client initialization error");
            e.printStackTrace();
        }

        new Thread(() -> {
            BufferedReader keyboard;
            keyboard = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter message from client:");
            try {
                while (true) {
                    String msg = keyboard.readLine();
                    if (msg.equals("/end"))
                        break;
                    out.writeUTF(msg);
                    out.flush();
                }
                in.close();
                out.close();
                socket.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                while (true) {
                    String msg = in.readUTF();
                    if (msg.equals("/end"))
                        break;
                    System.out.println("server: " + msg);
                }
                in.close();
                out.close();
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();

    }
}
