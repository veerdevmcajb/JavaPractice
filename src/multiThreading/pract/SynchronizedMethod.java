package multiThreading.pract;

public class SynchronizedMethod extends Thread{

    public void run(){
        criticalResource();
    }

   synchronized void criticalResource(){
        String name=Thread.currentThread().getName();
        System.out.println(name + "has entered the method");
        for(int i=1;i<=5;i++){
            System.out.println(name + " is executing "+i);
        }
        System.out.println(name + " completed the execution");
    }

    public static void main(String[] args) {
        SynchronizedMethod obj=new SynchronizedMethod();
        Thread t1= new Thread(obj);
        Thread t2= new Thread(obj);
        t1.setName("first-thread");
        t2.setName("second-thread");

        t1.start();
        t2.start();
    }
}
