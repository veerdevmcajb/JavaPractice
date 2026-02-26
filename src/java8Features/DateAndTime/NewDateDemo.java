package java8Features.DateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.Date;

public class NewDateDemo {
    public static void main(String[] args) {

        Date d= new Date();
        System.out.println(d);

        LocalDate d2=LocalDate.now();
        System.out.println(" Current Date "+ d2);

        d2=d2.plusDays(2);
        System.out.println("After 2 days date "+d2);

        d2=d2.plusMonths(2);
        System.out.println("After 2 months date "+d2);

        d2=d2.plusYears(2);
        System.out.println("After 2 years date "+d2);

        boolean leapYear=LocalDate.now().isLeapYear();
        System.out.println(leapYear);

        boolean learYear1=LocalDate.parse("2020-12-21").isLeapYear();
        System.out.println(learYear1);

        boolean before = LocalDate.parse("2024-12-05").isBefore(LocalDate.parse("2025-12-05"));
        System.out.println("Before Date "+before);

        //Local Time
        LocalTime lt=LocalTime.now();
        System.out.println("Current Time is : "+lt);

        // LocalDateTime
        LocalDateTime ldt=LocalDateTime.now();
        System.out.println("Local Date Time : "+ldt);

        //check diff between 2 days using Period

        Period between = Period.between(LocalDate.parse("1998-05-10"),LocalDate.now());
        System.out.println(between);

    }
}
