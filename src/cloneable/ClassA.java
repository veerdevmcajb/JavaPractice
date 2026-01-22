package cloneable;

public class ClassA implements Cloneable {
    int a;
    int b;

    ClassA show() throws CloneNotSupportedException
    {
        ClassA obj=(ClassA)super.clone();
        return obj;
    }
}
