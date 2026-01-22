package multiThreading.pract.interThreadCOmmunication;

public class ClassF {

    int amount=10000;

   synchronized void with_draw(int amount) throws InterruptedException
    {
        if(this.amount<amount)  //1000<15000
        {
            System.out.println("Insufficient Balance");
            wait(5000);
            System.out.println("Amount credited");
            this.amount-=amount;
            System.out.println("With draw Successful \nBalance is "+this.amount);
        }
        else
        {
            this.amount-=amount;
            System.out.println("With draw successful Balance is "+this.amount);
        }
    }
    synchronized void deposite(int amount)
    {
        this.amount+=amount;
        System.out.println("Deposite successfuly \nBalance is "+this.amount);
        //notify();
        //notifyAll();
    }
}
