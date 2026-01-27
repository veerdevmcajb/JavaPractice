package InnerClass;

// method local Innerclass --> we can write a inner class inside a method.

public class ClassC {
    void show(){
        String s="Java";

        class InnerClass
        {
            void meth1(){
                String data=s+" is Awesome";
                System.out.println(data);
            }
        }
        InnerClass obj=new InnerClass();
        obj.meth1();
    }

    public static void main(String[] args) {
        new ClassC().show();
    }
}
