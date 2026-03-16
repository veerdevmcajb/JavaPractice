package java8Features.StreamAPI.Practice;

import java.util.*;

public class Even_Num {

    public static void main(String [] args){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        numbers.stream().filter(e->e%2==0).forEach(System.out::println);

        int result = numbers.stream()
                .filter(e -> e % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(result);
    }
}
