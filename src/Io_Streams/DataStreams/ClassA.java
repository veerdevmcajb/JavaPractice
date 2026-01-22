package Io_Streams.DataStreams;

import java.io.*;

public class ClassA {
    void operation1() throws Exception{

        DataOutputStream dos=new DataOutputStream(new FileOutputStream("G:\\Java Workplace\\Io_Streams\\file1.txt"));
        System.out.println("connection created");
        dos.writeInt(1000);
        dos.writeChar('S');
        dos.writeBoolean(true);
        dos.writeInt(01);
        System.out.println("Data Written");

        dos.close();
        System.out.println("---------------------------------");

        DataInputStream dis=new DataInputStream(new FileInputStream("G:\\Java Workplace\\Io_Streams\\file1.txt"));
        System.out.println("Connection created");
        System.out.println(dis.readInt());
        System.out.println(dis.readChar());
        System.out.println(dis.readBoolean());
        System.out.println(dis.readInt());

        System.out.println("Data Retrived...");
        dis.close();
    }

    public static void main(String[] args) throws Exception {
       ClassA aobj=new ClassA();
            aobj.operation1();
    }
}
