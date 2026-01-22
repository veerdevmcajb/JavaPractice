package Files;

import java.io.File;
import java.io.IOException;

public class Create {
    public static void main(String[] args) throws IOException {

        // creating new file
        File file=new File("veer.txt");
        System.out.println(file.exists());
        boolean status=file.createNewFile();
        if(status){
            System.out.println("file is created Succesfully "+ file.getPath());
        }
        else {
            System.out.println("File is already exist...");
        }
        System.out.println(file.exists());


        // creating a new directory

        File ff=new File("Ashu");
        //ff.canExecute();
        boolean b=ff.mkdir();
        if(b){
            System.out.println("Directory is created successfully...");
        }
        else {
            System.out.println("Directory already exitss...");
        }


        // creating a new file inside a Directory
        File f=new File("Ashu","test1.txt");
        f.createNewFile();
        System.out.println("The file is created under the Ashu directory...");

    }
}
