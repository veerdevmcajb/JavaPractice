package reflectionAPI;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) throws Exception {
        Class cls=Class.forName("reflectionAPI.Student");

        Field [] fields=cls.getDeclaredFields();
        for (Field f:fields){
            System.out.println(f.getName());
        }

        Method [] methods= cls.getDeclaredMethods();
        for(Method m: methods){
            System.out.println(m.getName());
        }

        Constructor[]constructors=cls.getDeclaredConstructors();
            for(Constructor c:constructors){
                System.out.println(c.getName());
            }

//            Scanner sc=new Scanner(System.in);
//        System.out.println("Enter a class Name");
//        Class claName = Class.forName(sc.nextLine());
//        System.out.println("Class name is -> "+ claName.toString());





    }


}
