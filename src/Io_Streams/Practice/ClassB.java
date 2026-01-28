package Io_Streams.Practice;

import java.io.PrintWriter;

// Writing data to console using PrintWriter Object
public class ClassB {
    public static void main(String[] args) {
        PrintWriter pw=new PrintWriter(System.out);
        pw.print("Hi");
        pw.println("\nHello");
        pw.flush();
        pw.close();
    }
}
