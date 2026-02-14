package multiThreading;

public class ThreadPriority extends Thread {

    ThreadPriority(String name,int priority){
        super(name);
        setPriority(priority);
    }

    @Override
    public void run() {
        System.out.println(getName() + " with priority "+ getPriority() +" is running");
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        ThreadPriority t1=new ThreadPriority("Thread-1",3);
        ThreadPriority t2=new ThreadPriority("Thread-2",7);
        ThreadPriority t3=new ThreadPriority("Thread-3",5);
        ThreadPriority t4=new ThreadPriority("Thread-4",7);
        ThreadPriority t5=new ThreadPriority("Thread-5",2);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}

// Thread with Highest priority selected to run first.
