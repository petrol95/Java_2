package Lesson_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MainClass {

    public static void main(String[] args) {

        // Array
//        int[] arr = new int[5];

        // ArrayList
//        ArrayList<String> al = new ArrayList<>();
//        al.add("A");
//        al.add("2");
//        al.add("Core");
//        System.out.println(al); // [A, 2, Core]
//
//        List<String> als = new ArrayList<>(Arrays.asList("A", "@", "Core", "Java", "Home"));
//        als.remove("@");
//        als.remove(2);
//        System.out.println(als); // [A, Core, Home]
//        als.set(0, "Q");
//        System.out.println(als); // [Q, Core, Home]
//        System.out.println(als.get(1)); // Core
//
//        int e = 10;
//        Integer x = e;
//        int a = x;
//        System.out.println("e = " + 10 + ", x = " + x + ", a = " + a);
//
//        ArrayList<Integer> ali = new ArrayList<>();
//        ali.add(4);
//        ali.add(3);
//        ali.add(2);
//        ali.add(1);
//        ali.add(0);
//        ali.remove(4);
//        System.out.println(ali); // [4, 3, 2, 1]
//        ali.remove((Integer)4);
//        System.out.println(ali); // [3, 2, 1]
//        ali.add(1, 10);
//        System.out.println(ali); // shift: [3, 10, 2, 1]
//
//        ArrayList<String> als2 = new ArrayList<>();
//        als2.add("A");
//        als2.add("C");
//        als2.add("A");
//        als2.add("A");
//        als2.add("B");
//        als2.add("B");
//        als2.remove("A");
//        System.out.println(als2); // [C, A, A, B, B]
//        while(als2.remove("A"));
//        System.out.println(als2); // [C, B, B]
//        als2.clear();
//        System.out.println(als2); // []
//
//        ArrayList<String> als3 = new ArrayList<>();
//        als3.add("A");
//        als3.add("C");
//        als3.add("A");
//        als3.add("A");
//        als3.add("B");
//        als3.add("B");
//        System.out.println(als3); // [A, C, A, A, B, B]
//        ArrayList<String> als4 = new ArrayList<>();
//        als4.add("W");
//        als4.add("W");
//        als4.add("W");
//        als4.add("A");
//        als4.add("B");
//        als4.add("B");
//        als3.add(2, "D");
//        als3.addAll(1, als4);
//        System.out.println(als3); // [A, W, W, W, A, B, B, C, D, A, A, B, B]
//
//        ArrayList<String> als5 = new ArrayList<>(100_000);

        // HashMap
//        HashMap<String, String> hm = new HashMap<>();
//        hm.put("France", "Paris");
//        hm.put("Russia", "Moscow");
//        hm.put("England", "London");
//        System.out.println(hm.get("France"));
//        System.out.println(hm.get("England"));

        // Comparing ArrayList & HashMap
        ArrayList<String> al = new ArrayList<>();
        for (int i = 0; i < 1_000_000; i++) {
            al.add("Entry # " + i);
        }
        HashMap<String, Integer> hm = new HashMap<>();
        for (int i = 0; i < 1_000_000; i++) {
            hm.put("Entry # " + i, i);
        }
        long time = System.currentTimeMillis();
        for (int i = 0; i < 400; i++) {
            al.contains("Entry #654882");
        }
        System.out.println(System.currentTimeMillis() - time);
        time = System.currentTimeMillis();
        for (int i = 0; i < 100_000_000; i++) {
            hm.get("Entry #654882");
        }
        System.out.println(System.currentTimeMillis() - time);
    }




}
