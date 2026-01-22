package multiThreading.pract;

public class ThreadPriority extends Thread{
    public void run(){
        System.out.println("Current Thread name "+Thread.currentThread().getName());
        System.out.println("Current Thread priority "+Thread.currentThread().getPriority());
        System.out.println("Current Thead id "+ Thread.currentThread().getId());
    }

    public static void main(String[] args) {
        ThreadPriority t1=new ThreadPriority();
        ThreadPriority t2=new ThreadPriority();
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t1.isAlive());
        t1.start();
        t2.start();
        System.out.println(t1.isAlive());

    }
}
