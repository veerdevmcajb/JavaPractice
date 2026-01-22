package collections.list.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class TakingInputs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter First obj Integer ");
        int val1=sc.nextInt();
        System.out.println("Enter second obj Double");
        double val2=sc.nextDouble();
        System.out.println("Enter third obj String");
        String val3=sc.next();

        ArrayList objs=new ArrayList();
        objs.add(val1);
        objs.add(val2);
        objs.add(val3);
        System.out.println(objs);

        // Taking 5 Integers values from end user store into Arraylist
        ArrayList<Integer>intobjs=new ArrayList<Integer>();
        for(int i=1;i<=5;i++){
            System.out.println("Enter "+i+" value");
            intobjs.add(sc.nextInt());
        }
        System.out.println("ArrayList Data "+intobjs);
    }
}
