package Lesson_6.Homework_6;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        new ClientWin();
    }

    private static class ClientWin {

        private final String SERVER_ADDR = "localhost";
        private final int SERVER_PORT = 8189;
        private Socket socket;
        private Scanner in;
        private PrintWriter out;

        public ClientWin() {

            try {
                socket = new Socket (SERVER_ADDR, SERVER_PORT);
                in = new Scanner(socket.getInputStream());
                out = new PrintWriter(socket.getOutputStream());
                } catch(IOException e) {
                    e.printStackTrace();
                }

                new Thread(() -> {method();}).start();
        }

        private void method() {
            try {
                while (true) {
                    System.out.println("Please enter your message");
                    if (in.hasNext()) {
                        String w = in.nextLine();
                        if (w.equalsIgnoreCase("end session"))
                            break;
                        System.out.println("OK");
                        sendMsg(w);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        private void sendMsg(String msg) {
            out.println(msg);
            out.flush();
            out.println();
        }
    }
}

