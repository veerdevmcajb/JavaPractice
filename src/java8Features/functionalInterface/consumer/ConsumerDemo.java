package java8Features.functionalInterface.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {
       Consumer<String> c= (name)-> System.out.println(name + " Good Morning...");
        c.accept("Ashok");
       c.accept("Natha");
       c.accept("Veer");

       List<Integer> numbs= Arrays.asList(10,20,30,40);

       numbs.forEach((i-> System.out.println(i)));

    }
}
