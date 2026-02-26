package java8Features.StreamAPI.terminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalDemo {

    public static void main(String[] args) {

        Person p1=new Person("John","USA");
        Person p2=new Person("Shiv","INDIA");
        Person p3=new Person("Vicky","AUS");
        Person p4=new Person("kingJohn","CHINA");
        Person p5=new Person("Veer","INDIA");

        List<Person> persons= Arrays.asList(p1,p2,p3,p4,p5);

        // anyMatch()
     boolean status = persons.stream().anyMatch(p->p.country.equals("INDIA"));
        System.out.println(" Anu Indian Available : "+status);


     boolean status2 = persons.stream().anyMatch(p->p.country.equals("CANADA"));
        System.out.println("Any Canadian Available "+ status2 );

        //allMatch()
     boolean status3 = persons.stream().allMatch(p->p.country.equals("INDIA"));
        System.out.println("All Persons from INDIA "+status3);

        //noneMatch()
     boolean status4 = persons.stream().noneMatch(p->p.country.equals("Mexico"));
        System.out.println("No persons from Mexico : "+ status4);


        // findFirst()

      Optional <Person> findFirst = persons.stream().filter(p->p.country.equals("INDIA")).findFirst();
        if (findFirst.isPresent()){
            System.out.println(findFirst.get());
        }

        // Wap to get a collection of all indians from the stream

        // collectors() --> The Collected data is stored into another List.
        List <Person> indians = persons.stream().filter(p->p.country.equals("INDIA")).collect(Collectors.toList());
        System.out.println(indians);

        // Q. Collect Names of the person how is belongs to india and store into names collection

        List<String> names=persons.stream()
                .filter(p->p.country.equals("INDIA"))
                .map(p->p.name)
                .collect(Collectors.toList());
        System.out.println(names);

    }
}

class Person{
    String name;
    String country;

    public Person(String name, String country) {
        this.name = name;
        this.country = country;
    }

    @Override
    public String toString() {
        return name +" "+ country;
    }
}