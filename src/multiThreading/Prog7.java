package multiThreading;

public class Prog7 implements Runnable{
    @Override
    public void run() {
        for(int i=1;i<=5;i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Prog7 obj=new Prog7();

        Thread t=new Thread(obj);
        t.start();
    }
}
