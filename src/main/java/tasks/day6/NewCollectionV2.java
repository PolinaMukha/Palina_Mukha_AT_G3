package main.java.tasks.day6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NewCollectionV2 {
    public static void main(String[] args) {
        List<String> myList1 = new ArrayList<>();
        List<String> myList2 = new LinkedList<>();
        String str = "мама мыла раму";

        long t0 = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            myList1.add(str);
        }
        System.out.println(System.currentTimeMillis() - t0);

        t0 = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            myList2.add(str);
        }
        System.out.println(System.currentTimeMillis() - t0);
    }
}
