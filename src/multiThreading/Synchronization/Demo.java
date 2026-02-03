package multiThreading.Synchronization;

// Synchronized means -> Thread safe only one Thread can access the obj at a one time.
// non-Synchronized mean -> Not Thread safe multiple Threads can access the object at a time
//if multiple Threads can access the same obj at a same time then there is a chance
// of getting data inconsistency problem.
// To avoid data inconsistency problem. we need to use Synchronized concept.
// By using synchronization we cnn achieve Thread safety but it will slow down our execution process.

public class Demo implements Runnable{

    // Method level Synchronized
    public synchronized void printNums(){
        for(int i=1;i<=10;i++){
            System.out.println(Thread.currentThread().getName() + " "+ i);
            try{

            Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public  void run(){
        printNums();
    }

    public static void main(String[] args) {
        Demo obj=new Demo();
        Thread t1=new Thread(obj);
        Thread t2=new Thread(obj);
        t1.start();
        t2.start();
    }
}


