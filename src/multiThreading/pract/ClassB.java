package multiThreading.pract;

public class ClassB implements Runnable{
    @Override
    public void run() {
        for(int i=1;i<=3;i++){
            System.out.println("Run method executed "+i);
        }
    }

    public static void main(String[] args) {
        System.out.println("Creating a Thread using Runnable ");
        ClassB obj=new ClassB();
       Thread t = new Thread(obj);
        t.start();
    }
}
