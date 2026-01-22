package Constructor;

public class Test {
    int num1;
    int num2;

    Test(int num1,int num2){
        this.num1=num1;
        System.out.println(num1 + " is num1");
        this.num2=num2;
        System.out.println(num2 + " is num2");
    }

    void add(){
        System.out.println("addition is "+ (num1+num2));
    }

    void mul(){
        System.out.println("Mul is " +(num1 * num2));
    }

    void div(){
        System.out.println("Div is "+ (num1 / num2));
    }

    public static void main(String[] args) {
        Test t=new Test(20,10);
            t.add();
            t.mul();
            t.div();

            Test t1=new Test(40,5);
            t1.add();
            t1.mul();
            t1.div();
    }
}
