package multiThreading.ProblemsWithThreads;
/* Q . Program that describes two threads will book the ticket so,
        multirthreading is not good in all the situations.
* */

public class RailwayCustomer implements Runnable {
    private int availableSeat=1;
    private int wantedSeat;

    RailwayCustomer(int wantedSeat){
        this.wantedSeat=wantedSeat;
    }

    public void run(){
        String name=null;

        if(availableSeat>=wantedSeat){
            name=Thread.currentThread().getName();
            System.out.println(wantedSeat + " is Booked By "+name);
            availableSeat=availableSeat-wantedSeat;
           // System.out.println("availableSeat is "+ availableSeat); // first time i is 0 and 2nd time it will goes to -1
        }
        else {
            name=Thread.currentThread().getName();
            System.out.println("Sorry..! "+ name +" seat is not avaliable..");
        }
    }
}
