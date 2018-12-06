package Lesson_5;

public class ExampleChairs {

    public static void main(String[] args) {

        Object chair = new Object();

            Thread man1 = new Thread(() -> {
                System.out.println("Чел1 подошел к стулу");
                synchronized (chair){
                    System.out.println("Чел1 сел на стул");
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Чел1 встал со стула");
                }
            });
            man1.start();

            Thread man2 = new Thread(() -> {
                System.out.println("Чел2 подошел к стулу");
                synchronized (chair){
                    System.out.println("Чел2 сел на стул");
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Чел2 встал со стула");
                }
            });
            man2.start();

            Thread man3 = new Thread(() -> {
                System.out.println("Чел3 подошел к стулу");
                synchronized (chair){
                    System.out.println("Чел3 сел на стул");
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Чел3 встал со стула");
                }
            });
            man3.start();

            Thread man4 = new Thread(() -> {
                System.out.println("Чел4 подошел к стулу");
                synchronized (chair){
                    System.out.println("Чел4 сел на стул");
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Чел4 встал со стула");
                }
            });
            man4.start();
        }
}
