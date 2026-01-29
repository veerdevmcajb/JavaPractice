package multiThreading.Synchronization;

public class PrintTable {

    public synchronized void printTable(int num){
        for(int i=1;i<=10;i++){
            System.out.println(num +" X "+i+" = "+(num*i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
        }
        System.out.println("-------------------------");
    }
}

class ProblemWithObjectLevelSynchronization {

    public static void main(String[] args) {
        PrintTable pt1=new PrintTable(); // lock 1
        PrintTable pt2=new PrintTable(); // lock2

        Thread t1=new Thread()
        { // anonymous innerclass


            @Override
            public void run() {
                pt1.printTable(5);
            }
        };

        Thread t2=new Thread()
        {
            @Override
            public void run() {
                pt1.printTable(10);
            }
        };

        Thread t3=new Thread(){
            @Override
            public void run() {
                pt2.printTable(15);
            }
        };

        Thread t4=new Thread()
        {
            @Override
            public void run() {
                pt2.printTable(20);
            }
        };

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

/*  So, from the above program it is clear that synchronization will not work with multiple objects.
    Now, to avoid this Static Synchronization is came into the picture.
* */