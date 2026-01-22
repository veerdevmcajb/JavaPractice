package multiThreading.pract;

public class DaemonThread  extends Thread{
     void message(String str){
         try{
             System.out.println("Message "+ str);
             Thread.sleep(1000);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
     }

    public void run(){
        if(Thread.currentThread().isDaemon()){
            while (true){
                message("Print Hi Shiv..");
            }
        }
    }
}

class DaemonDemo{
    public static void main(String[] args) {
        DaemonThread t=new DaemonThread();
        t.setDaemon(true); // setting daemon nature to thread
        t.start();
        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
            System.out.println("main Thread compleated");
        }
    }
}
