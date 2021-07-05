package main.java.tasks.day6.hometaskCollections;

import java.util.ArrayList;
import java.util.List;

public class Butterflies {
    public static void main(String[] args) {
        List<String> butterflies = new ArrayList<>();
        butterflies.add("Common blue");
        butterflies.add("Swallowtail");
        butterflies.add("Aglais io");
        butterflies.add("Common blue");

        for (String b : butterflies) {
            System.out.println("'" + b + "'" + " ");
        }

        int counter = 0;
        for (String s : butterflies) {
            if (s.contains("o")) {
                counter++;
            }

        }
        System.out.println("----------");
        System.out.println(counter);
        System.out.println("----------");

        for (int i = 0; i < butterflies.size(); i++) {
            System.out.println(butterflies.get(i) + " ");
        }

        System.out.println("----------");

        for (String but : butterflies) {
            System.out.println(but);
        }
    }
}
