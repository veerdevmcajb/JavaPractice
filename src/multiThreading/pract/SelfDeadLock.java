package multiThreading.pract;

public class SelfDeadLock {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Main thread Started");
        Thread thread=Thread.currentThread();
        String name=thread.getName();
        System.out.println("Name is : "+ name);

        for(int i=1;i<=5;i++){
            System.out.println(i+" by "+ name +"thread");
            Thread.sleep(1000);
        }
        thread.join(); // deadLock --> main Thread waiting for itself to terminate

        System.out.println("Main thread Ended.."); // it will never execute
    }
}
