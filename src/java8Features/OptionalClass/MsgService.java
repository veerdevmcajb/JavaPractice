package java8Features.OptionalClass;

import java.util.Optional;
import java.util.Scanner;
/*  Optional Class
    - Optional Class is Introduced in 1.8v in java.util
    - Optional class is used to avoid NullPointerException in the program.

    Q What is NullPointerException(NPE)?
    ans ) When we perform some operations on null value then we will get NullPointerException
            String s=null;
            s.length(); //NPE
* */

public class MsgService {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("Enter userid");
        int userId=s.nextInt();

        User u=new User();
//        String userName =u.getUserNameById(userId);
//        String msg=userName.toUpperCase()+", Hello";
//        System.out.println(msg);

        Optional<String>userName=u.getUserNameById(userId);

        if(userName.isPresent()){
            String  name=userName.get();
            System.out.println(name.toUpperCase() +" , Hello");
        }else {
            System.out.println("No Data Found");
        }
    }
}
