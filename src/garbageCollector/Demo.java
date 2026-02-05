package garbageCollector;

public class Demo {

    public static void main(String[] args) {
        Demo d=new Demo();
        d=null;
        System.gc();
    }
   protected void finalize() throws Throwable{
        System.out.println("Finalize () called");
        System.out.println("Garbage is collected");
    }
}
