package multiThreading;

public class Prog9 implements Runnable{
   int table;
   Prog9(int table){
       this.table=table;
   }

    @Override
    public void run() {

        for(int i=1;i<=10;i++){
            try {
                Thread.sleep(1000);
                System.out.println(table*i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class ProgMain {

    public static void main(String[] args) {
        Prog9 obj = new Prog9(2);
        Thread t=new Thread(obj);
        t.start();
    }
}
