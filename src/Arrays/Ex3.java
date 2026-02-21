package Arrays;

import java.util.stream.Stream;

public class Ex3 {
    public static void main(String[] args) {
        String names[]={"Sachin","Rohit","Virat","Rahul"};

        for(int i=0;i<names.length;i++){
            System.out.println(names[i]);
        }
        System.out.println("-------2nd approach-------------");

        for(String n:names){
            System.out.println(n);
        }

        System.out.println("-----------3rd approach-----------");

        Stream.of(names).forEach(name-> System.out.println(name));

        System.out.println("-------reverse array------");
        for(int i=names.length-1;i>=0;i--){
            System.out.println(names[i]);
        }
    }
}
