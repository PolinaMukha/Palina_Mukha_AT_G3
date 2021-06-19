package main.java.tasks.day1;

/*
1) используя while вывести в консоль все числа от 0 до 20 в 1 строку через пробел
 */

public class CycleTask1 {

      public void printAllNumbers() {
        int[] array = new int[21];
        System.out.print("Task #1: ");

        int i = 0;
        while (i <= 20) {
            array[i] = i + 1;
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
    }
}



