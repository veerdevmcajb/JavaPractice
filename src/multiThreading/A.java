package multiThreading;

// process of executing multiple threads simultaneously within a single program.
//A thread is the smallest unit of execution in a program,
// and multithreading allows multiple threads to share the same memory

public class A extends Thread{
    public void run(){
        for(int i=1;i<=3;i++){
            System.out.println("Good Morning"+Thread.currentThread().getName());
        }
    }
}

class B {
    public static void main(String[] args) throws InterruptedException {
        A t=new A();
        t.start();
        System.out.println(t.getId());
        System.out.println(t.isAlive());
        Thread.sleep(1000);
        System.out.println(t.isAlive());    //false
        System.out.println(Thread.activeCount());   //2
    }
}
