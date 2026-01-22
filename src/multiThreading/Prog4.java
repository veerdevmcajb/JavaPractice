package multiThreading;

// Create a Three thread it prints below msg
//Good Morning...Ratan
//Good Morning...Ratan
//Good Evening...Rohit
//Good Evening...Rohit
//Good Evening...Rohit
//Good Night...Rani
//Good Night...Rani
//Good Night...Rani

public class Prog4 extends Thread{

}

class Test4{
    public static void main(String[] args) {

        Prog4 p1=new Prog4();
        p1.setName("Ratan");
        for(int i=1;i<=2;i++){
            System.out.println("Good Morning..."+p1.getName());
        }

        Prog4 p2=new Prog4();
        p2.setName("Rohit");
        for(int i=1;i<=3;i++){
            System.out.println("Good Evening..."+p2.getName());
        }

        Prog4 p3=new Prog4();
        p3.setName("Rani");
        for(int i=1;i<=3;i++){
            System.out.println("Good Night..."+p3.getName());
        }

    }
}