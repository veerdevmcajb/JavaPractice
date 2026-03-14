package java8Features.lambdaEx;

public class Example_1 {

    public static void main(String[] args) {
//        Runnable r=(()-> System.out.println("Hello"));
//        new Thread(r).start();

        // or

        new Thread(()-> System.out.println(Thread.currentThread().getName() + " with Lambda ")).start();
    }
}
