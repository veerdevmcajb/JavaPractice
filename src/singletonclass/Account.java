package singletonclass;


public class Account {

    // private static non-primitive reference variable
    private static Account obj=null;

    // private constructor
    private Account(){
        System.out.println("Object Created..");
    }

    // declare public static helper method to create a Singleton class object.
    public static void createObject(){
        if(obj==null){
            obj=new Account();
        }else {
            System.out.println("Can not create Object");
        }
    }
}
