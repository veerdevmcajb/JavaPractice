package exception_Handling;

public class ClassB {
    int age=18;

    void meth1(int age){
    if(age>18){
        System.out.println("Eligible to vote");
    }else {
        throw new RuntimeException("Wait for somtime..");
    }
    }

    public static void main(String[] args) {
        ClassB obj=new ClassB();
        obj.meth1(obj.age);
    }
}
