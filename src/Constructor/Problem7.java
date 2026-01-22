package Constructor;

/** Write a program showing difference between:
this keyword
this() constructor call*/

public class Problem7 {
    int a;
    int b;

    Problem7(){
        System.out.println("for this constructor we have to use this()");
    }

    Problem7(int a,int b){
        this(); // call constructor
        this.a=a; // current obj reference
        this.b=b;
        System.out.println("For initialize the instance var we use this" + (a+b));
    }

    public static void main(String[] args) {
        Problem7 p=new Problem7(10,20);
    }

}
