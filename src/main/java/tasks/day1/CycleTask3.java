package main.java.tasks.day1;

import java.util.Random;

/*
3) создать пустой массив типа int и размера n = 7 и заполнить его случайными
элементами используя Random.nextInt
 */


public class CycleTask3 {
    public static void printRandom() {
        int[] array = new int[7];
        Random random = new Random();
        System.out.println("Task #3: ");

        int i;
        for (i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        int count = 0;
        for (int b : array) {
            System.out.println("Element [" + count++ + "] is " + b);
        }
        System.out.println();
    }
}

