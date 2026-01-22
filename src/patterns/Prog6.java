package patterns;

public class Prog6 {
    public static void main(String[] args) {
        int star=0,space=5;
        for(int i=1;i<=5;i++){
            star++;
            space--;
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=star;j++){
                System.out.print("*");
            }
            System.out.println();
        }

//        for(int i=1;i<=5;i++){
//
//            for(int j=1;j<5;j++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

    }
}


//    *
//   **
//  ***
// ****
//*****