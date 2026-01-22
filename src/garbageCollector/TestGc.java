package garbageCollector;

public class TestGc {
    public void finalize(){
        System.out.println("Object destroyed");
    }

    public static void main(String[] args) {
        TestGc t=new TestGc();
        System.out.println(t);
        t=null;

        Runtime r=Runtime.getRuntime();
        r.gc();
    }
}


//
//ex 3: we can call the GC in two ways
//System  class	:	 gc()    : static method
//Runtime class	:	 gc()    : instance  method