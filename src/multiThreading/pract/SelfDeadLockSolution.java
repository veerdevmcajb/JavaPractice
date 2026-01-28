package multiThreading.pract;

public class SelfDeadLockSolution {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Main Thread Started");

        Thread child=new Thread();
        String name=child.getName();
        for(int i=1;i<=5;i++){
            System.out.println(i+" by "+ name +"thread");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        child.start();
        child.join();
        System.out.println("Main Thread Ended");
    }
}
