//package Lesson_6.Homework_6;
//
//import java.io.DataInputStream;
//import java.io.DataOutputStream;
//import java.io.IOException;
//import java.net.Socket;
//
//public class FromClient implements Runnable {
//
//    private Socket socket = null;
//    private DataInputStream in;
//    private DataOutputStream out;
//
//    public FromClient(Socket socket) {
//        this.socket = socket;
//    }
//
//    @Override
//    public void run() {
//        try{
//            while(true) {
//                String msg = in.readUTF();
//                System.out.println("client: " + msg);
//                sendMsg("echo: " + msg);
//                if (msg.equals("/end")) break;
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                socket.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//
//    }
//
//    private void sendMsg(String s) {
//        try {
//            out.writeUTF(s);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//}
