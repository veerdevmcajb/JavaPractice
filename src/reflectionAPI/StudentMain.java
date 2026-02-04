package reflectionAPI;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

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


    }


}
