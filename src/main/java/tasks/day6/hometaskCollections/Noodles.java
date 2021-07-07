package main.java.tasks.day6.hometaskCollections;

import java.util.*;

public class Noodles {
    public static void main(String[] args) {
        List<String> noodles = new ArrayList<>();
        noodles.add("Hakka");
        noodles.add("Ramen");
        noodles.add("Hibachi");
        noodles.add("Schezwan");
        
        for (String noo : noodles) {
            System.out.print(noo + "-");
        }
        System.out.println();

        int b;
        for (int i = 0; i < noodles.size(); i++) {
            String replaceLetters = noodles.get(i);
            replaceLetters = replaceLetters.replaceAll("a", "o");
            noodles.set(i, replaceLetters);
        }
        System.out.println(noodles);

        for (int i = 0; i < noodles.size(); i++) {
            System.out.print(noodles.get(i) + " ");
        }
    }
}
