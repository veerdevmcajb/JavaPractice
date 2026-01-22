package polymorphism.methodOverloading;

public class Main {

    // We can overload main method which is currect in java
    public static void main(String[]args){
        System.out.println("Main method The entry of java prog...!");
        main("S");
        main();
    }

    public static void main(String args){
        System.out.println("Main with String");
    }

    public static void main(){
        System.out.println("Main without agruments");
    }
}
