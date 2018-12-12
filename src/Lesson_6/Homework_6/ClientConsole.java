//package Lesson_6.Homework_6;
//
//import java.io.DataInputStream;
//import java.io.DataOutputStream;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.net.Socket;
//import java.util.Scanner;
//
//public class ClientConsole {
//
//    private Socket socket;
////    private DataOutputStream out;
////    private DataInputStream in;
//    private Scanner in;
//    private PrintWriter out;
//
//    final String SERVER_IP = "localhost";
//    final int SERVER_PORT = 8190;
//
//    public ClientConsole() {
//        try {
//            socket = new Socket(SERVER_IP, SERVER_PORT);
//            in = new Scanner (socket.getInputStream ());
//            out = new PrintWriter (socket.getOutputStream ());
////            in = new DataInputStream(socket.getInputStream());
////            out = new DataOutputStream(socket.getOutputStream());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
// //       new Thread(new Runnable() {
//         Thread t = new Thread(new Runnable() {
//            @Override
//            public void run() {
// //               try {
//                    while (true) {
//                        System.out.println("Enter your message: ");
//                        String msg = in.nextLine();
////                        String msg = in.readUTF();
//                        if (msg.equals("/end")) break;
//                        sendMsg(msg);
// //                   }
//            }
// //       }).start();
//           });
// //       t.setDaemon(true);
//        t.start();
//
//    }
//
//    public void sendMsg(String msg){
//        try {
////            out.writeUTF(msg);
//            out.println(msg);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}