package Interface;


public interface Bank { // interface are by default abstract
    int limit=40000;    // public static final
    void roi();         // public abstract
}

class AxisBank implements Bank{
    public void roi(){
        System.out.println("Axis bank ROI withdraw limit is :"+ Bank.limit);
    }
}

class Sbi implements Bank{
   public void roi(){
       System.out.println("SBI bank ROI Withdraw limit is :"+ Bank.limit);
    }
}

class TestClient{

        void info(Bank b){
            b.roi();
        }

    public static void main(String[] args) {

            TestClient t = new TestClient();
            t.info(new AxisBank());
            t.info(new Sbi());

        System.out.println("*****************");

        AxisBank ax=new AxisBank();
        ax.roi();

        Sbi s=new Sbi();
        s.roi();
    }

}