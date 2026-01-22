package LoopingStatements.whileLoop;

public class Prog1 {

    void meth1(int a){
        System.out.println("v value "+a);
        do{
            System.out.println("a value is "+a);
            a++;
        }while (a<=5);
    }

    public static void main(String[] args) {
        Prog1 obj=new Prog1();
        obj.meth1(1);
    }
}
