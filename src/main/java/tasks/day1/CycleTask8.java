package main.java.tasks.day1;

/*
8) найти минимальный элемент массива и вывести результат в консоль
 */

public class CycleTask8 {
    public void printMinElement() {
        System.out.println();
        int[] array = {50, -1, 10, -500, 1};
        System.out.println("Task #8: ");

        int min = array[0];
        for(int i = 0; i < array.length; i++){
            if(min>array[i])
                min = array[i];
        }

        System.out.println(min);

    }
}
