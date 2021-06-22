package main.java.tasks.day2;

/*
13) написать метод, который вернет сумму тех элементов целочисленного массива, которые кратны числу текущего месяца
 */

import java.util.Random;

public class MultiplicityByMonth {
    public static final int n = 6;

    public void sumElementsMultiplicityByMonth(int n) {

        int[] array = new int[25];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(25);
        }

        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

        int[] arrayRevers = new int[25];

        int e = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % n == 0) {
                System.out.print(array[i] + " ");
                e = array[i] + e;
            }
        }
        System.out.println(e);
    }
}
