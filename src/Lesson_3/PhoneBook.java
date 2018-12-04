package Lesson_3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Java. Level 2. Lesson 3. Homework 3
 *
 * @author Olga Petrova
 * @version dated Nov 30, 2018
 */

public class PhoneBook {

    private HashMap<Integer, Record> phoneBook;

    public PhoneBook() {
        this.phoneBook = new HashMap<>();
    }

    public void add(Record rec) {
        int ind = phoneBook.size();
        phoneBook.put(ind, rec);
    }

    public void get(String name) {
        System.out.println(name + ":");
        Iterator<Map.Entry<Integer, Record>> iter = phoneBook.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<Integer, Record> e = iter.next();
            Record rec = new Record();
            rec = e.getValue();
            if (name.equals(rec.getName()))
                rec.displayTelNumber();
        }
        System.out.println("\n============================");
    }

    public void display() {
        System.out.println("PhoneBook");
        Iterator<Map.Entry<Integer, Record>> iter = phoneBook.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<Integer, Record> e = iter.next();
            System.out.print((e.getKey() + 1) + ". ");
            e.getValue().display();
            System.out.println();
        }
    }
}