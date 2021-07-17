package main.java.tasks.day8;

import java.util.stream.IntStream;

public class ThreadRunner {
    public static void main(String[] args) {
        DemoThread thread = new DemoThread();
        thread.start();

        new Thread(() -> IntStream.range(0, 100).forEach(System.out::println)).start();
    }
}
