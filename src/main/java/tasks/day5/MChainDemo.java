package main.java.tasks.day5;

public class MChainDemo {
    public static void main(String[] args) {
    method1("Beautiful", 15, true, 8, "Cat");
    }

    private static void method1(String word, int number, boolean condition, int number2, String doubleWord) {
        System.out.println("I'm method1:" + word + " " + number + " " + condition + " " + number2 + " " + doubleWord);
        method2(number, condition, number2, doubleWord);
    }

    private static void method2(int number, boolean condition, int number2, String doubleWord) {
        System.out.println("I'm method2");
        method3(false, 48,"grazie", "Person");
    }

    private static void method3(boolean condition, int number2, String doubleWord, String thirdWord) {
        System.out.println("I'm method3");
        method4("excellent", "wonderland");
    }

    private static void method4(String doubleWord, String thirdWord) {
        System.out.println("I'm method4");
        method5("world", "peace", 78);
    }

    private static void method5(String doubleWord, String thirdWord, int number3) {
        System.out.println("I'm method5");
    }
}
