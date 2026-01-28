package Io_Streams.Practice;

import java.io.*;

// Serilization
public class Person implements Serializable {
    int id;
    String name;
    public static void main(String[] args) throws Exception {
   Person p =new Person();
        p.id=101;
        p.name="Veer";
        // converting java object into file is called as Serialization.
        System.out.println("Serialization started");
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("person.ser"));
        oos.writeObject(p);
        oos.flush();
        oos.close();
        System.out.println("Serialization Ended");

        // Converting file data back to java object is called as De-serialization
        System.out.println("De-Serialization Started");

        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("person.ser"));
        Object object=ois.readObject();
        Person p1=(Person) object;
        System.out.println("id :" +p1.id);
        System.out.println("Name :" +p1.name);
        ois.close();
        System.out.println("De-Serialization Ended");
    }
}
