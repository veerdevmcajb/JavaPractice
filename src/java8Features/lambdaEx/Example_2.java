package java8Features.lambdaEx;

// Functional interfaces are required only for lambda expressions.
// Function interface with lambda

/*  Anonymous classes can implement any interface,
    but lambda expressions can only implement functional interfaces.
*/

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface Add{
    int add(int a, int b);

   default void display(){
        System.out.println(" Functional interface default method");
    }

    static int show(){
        return 101;
    }


}

public class Example_2 {

    public static void main(String[] args) {

        Add obj = (a, b) -> a + b;
        System.out.println(obj.add(5, 5));

        // Lambda with Multiple Statements
        // for multiple statements, {} and return are required.

       Add obj2=(a,b)->{
           int result=a+b;
           return result;
       };

        System.out.println(obj2.add(10,100));


        // Lambda with collections
        System.out.println("======Lambda with collections==========");
        List<Integer> list = Arrays.asList(10,30,20,50,40);
        list.forEach(System.out::println);

        // Lambda with Filtering (Streams)
        System.out.println("====Lambda with Filtering (Streams) even numbers ====");
        list.stream().filter(e-> e%2==0).forEach(System.out::println);


    }

}
