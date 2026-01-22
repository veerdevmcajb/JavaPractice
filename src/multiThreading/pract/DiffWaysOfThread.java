package multiThreading.pract;

public class DiffWaysOfThread  extends Thread{

    public void run(){
        System.out.println("User thread is running extend Thread");
    }
}

class  MyRunnable implements Runnable{

    public void run(){
        System.out.println("User thread is running implements Runnable");
    }
}

class ThreadDemo{
    public static void main(String[] args) {

        // creating Thread class obj by passing ananomous
        new Thread(new DiffWaysOfThread()).start();
        new Thread(new MyRunnable()).start();
    }
}
