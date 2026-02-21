package Arrays.problems;

import java.util.Arrays;

public class MargeArray {
    public static void main(String[] args) {

        int a[]={1,2,3};
        int b[]={4,5,6};

        int c[]=new int[a.length+ b.length];

        for(int i=0;i<=a.length-1;i++){
            c[i]=a[i];
        }

        for(int i=0;i<=b.length-1;i++){
            c[i+a.length]=b[i];
        }

        System.out.println(Arrays.toString(c));

        for(int i=0;i<=c.length-1;i++){
        System.out.println(c[i]);
        }
    }
}
