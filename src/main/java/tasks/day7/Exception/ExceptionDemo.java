package main.java.tasks.day7.Exception;

public class ExceptionDemo {
    public static void main(String[] args) throws Exception {

        new ExcClass().doSomething();

        int a = 2;
        int b = 0;

        int[] arr = {1, 2};

        try {
            System.out.println(arr[3]);
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getLocalizedMessage());
        }

        System.out.println("bugaga");

    }
}
