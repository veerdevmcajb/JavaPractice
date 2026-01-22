package multiThreading;

public class Prog2 extends Thread{

    public void run(){
        add(10,20);
        mult(10,5);

    }
    private void add(int n1,int n2){
        System.out.println("Addition is : "+(n1+n2));
    }
    private void mult(int n1,int n2){
        System.out.println("Mult is : "+(n1*n2));
    }
}

class Test2{
    public static void main(String[] args) {
        Prog2 p=new Prog2();
        p.start();
    }
}

//No need to write all logic inside run method
// we can create our own method to write a logic just call that methods run() methods.