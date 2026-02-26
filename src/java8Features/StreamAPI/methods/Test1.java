package java8Features.StreamAPI.methods;

import java.util.Arrays;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {

        List<String> courses = Arrays.asList("core Java","Adv java","SpringBoot","restAPI","microservices","core java");

        System.out.println(courses);

        // limit()- Get elements from the given Stream based on given size.
        courses.stream().limit(3).forEach(s-> System.out.println(s));

        // skip() -> it is used to skip given numbers of elements from starting position of the stream.
        courses.stream().skip(3).forEach(s-> System.out.println(s));


        List<String> names = Arrays.asList("Raja","Rani","Guru","Raja","Rani");
        // distinct() -> To get unique elements from the stream.
        names.stream().distinct().forEach(s-> System.out.println(s));

    }
}
