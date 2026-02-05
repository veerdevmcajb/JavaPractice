package Enums;

// Enum is a special datatype in java
// it is used to create pre-defined constants
// To declare constants using Enums we will use enum keyword
// enum stands for Enumeration.
// Enum constant we cant override
// Enum doesn't support object creation.
// Enum can't Extends classes.
// Enum can be declared inside a class & outside a class. and separate file
public class ClassA {
    enum WEEKDAYS {
        MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY;
    }
    enum WEEKENDDAYS{
        SUNDAY,MONDAY
    }

    public static void main(String[] args) {
        System.out.println(Course.JAVA);
        System.out.println(WEEKDAYS.FRIDAY);
       Course[] values = Course.values();
        for(Course x:values){
            System.out.println(x);
        }
    }

}
