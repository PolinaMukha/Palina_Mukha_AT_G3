package main.java.tasks.day1;

/*
5) вывести в консоль все элементы массива в обратном порядке
 */


public class CycleTask5 {
    public void printArrayElementsInReverse() {
        int[] array = {50, 25, 10, 18, 1};//
        System.out.println();
        System.out.println("Task #5: ");

        for (int i = array.length-1; i >= 0; i--) {
                System.out.print(array[i] + " ");
            }
        System.out.println();
        }

    }


