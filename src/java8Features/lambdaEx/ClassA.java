package java8Features.lambdaEx;

/*  From 1.8v onwords Java is called as Functional Programming ->
*   - in oops language Classes and objects are main entities.
*   - We need to write methods inside the class only.
* - Functional programming means everything will be represented in the frm of functions .
*       functions can be exist outside of the class.Functions can be store in to reference  variable.
*       A functions can be pass as a parameter to other method.
*
*   - Lambda Expression introduced in java to enable Function Programming
*       ===============================
*           - What is Lambda Expression
*       ==============================
*       -Lambda is a anonmous function without name without modifier and without return type.
*       -Lambda is used to reduce no of lines in our program.
*       - Lambda is a nameless functions
*       ex.
*       public void m1(){
*          sout("HI");
*       }
*
*       ()->sout("HI");
*
*       =========================
*           Functional Interface
*       =========================
*   * functional Interface --> the functional Interface which contain only one abstract method.
*       -> Functional Interfaces are used to invoke Lambda Expressions
*           Runnable--> run();
*           Callable--> call();
*           Comparable--> compareTo();
*
*       - To represent a Functional Interface we use @FunctionalInterface annotation.
*       @FunctionalInterface
*       public Interface MyInterface{
*           public void m1();
*       }
*       note:-> when we write a @FUnctionalInterface annotation then compiler will check oue Interface is containing only one abstract method or not.
*
* */
@FunctionalInterface
interface MyInterface{
    public void m2();
}
public class ClassA {
    public static void main(String[] args) {
    MyInterface mi=()-> System.out.println("Lambda Expression");
    mi.m2();
    }
}
