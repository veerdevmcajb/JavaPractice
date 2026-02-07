package multiThreading;

// Create a Three thread it prints below msg
//Good Morning...Ratan
//Good Morning...Ratan
//Good Evening...Rohit
//Good Evening...Rohit
//Good Evening...Rohit
//Good Night...Rani
//Good Night...Rani
//Good Night...Rani

public class Prog4 extends Thread{
    @Override
    public void run() {
        for(int i=1;i<=3;i++){
            System.out.println("Good Morning..."+ Thread.currentThread().getName());
        }
    }
}

class Test4{
    public static void main(String[] args) throws InterruptedException {
        Prog4 obj=new Prog4();
        obj.setName("ratan");
        obj.start();
        obj.join();
        Thread t1=new Thread(obj);
        t1.setName("Rohit");
        t1.start();

        Thread t2=new Thread(obj);
        t2.setName("Rani");
        t2.start();



    }
}