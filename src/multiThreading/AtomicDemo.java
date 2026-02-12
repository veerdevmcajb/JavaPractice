package multiThreading;

import java.util.concurrent.atomic.AtomicInteger;

class AtomicDemo {

    static AtomicInteger count = new AtomicInteger(0);

    public static void main(String[] args) throws Exception {

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                count.incrementAndGet();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                count.incrementAndGet();
            }
        });

        t1.start();
        t2.start();
        t2.run();// if we use run then we can't perform multithreading

        t1.join();
        t2.join();

        System.out.println(count.get());

    }
}
