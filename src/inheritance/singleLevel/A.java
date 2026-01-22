package inheritance.singleLevel;

public class A {
    int a=10,b=20;  //variables with same names then this,super required
}

class B extends A{
int a=100, b=200;

void add(int a,int b){
    System.out.println(a+b);
    System.out.println(this.a+this.b);
    System.out.println(super.a+super.b);
}

    public static void main(String[] args) {
        B obj=new B();
        obj.add(25,25);
    }
}
