package multiThreading.pract;

public class ThreadYield extends Thread{
    public void run(){

        for(int i=0;i<5;i++){
            Thread.yield();
            System.out.println("Child Thread"+Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        ThreadYield t=new ThreadYield();
        ThreadYield t1=new ThreadYield();
        t.setPriority(5);
        t.setName("Thread 1");
        t1.setName("Thread 2");
        t1.setPriority(7);
        t.start();
        t1.start();
        for(int i=0;i<3;i++){
            System.out.println("Main Thread");
        }
    }
}
