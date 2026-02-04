package string;

import java.util.StringTokenizer;
/*  StringTokenizer
    - StringTokenizer is predefined class in java.util package
    - Using This class we can split string into multiple tokens based on delimiter.

* */
public class StringTokenizerEx {

    public static void main(String[] args) {
        String s="Java is awesome";
        StringTokenizer st=new StringTokenizer(s," ");
        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }

    }
}
