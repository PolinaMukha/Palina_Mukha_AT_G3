package main.java.tasks.day1;

/*
10) отсортировать элементы массива в порядке убывания (любым способом) и
    вывести результат в консоль
 */

public class CycleTask10 {
    public void sortElementsInDesc() {
        System.out.println();
        int[] array = {80, 50, 1, 17, 99, -100, 0};
        System.out.println("Task #10: ");


        int e = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) { // the first element is compared with the array's rest
                if (array[i] < array[j]) { // compare and swapping elements
                    e = array[i];
                    array[i] = array[j];
                    array[j] = e;

                }
            }
            System.out.print(array[i] + " ");
        }
    }
}


