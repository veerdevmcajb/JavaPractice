package multiThreading;

public class TableThread extends Thread{
    int table;
    TableThread(int table){
        this.table=table;
    }

    @Override
    public void run() {
        for(int i=1;i<=10;i++){
            System.out.println(table +"*" + i + "="+ (table*i));
        }
    }
}

class TableMain{

    public static void main(String[] args) {
        TableThread t=new TableThread(5);
        t.start();
    }
}
