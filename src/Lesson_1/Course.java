package Lesson_1;

import Lesson_1.Competitors.Competitor;
import Lesson_1.Obstacles.Cross;
import Lesson_1.Obstacles.Obstacle;
import Lesson_1.Obstacles.Wall;
import Lesson_1.Obstacles.Water;

public class Course {

    private Obstacle[] obstacles;

    public Course(Cross cross, Wall wall1, Water water, Wall wall2) {
        this.obstacles = new Obstacle[]{cross, wall1, water, wall2};
    }

    public void doIt(Team team) {
        for (Competitor с: team.getCompetitors()) {
            for (Obstacle o: obstacles) {
                o.doIt(с);
                if (!с.isOnDistance()) break;
            }
        }
    }

    public void showCource() {
        System.out.println("Дистанция: ");
        for (Obstacle o: obstacles) {
            System.out.println(o);
        }
        System.out.println("================================");
    }

}
