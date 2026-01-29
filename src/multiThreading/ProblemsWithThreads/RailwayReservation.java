package multiThreading.ProblemsWithThreads;

public class RailwayReservation {

    public static void main(String[] args) {

        RailwayCustomer r1=new RailwayCustomer(1);

        Thread t1=new Thread(r1,"Natha");
        Thread t2=new Thread(r1,"Akash");

        t1.start();
        t2.start();

    }
}
