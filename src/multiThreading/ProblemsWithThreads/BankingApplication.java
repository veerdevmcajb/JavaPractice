package multiThreading.ProblemsWithThreads;

public class BankingApplication {

    public static void main(String[] args) {
        Customer cust=new Customer(20000);

        Runnable r1=()->{

            String name=null;

            if(cust.withdraw<= cust.balance){
                name=Thread.currentThread().getName();
                System.out.println(cust.withdraw + " is withdraw successfully by "+ name);
                cust.balance= cust.balance - cust.withdraw;
                System.out.println("Current Balance is "+ cust.balance);
            }
            else {
                name=Thread.currentThread().getName();
                System.out.println("Sorry..! "+ name +"insufficient Balance");
            }
        };

        Thread t1=new Thread(r1,"Virat");
        Thread t2=new Thread(r1,"Rohit");
        t1.start();
        t2.start();
    }
}
