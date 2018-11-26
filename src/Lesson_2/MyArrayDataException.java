package Lesson_2;

public class MyArrayDataException extends RuntimeException {

    public MyArrayDataException(int x, int y) {
        super();
        System.out.println("Невозможно преобразовать значение в ячейке [" + (x + 1) + "][" + (y + 1) + "]!");
    }
}
