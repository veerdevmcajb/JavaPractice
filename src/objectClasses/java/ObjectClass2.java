package objectClasses.java;

public class ObjectClass2 {


    void show(){
        System.out.println("Hello World");
    }

    protected void finalize(){
        System.out.println("Garbage has beeen Collected");
    }

    public static void main(String[] args) {
        ObjectClass2 obj=new ObjectClass2();

        obj.show();
        obj=null;
        System.gc();
    }
}
