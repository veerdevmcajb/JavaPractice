package java8Features.functionalInterface.consumer;

import java.util.function.Function;

public class FunctionDemo {

    public static void main(String[] args) {

        Function<String,Integer> f=(name)->name.length();

        System.out.println(f.apply("Shivanand"));
        System.out.println(f.apply("veer"));
        System.out.println(f.apply("Natha"));
    }
}
