package main.java.tasks.day5;

import java.util.Scanner;

public class MyScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String incoming = scanner.nextLine();
            System.out.printf("Just got '%s' text!", incoming);
            if (incoming.equalsIgnoreCase("Cat")) {
                return;
            }
            System.out.printf("Just got '%s' text!", incoming);
        }
    }
}
