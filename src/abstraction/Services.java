package abstraction;

abstract public class Services {
        abstract String login(String userName,String password);
        abstract double totalBill(String productName,double productCost,int productQuantity);
        abstract int add(int num1,int num2);
        abstract void wish();
}

abstract class LoginService extends Services {

    String login(String userName, String password) {
        return ("Login successful for " + userName);
    }
}


abstract class Bill extends LoginService{
    @Override
    double totalBill(String productName,double productCost,int productQuantity){
        System.out.println("Product name is :"+ productName);
        System.out.println("product cost is: "+ productCost);
        System.out.println("Product productQuantity is:"+ productQuantity);
        return (productCost * productQuantity);
    }
}

  class Addition extends Bill {
      int add(int num1, int num2){
        return (num1 + num2);
    }

    void wish(){
        System.out.println("Good Morning");
    }

}


class Main extends Addition{
    public static void main(String[] args) {
       Addition obj=new Addition();
        System.out.println( obj.login("Shiv","1234"));
        System.out.println("Total Bill is " + obj.totalBill("Mouse",450,2));
        System.out.println("Addition is "+ obj.add(25,25));
        obj.wish();


    }
}
