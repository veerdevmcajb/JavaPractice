package com.basics.logic;

public class StaticEx {

    int a = 10;
    static int b ;

    static {
        b=20;
        System.out.println(b);

        StaticEx obj = new StaticEx();
        obj.add(obj);
    }

    static void add(StaticEx obj) {

        System.out.println(b); // 0
        b=20;
        System.out.println(b);

        System.out.println("addition");
        System.out.println(obj.a);
        obj.run();
    }

    void run() {
        System.out.println("run method");

    }

    public static void main(String[] args) {

        StaticEx obj = new StaticEx();
        System.out.println(obj.a);
        obj.run();
        add(obj);

        StaticEx.add(obj);

        obj.add(obj);
    }
}

