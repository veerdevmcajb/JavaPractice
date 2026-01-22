package Constructor;

public class Customer {
    String cname;
    int pid;
    int pcost;
    int quantity;
    static final double gst=10;
    static final String brand="honeywell";
    static  final int discount=5;

    Customer(String cname, int pid,int pcost,int quantity){
        this.cname=cname;
        this.pid=pid;
        this.pcost=pcost;
        this.quantity=quantity;
    }

void totalBill(){
    double discount =pcost*0.05;
    double afterDiscount= pcost - discount;

    double withgst= afterDiscount *0.10;

    double finalAmount = afterDiscount + withgst;

    System.out.println("Customer Name :"+cname);
    System.out.println("Product id is : "+pid);
    System.out.println("Product cost is : "+pcost);
    System.out.println("Product quentit is : "+quantity);
    System.out.println("Discount 5% "+ discount);
    System.out.println("after discount Amount : "+ afterDiscount);
    System.out.println("gst 10% :"+ withgst);
    System.out.println("Final Bill is : "+ finalAmount);
}

    public static void main(String[] args) {
        Customer c=new Customer("Veer",101,500,1);
        c.totalBill();
    }
}
