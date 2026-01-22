package LoopingStatements.forLoop;

public class ForBreak {

    void meth1(){
        for(int i=0;i<=10;i++){
            if(i==5){
                //break; // break stop the loop
                //continue; // skip that specific loop
                return;
            }
            System.out.println(i);
        }
        System.out.println("Compiler out of the loop");
    }

    public static void main(String[] args) {
        ForBreak obj=new ForBreak();
        obj.meth1();
    }
}
