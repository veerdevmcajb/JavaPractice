package multiThreading.pract;

public class DiffThrDiffTask extends Thread{
    @Override
    public void run() {
        System.out.println("Natha Task "+Thread.currentThread().getName());
    }
}
class MyThr2 extends Thread{
    public void run(){
        System.out.println("Vijay Task "+ Thread.currentThread().getName());
    }
}
class MyThr3 extends Thread{
    public void run(){
        System.out.println("Bablu Task "+ Thread.currentThread().getName());
    }
}

class TestThrs {
    public static void main(String[] args) {
        DiffThrDiffTask t1=new DiffThrDiffTask();
        MyThr2 t2=new MyThr2();
        MyThr3 t3=new MyThr3();

        t1.start();
        t2.start();
        t3.start();
    }
}

// output
//Bablu Task Thread-2
//Natha Task Thread-0
//Vijay Task Thread-1
