package java8Features.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

// Q WAP To print the numbers which is Greater Than 20.
public class Numbers {

    public static void main(String[] args) {
        List <Integer>list= Arrays.asList(66,25,77,20,88,16);

        System.out.println("Using For-each");
        for(Integer i:list){
            if(i>20){
                System.out.println(i);
            }
        }

        System.out.println("Using Stream ");
        Stream <Integer>stream=list.stream();
        Stream<Integer>filter=stream.filter(i->i>20);
        filter.forEach(i-> System.out.println(i));

        // above code in one single line
        list.stream().filter(i->i>20).forEach(i-> System.out.println(i));

        // Stream is not changing the original DataStructure .
        // it is just taking the data from collections and perform the operations
    }
}
