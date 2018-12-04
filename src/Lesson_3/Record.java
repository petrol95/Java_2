package Lesson_3;

import java.util.HashSet;

/**
 * Java. Level 2. Lesson 3. Homework 3
 *
 * @author Olga Petrova
 * @version dated Nov 30, 2018
 */

public class Record {

    private String name;
    private HashSet<String> telNumber;

    public Record() {
        this.name = "";
        this.telNumber = new HashSet<>();
   }

    public Record(String name, HashSet telNumber) {
        this.name = name;
        this.telNumber = new HashSet<>();
        this.telNumber.addAll(telNumber);
    }

    public String getName() {
        return name;
    }

    public void displayTelNumber() {
        System.out.print(telNumber);
    }

    public void display() {
        System.out.print(name + ": ");
        displayTelNumber();
    }
}