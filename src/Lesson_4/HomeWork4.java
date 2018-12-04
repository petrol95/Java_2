package Lesson_4;

import javax.swing.*;

/**
 * Java. Level 2. Lesson 4. Homework 4
 *
 * @author Olga Petrova
 * @version dated Dec 03, 2018
 */

public class HomeWork4 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ChatWindow();
            }
        });
    }
}
