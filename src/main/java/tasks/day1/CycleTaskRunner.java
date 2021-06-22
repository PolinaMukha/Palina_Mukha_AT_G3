package main.java.tasks.day1;

/*

1. CycleTask (для него создаем отдельный пакет и каждое подзадание делаем в отдельном классе,
   запускаем в отдельном классе CycleTaskRunner)
    1) используя while вывести в консоль все числа от 0 до 20 в 1 строку через пробел
    2) используя for вывести в консоль каждое нечетное число от 3 до 19 включительно
    3) создать пустой массив типа int и размера n = 7 и заполнить его случайными
       элементами используя Random.nextInt
    4) пройти по массиву и вывести в консоль все элементы
    5) вывести в консоль все элементы массива в обратном порядке
    6) каждый элемент массива умножить на 5 и вывести результат в консоль
    7) каждый элемент массива возвести в квадрат и вывести результат в консоль
    8) найти минимальный элемент массива и вывести результат в консоль
    9) поменять местами первый и последний элементы и вывести результат в консоль
    10) отсортировать элементы массива в порядке убывания (любым способом) и
        вывести результат в консоль
 */

public class CycleTaskRunner {

    public static void main(String[] args) {

        new CycleTask1().printAllNumbers();

        new CycleTask2().printEveryOddNumber();

        new CycleTask3().printRandom();

        new CycleTask4().printRandom();

        new CycleTask5().printArrayElementsInReverse();

        new CycleTask6().multiplyElementBy5();

        new CycleTask7().squareElement();

        new CycleTask8().printMinElement();

        new CycleTask9().swapElements();

        new CycleTask10().sortElementsInDesc();

    }
}
