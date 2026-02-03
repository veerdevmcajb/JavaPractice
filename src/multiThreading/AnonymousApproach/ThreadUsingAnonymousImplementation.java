package multiThreading.AnonymousApproach;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Wroking with Threads using Anonymous Implementation
public class ThreadUsingAnonymousImplementation {

    public static void main(String[] args) {
        //Anonymous Thread Implementation using Thread
        Thread t1=new Thread(){
            @Override
            public void run() {
                System.out.println("run() logic 1 ");
            }
        };
        t1.start();

        Runnable r=new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous Thread implementation using Runnable ");
            }
        };
        Thread t2=new Thread(r); // we can't create a interface obj so we create a obj of Thread class
                                // passing r obj inside thread constructor.
        t2.start();

        Callable c=new Callable() {
            @Override
            public Object call() throws Exception {
                System.out.println("Call () from Callable ");
                return null;
            }
        };
       ExecutorService exService = Executors.newFixedThreadPool(1);
        exService.submit(c);
        exService.shutdownNow();
    }
}
