package patterns;

public class Prog10 {
    public static void main(String[] args) {

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
    }
}



//                *******
//                *     *
//                *
//                *******
//                      *
//                *     *
//                *******


//j=7
// if(i==1 || i==4 || i==7 -> *
// i<=4 && j==1 || || i>=4 && j==7
// i==6 && j==1 || i==2 && j==7
//
