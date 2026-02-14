package multiThreading.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WorkerThread implements Runnable{
    private String message;

    WorkerThread(String message){
        this.message=message;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() +" (Start) message = " );
        processMessage();
        System.out.println(Thread.currentThread().getName()+" (End) ");
    }

    public void processMessage(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        ExecutorService executer= Executors.newFixedThreadPool(5);

        for(int i=0;i<=10;i++){
            Runnable worker=new WorkerThread(" "+i);
            executer.execute(worker);
        }
        executer.shutdown();
    }
}
