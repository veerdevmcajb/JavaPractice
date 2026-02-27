package singletonclass;

public class AadharCard {

    private static AadharCard ac = null;

    private AadharCard(){
        System.out.println("Aadhaar Card Created..");

    }

    public static void createAadharObject(){
        if(ac==null){
            ac=new AadharCard();
            System.out.println(ac);
        }else {
            System.out.println("Aadhaar not created..");
        }
    }

}
