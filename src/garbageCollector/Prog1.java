package garbageCollector;

// Garbage collector is collect the garbage.
// Garbage means a object without reference is called garbage.
//4-ways to give the obj to GC:
//	1.  Test t = new Test();
//		;;;;;;;;;;;;;;;
//		t = null
//
//	2.	name less object
//		new Test();
//
//	3. reassign ref-var
//			str1 ---- ratan
//			str2  ---- anu
//			str1=str2		//here str1 is poinnting to str2
//					---- ratan
//			str2,str1  ---- anu
//
//	4. once we create the obj inside the method, once the method is completed object is eligible to GC.
//			void m1()
//			{	Test t = new Test();
//				stack		heap
//			}


public class Prog1 {

    public static void main(String[] args) throws Exception {

        Runtime r=Runtime.getRuntime();
        r.exec("notepad");
        r.exec("mspaint");
        r.exec("calc");
    }

}
