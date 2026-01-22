package inheritance.multiLevel;

public class C extends B{

    String name="Ram";
    int age=20;

    void gen3(String name, int age){
        System.out.println("From generation 3 ");
        System.out.println("Name is "+ name + " Age is "+age);
        System.out.println("Son have a business");
        System.out.println("grandFather give me his money "+ money);
    }

    public static void main(String[] args) {
        C obj=new C();
        obj.gen1("Ram",80);
        obj.gen2("Shyam",55);
        obj.gen3("Sonu",20);
    }
}
