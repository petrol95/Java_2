//package Lesson_6.Homework_6;
//
//import java.io.DataInputStream;
//import java.io.DataOutputStream;
//import java.io.IOException;
//import java.net.Socket;
//
//    public class Send implements Runnable {
//        private Socket socket = null;
//        private DataInputStream in;
//        private DataOutputStream out;
//
//        public Send(Socket socket) {
//            this.socket = socket;
//        }
//
//        @Override
//        public void run() {
//            try{
//                String msg = null;
//                while(true) {
//                    msg = in.readUTF();
//                    if (msg.equals("/end")) break;
//                    System.out.println("client: " + msg);
//                    sendMsg("echo: " + msg);
//                    System.out.println("Please enter your message");
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            } finally {
//                try {
//                    socket.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//
//        private void sendMsg(String s) {
//            try {
//                out.writeUTF(s);
//                out.flush();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//        }
//    }
//
