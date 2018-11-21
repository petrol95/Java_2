package Lesson_1;

public interface Flyable {
    void fly();

    default void defaultFly() {
        System.out.println("defFly");
    }
}
