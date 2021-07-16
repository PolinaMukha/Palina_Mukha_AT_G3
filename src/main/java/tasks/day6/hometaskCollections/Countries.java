package main.java.tasks.day6.hometaskCollections;

import java.util.ArrayList;
import java.util.List;

public class Countries {
    public static void main(String[] args) {
        List<String> countries = new ArrayList<>();
        countries.add("Андора");
        countries.add("Португалия");
        countries.add("Англия");
        countries.add("Замбия");

        for (String c : countries) {
        }

        countries.replaceAll(String::toString);
        System.out.println(countries);

        int counter = 0;
        for (int i = 0; i < countries.size(); i++) {
            if (countries.get(i).length() < 7) {
                countries.remove(i);
                i = i - 1;
                counter++;
            }
        }
        System.out.println(counter);

        countries.add("Андора");
        countries.add("Англия");
        countries.add("Замбия");
        for (int i = 0; i < countries.size(); i++) {
            System.out.println(countries.get(i));
        }
    }
}

