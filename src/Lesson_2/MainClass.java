package Lesson_2;

public class MainClass {

    public static void main(String[] args) {
        try {
            int[] q = new int[5];
            q[20] = 20;
            int x = 10 / 0;
            System.out.println("e");
        } catch(ArithmeticException e) {
            System.out.println("AE");
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("AIOOBE");
        }
        System.out.println("END");
    }
}
