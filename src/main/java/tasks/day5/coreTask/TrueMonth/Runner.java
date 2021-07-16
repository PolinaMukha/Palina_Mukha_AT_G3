package main.java.tasks.day5.coreTask.TrueMonth;

import main.java.tasks.day5.coreTask.TrueMonth.PrintNextMonth;

import java.util.Scanner;
import static main.java.tasks.day5.coreTask.TrueMonth.PrintNextMonth.printNextMonth;

/*
- Написать метод, который выводит следующий месяц от заданного во входном параметре.
  Входной параметр ввести с клавиатуры.
 */

public class Runner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String month = scanner.nextLine();
            if (month.equalsIgnoreCase("qw")) {
                return;
            } else {
                System.out.println(printNextMonth(month));
            }
        }
    }
}

