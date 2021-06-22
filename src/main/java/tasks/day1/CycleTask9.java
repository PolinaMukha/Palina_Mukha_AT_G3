package main.java.tasks.day1;

/*
9) поменять местами первый и последний элементы и вывести результат в консоль
 */

//use a similar approach as in task 5 and 8

public class CycleTask9 {

    public void swapElements() {
        int[] array = {50, -1, 10, -500, 1};
        System.out.println();
        System.out.println("Task #9: ");

        for (int i = array.length - 1; i >= 0; i--) {

            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}


