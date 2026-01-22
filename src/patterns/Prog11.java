package patterns;

public class Prog11 {
    public static void main(String[] args) {

        // S
        for(int i=1;i<=7;i++){

            for(int j=1;j<=7;j++){
                if(i==1 || i==4 || i==7 || i<=4 && j==1 || i>=4 && j==7 || i==6 && j==1 || i==2 && j==7 ){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        //  H
        for (int i=1;i<=5;i++){

            for(int j=1;j<=5;j++){
                if(j==1 || j==5 || i==3){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();


        //  I
        for(int i=1;i<=5;i++){

            for(int j=1;j<=5;j++){
                if(i==1 || i==5 || j==3){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        //  V
        for(int i=1;i<=5;i++){

            for(int j=1;j<=10;j++){
                if(i==j || (i+j==11)){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
