package lambdaExpression;

public interface Operations {
    void add(int num1,int num2);
}

class TestOperations{
    public static void main(String[] args) {
        Operations op1=(int num1,int num2)-> {System.out.println(num1+num2) ;
            System.out.println("Hello");};
        op1.add(45,18);

        Operations op2=(num1,num2)-> System.out.println(num1+num2);
        op2.add(100,200);

        op2.add(50,10);
    }

}
