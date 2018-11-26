package Lesson_1;

import Lesson_1.Competitors.Cat;
import Lesson_1.Competitors.Dog;
import Lesson_1.Competitors.Human;
import Lesson_1.Obstacles.Cross;
import Lesson_1.Obstacles.Wall;
import Lesson_1.Obstacles.Water;

public class MainClass {

    public static void main(String[] args) {

        Course c = new Course(new Cross(400), new Wall(2), new Water(1), new Wall(1)); // Создаем полосу препятствий
        Team team = new Team("Команда 1", new Human("Боб"), new Cat("Барсик"), new Dog("Бобик"), new Cat("Пушок")); // Создаем команду
        team.showAll(); // Показываем состав команды
        c.showCource(); // Показываем полосу препятствий
        c.doIt(team); // Просим команду пройти полосу
        team.showResults(); // Показываем результаты

        Course c2 = new Course(new Cross(400), new Wall(2), new Water(0), new Wall(1)); // Создаем полосу препятствий
        Team team2 = new Team("Команда 2", new Human("Джек"), new Cat("Мурзик"), new Dog("Тузик"), new Cat("Васька")); // Создаем команду
        team2.showAll(); // Показываем состав команды
        c2.showCource(); // Показываем полосу препятствий
        c2.doIt(team2); // Просим команду пройти полосу
        team2.showResults(); // Показываем результаты


    }
}
