package main.java.tasks.day6.hometaskCollections;

import java.util.Arrays;
import java.util.List;

public class DoubleNumbers {
    public static void main(String[] args) {
        Double doubleNumbers[] = new Double[]{33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9};
        List<Double> list = Arrays.asList(doubleNumbers);

        for (Double dn : doubleNumbers) {
            System.out.println(dn + " ");
        }

        double multipl = 1.0;
        for (double i : doubleNumbers) {
            multipl = multipl * i;
        }

        System.out.println("Multipl is: " + multipl);

        double sum = 0;
        for (double i : doubleNumbers) {
            sum += Math.ceil(i) - i;
        }
        System.out.println("FractionalSum is: " + sum);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i).intValue() + " ");
        }
    }
}
