package exception_Handling;

public class MultipleTryCatch {

    void method1(){

        String s=null;
        System.out.println(10);
        try{
            System.out.println("try block executed");
            System.out.println("Division is "+ 20/5);
            System.out.println("Length is "+s.length());
        }
//        catch (ArithmeticException e){
//            System.out.println("first catch block executed..");
//            e.printStackTrace();
//        }
//        catch (NullPointerException e){
//            System.out.println("2nd catch block executed");
//            e.printStackTrace();
//        }

        // we can handle multiple exception by single cathch block also
        catch (ArithmeticException | NullPointerException e){
            System.out.println("catch block executed");
            e.printStackTrace();
        }
        finally {
            System.out.println("finally block executed");
        }
        System.out.println(30);
    }

    public static void main(String[] args) {
        new MultipleTryCatch().method1();
    }
}
