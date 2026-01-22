package multiThreading;


// create a three threads it prints below message
//Good Morning... Thread-0
//Good Morning... Thread-0
//Good Morning... Thread-0
//Good Morning... Thread-1
//Good Morning... Thread-1
//Good Morning... Thread-1
//Good Morning... Thread-2
//Good Morning... Thread-2
//Good Morning... Thread-2

import java.lang.Runnable;

public class Prog3 implements Runnable {

    public void run(){
        for(int i=1;i<=3;i++){
            System.out.println("Good Morning "+Thread.currentThread().getName());
            try{Thread.sleep(1000);}
            catch (InterruptedException e){
                    e.printStackTrace();
                }
        }
    }
}

class Test3{
    public static void main(String[] args) throws Exception {
        Prog3 p1=new Prog3();
        Thread obj=new Thread(p1);
        obj.start();
        obj.join();
        Thread obj1=new Thread(p1);
        obj1.start();
        Thread obj2=new Thread(p1);
        obj2.start();
//        Prog3 p2=new Prog3();
//        Prog3 p3=new Prog3();
//        p1.start();
//        p1.join(); // wait for this thread to die.
//        p2.start();
//        p2.join();
//        p3.start();




//        Prog3 p1=new Prog3();
//        for(int i=1;i<=3;i++){
//            System.out.println("Good Morning... "+ (p1.getName()));
//        }
//
//        Prog3 p2=new Prog3();
//        for(int i=1;i<=3;i++){
//            System.out.println("Good Morning... "+ (p2.getName()));
//        }
//
//        Prog3 p3=new Prog3();
//        for(int i=1;i<=3;i++){
//            System.out.println("Good Morning... "+ (p3.getName()));
//        }

    }
}
