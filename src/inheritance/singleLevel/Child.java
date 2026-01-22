package inheritance.singleLevel;

public class Child extends Parents {

    int i=00,j=200; // variable with different names this,super is not required.


    Child(){
        // compiler add the super Keyword to call parent constructor.
    }

    void add(int x,int y){
        System.out.println(x+y);
        System.out.println(i+j);
        System.out.println(a+b);
    }
    void lessMoney(){
        System.out.println("10 lakh money");
    }
    public static void main(String[] args) {
            Parents p=new Parents();
            p.moreMoney();

        System.out.println("*******************");
            Child c=new Child();
            c.moreMoney();
            c.lessMoney();
            c.add(200,300);
    }
}
