package java8Features.StreamAPI.flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class Demo {

    public static void main(String[] args) {
        List <String> javaCourses = Arrays.asList("Core java","Adv java","SpringBoot");

        List<String> uiCourses = Arrays.asList("HTML","Css","js","Bs");

        List<List<String>> courses = Arrays.asList(javaCourses,uiCourses);

        // System.out.println(courses); // [[Core java, Adv java, SpringBoot], [HTML, Css, js, Bs]]

        // courses.stream().forEach(c-> System.out.println(c));

        //👉 flatMap() → gives you all items from all boxes in one place
        /*  Use it when:
                You have nested collections
                You want to flatten data
                You want to avoid nested loops
        * */

        Stream<String> flatMap=courses.stream().flatMap(s->s.stream());
        flatMap.forEach(c-> System.out.println(c));
    }
}

