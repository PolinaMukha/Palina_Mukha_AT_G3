package main.java.tasks.day8.ConcurentThread;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SynchrConcurThread {
    static int j;

    public static void main(String[] args) throws InterruptedException {
        Map<Integer, Integer> myMap = new ConcurrentHashMap<>();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1_0_000; i++) {
                myMap.put(i, i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1_0_000; i++) {
                myMap.forEach((k, v) -> j += v);
            }
        });

        t1.start();
        t2.start();
        t2.join();
        Thread.sleep(100);
        System.out.println(j);
    }
}
