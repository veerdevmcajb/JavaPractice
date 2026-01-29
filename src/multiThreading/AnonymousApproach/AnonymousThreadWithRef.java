package multiThreading.AnonymousApproach;

// Creating Anonymous Thread class using reference :

public class AnonymousThreadWithRef {

    public static void main(String[] args) {

        // Anonymous inncer class
        Thread t1=new Thread(){

            public void run(){
                Thread t=Thread.currentThread();
                System.out.println("Name is : "+ t.getName());
                System.out.println("Id is : "+t.getId());
            }
        };

        t1.start();
    }
}
