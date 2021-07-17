package main.java.tasks.day8.ConcurentThread;

public class CounterMonitorThread {
    static int j;

    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();

        Thread t1 = new Thread(() -> {
            synchronized (lock) {
                for (int i = 0; i < 1_0_000; i++) {
                    j++;
                }
            }
        });
        Thread t2 = new Thread(() -> {
            synchronized (lock) {
                for (int i = 0; i < 1_0_000; i++) {
                    j--;
                }
            }
        });
        t1.start();
        t2.start();
        t2.join();
        System.out.println(j);
    }
}

