package multiThreading.pract;

// using Runnable Interface

public class MyThread2Approach implements Runnable{

    //Override run method to write logic of Thread.
    public void run(){
       for(int i=0;i<10;i++){
           System.out.println("User define Thread using Runnable Interface."+ Thread.currentThread().getName());
       }
    }
}

class Test{
    public static void main(String[] args) //main Thread Started
    {
        MyThread2Approach obj=new MyThread2Approach();  // Mt Thread is created
        Thread t=new Thread(obj);   // we are passing a obj in Thread class constructor.
        Thread t1=new Thread(obj);
        t.start();  // MyThread execution start
        t1.start();
    }
}
