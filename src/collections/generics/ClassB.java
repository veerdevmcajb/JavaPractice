package collections.generics;
// Generics are used to achieve TypeSafty.

public class ClassB <T>{

    T obj;

    void add(T obj){
        this.obj=obj;
    }

    T get(){
        return obj ;
    }

    public static void main(String[] args) {
        ClassB <Integer> b =new ClassB<>();
        b.add(10);
        System.out.println(b.get());

        ClassB <String >b1=new ClassB<>();
        b1.add("Shiv");
        System.out.println(b1.get());
    }


}
