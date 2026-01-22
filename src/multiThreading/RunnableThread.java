package multiThreading;

class Natha implements Runnable{

    @Override
    public void run() {
        for (int i=0;i<5;i++){
            try {
                System.out.println(Thread.currentThread().getName()+ " " +"hiiii nnnnabbba");
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println("ghavla re");
            }
        }
    }
}


public class RunnableThread {
    public static void main(String[] args) {
        Natha nt=new Natha();
        Thread th=new Thread(nt,"th-1");
        Thread th1=new Thread(nt,"th-2");

        th.start();
        try {
            th.join();

        }catch (Exception e){
            System.out.println("ghavla re");
        }

        th1.start();


    }
}