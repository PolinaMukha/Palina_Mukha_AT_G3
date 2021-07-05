package main.java.tasks.day6.hometaskCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

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
        System.out.println(butterflies);

        int counter = 0;
        for (String s : butterflies) {
            if (s.contains("o")) {
                counter++;
            }
        }
        System.out.println(counter);


        for (int i = 0; i < butterflies.size(); i++) {
            //System.out.println(butterflies.get(i) + " ");
        }

        for (String but : butterflies) {
            //System.out.println(but);
        }
    }
}
