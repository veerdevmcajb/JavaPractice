package multiThreading.pract;

public class ClassA extends Thread{

    @Override
    public void run() {
        for(int i=0;i<=3;i++){
            System.out.println("Run method executed "+i+Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        System.out.println("Creating a Thread using Thread class ");
        ClassA obj=new ClassA();
         Thread t=new Thread(obj);
         t.start(); //-> A new Thread will be created which is
        // responsible for running the class A run method.

        t.run(); //-> No new thread will be created just run
        // method which is presenting class A will be executed beacuse of oerriding.
       //Thread.run();

         Thread t1=new Thread();
         t1.start(); // it will call a run method which is present in Thread class.
    }
}
