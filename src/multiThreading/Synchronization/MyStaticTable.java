package multiThreading.Synchronization;

public class MyStaticTable {

    public static synchronized void printTable(int num){

        for(int i=1;i<=10;i++){
            System.out.println(num+" x "+ i+" = "+(num*i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread is Interrupted");
            }
        }
        System.out.println("----------------------");
    }
}

class StaticSynchronization{

    public static void main(String[] args) {

        Thread t1=new Thread()
        {
            @Override
            public void run() {
                MyStaticTable.printTable(5);
            }
        };

        Thread t2=new Thread()
        {
            @Override
            public void run() {
                MyStaticTable.printTable(10);
            }
        };

        Thread t3=new Thread()
        {
            @Override
            public void run() {
                MyStaticTable.printTable(15);
            }
        };

        Thread t4=new Thread()
        {
            @Override
            public void run() {
                MyStaticTable.printTable(20);
            }
        };

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
