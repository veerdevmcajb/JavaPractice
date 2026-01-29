package multiThreading.AnonymousApproach;

import multiThreading.MyRunnable;

//Case 3 : Creating Thread with Anonymous approach using Runnable

public class AnonymousRunnable {

    public static void main(String[] args) {
        Runnable r1=new Runnable() {
            @Override
            public void run() {
                Thread t=Thread.currentThread();
                System.out.println("Name is "+t.getName()+" from AnonymousRunnable");
                System.out.println("Id is : "+t.getId());
            }
        };
        Thread t1=new Thread(r1);
        t1.start();
    }
}
