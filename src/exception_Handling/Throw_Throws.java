package exception_Handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throw_Throws {
    int avl_amt=10000;

    void withdraw(int wd_amt){

        if(avl_amt < wd_amt){
            throw new RuntimeException("Balance is not sufficient");
        }
        else {
            System.out.println("Transition success");
        }
    }

    void meth2() throws Exception {
        FileInputStream fos=new FileInputStream("F:\\Java_Sessions\\txt.txt");
    }

    public static void main(String[] args) throws Exception {
        Throw_Throws obj=new Throw_Throws();
        try {
            obj.withdraw(15000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // obj.meth2();
        System.out.println("End");
    }
}
