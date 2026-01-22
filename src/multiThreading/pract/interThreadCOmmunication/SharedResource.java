package multiThreading.pract.interThreadCOmmunication;

public class SharedResource {

     synchronized void waitMethod1(){

         try {
             System.out.println("Thread is waiting...");
             wait();
             System.out.println("Thread is resume");
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
     }

     synchronized void notifyMethod(){
         System.out.println("Notifying Thread...");
         notify();
     }
}

class InterThreadComm{
    public static void main(String[] args) {
        SharedResource sobj=new SharedResource();
            Thread t1= new Thread(()->sobj.waitMethod1());
            Thread t2=new Thread(()->sobj.notifyMethod());
            t1.start();
            try {
                Thread.sleep(1000); // ensure wait() is called first
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        t2.start();

    }
}
