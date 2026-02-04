package reflectionAPI;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Demo {
    public static void main(String[] args) throws Exception {

            // loading class into jvm
            Class clz=Class.forName("reflectionAPI.Student");

            // Creating object for loading class
            Object obj = clz.newInstance();

            // getting the fields whose name is age
            Field field=clz.getDeclaredField("id");

            //getting the methods
            Method method=clz.getDeclaredMethod("meth1");

            // making the variable accessing
            field.setAccessible(true);

            //set value for field
            field.set(obj,28);

            Student s= (Student)obj;
            s.getId();

            method.invoke(obj,null);


    }
}
