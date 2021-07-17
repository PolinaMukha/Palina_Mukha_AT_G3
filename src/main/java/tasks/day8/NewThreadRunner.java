package main.java.tasks.day8;

import java.util.stream.IntStream;

public class NewThreadRunner {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            IntStream.range(1, 10).forEach(i -> System.out.println("t1:" + i));
            Thread.yield();
        });

        Thread t2 = new Thread(() -> {
            IntStream.range(1, 10).forEach(i -> System.out.println("t2:" + i));
        });

        Thread t3 = new Thread(() -> {
            IntStream.range(1, 10).forEach(i -> System.out.println("t3:" + i));
        });

        t1.start();
        t2.start();
        t3.start();
    }
}
