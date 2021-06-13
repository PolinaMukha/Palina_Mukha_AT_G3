package CycleTask;

/*
7) каждый элемент массива возвести в квадрат и вывести результат в консоль
 */

public class CycleTask7 {
    public static void ctMethod7() {
        int[] array = new int[21];
        System.out.println();
        System.out.print("Task #7: ");

        for (int i = 0; i <= 20; i++) {
            if (i <= array.length - 1) {
                array[i] = i;
                int a = i * i;
                System.out.print(a + " ");
            }
        }
        System.out.println();
    }
}
