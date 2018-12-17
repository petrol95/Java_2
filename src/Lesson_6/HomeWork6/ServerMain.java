package Lesson_6.HomeWork6;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {

    public static void main(String[] args) {

        try(ServerSocket serverSocket = new ServerSocket(8189)) {
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

        BufferedReader keyboard;
        keyboard = new BufferedReader(new InputStreamReader(System.in));

        new Thread(() -> {
            try {
                while(true) {

                    // Обработка сообщения от клиента
                    String mes = in.readUTF();
                    out.writeUTF("echo: " + mes);
                    out.flush();
                    System.out.println(mes);

//                    // Ввод сообщения в консоли сервера
//                    System.out.println("Enter message from server:");
//                    String msg = keyboard.readLine();
//                    if (msg.equals("/end"))
//                        break;
//                    else {
//                        out.writeUTF("server: " + msg);
//                        out.flush();
//                        msg = in.readUTF();
//                        System.out.println(msg);
//                    }

                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();








    }
}