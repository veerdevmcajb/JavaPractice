package java8Features.StreamAPI.Practice;

import java.util.*;
import java.util.stream.Collectors;

public class String_UpperCase {

    public static void main(String [] args){

        List<String> names = Arrays.asList("ram","shyam","alex","john");

        List<String> res = names.stream()
                .map(s->s.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(res);


    }
}
