package multiThreading;
/*     - we have 3 types of threads in java
        1) Default Thread created by jvm which is main Thread
        2) User define Threads (Thread class, Runnable interface, Callable interface)
        3) Daemon Threads

    - The Thread which runs in the background is called as Daemon thread. ex.Garbage Collector .
    - Daemon threads are also called as low priority Threads.
    - We can make our thread as Daemon using setDaemon()method
    - When JVM reaches end of main method it will terminate our prog.
    - if jvm found Daemon Thread running it terminates that daemon Thread
        and shoutdown thr program.
    - JVM will not be care about Daemon Thread .
* */
public class DaemonEx implements Runnable{
    @Override
    public void run() {
        if(Thread.currentThread().isDaemon()){
            System.out.println("Daemon Thread is execute");
            System.out.println("hi");
        }else {
            System.out.println("Normal Thread execute");
        }
    }

    public static void main(String[] args) {
        System.out.println("Main Started");
        DaemonEx d=new DaemonEx();
        Thread t=new Thread(d);
        t.setDaemon(true);
        t.start();
        System.out.println("Main Ended");
    }
}
