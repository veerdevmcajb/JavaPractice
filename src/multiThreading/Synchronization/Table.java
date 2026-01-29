package multiThreading.Synchronization;

public class Table {

    public synchronized void printTable(int num){
        for(int i=1;i<=10;i++){
            System.out.println(num + " X "+i+"="+(num*i));
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("------------------------");
    }
}

class MethodLevelSynchronization{

    public static void main(String[] args) {

        Table t=new Table();
        new Thread(){
            @Override
            public void run() {
                t.printTable(5);
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                t.printTable(10);
            }
        }.start();
    }
}
