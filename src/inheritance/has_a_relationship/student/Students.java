package inheritance.has_a_relationship.student;

import inheritance.multiLevel.A;

public class Students {
    int sid;
    String sName;
    String schoolName;
    Parent p;
    Marks m;
    Address add;

    Students(int sid, String sName, String schoolName, Parent p, Marks m, Address add){
        this.sid=sid;
        this.sName=sName;
        this.schoolName=schoolName;
        this.p=p;
        this.m=m;
        this.add=add;
    }

    void status(){
        System.out.println("Student id is: "+sid);

        int total=m.m1+m.m2+m.m3;
        if(total >=150){
            System.out.println("Your Result is : Pass");
        }else {
            System.out.println("Your result is : Fail");
        }

        System.out.println("Student Name is: "+sName);
        System.out.println("Student School Name is: "+schoolName);
        System.out.println("Student Parent Name: " +"Father Name: "+ p.fName + " Mother Name : "+ p.mName);
        System.out.println("Student Marks is: "+m.m1+" "+ m.m2 +" "+ m.m3);
        System.out.println("Student Address is: "+add.dno +" "+add.street +" "+ add.pin +" "+ add.state +" "+ add.country);
        System.out.println("***************************");

    }

    public static void main(String[] args) {
        Address addres=new Address(206,"Narhe",431602,"MH","India");

        Marks m =new Marks(75,55,80);

        Parent p=new Parent("Ram","Sita");

        Students s= new Students(01,"Veer","Brainworks",p,m,addres);
        s.status();

        Students s1=new Students(02,"Natha","MIT",new Parent("Mahadev","Parvati"),new Marks(80,50,99),new Address(501,"Jalna",431401,"MH","India"));
        s1.status();

        Students s2=new Students(03,"Abhya","Jspm",new Parent("Xyz","Pqr"),new Marks(30,40,50),new Address(420,"Wadgaon",420420,"MH","India"));
        s2.status();
    }
}
