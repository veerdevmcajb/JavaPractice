package abstraction;

abstract public class Operations {
    abstract void add(int a,int b);
    abstract void mult(int a,int b);
}

abstract class Dev1 extends Operations{
    void add(int a, int b){
        System.out.println(a+b);
    }
}

class Dev2 extends Dev1{
    void mult(int a,int b){
        System.out.println(a*b);
    }
}

class TestClient{
    public static void main(String[] args) {
        Dev2 d=new Dev2();
        d.add(10,20);
        d.mult(10,5);
    }
}
