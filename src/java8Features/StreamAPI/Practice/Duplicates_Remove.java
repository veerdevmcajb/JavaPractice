package java8Features.StreamAPI.Practice;
import java.util.*;

// Q. Remove duplicates from list

public class Duplicates_Remove {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,3,5,0,8,2,2,3,4,4,5);

        System.out.println("after removing duplicates...");
        numbers.stream().distinct().forEach(System.out::println);

        System.out.println("Sorted Order");
        numbers.stream().sorted().forEach(System.out::println);

        //numbers.stream().peek(e->e%2==0).forEach(System.out::println);


        System.out.println("===================spliterator==================");

        List<String> names = Arrays.asList("sachin", "sehwag", "dhoni");

        Spliterator<String> spliterator = names.stream().spliterator();

        spliterator.forEachRemaining(n -> System.out.println(n));

    }
}
