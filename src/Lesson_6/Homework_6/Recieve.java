//package Lesson_6.Homework_6;
//
//import java.io.DataInputStream;
//import java.io.DataOutputStream;
//import java.io.IOException;
//import java.net.Socket;
//
//class Receive implements Runnable {
//
//    private Socket socket = null;
//    private DataInputStream in;
//    private DataOutputStream out;
//
//    public Receive(Socket socket) {
//        this.socket = socket;
//    }
//
//    @Override
//    public void run() {
//        while(true) {
//            String msg = null;
//           try {
//               msg = in.readUTF();
//           } catch (IOException e) {
//               e.printStackTrace();
//           }
//           System.out.println("client: " + msg);
//           sendMsg("echo: " + msg);
//           System.out.println("Please enter your message");
//           if (msg.equals("/end")) break;
//       }
//    }
//
//    private void sendMsg(String s) {
//        try {
//            out.writeUTF(s);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
//
