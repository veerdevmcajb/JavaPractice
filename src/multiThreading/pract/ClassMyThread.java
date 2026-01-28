package multiThreading.pract;

public class ClassMyThread extends Thread{

    public void run(){
        for(int i=1;i<=5;i++){
            try {

                Thread.yield(); //-> yield method pause the execution and give the chance to execute to another Thread. based on priority.
                //Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Thread has Interrupted");
            }
            System.out.println(i+" by "+Thread.currentThread().getName());
        }
    }
}

class ClassSleepDemo{

    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());

        ClassMyThread t1=new ClassMyThread();
        ClassMyThread t2=new ClassMyThread();
        ClassMyThread t3=new ClassMyThread();
       t1.setName("Child1"); // --> using setName () we can give a name to thread.
       t2.setName("Child2");
       t3.setName("Child3");
       t1.setPriority(7); // give the priority to Thread between 1 -10.
       t2.setPriority(9);
       t1.start(); // start () call the run() automatically.
        //t1.join(); // join() method stop the execution of Other Thread and executed the current Thread.
        t2.start();
        //t2.join(); // wait until this thread finish their execution.
        t3.start();
    }
}
