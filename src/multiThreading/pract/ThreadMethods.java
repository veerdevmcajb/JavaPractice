package multiThreading.pract;

public class ThreadMethods extends Thread{

    public void run(){
        for(int i=1;i<=3;i++){
            System.out.println("Class A method called");
        }
    }
}


 class ClassB2 extends Thread{
     public static void main(String[] args) throws InterruptedException {
         ThreadMethods obj=new ThreadMethods();
         obj.start();
         //obj.join(1000);
         //join method will stop the execution of other thread until other thread are executed

         Thread.yield();
         for(int i=1;i<=5;i++){
             System.out.println("ClassB method called");
         }
     }
}
