package Lesson_3;

import java.util.*;

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
//        ArrayList<String> al = new ArrayList<>();
//        for (int i = 0; i < 1_000_000; i++) {
//            al.add("Entry # " + i);
//        }
//        HashMap<String, Integer> hm = new HashMap<>();
//        for (int i = 0; i < 1_000_000; i++) {
//            hm.put("Entry # " + i, i);
//        }
//        long time = System.currentTimeMillis();
//        for (int i = 0; i < 400; i++) {
//            al.contains("Entry #654882");
//        }
//        System.out.println(System.currentTimeMillis() - time);
//        time = System.currentTimeMillis();
//        for (int i = 0; i < 100_000_000; i++) {
//            hm.get("Entry #654882");
//        }
//        System.out.println(System.currentTimeMillis() - time);

        // Имитация коллизий в HashMap
//        String[] str = new String[10];
//        str[(str.length - 1) & "Java".hashCode()] = "Java";
//        str[(str.length - 1) & "Home".hashCode()] = "Home";
//        str[(str.length - 1) & "Core".hashCode()] = "Core";
//        System.out.println(Arrays.toString(str)); // [Java, null, null, null, null, null, null, null, null, Core]

        // HashSet
//        HashSet<String> hs = new HashSet<>();
//        hs.add("Q");
//        hs.add("B");
//        hs.add("B");
//        hs.add("B");
//        hs.add("A");
//        hs.add("A");
//        hs.add("C");
//        System.out.println(hs); // [Q, A, B, C]
//
//        // LinkedHashSet
//        LinkedHashSet<String> lhs = new LinkedHashSet<>();
//        lhs.add("Q");
//        lhs.add("B");
//        lhs.add("B");
//        lhs.add("B");
//        lhs.add("A");
//        lhs.add("A");
//        lhs.add("C");
//        System.out.println(lhs); // [Q, B, A, C]

        // TreeSet
//        TreeSet<String> ts = new TreeSet<>(Arrays.asList("A", "W", "Q", "C", "C", "D"));
//        System.out.println(ts); // [A, C, D, Q, W]

//        HashMap<String, Integer> hmi = new HashMap<>();
//        hmi.put("A", 1);
//        System.out.println(hmi.getOrDefault("A", 9)); // 1

        // Iterator
//        ArrayList<Integer> ali = new ArrayList<>(Arrays.asList(2, 2, 2, 1, 2, 2, 1, 1));
//        Iterator<Integer> iter = ali.iterator();
//        while(iter.hasNext()) {
//            Integer temp = iter.next();
//            if (temp == 2)
//                iter.remove();
//        }
//        System.out.println(ali); // [1, 1, 1]

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("A", 1);
        Iterator <Map.Entry<String, Integer>> iter = hm.entrySet().iterator();
        while(iter.hasNext()) {
            Map.Entry<String, Integer> e = iter.next();
            System.out.println(e.getKey() + " " + e.getValue()); // A 1
        }
    }
}
