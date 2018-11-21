package Lesson_1;

public class MainClass {

//    static final int APP_START = 0;
//    static final int APP_PREPARE = 1;
//    static final int APP_WORK = 2;
//    static final int APP_SAVE_DATA = 3;

    static AppState appState = AppState.INIT;

    public static void main(String[] args) {

//        appState++;
        System.out.println(appState.getPriority());
        appState = AppState.WORK;
        System.out.println(appState.getPriority());

    }

//    public static void main(String[] args) {
//
////        Animal a = new Cat();
////        Flyable f = new Parrot();
////        f.fly();
////        f.defaultFly();
////        ((Parrot)f).voice();
////        Predator[] predators = {new Cat(), new Cat(), new Cat()};
//
//    }

}
