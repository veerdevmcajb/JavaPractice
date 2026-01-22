package Scanner;

import java.util.Scanner;

public class VegetableStore {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int choice;
    int total=0;

    do{
        System.out.println("Welcome to our Vegetable Shop");
        System.out.println("Plz choose");
        System.out.println("1. Onion");
        System.out.println("2. Chilli");
        System.out.println("3. Tomato");
        System.out.println("4. Brinjal");
        System.out.println("5. Ladies Finger");
        System.out.println("6 Bill");
        System.out.println("Enter your choice");
        choice=sc.nextInt();

        switch (choice){
            case 1:
                System.out.println("Onion 1 kg = 30 rs");
                System.out.println("How many kgs you want.?");
                int a=sc.nextInt();
                int cost1=a*30;
                total=total+cost1;

                System.out.println("cost "+cost1);
                System.out.println("____________________");
                break;

            case 2:
                System.out.println("Chilli 1 kg of 60 rs");
                System.out.println("How many kgs you want.?");
                int b=sc.nextInt();
                int cost2=b*60;
                total=total+cost2;
                System.out.println("cost "+cost2);

                System.out.println("____________________");
                break;

            case 3:
                System.out.println("Tomato 1 kg of 55 rs");
                System.out.println("How many kgs you want.?");
                int c=sc.nextInt();
                int cost3=c*55;
                total=total+cost3;
                System.out.println("cost "+cost3);
                System.out.println("____________________");
                break;

            case 4:
                System.out.println("Brinjal 1 kg of 50 rs");
                System.out.println("How many kgs you want.?");
                int d=sc.nextInt();
                int cost4=d*50;
                total+=cost4;
                System.out.println("cost "+cost4);
                System.out.println("____________________");
                break;

            case 5:
                System.out.println("Ladies Finger 1 kg of 40 rs");
                System.out.println("How many kgs you want.?");
                int e=sc.nextInt();
                int cost5=e*40;
                total+=cost5;
                System.out.println("cost "+cost5);
                System.out.println("____________________");
                break;

            case 6:
                System.out.println("Thank You..!");
                System.out.println("Total Bill is "+ total+" rs");
                break;

            default:
                System.out.println("Invalid Choise");

        }
    }while(choice !=6);
    }
}
