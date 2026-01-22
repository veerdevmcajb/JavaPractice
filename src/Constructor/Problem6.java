package Constructor;

/***
 * Parent class with constructor
 * Child class calling parent constructor using super()
 */

public class Problem6 {
    Problem6(){
        System.out.println("Parent constructor");
    }
}

class Child extends Problem6{
    Child(){
        super();
    }

    public static void main(String[] args) {

    Child c=new Child();
    }


}
