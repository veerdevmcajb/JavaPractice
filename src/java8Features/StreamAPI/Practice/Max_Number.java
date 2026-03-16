package java8Features.StreamAPI.Practice;
import java.util.*;

public class Max_Number {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5,12,8,20,3);

        int res = numbers.stream().max(Integer :: compare).get();
        System.out.println(res);

        int max= numbers.stream().reduce(Integer.MIN_VALUE,Integer::max);
        System.out.println("Max value is -> "+ max);

        // Integer::max   --> means  --> Integer.max(a, b) method reference

        int min = numbers.stream().reduce(Integer.MAX_VALUE,Integer::min);
        System.out.println("Min value is -> "+ min);
    }
}
