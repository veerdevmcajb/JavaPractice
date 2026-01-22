package Io_Streams.ObjectStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ClassC {

    public static void main(String[] args) throws Exception {
        ClassA aobj=new ClassA();
        ClassB bobj=new ClassB();

      ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream("G:\\Java Workplace\\Io_Streams\\Data.ser"));
        System.out.println("Connection created");

        oos.writeObject(bobj);
        oos.writeObject(aobj);

        System.out.println("Seriliazation started");

        System.out.println("------------------------");

        System.out.println("Deseriliazation started");
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("G:\\Java Workplace\\Io_Streams\\Data.ser"));
        System.out.println("connection created");

        ClassB bobj2=(ClassB) ois.readObject();
        ClassA aobj2=(ClassA) ois.readObject();

        System.out.println(aobj2.a + " "+ aobj2.b);
        System.out.println(bobj2.x + " "+ bobj2.y);
    }
}
