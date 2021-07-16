package main.java.tasks.day6.hometaskCollections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Numbers {
    public static void main(String[] args) {
        Integer numbers[] = new Integer[]{3342, 34, 79, 23426, 68, 1324, 55, 7699};
        List<Integer> list = Arrays.asList(numbers);


        for (Integer n : numbers) {
            System.out.println(n + " ");
        }

        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        System.out.println("Sum  is: " + sum);

        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        System.out.println();
        Collections.reverse(list);
        for (int counter : list) {
            System.out.print(counter + " ");
        }
    }
}
