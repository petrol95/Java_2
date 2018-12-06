package Lesson_5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainClass {
    public static void main(String[] args) {
////        System.out.println(Thread.currentThread().getName());
//        MyThread t1 = new MyThread();
//        MyThread t2 = new MyThread();
//        t1.start();
//        t2.start();
////        t1.run();
////        t2.run();
//
//        Thread t3 = new Thread(new MyRunnable());
//        Thread t4 = new Thread(new MyRunnable());
//        t3.start();
//        t4.start();

//        Thread t1 = new Thread(() -> System.out.println("A"));
//        Thread t2 = new Thread(() -> System.out.println("B"));
//        t1.start();
//        t2.start();

        ExecutorService service = Executors.newFixedThreadPool(10);
        service.execute(() -> {
            System.out.println("A");
        });
        service.shutdown();



    }
}
