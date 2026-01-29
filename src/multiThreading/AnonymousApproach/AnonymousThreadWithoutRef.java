package multiThreading.AnonymousApproach;

//Case 2: Creating Anonymous Thread class without reference :

public class AnonymousThreadWithoutRef {

    public static void main(String[] args) {

        new Thread("natha"){
            public void run(){
                Thread t= Thread.currentThread();
                System.out.println(t.getName());
                System.out.println(t.getId());
            }
        }.start();
    }
}
