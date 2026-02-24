package multiThreading;

public class ThreadWithLambdaEx {

    public static void main(String[] args) {
        Runnable r=()->{
            for(int i=5;i>=1;i--){
                System.out.println(i);
            }
        };

        Thread t=new Thread(r);
        t.start();
    }
}

// from 1.8v this is the way to create a Thread using Lambda Expression.
