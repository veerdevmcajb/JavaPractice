package java8Features.StringJoiner;

import java.util.StringJoiner;

/* - StringJoiner class introduced in java 1,8v;
   - It is used to join more than one String with specific delimiter.
   - we can concat prefix and suffix while joining strings using StringJoiner.


* */

public class StringJoinerDemo {

    public static void main(String[] args) {

        StringJoiner sj=new StringJoiner("-");
        sj.add("Shiv");
        sj.add("Madhavrao");
        sj.add("Chandankar");
        System.out.println(sj);

        StringJoiner sj2=new StringJoiner("-","(",")");
        sj2.add("veer");
        sj2.add("Dev");
        sj2.add("mca");
        System.out.println(sj2);

    }
}
