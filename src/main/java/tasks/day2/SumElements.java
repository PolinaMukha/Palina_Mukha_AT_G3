package main.java.tasks.day2;

/*
11) написать метод, который подсчитает сумму каждого n-ого элемента в целочисленном массиве,
    где n - целое число, передаваемое в сигнатуру этого метода
 */

import java.util.Random;

public class SumElements{

    public static final int n = 5;

    public void sumElements(int n) {
        int[] array1 = new int[25];
        Random random = new Random();
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(25);
        }

        for (int i : array1) {
            System.out.print(i + " ");
        }
        System.out.println();

        int[] arrayRevers = new int[25];

        int e = 0;
        for (int i = 0; i < array1.length; i++) {
            if ((i + 1) % n == 0) {
                System.out.print(array1[i] + " ");
                e = array1[i] + e;
            }
        }
        System.out.println(e);
    }
}










