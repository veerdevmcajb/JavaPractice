package multiThreading.pract;

public class Join {

    public static void main(String[] args) throws InterruptedException{
        System.out.println("S");
        Thread.sleep(1000);
        System.out.println("H");
        Thread.sleep(2000);
        System.out.println("I");
        Thread.sleep(5000,500);
        System.out.println("V");
    }
}
