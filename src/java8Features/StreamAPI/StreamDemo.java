package java8Features.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {

        // Approach 1
        Stream<Integer>stream1= Stream.of(1,2,3,4,5);

        ArrayList <String>names=new ArrayList<>();
        names.add("Akshay");
        names.add("Natha");
        names.add("Veer");
        names.add("Vijay");
        names.add("Akash");

        // Approach 2
        Stream<String>stream2=names.stream();

        System.out.println(stream2);
        System.out.println(stream1);

        System.out.println("======================================");
      List<Integer> list =  List.of(10,20,5,8,7,20);
      List<Integer> even=list.stream().filter(e->e%2==0).collect(Collectors.toList());
        System.out.println(even);

        list.stream().filter(e->e%2==0).forEach(s-> System.out.println(s));
    }
}
