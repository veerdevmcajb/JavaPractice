package multiThreading;

class VolatileDemo {

    volatile boolean running = true;

    public static void main(String[] args) throws Exception {

        VolatileDemo obj = new VolatileDemo();

        Thread worker = new Thread(() -> {
            while (obj.running) {
                // working
                System.out.println("Working..");
            }
            System.out.println("Worker stopped");
        });

        worker.start();

        Thread.sleep(100);
        obj.running = false;
    }
}
