package Lesson_5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class  MainClass {

    Object mon = new Object();

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

//        ExecutorService service = Executors.newFixedThreadPool(10);
//        service.execute(() -> {
//            System.out.println("A");
//        });
//        service.shutdown();

//        new Thread(() -> {
//            for (int i = 0; i < 10; i++) {
//                System.out.println(i);
//            }
//        }).start();

//        Thread t = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("A");
//            }
//        });
//        t.setPriority(5);
//        t.start();

//        Thread t = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                while(true) {
//                    System.out.println("q");
//                }
//            }
//        });
//        t.start();
//
//        Thread t2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                while(true) {
//                    System.out.println("w");
//                }
//            }
//        });
//        t2.start();

//      Thread t = new Thread(new Runnable() {
//          @Override
//          public void run() {
//              for (int i = 0; i < 5; i++) {
//                  System.out.println(i);
//              }
//          }
//      });
//      t.start();
//      try {
//          t.join();
//      } catch (InterruptedException e) {
//          e.printStackTrace();
//      }
//      System.out.println("end");

//     Thread t = new Thread(new Runnable() {
//         @Override
//         public void run() {
//             int time = 0;
//             while(true) {
//                 time++;
//                 try {
//                     Thread.sleep(1000);
//                 } catch (InterruptedException e) {
//                     e.printStackTrace();
//                 }
//                 System.out.println(time);
//             }
//         }
//     });
//     t.setDaemon(true);
//     t.start();
//     try {
//         Thread.sleep(5000);
//     } catch (InterruptedException e) {
//         e.printStackTrace();
//     }
//     System.out.println("end");+

//        // 1-й вариант блокировки
//        Counter counter = new Counter();
//        Thread t1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 100000; i++) {
//                    counter.inc();
////                    try {
////                        Thread.sleep(1);
////                    } catch (InterruptedException e) {
////                        e.printStackTrace();
////                    }
//                }
//            }
//        });
//
//        Thread t2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 100000; i++) {
//                    counter.dec();
////                    try {
////                        Thread.sleep(1);
////                    } catch (InterruptedException e) {
////                        e.printStackTrace();
////                    }
//                }
//            }
//        });
//
//        t1.start();
//        t2.start();
//
//        try {
//            t1.join();
//            t2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println(counter.value());

        // 2-й вариант блокировки
        MainClass mc = new MainClass();
        new Thread(() -> mc.method1()).start();
        new Thread(() -> mc.method1()).start();
    }


        public void method1() {
            System.out.println("Block1 begins");
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Block1 ends");
            synchronized(mon) {
                System.out.println("Synch block begins");
                for (int i = 0; i < 5; i++) {
                    System.out.println(i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                }
            }
            System.out.println("Synch block ends");
        }
    }
}
