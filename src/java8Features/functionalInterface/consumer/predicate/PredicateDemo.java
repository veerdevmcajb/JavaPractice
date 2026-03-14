package java8Features.functionalInterface.consumer.predicate;

import java.util.function.Predicate;
/*  Predicate is a functional Interface is used to check condition and return true or false
    Predicate Interface is having only one abstract method that is test();
* */
public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> p=i->i>10; // we can store a lambada into a variable.
        System.out.println(p.test(5));
        System.out.println(p.test(10));
        System.out.println(p.test(15));

    }
}
