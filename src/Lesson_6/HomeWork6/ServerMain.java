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

//            BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter message:");

            while(true) {

//                String msg = keyboard.readLine();
                String msg = in.readUTF();
//                if (msg.equals("/end"))
//                    break;
//                else {
                    out.writeUTF("echo: " + msg);
                    out.flush();
                    System.out.println(msg);
//                }

            }
        } catch (IOException e) {
            System.out.println("Server initialization error");
            e.printStackTrace();
        }
    }
}