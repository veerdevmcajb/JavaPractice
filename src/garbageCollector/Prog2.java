package garbageCollector;

public class Prog2 {

    public void finalize(){
        System.out.println("Object Destoryed");
        System.out.println(10/0);
        // Exceptions are ignored in finalize mathod.
    }
    public static void main(String[] args) {

        Prog2 p=new Prog2();
        Prog2 p1=new Prog2();
        System.out.println(p);
        System.out.println(p1);

        p=null;
        p1=null;
        System.out.println(p);
        System.out.println(p1);
        System.gc();
    }
}
//notes
//The finalize method is called  by the garbage collector just before destroying the object.
// b. Observation : In finalize method if any exceptions are raised those are ignored, objects are destroyed.
//	public void finalize()
//	{	System.out.println("Object destoryed");
//		System.out.println(10/0);
//	}