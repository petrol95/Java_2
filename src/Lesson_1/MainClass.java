package Lesson_1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainClass {

//    static final int APP_START = 0;
//    static final int APP_PREPARE = 1;
//    static final int APP_WORK = 2;
//    static final int APP_SAVE_DATA = 3;
//    static AppState appState = AppState.INIT;

    public static void main(String[] args) {

//        appState++;
//        System.out.println(appState.getPriority());
//        appState = AppState.WORK;
//        System.out.println(appState.getPriority());
//        Outer outer = new Outer(20);
//        Outer.Inner inner = new Outer(10).new Inner(30);
//        Outer.Inner inner2 = outer.new Inner(30);

//        SOuter.SInner si = new SOuter.SInner();
//        class Point {
//            int x;
//            int y;
//
//            public Point(int x, int y) {
//                this.x = x;
//                this.y = y;
//            }
//        }
//        Point p = new Point(10, 10);

        Flyable f = new Flyable() {
            @Override
            public void fly() {
                System.out.println("fly-fly-fly");
            }
        };
        f.fly();
        System.out.println(f.getClass().getName());

        Flyable f2 = new Flyable() {
            @Override
            public void fly() {
                System.out.println("fly-fly-fly");
            }
        };
        f2.fly();
        System.out.println(f2.getClass().getName());

        JButton jb1 = new JButton("Button #1");
        jb1.addActionListener(new JButton1Action());

        jb1.addActionListener(e -> System.out.println("CLICKED!!!"));



    }

//    public static void main(String[] args) {
//
////        Animal a = new Cat();
////        Flyable f = new Parrot();
////        f.fly();
////        f.defaultFly();
////        ((Parrot)f).voice();
////        Predator[] predators = {new Cat(), new Cat(), new Cat()};
//
//    }

}