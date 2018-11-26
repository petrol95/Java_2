package Lesson_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainClass {

//    static class Person {
//        int age;
//        public Person(int age) {
//            this.age = age;
//            if (age < 14) {
//                throw new RuntimeException("Невозможно создать сотрудника с возрастом меньше 14");
//            }
//        }
//    }

    public static void main(String[] args) {
        // try, catch, finally, throw, throws

//        try {
//            try {
//                int x = 10 / 0;
//            } catch (ArrayIndexOutOfBoundsException e) {
//                System.out.println("AIOOBE");
//            }
//            int[] q = new int[5];
//            q[20] = 20;
//            System.out.println("e");
//        } catch (ArithmeticException e) {
//            System.out.println("AE");
//        } catch (RuntimeException e) {
//            System.out.println("RE");
//        } catch (Exception e) {
//            System.out.println("E");
//            e.printStackTrace();
//        }
//        System.out.println("END");

//        try {
//            FileInputStream in = new FileInputStream("1.txt");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

//        try {
//            throw new RuntimeException("AAA!!!");
//        } catch (Exception e) {
//            // e.printStackTrace();
//            System.out.println("E1");
//        }
//        System.out.println("E");

//        System.out.println(sqrt(-10));

//        Person p = new Person(5);
//        System.out.println(p.age);

//        try {
//            a();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        JFrame jf = new JFrame();
//        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        jf.setTitle("Report Maker");
//        jf.setBounds(1200, 400, 400, 400);
//        JButton jButton = new JButton("Save Report");
//        jButton.addActionListener(e -> {
//            try {
//                ReportMaker.makeReportPDF("Report1", "Z:/1.pdf");
//            } catch (IOException e1) {
//                JOptionPane.showMessageDialog(null, "Ошибка при сохранении отчета!");
//            }
//        });
//        jf.add(jButton, BorderLayout.SOUTH);
//        jf.setVisible(true);

//        FileOutputStream out = null;
//        try {
//            out = new FileOutputStream("1.txt");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                out.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//
//        // try-with-resources
//        try(FileOutputStream out2 = new FileOutputStream("2.txt");
//            FileOutputStream out3 = new FileOutputStream("3.txt")) {
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        try {
//        } catch (ArithmeticException | NullPointerException | NumberFormatException e) {
//        }

        throw new MyException("Сгенерировано исключение");

    }

//    public static void a() throws IOException {
//        FileOutputStream out = new FileOutputStream("1.txt");
//        out.close();
//    }

//    public static int sqrt(int n) {
//        if (n >= 0) {
//            return n / 2;
//        }
//        throw new ArithmeticException("Невозможно взять квадратный корень из отрицательного числа!");
//    }

}
