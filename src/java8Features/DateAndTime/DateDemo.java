package java8Features.DateAndTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/*  Date & Time API Changes
    - In java we have to 2 classes to represent Date
        1) java.util.Date;
        2) java.sql.Date;
    Note: When we are performing database operations then we will use java.sql.Date class

    - For Normal Date related Operations then we will use java.util.Date class.
            Date d=new Date();
            sout(d);

    Note : When we create a Date obj for Date class we will get date and Time

    -> If we want to get only date or Time then we need to format it using simpleDateFormat class.

    To overcome the above problems of java.util.Date  class java 1.8v introduced Date API Changes.
    - New classes got introduced
        1) java.time.LocalDate  ( it will deal with only date)
        2) java.time.LocalTime  ( it will deal with only time)
        3) java.time.LocalDateTime (it will deal with both date & time).
        4) java.time.Period (it will deal with difference between dates)

*
* */
public class DateDemo {

    public static void main(String[] args) throws Exception {

        Date d=new Date();
        System.out.println(d);

        // Converting Date to String ---> using format () method Taking date as a input & String as a output.
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MMM/yy");
        String format1= sdf.format(d);
        System.out.println(format1);

        // Date in us format
        SimpleDateFormat sdf2=new SimpleDateFormat("MM/dd/yyyy");
        String format2=sdf2.format(d);
        System.out.println(format2);

        //Convert String to Date ---> using parse() method Taking String as a input & Date As a output.
        System.out.println("Convert String to Date ");
        SimpleDateFormat sdf3=new SimpleDateFormat("yyyy-MM-dd");
        Date parsedDate=sdf3.parse("2026-02-24");
        System.out.println(parsedDate);

        DateTimeFormatter format=DateTimeFormatter.ofPattern("dd-mm-yyyy");
        //String formatDate=d.
    }
}
