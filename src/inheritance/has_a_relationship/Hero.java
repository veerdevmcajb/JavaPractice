package inheritance.has_a_relationship;

// has-a -relationship -> One class has a  reference to the another class is known as has-a-relationship.

public class Hero {
    String name;
    int age;
    double height;
    Address add;    // Hero class Has a reference of a Address class.
    Movies m;

    Hero(String name,int age, double height, Address add, Movies m){
        this.name=name;
        this.age=age;
        this.height=height;
        this.add=add;
        this.m=m;
    }

    void display(){
        System.out.println("Hero name is : "+ name);
        System.out.println("Hero age is : "+ age);
        System.out.println("Hero height is : "+ height);
        System.out.println("Hero address is : "+ add.dno +" "+ add.street +" "+ add.state);
        System.out.println("Hero movies : "+ m.tollywoodmov+" " + m.bollywoodbmov);
    }

    public static void main(String[] args) {

        // named object
        Address a1=new Address(111,"Panjagutta","ts");
        Movies m1=new Movies(78,58);

        Hero h=new Hero("Veer",28,5.5,a1,m1);
        h.display();

        System.out.println("*********************");
        // name less object
        Hero h1=new Hero("Rohit",30,5.2,new Address(202,"Nanded City","MH"),new Movies(50,65));
        h1.display();
    }
}
