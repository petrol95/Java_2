package Lesson_1;

import Lesson_1.Competitors.*;
import Lesson_1.Obstacles.Cross;
import Lesson_1.Obstacles.Obstacle;
import Lesson_1.Obstacles.Wall;
import Lesson_1.Obstacles.Water;

public class MainClass {

    public static void main(String[] args) {

        Competitor[] competitors = {new Human("Боб"), new Cat("Барсик"), new Dog("Бобик")};
        Obstacle[] obstacles = {new Cross(400), new Wall(2), new Water(1)};

        for (Competitor с: competitors) {
            for (Obstacle o: obstacles) {
                o.doIt(с);
                if (!с.isOnDistance()) break;
            }
        }

        System.out.println("================================");
        for (Competitor c: competitors) {
            c.showResult();
        }

    }
}
