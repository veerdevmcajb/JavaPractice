package multiThreading;

public class Prog1 extends Thread{

    public void run(){
        System.out.println("0-argu run");
    }

    public void run(int a){
        System.out.println("1-argu run");
    }
}
class Test{
    public static void main(String[] args) {
        Prog1 p1=new Prog1();
        Prog1 p2=new Prog1();

        // get the name of the thread using getName()
        System.out.println(p1.getName());
        System.out.println(p2.getName());
        System.out.println(Thread.currentThread().getName());

        //set the name of the thread using setName()
        p1.setName("Natha");
        p2.setName("Tilak");
        Thread.currentThread().setName("Rohit");

        System.out.println(p1.getName());
        System.out.println(p2.getName());
        System.out.println(Thread.currentThread().getName());

        // We can overload a run () method but thread always call 0-argu run() method.
        Prog1 obj=new Prog1();
        obj.start();
    }
}

// in java whenever execution start from main method, one thread started
// automatically is called main thread.

// -Thread names : Every thread is having name
//  - default name of the main Thread is : main
//  - default names of user define threads are starts from :- thread-0, thread-1....
