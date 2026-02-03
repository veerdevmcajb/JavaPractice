package collections.generics;

// java prog with Generics Type to achieve type safety
public class ClassC <T1,T2>{
    T1 obj1;
    T2 obj2;

    ClassC(T1 obj1,T2 obj2){
        this.obj1=obj1;
        this.obj2=obj2;
    }

    void print(){
        System.out.println(obj1 +" "+ obj2);
    }

    public static void main(String[] args) {
        // we can store any type of data.
        ClassC<Integer,String> c=new ClassC<>(101,"Veer");
        c.print();

        ClassC<String,Long> c1=new ClassC<>("Shiv",12345678l);
        c1.print();
    }
}
