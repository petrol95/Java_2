package Lesson_6.HomeWork6;

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
            e.printStackTrace();
        }

        new Thread(() -> {
            while (true) {
                try {
                    BufferedReader keyboard;
                    keyboard = new BufferedReader(new InputStreamReader(System.in));
                    System.out.println("Enter message from client:");
                    String msg = keyboard.readLine();
                    if (msg.equals("/end"))
                        break;
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
                    out.writeUTF(msg);
                    out.flush();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }
}