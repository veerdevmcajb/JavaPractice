package Interface;

public interface BankServices {
    void deposit();
    void withdraw();
    void loan();
    void account();
}

abstract class Dev1 implements BankServices{
    public void deposit(){
        System.out.println("deposit services is completed");
    }
}

abstract class Dev2 extends Dev1{
    public void withdraw(){
        System.out.println("successfully Withdrawal ");
    }
}

class Dev3 extends Dev2{
    public void loan(){
        System.out.println("Loan services are avaliable");
    }
    public void account(){
        System.out.println("Account no");
    }
}

class SbiBank{
    public static void main(String[] args) {
       Dev3 obj=new Dev3();
       obj.deposit();
       obj.withdraw();
       obj.account();
       obj.loan();
    }
}

