package Lesson_6.Homework_6;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main (String [] args) {

        ServerSocket serverSocket = null;
        Socket socket = null;

        try {
            serverSocket = new ServerSocket (8189);
            System.out.println ("Waiting for connection...");
            socket = serverSocket.accept();
            System.out.println("Client connected");
            Scanner sc = new Scanner(socket.getInputStream());
            PrintWriter pw = new PrintWriter (socket.getOutputStream());
            while (true) {
                String str = sc.nextLine();
                if (str.equals("/end"))
                    break;
                pw.println("echo: " + str);
                pw.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
