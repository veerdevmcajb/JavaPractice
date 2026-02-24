package java8Features.functionalInterface.consumer.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Person {
    String name;
    int age;

    Person(String name,int age){
        this.name=name;
        this.age=age;
    }
}

class PredicatePerson{

    public static void main(String[] args) {
        Person p1=new Person("Akash",19);
        Person p2=new Person("Bashu",26);
        Person p3=new Person("Natha",9);
        Person p4=new Person("Raj",18);
        Person p5=new Person("Shyam",6);

       List<Person>persons= Arrays.asList(p1,p2,p3,p4,p5);

        Predicate<Person> predicate=p->p.age>=18;

        for(Person person: persons){
            if(predicate.test(person)){
                System.out.println(person.name+" "+ person.age);
            }
        }
    }
}
