package multiThreading.pract;

// deadlock in multiThreading
//Thread 1 holds lock1 and waits for lock2
//Thread 2 holds lock2 and waits for lock1
//Both wait forever → deadlock

//A deadlock occurs when two or more threads are blocked forever,
//each waiting for a resource held by another thread. As a result, none of the threads can proceed.

public class ClassDeadLock {

    public static void main(String[] args) {

        final String A="java";
        final String B="python";

        Thread t1=new Thread()
        {
            public void run()
            {
                synchronized (A)    //java  Thread 1 is holding java
                {
                    System.out.println("Thread 1 locked on A");
                    try{
                        Thread.sleep(100);
                    }
                    catch (Exception e)
                    {
                        e.printStackTrace();
                    }
                    // waiting for B

                    synchronized (B)
                    {
                        System.out.println("Thread 1 locked on B");
                    }
                    System.out.println("no dead lock");
                }
            }
        };

        Thread t2=new Thread()
        {
            public void run()
            {
                synchronized (B)
                {
                    System.out.println("Thread 2 locked on B");
                    try{
                        Thread.sleep(100);
                    }
                    catch (Exception e)
                    {
                        e.printStackTrace();
                    }

                    // waiting for A
                    synchronized (A)
                    {
                        System.out.println("Thread 2 locked in A");
                    }
                }
                System.out.println("no dead lock");
            }
        };

        t1.start();
        t2.start();
    }
}
