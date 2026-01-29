package multiThreading;

public class Ravi implements Runnable{
    public void run(){
        Thread t=Thread.currentThread();
        System.out.println("This is : "+ t.getName()+" Thread");
        System.out.println("My id is : "+ t.getId());
    }
}
