package CycleTask;

/*
10) отсортировать элементы массива в порядке убывания (любым способом) и
    вывести результат в консоль
 */

public class CycleTask10 {
    public static void ctMethod10() {
        System.out.println();
        int[] array = {80, 50, 1, 17, 99, -100, 0};
        System.out.println("Task #10: ");

        /* -------------------------------------------- */
        /* NEED TO CHECK AGAIN - Why do I get 1 17 50 in the console? */


        /*for(int i = 0; i < array.length; i++){

            int min = array[i];
            int minFirst = i; // first is minimal

            for (int j = i + 1; j < array.length; j++){ // need to check whether the min is the smallest one
                if(array[j] < min){
                    min = array[j];
                    minFirst = j;
                }
            }
            if (i != minFirst){ //swap the min elements if the smallest one was found
                int e = array[i];
                array[i] = array [minFirst];
                array[minFirst] = e;
                System.out.print(array[i] + " ");
            }
        }*/
        /* -------------------------------------------- */

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


