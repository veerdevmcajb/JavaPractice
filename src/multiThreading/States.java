package multiThreading;

public class States extends Thread{
    public void run(){
        System.out.println("Running"); // Running
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        States t1=new States();
        System.out.println(t1.getState());  // New
        t1.start();
        System.out.println(t1.getState()); // Runnable / Ready
        Thread.sleep(200);
        System.out.println(t1.getState()); // Waiting
        t1.join();
        System.out.println(t1.getState()); // Terminated. / Dead
    }
}
