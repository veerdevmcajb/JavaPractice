package multiThreading.Synchronization;

public class ThreadName {

    public void printThreadName(){
        String name=Thread.currentThread().getName();
        System.out.println("Thread inside method is "+ name);

        synchronized (this)
        {
            for(int i=1;i<=10;i++){
                System.out.println("i value is "+ i+ " by "+ name);
            }
            System.out.println("-------------------------");
        }
    }
}

class BlockSynchronization{

    public static void main(String[] args) {
        ThreadName obj=new ThreadName(); // lock is created

        Runnable r1=()->obj.printThreadName();

        Thread t1=new Thread(r1,"child1");
        Thread t2=new Thread(r1,"child2");
        t1.start();
        t2.start();
    }
}
