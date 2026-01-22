package LoopingStatements.forLoop;

//WAP the Sum of 1 -10
//wap the sum of 1-10 even values
// wap the sum 1-10 odd values

public class Assignment2 {

    public static void main(String[] args) {

        int sum=0;

        for(int i=1; i<=10; i++){
            sum = sum + i;
        }
        System.out.println(" the Sum of 1 -10 is : "+ sum);

        Assignment2 obj=new Assignment2();
        obj.even();
        obj.odd();
    }

    void even(){
        int sumEven=0;

        for(int i=1; i<=10; i++){
            if( i % 2 == 0){
                sumEven=sumEven+i;

            }
        }
        System.out.println("the sum of 1-10 even values : "+ sumEven);
    }

    void odd(){
        int sumOdd=0;

        for(int i=1;i<=10;i++){
            if(i%2 !=0){
                sumOdd=sumOdd+i;
            }
        }
        System.out.println("the sum of 1-10 odd values is : "+ sumOdd);
    }
}
