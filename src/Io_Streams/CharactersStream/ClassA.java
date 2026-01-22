package Io_Streams.CharactersStream;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class ClassA {

    Scanner sc=new Scanner(System.in);
    // reading the data from file.
    void read() throws Exception{
        // read the data
        FileReader fr=new FileReader("G:\\Java Workplace\\Io_Streams\\file2.txt");
        System.out.println("Connection created");
        int x;
        while((x=fr.read())!=-1){
            System.out.print((char)x);
        }
        System.out.println();
        System.out.println("Data retrived ");
        fr.close();
    }

    //writing the data into file
    void write() throws Exception{
        //Write the data
        FileWriter fw=new FileWriter("G:\\Java Workplace\\Io_Streams\\file4.txt",true);
        System.out.println("Connetion created");
        System.out.println("Enter your data");

        String data=sc.nextLine();
        fw.write(data);
        System.out.println(data);
        System.out.println("Data is Entered...");
        fw.close();
    }

    void copy() throws Exception{
        // copy the data
        FileReader fr=new FileReader("G:\\Java Workplace\\Io_Streams\\file4.txt");
        FileWriter fw=new FileWriter("G:\\Java Workplace\\Io_Streams\\file5.txt",true);
        System.out.println("Connection created");
        int i;
        while ((i=fr.read())!=-1){
            fw.write(i);
        }
        System.out.println("Data is copied");
        fr.close();
        fw.close();

    }
    public static void main(String[] args) throws Exception {
        ClassA aobj=new ClassA();
       // aobj.read();
        // aobj.write();
        aobj.copy();
    }
}
