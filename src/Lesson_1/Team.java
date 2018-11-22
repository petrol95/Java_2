package Lesson_1;

import Lesson_1.Competitors.Cat;
import Lesson_1.Competitors.Competitor;
import Lesson_1.Competitors.Dog;
import Lesson_1.Competitors.Human;

public class Team {

    private Competitor[] competitors;
    private String name;

    public Team(String name, Human human, Cat cat1, Dog dog, Cat cat2) {
        this.name = name;
        this.competitors = new Competitor[]{human, cat1, dog, cat2};
    }

    public Competitor[] getCompetitors() {
        return competitors;
    }

    public void showAll() {
        System.out.println("================================");
        System.out.println("Состав команды: " + name);
        for (Competitor c: competitors) {
            System.out.println(c);
        }
        System.out.println("================================");
    }

    public void showResults() {
        System.out.println("================================");
        System.out.println("Результаты:");
        for (Competitor c: competitors) {
            c.showResult();
        }
   }

}
