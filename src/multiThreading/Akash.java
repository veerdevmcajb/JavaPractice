package multiThreading;

public class Akash implements Runnable{

    public void run(){
        Thread t=Thread.currentThread();
        System.out.println("This is : "+t.getName());
        System.out.println("My id is : "+t.getId());
    }
}
