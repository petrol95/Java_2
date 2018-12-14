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

        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your message:");

        new Thread(() -> {
            try {
                while(true) {
                    String msg = keyboard.readLine();
                    if (msg.equals("/end"))
                        break;
                    else {
                        out.writeUTF("client: " + msg);
                        out.flush();
                        msg = in.readUTF();
                        System.out.println(msg);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
    }
}
