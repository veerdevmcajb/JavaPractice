package multiThreading.AnonymousApproach;

// Case 4 :- Runnable by using Lambda
public class RunnableUsingLambda {
    public static void main(String[] args) {

        Runnable r1=()->{
            System.out.println("Case 4 :- Runnable by using Lambda");
            Thread t=new Thread();
            System.out.println(t.getName());
            System.out.println(t.getId());
        };

        Thread t1=new Thread(r1);
        t1.start();
    }
}
