package java8Features.StreamAPI.Practice;

import java.util.Arrays;

public class CountVowels {

    public static void main(String []ar){

//        String str="SHIVANAND";
//        char ch[]= str.toCharArray();
//
//        System.out.println(ch);
//
//        String []arr =str.split(" ");
//        System.out.println(Arrays.toString(arr));
//
//        Arrays.stream(arr)
//                .filter(e->e.startsWith("A") || e.startsWith("E") ||
//                        e.startsWith("I") || e.startsWith("O") || e.startsWith("U"))
//                .map(e-> e.length()).forEach(System.out::println);

        String str = "Shivanand";

        long count = str.chars()
                .mapToObj(c->(char)c)
                .filter(c->"AEIOUaeiou".indexOf(c)!=-1)
                .count();
        System.out.println("Vowels count : " + count);

    }
}
