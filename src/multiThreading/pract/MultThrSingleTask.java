package multiThreading.pract;

public class MultThrSingleTask extends Thread{
    public void run() {
        System.out.println("Hello "+ Thread.currentThread().getName());
    }
}

class ThreadDe {
    public static void main(String[] args) {
        MultThrSingleTask t1=new MultThrSingleTask(); // new Thread created
        MultThrSingleTask t2=new MultThrSingleTask(); // new Thread created
        MultThrSingleTask t3=new MultThrSingleTask(); // new Thread created

        t1.start();
        t1.setName("Natha");    // we can set a name for thread
        System.out.println("t1 thread name "+ t1.getName()); // getName
        t2.setName("Bablu");
        t2.start();
        t3.setName("Nilu");
        t3.start();
    }
}
