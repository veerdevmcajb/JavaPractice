package multiThreading;

public class Prog6 extends Thread{
    int table;
    Prog6(int table){
        this.table=table;
    }
    @Override
    public void run() {
        for(int i=1;i<=10;i++){
            System.out.println(table +" * "+i+"="+(table*i));
        }
    }

    public static void main(String[] args) {
        Prog6 t1=new Prog6(4);
        t1.start();

        Prog6 t2=new Prog6(10);
        t2.start();
    }
}
