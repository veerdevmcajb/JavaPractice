package java8Features.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class FilterNames {

    public static void main(String[] args) {

        // Filter() --> Filter is used to filter the data.
        // Wap to Print the Names Which Are Starts With A.?
        List<String> names= Arrays.asList("John","Anushka","Anupama","Smith","Ashok");
        names.stream().filter(i->i.startsWith("A")).forEach(i-> System.out.println(i));


        // Map() --> map is used to Transform the Data.
        // Q. WAP to print the all data in uppercase
        names.stream().map(name->name.toUpperCase()).forEach(name-> System.out.println(name));

        // get the length of the each name
        names.stream().mapToInt(name->name.length()).forEach(name-> System.out.println(name));

        System.out.println("======names with its length which are starting with 'A'=====");
        // print names with its length which are starting with 'A'
        //names.stream().filter(name->name.startsWith("A")).map(name->name +"-"+name.length()).forEach(length -> System.out.println(length));

         names.stream()
                .filter(name->name.startsWith("A"))
                .map(name->name +"-"+name.length())
                .forEach(name-> System.out.println(name));

    }
}
