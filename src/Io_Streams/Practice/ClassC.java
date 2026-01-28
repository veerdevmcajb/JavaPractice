package Io_Streams.Practice;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

//Print Writer

public class ClassC {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw=new PrintWriter("f1.txt");
        pw.write("This is my first Data");
        pw.flush();
        pw.close();
    }
}
