package exception_Handling;

public class ClassA_ExceptionMsg {

    void method1(){
        System.out.println(10);
        try{
            System.out.println(20/0);
        }
        catch (Exception e){
            System.out.println("Catch block executed");
            System.out.println("Message => "+ e.getMessage()); //Reason for the exception
            System.out.println(e.toString());   // Name + reason of the exception
         //   e.printStackTrace();    // it will give the complete information about the exception. this is highly recommended.

        }
        finally {
            System.out.println("Finally Block executed");
        }
        System.out.println(30);
    }

    public static void main(String[] args) {
        new ClassA_ExceptionMsg().method1();
    }
}
