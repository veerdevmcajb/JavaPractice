package java8Features.StreamAPI;

import java.util.ArrayList;
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
    }
}
