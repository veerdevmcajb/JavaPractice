package Files;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamEx {

    public static void main(String[] args) throws IOException {

        //step1 Create a chennel
        FileReader reader=new FileReader("abc.txt");
        FileWriter writer=new FileWriter("xyz.txt");

        // step 2 read or write operations
        int c;
        while((c= reader.read())!=-1){
            System.out.println((char)c);
            writer.write(c);

        }

        //step3
        reader.close();
        writer.close();

        System.out.println("The resources are released...!");
    }
}
