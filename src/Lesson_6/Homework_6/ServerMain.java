package Lesson_6.Homework_6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {



    public static void main(String[] args) throws IOException {

        System.out.println("Server started... Waiting for connection");
        ServerSocket serverSocket = new ServerSocket(8188);
        Socket clientSocket = serverSocket.accept();
        System.out.println("Client connected");

        FromClient fromClient = new FromClient(clientSocket);
        Thread t = new Thread(fromClient);
        t.start();

        ToClient toClient = new ToClient(clientSocket);
        Thread t2 = new Thread(toClient);
        t2.setDaemon(true);
        t2.start();
    }
}
