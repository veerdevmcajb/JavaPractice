package multiThreading.pract;

public class SleepJoinThread extends Thread {

    public void run(){
        for(int i=0;i<5;i++){
            {
                try{ Thread.sleep(2000); }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+" "+i);
            }
        }
    }
}

class DemoSleepJoin{
    public static void main(String[] args) {
        SleepJoinThread t1=new SleepJoinThread();
        SleepJoinThread t2=new SleepJoinThread();
        SleepJoinThread t3=new SleepJoinThread();
        t1.start();
        try {
            t1.join(1000);  // join is used to stop the execution of the thread until complition of some other thread.
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t2.start();


    }
}
