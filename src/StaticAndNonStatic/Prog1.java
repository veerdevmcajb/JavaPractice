package StaticAndNonStatic;

public class Prog1 {
    // instance variables
    int x,y,z;
    int i=10,j,k;

    //static variables
    static int a=10,b=20,c;
    static int l=10,m=20,n=30;
    static int d,e=100,f;

    public static void main(String[]args){
        Prog1 p=new Prog1();
        System.out.println(p.x +" " + p.y + p.z);
        System.out.println(p.i +" " + p.j + p.k);

        System.out.println(Prog1.a +" " + Prog1.b + Prog1.c);
        System.out.println(Prog1.l +" " + Prog1.m + Prog1.n);
        System.out.println(Prog1.d +" " + Prog1.e + Prog1.f);
    }

}

// static