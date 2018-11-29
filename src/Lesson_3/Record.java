package Lesson_3;

/**
 * Java. Level 2. Lesson 3. Homework 3
 *
 * @author Olga Petrova
 * @version dated Nov 29, 2018
 */

public class Record {

    private String name;
    private String telNumber;

    public Record() {
        this.name = "";
        this.telNumber = "";
    }

    public Record(String name, String telNumber) {
        this.name = name;
        this.telNumber = telNumber;
    }

    public String getName() {
        return name;
    }

    public String getTelNumber() {
        return telNumber;
    }

    @Override
    public String toString() {
        return "[" + name + ": " + telNumber + "]";
    }
}
