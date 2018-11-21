package Lesson_1;

public class MainClass {

    public static void main(String[] args) {
        Animal a = new Cat();
        Flyable f = new Parrot();
        f.fly();
        f.defaultFly();
        ((Parrot)f).voice();
        Predator[] predators = {new Cat(), new Cat(), new Cat()};

    }
}
