package multiThreading.pract;


// sleep() and interept() methods

public class Natha extends Thread{
    public void run(){
        System.out.println(currentThread().getName());
        System.out.println("I am ready for interview");
        for(int i=1;i<=3;i++){

        System.out.println("This is my "+i+"interview");
        }
        System.out.println("I got placed");

        try{
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Some one distrub my sleep");
        }

        System.out.println("Time to go to office");
    }

    public static void main(String[] args) {
        Natha n=new Natha();
        Thread t=new Thread(n);
        t.start();
        t.interrupt();
    }
}


/**
 *  interept() will act only if the thread is in the sleeping state.
 *  if there is no thread is in sleeping state then the interept will wait until the thread went into sleeping state.
 *   in entire prog if there is no thread is in sleeping state then no impact of interept () on prog.
 */
