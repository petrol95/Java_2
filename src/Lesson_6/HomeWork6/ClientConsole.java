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

        BufferedReader keyboard;
        keyboard = new BufferedReader(new InputStreamReader(System.in));

        // Ввод сообщения в консоли клиента
        new Thread(() -> {
            try {
                while(true) {
                    System.out.println("Enter message from client:");
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

//        // Обработка сообщения от сервера
//        new Thread(() -> {
//            try {
//                while(true) {
//                    String mes = in.readUTF();
//                    out.writeUTF("echo: " + mes);
//                    out.flush();
//                    System.out.println(mes);
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }).start();
    }
}