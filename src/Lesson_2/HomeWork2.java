package Lesson_2;

public class HomeWork2 {
    static final int ARR_WIDTH = 4;
    static final int ARR_HEIGHT = 4;

    public static void main(String[] args) {

        // Test case 1
        String[][] arr = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        System.out.println("Test case 1");
        testArray(arr);

        // Test case 2
        String[][] arr2 = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16", "17"}
        };
        System.out.println("Test case 2");
        testArray(arr2);

        // Test case 3
        String[][] arr3 = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "a", "11", "12"},
                {"13", "14", "15", "16"}
        };
        System.out.println("Test case 3");
        testArray(arr3);

        // Test case 4
        String[][] arr4 = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"},
                {"17", "18", "19", "20"}
        };
        System.out.println("Test case 4");
        testArray(arr4);
    }

    private static void testArray(String[][] arr) {
        try {
            System.out.println("Сумма элементов = " + calcSum(arr));
        } catch (MyArraySizeException e) {
            System.out.println("Ошибка размерности!");
        } catch (MyArrayDataException e) {
            System.out.println("Ошибка значения!");
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    public static int calcSum(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        // checking dimensions
        if (arr.length != ARR_HEIGHT) {
            throw new MyArraySizeException(-1);
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].length != ARR_WIDTH) {
                    throw new MyArraySizeException(i);
                }
            }
        }
        // calculating sum
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                try {
                    Integer temp = new Integer(arr[i][j]);
                    sum += temp;
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sum;
    }

}
