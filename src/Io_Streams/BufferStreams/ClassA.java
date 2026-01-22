package Io_Streams.BufferStreams;

import java.io.*;
import java.util.Scanner;

public class ClassA {

    Scanner sc=new Scanner(System.in);

    // read a data
    void read()throws Exception{
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("G:\\Java Workplace\\Io_Streams\\file5.txt"));
        System.out.println("Connection created..for file5");
        int x;
        while ((x=bis.read())!=-1){
            System.out.print((char)x);
        }
        System.out.println();
        System.out.println("Data Retrived..");
        bis.close();

        System.out.println("------------------------------------------------------");

        BufferedReader bw=new BufferedReader(new FileReader("G:\\Java Workplace\\Io_Streams\\file4.txt"));
        System.out.println("connection created for file4");
        int y;
        while((y= bw.read())!=-1){
            System.out.print((char) y);
        }
        System.out.println("Data Received");
        bw.close();

//        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(""));
//
//        BufferedReader br=new BufferedReader(new FileReader(""));
//        BufferedWriter bw=new BufferedWriter(new FileWriter(""));

    }


    // writing a data
    void write()throws Exception{
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("G:\\Java Workplace\\Io_Streams\\file5.txt",true));
        System.out.println("Connection created");
        System.out.println("Enter your Data.. in file5");
        String data=sc.nextLine();
        byte arr[]=data.getBytes();
        bos.write(arr);
        String separater=System.lineSeparator();
        System.out.println();
        System.out.println("Data Entered...");
        bos.close();

        System.out.println("-----------------------------------------");

        BufferedWriter bw=new BufferedWriter(new FileWriter("G:\\Java Workplace\\Io_Streams\\file4.txt",true));
        System.out.println("Connection created using BufferWriter for file4");
        System.out.println("Enter your data for file4");
        String data2=sc.nextLine();
        bw.write(data2);
        System.out.println();
        System.out.println("Data entered");
        bw.close();
    }

    public static void main(String[] args) throws Exception {

       ClassA aobj=new ClassA();
       //aobj.read();
        aobj.write();
    }
}
