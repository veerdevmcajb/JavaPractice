package java8Features.lambdaEx;

import java.util.function.Predicate;
/*  Predicate Interface is used to check condition and return true or false
    Predicate Interface is having only one abstract method that is test();
* */
public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> p=i->i>10;
        System.out.println(p.test(5));
        System.out.println(p.test(10));
        System.out.println(p.test(15));
    }
}
