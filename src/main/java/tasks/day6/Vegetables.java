package main.java.tasks.day6;

import java.util.ArrayList;
import java.util.List;

public class Vegetables {
    public static void main(String[] args) {
        List<String> vegetables = new ArrayList();
        vegetables.add("Помидор");
        vegetables.add("Огурец");
        vegetables.add("Кабачок");
        vegetables.add("Батат");
        vegetables.add("Картофель");

        for (String n : vegetables) {
            System.out.print(n + " ");
        }
        System.out.println();

        int counter = 0;
        for (String s : vegetables) {
            if (s.contains("а")) {
                counter++;
            }
        }
        System.out.println(counter);

        for (String vegetable : vegetables) {
            System.out.print( vegetable + " ");
        }

        vegetables.remove("Огурец");
        vegetables.remove(3);

        for (String vegetable : vegetables) {
            System.out.println( vegetable + " ");
        }
    }
}