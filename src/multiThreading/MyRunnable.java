package multiThreading;

public class MyRunnable implements Runnable{
    public void run(){
        System.out.println("User define Thread "+ Thread.currentThread().getName());
    }
}

class TestMyRunnable{
    public static void main(String[] args) {
        MyRunnable r=new MyRunnable();
        new Thread(r).start();

        new Thread(new MyRunnable()).start();

        new Thread(()-> System.out.println("Lambda Thread")).start();
    }
}
