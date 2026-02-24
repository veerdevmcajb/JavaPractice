package multiThreading;

import multiThreading.threadPool.WorkerThread;

// Annomous Implementation for the Interface. like Inner Class.

public class Prog8 {

    public static void main(String[] args) {
        Runnable r=new Runnable() {
            @Override
            public void run() {
                for(int i=11;i<=15;i++){
                    System.out.println(i);
                }
            }
        };

        Thread t=new Thread(r);
        t.start();
    }

}
