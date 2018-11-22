package Lesson_1.Examples;

public interface Flyable {
    void fly();

    default void defaultFly() {
        System.out.println("defFly");
    }
}
