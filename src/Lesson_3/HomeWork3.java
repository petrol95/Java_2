package Lesson_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Java. Level 2. Lesson 3. Homework 3
 *
 * @author Olga Petrova
 * @version dated Nov 30, 2018
 */

public class HomeWork3 {

    public static void main (String[] args) {

        // Task #1
        System.out.println("Task #1");
        ArrayList<String> al = new ArrayList<>(Arrays.asList(
                "Cat", "Water", "Heat", "Water", "Heat", "Stone", "Paper", "Cat", "Cat", "Dog", "Cow"));
        HashSet<String> hs = new HashSet<>(); // unique words
        ArrayList<Integer> ind = new ArrayList<>(); // how many times each word occurs
        hs.addAll(al);

        Iterator<String> iter = hs.iterator();
        while (iter.hasNext()) {
            int s = 0;
            String temp = iter.next();
            for (String arrEntry : al) {
                if (temp.equals(arrEntry))
                    s++;
            }
            ind.add(s);
        }

        System.out.println(al);
        System.out.println("Unique words: " + hs);
        System.out.println("Number of times each word occurs: " + ind);

        // Task # 2
        System.out.println("\nTask #2");
        PhoneBook pb = new PhoneBook();
        addRecord(pb,"Smith", new HashSet<>(Arrays.asList("123456", "456789")));
        addRecord(pb,"Smith", new HashSet<>(Arrays.asList("345678")));
        addRecord(pb,"Johnson", new HashSet<>(Arrays.asList("567838")));
        addRecord(pb,"Johnson", new HashSet<>(Arrays.asList("165738")));
        addRecord(pb,"Richter", new HashSet<>(Arrays.asList("835627")));

        pb.get("Smith");
        pb.get("Johnson");
        pb.get("Richter");
        pb.display();
    }

    private static void addRecord(PhoneBook pb, String name, HashSet telNumber) {
        pb.add(new Record(name, telNumber));
    }
}