package Io_Streams.ByteStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

// Byte Streams
// FileInputStream (read()) --> return type of read() is int. it returns ASCCI value & if there are no characher in file it will retuen -1.
// FileOutputStream (Write()) -->

public class ClassA {

    // reading the data from file
    void read() throws Exception{
        FileInputStream fis=new FileInputStream("G:\\Java Workplace\\Io_Streams\\file1.txt");
        System.out.println("Connection created");
        int x;
        while((x= fis.read())!=-1){
            System.out.print((char) x);
        }
        System.out.println();
        System.out.println("Data is reterived");
        fis.close();
    }

    //writing the data into file
    void write()throws Exception{
       FileOutputStream fos=new FileOutputStream("G:\\Java Workplace\\Io_Streams\\file2.txt",true);
        System.out.println("Connection created");
        String data=" just learn it and practice it.";
        byte arr[]=data.getBytes();
        fos.write(arr);
        System.out.println("Data Entered");
        fos.close();
    }

    // copy the data from one file to another file.
    void copy()throws Exception{
        FileInputStream fis=new FileInputStream("G:\\Java Workplace\\Io_Streams\\file2.txt");
        FileOutputStream fos=new FileOutputStream("G:\\Java Workplace\\Io_Streams\\file3.txt",true);
        System.out.println("connection created...");
        int x;
        while ((x=fis.read())!=-1){
            fos.write(x);
        }
        System.out.println("Data copied..");
        fis.close();
        fos.close();

    }
    public static void main(String[] args) throws Exception {
        ClassA obj=new ClassA();
      //  obj.read();
      // obj.write();
        obj.copy();
    }
}
