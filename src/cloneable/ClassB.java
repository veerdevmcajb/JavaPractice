package cloneable;

public class ClassB  implements Cloneable{
    int x;
    int y;

    ClassB display() throws CloneNotSupportedException
    {
        ClassB obj=(ClassB) super.clone();
        return obj;
    }
}
