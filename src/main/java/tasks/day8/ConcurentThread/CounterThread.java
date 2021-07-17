package main.java.tasks.day8.ConcurentThread;

public class CounterThread {
    static int j;
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1_0_000; i++) {
                j++;
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1_0_000; i++) {
                j--;
            }
        });

        t1.start();
        t2.start();
        t2.join();
        System.out.println(j);
    }
}
