package java8Features.DateAndTime;

import java.time.*;
import java.util.Date;
import java.util.TimeZone;

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

        // TimeZone

        ZonedDateTime zonedTime = ZonedDateTime.now();
        System.out.println("ZonedTime : "+ zonedTime);

        ZonedDateTime NYC_Time = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("NYC_Time "+NYC_Time);

        ZonedDateTime LA_Time = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println("LA_Time "+ LA_Time);

        ZonedDateTime utc = ZonedDateTime.now(ZoneId.of("UTC"));
        System.out.println(utc);

        // Instant
        Instant instant = Instant.now();
        System.out.println("Instant  "+instant);
    }
}
