package main.java.tasks.day6;

import java.util.*;

public class NewCollection4 {
    public static void main(String[] args) {
        Set<String> mySet1 = new HashSet<>();
        Set<String> mySet2 = new TreeSet<>();
        String str = "мама мыла раму";

        long t0 = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            mySet1.add(str);
        }
        System.out.println(System.currentTimeMillis() - t0);

        t0 = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            mySet2.add(str);
        }
        System.out.println(System.currentTimeMillis() - t0);

        t0 = System.nanoTime();
        Iterator<String> iterator = mySet1.iterator();
        while (iterator.hasNext()) {
            iterator.next();
        }
        System.out.println(System.nanoTime() - t0);
    }
}
