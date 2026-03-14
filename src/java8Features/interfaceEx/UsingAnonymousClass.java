package java8Features.interfaceEx;

interface Add {
    int add(int a, int b);
    int sub(int c,int d);
    void display();
}

public class UsingAnonymousClass {

    public static void main(String[] args) {
        Add obj = new Add() {
            @Override
            public int add(int a, int b) {
                return a + b;
            }

            @Override
            public int sub(int c, int d) {
                return c-d;
            }

            @Override
            public void display() {
                System.out.println("Display Method called...");
            }
        };

        System.out.println(obj.add(5,8));
        System.out.println(obj.sub(10,3));
        obj.display();
    }
}
