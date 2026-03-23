package java8Features.StreamAPI.Practice;

import java.util.Arrays;
import java.util.List;

public class Square_Each_Num {

    public static void main (String []args){

        List<Integer> num = Arrays.asList(1,2,3,4,5);

        num.stream().map(n->n*n).forEach(System.out::println);


        System.out.println("Max num is :  " + num.stream().max(Integer::compare).get());

        System.out.println("Min num is : " + num.stream().min(Integer::compare).get());

        // removing duplicates.
        List<Integer> list = Arrays.asList(1,2,2,3,4,4,5);
        list.stream().distinct().forEach(System.out::println);
    }
}
