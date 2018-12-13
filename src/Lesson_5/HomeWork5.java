package Lesson_5;

/**
 * Java. Level 2. Lesson 5. Homework 5
 *
 * @author Olga Petrova
 * @version dated Dec 06, 2018
 */

public class HomeWork5 {

    static final int SIZE = 10_000_000;
    static final int H = SIZE / 2;

    public static void main(String[] args) {
        System.out.println("Method 1: " + method1());
        System.out.println("Method 2: " + method2());
    }

    private static long method1() {

        float[] arr = new float[SIZE];
        for (int i = 0; i < SIZE; i++) {
            arr[i] = 1;
        }

        long a = System.currentTimeMillis();
        calc(arr);
        return System.currentTimeMillis() - a;

    }

    private static long method2() {

        float[] arr = new float[SIZE];
        float[] arr1 = new float[H];
        float[] arr2 = new float[SIZE - H];

        for (int i = 0; i < SIZE; i++) {
            arr[i] = 1;
        }

        long a = System.currentTimeMillis();

        System.arraycopy(arr, 0, arr1, 0, H);
        System.arraycopy(arr, H, arr2, 0, SIZE - H);

        new Thread(() -> {calc(arr1);}).start();
        new Thread(() -> {calc(arr2);}).start();

        System.arraycopy(arr1, 0, arr, 0, H);
        System.arraycopy(arr2, 0, arr, H, SIZE - H);

        return System.currentTimeMillis() - a;
    }

    private static void calc(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }
}