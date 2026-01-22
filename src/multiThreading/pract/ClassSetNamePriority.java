package multiThreading.pract;


// setName for a Thread and Priority
public class ClassSetNamePriority extends Thread{

    public void run(){
        String name=Thread.currentThread().getName();
        int priprity=Thread.currentThread().getPriority();
        for(int i=1;i<=3;i++){
            System.out.println(name + "(" + priprity+")" + "Executed run()");
        }
    }

    public static void main(String[] args) {
        ClassSetNamePriority obj=new ClassSetNamePriority();
        Thread t1=new Thread(obj);
        Thread t2=new Thread(obj);

        t1.setName("First Thread");
        t2.setName("Second Thread");

        t1.setPriority(MIN_PRIORITY);
        t2.setPriority(10);

        t1.start();
        t2.start();
    }
}
