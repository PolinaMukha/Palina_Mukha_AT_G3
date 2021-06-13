package CycleTask;

/*
2) используя for вывести в консоль каждое нечетное число от 3 до 19 включительн
 */

public class CycleTask2 {
    static void ctMethod2() {
        int[] array = new int[21];
        System.out.print("Task #2: ");

        for (int i = 3; i <= 20; i++) {
            if (i <= array.length - 1) {
                array[i] = i + 1;
                System.out.print(i + " ");
                i++;
            }
        }
        System.out.println();
    }
}
