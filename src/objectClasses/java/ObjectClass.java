package objectClasses.java;

public class ObjectClass {

    void method1(){
        System.out.println("Method1 is called");
    }

    public static void main(String[] args) {

        ObjectClass obj=new ObjectClass();
        ObjectClass obj2=new ObjectClass();

        //hashcode method => It is usedfor uniqur identity numbers.
        System.out.println("obj hashcode " + obj.hashCode());
        System.out.println("obj2 hashcode " + obj2.hashCode());

        // equals method => it will check the address and return true or false.
        System.out.println(obj.equals(obj)); // true
        System.out.println(obj.equals(obj2)); // false

        // getClass method => give fully qualified class name
        System.out.println("getClass()=> "+ obj.getClass());

        // toString method => convert an object into String representation format.
        System.out.println("toString()==> "+ obj.toString());
        System.out.println("toString()==> "+ obj2.toString());
    }
}
