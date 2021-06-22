package main.java.tasks.day2;

/*
12) написать метод, который вернет целочисленный массив, состоящий только из тех элементов исходного целочисленного
    массива, которые больше, чем число n, где n - целое число, передаваемое в сигнатуру этого метода, элементы
    в результирующем массиве должны быть расположены в обратном порядке
 */

import java.util.Random;

public class IntegerArrayReverse {

    public static final int n = 5;

    public static void printIntegerArrayReverse(int n) {
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
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] > n) {
                arrayRevers[i] = array[i];
                System.out.print(arrayRevers[i] + " ");
            }
        }
        System.out.println();
        System.out.println();
    }
}

