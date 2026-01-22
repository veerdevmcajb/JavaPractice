package multiThreading;

// Take a two threads
// t1 : during object creation give a table number of :4
//      MyThread t=new MyThread(4);
//      4*1=4
//      4*2=8

// t2=

public class Prog5 extends Thread {

    Prog5(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n + " * "+ i+" = "+(n*i));
        }
    }

    Prog5(int n2,int n){
        for (int i=1;i<=10;i++){
            System.out.println(n +" *"+ i+" = "+(n2*i));
        }
    }
}
class Test5{
    public static void main(String[] args) {
        Prog5 t=new Prog5(4);
        t.start();
        System.out.println();
        Prog5 t2=new Prog5(7,0);
        //t.start();
    }
}
