package Lesson_6.Homework_6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ClientMain {


//    static Socket socket;
//    static DataOutputStream out;
//    static DataInputStream in;
//
//    final String SERVER_IP = "localhost";
//    final int SERVER_PORT = 8188;

    public static void main(String[] args) {
        try {
            Socket socket = new Socket ("localhost",8188);
            Send send = new Send(socket);
            Thread t = new Thread(send);
            t.start();
//            Thread t2 = new Thread(new Receive(socket));
//            t2.setDaemon(true);
//            t2.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
