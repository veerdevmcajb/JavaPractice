package multiThreading;

public class Testthread extends Thread{

    @Override
    public void run() {
        System.out.println("This is Deammon thread"+ Thread.currentThread().getName());
        for(int i=0;i<3;i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        System.out.println("Main started..");
        Testthread obj=new Testthread();
        Thread t1=new Thread(obj);
       //t1.setDaemon(true);
        t1.start();
       // t1.start();//IllegalThreadStateException

        System.out.println("main ends");
    }
}
