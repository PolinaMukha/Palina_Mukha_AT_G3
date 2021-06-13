package CycleTask;

/*
6) каждый элемент массива умножить на 5 и вывести результат в консоль
 */

public class CycleTask6 {
    public static void ctMethod6() {
        int[] array = new int[21];
        System.out.println();
        System.out.print("Task #6: ");

        for (int i = 0; i <= 20; i++) {
            if (i <= array.length - 1) {
                array[i] = i;
                int a = i * 5;
                System.out.print(a + " ");
                //i++;
            }
        }
        System.out.println();
    }
}
