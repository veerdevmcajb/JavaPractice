package java8Features.StreamAPI.Practice;

import java.util.*;

public class SumOfNumbers {

    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(10,20,30,40);

        int sum = num.stream()
                .reduce(0,(a,b) -> a+b);

        System.out.println(sum);



    }
}
