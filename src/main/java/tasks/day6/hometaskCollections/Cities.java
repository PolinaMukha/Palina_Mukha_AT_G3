package main.java.tasks.day6.hometaskCollections;

import java.util.ArrayList;
import java.util.List;

public class Cities {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("Минск");
        cities.add("Москва");
        cities.add("Берлин");

        for (String c : cities) {
            System.out.println(c + " ");
        }
        System.out.println("---------");

        String sum = "";
        for (int i = 0; i < cities.size(); i++) {
            sum += cities.get(i);
        }

        int counter = 0;
        for (int i = 0; i < sum.length(); i++){
            counter++;
        }
        System.out.println(counter);

        for (int i = 0; i < cities.size(); i++){
            System.out.print(cities.get(i) + " ");
        }
    }
}
