package Io_Streams.Practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {

        // file Writer
//        FileWriter fw=new FileWriter("Data.txt",true); // file is created
//        fw.write("Hi..Good Morning"); // write the data in that file
//        fw.write("\n");
//        fw.write("Nice to meet you..!");
//        fw.close();
//
        // file Reader --> it will read the data character by character .
//        FileReader fr=new FileReader("Data.txt");
//        int i;
//        int count=0;
//        int words=0;
//        while((i=fr.read())!=-1){
//
//        System.out.print((char)i);
//        count++;
//        }
//        System.out.println("Character count is : "+ count);
//        fr.close();


        //BufferReader --> BufferReader is Recommanded .--> it will read the data line by line.
        BufferedReader br = new BufferedReader(new FileReader("Data.txt"));
        String line = br.readLine();
        int count=0;
        int i=0;
        while (line != null) {
            i++;
            System.out.println(line);
            count++;
            line = br.readLine();
        }
        System.out.println("Line Count is "+ count);
        System.out.println(" Count is "+ i);


    }
}


