package multiThreading.pract;

public class MyThread extends Thread{

    // overriding run method form thread class
    public void run(){
        for(int i=0;i<10;i++){
        System.out.println("User define thread"+ Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        // creating user define class object
        MyThread t=new MyThread();
        MyThread t1=new MyThread();

        // start the thread execution using start() method
        t.start();  // start method responsiblity-> register a thread into Thread sheddular. & start() automatically call run().
        t1.start();
        // when user define thread is register in the shedular only then it is considered as thread is born/created.

        // t.start(); // we cant start thread twice -> IllegalThreadStateException.
//        for(int i=0;i<10;i++){
//            System.out.println("Main thread");
//        }
    }
}


/*  life cycle stages of Thread
    1) New thread -->    MyThread t=new MyThread();
    2) Ready -->         t.start();
    3) Running -->       The  Thread is running state means the run() is executed.
    4) Blocked / Waiting /non-running mode --> got interrupted or goes to sleeping state a
    5) Dead state  --> run() excution over thread goes dead state.
*
* */