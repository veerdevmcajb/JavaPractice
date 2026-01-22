package Interface;

public interface Showable{
    void show();
}

class Computer implements Showable,Printable{


    @Override
    public void print() {
        System.out.println("Printing... Data");
    }

    @Override
    public void show() {
        System.out.println("Showing Data...");
    }
}
class TestShowPrint extends Computer{
    public static void main(String[] args) {
        TestShowPrint obj=new TestShowPrint();
        obj.print();
        obj.show();
    }
}