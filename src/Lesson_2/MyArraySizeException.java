package Lesson_2;

import static Lesson_2.HomeWork2.ARR_HEIGHT;
import static Lesson_2.HomeWork2.ARR_WIDTH;

public class MyArraySizeException extends RuntimeException {

    public MyArraySizeException(int x) {
        super();
        if (x == -1) {
            System.out.println("Ошибка в количестве строк. Массив должен иметь размерность " +
                    ARR_WIDTH  + "x" + ARR_HEIGHT + "!");
        }
        else {
            System.out.println("Ошибка в размере строки " + (x + 1) +
                    ". Массив должен иметь размерность " + ARR_WIDTH  + "x" + ARR_HEIGHT + "!");
        }
    }
}
