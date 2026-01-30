package multiThreading.callable;

import java.util.concurrent.*;

public class ClassA implements Callable {
    @Override
    public Object call() throws Exception {
        System.out.println("Call() method execute.."+ Thread.currentThread().getName());
        return "Hi";
    }

    public static void main(String[] args) throws Exception {
        ClassA obj=new ClassA();
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for(int i=1;i<=15;i++){
           Future submit= executorService.submit(obj);
            System.out.println(submit.get().toString());
        }
        executorService.shutdownNow();
    }
}

// callable  returns Object
// callable have call method
// using callable we can create a Thread.

// executerService introduced in java 1.5v
// using ExecuterService we can implement multiThreading
// using ExecuterService we can create a thread pool. we can submit task to the pool of Threads.
// ExecuterService will reuse threads available in the thread pull to complete all submitted task.
// execcuterService is assign the taask to the Thread.
// executerService is heighly recomanded for parallal task with multiple Threads service.

//ExecutorService is a concept in java which is used to submit multiple task to a pool of Thread .
