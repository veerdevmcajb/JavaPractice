package multiThreading;

// Program to assign different targets by using different threads :

public class UserThread implements Runnable{
    public void run(){

        Thread t=Thread.currentThread();
        System.out.println("This is : "+t.getName());
        System.out.println("My id is : "+t.getId());
    }
}

class RunnableDemo{
    public static void main(String[] args) {

        Thread t1=Thread.currentThread();
        System.out.println("This is : "+t1.getName());
        System.out.println("My Id is : "+ t1.getId());

        Thread tn=new Thread(new UserThread(),"child1");
        tn.start();

        Thread tr=new Thread(new Ravi(),"Ravi");
        tr.start();

        Thread ta=new Thread(new Akash(),"Akash");
        ta.start();

    }
}
