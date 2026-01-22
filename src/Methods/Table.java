package Methods;

public class Table {
    void method1(int num){
        for(int i=1;i<=10;i++){
            System.out.println(num + "*" +i+"="+(num*i));
        }
    }

    public static void main(String[] args) {
        Table t=new Table();
        t.method1(2);
    }
}
