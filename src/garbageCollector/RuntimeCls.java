package garbageCollector;

//Runtime cls used to interact with Runtime resources.

public class RuntimeCls {
    public static void main(String[] args) throws Exception
    {	   	Runtime r = Runtime.getRuntime();
        System.out.println("Total memory....."+r.totalMemory());
        System.out.println("Free memory....."+r.freeMemory());
        for(int i=0;i<100000;i++)
        {	 new Test();
        }
        System.out.println("Free memory after 1L..."+r.freeMemory());
        r.gc();
        System.out.println("Free memory after GC.."+r.freeMemory());
    }
}
