package inheritance.multiple;

public class Child implements Parent1,Parent2{

    @Override
    public void money() {
        Parent1.super.money();
        Parent2.super.money();

    }

    public static void main(String[] args) {
        Child c=new Child();
        c.money();
    }
}

