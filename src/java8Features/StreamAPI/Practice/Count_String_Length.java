package java8Features.StreamAPI.Practice;
import java.util.*;

public class Count_String_Length {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Ram","Tom","Alexander","Sam","John");

        long count= list.stream().filter(s->s.length() > 3).count();
        System.out.println(count);

    }
}
