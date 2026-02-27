package singletonclass;

public class Marriage {
private static Marriage m;

        int age=29;

    private Marriage(){
        System.out.println("Got Married..");
    }

  public static Marriage createObj(){
        if(m==null){
            m=new Marriage();
        }
        return m;
    }
}


class Solution{
    public static void main(String[] args) {

       Marriage obj = Marriage.createObj();
       System.out.println("At the age of : "+obj.age);
       Marriage obj1 = Marriage.createObj();

    }
}
