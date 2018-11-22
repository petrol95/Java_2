package Lesson_1.Obstacles;

import Lesson_1.Competitors.Competitor;

public class Wall extends Obstacle {

    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.jump(height);
    }

    @Override
    public String toString() {
        return "Стена: " + height;
    }
}
