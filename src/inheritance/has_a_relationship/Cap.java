package inheritance.has_a_relationship;

public class Cap {
    public void open(){
        System.out.println("Cap is open");
    }

    public void close(){
        System.out.println("Cap is close");
    }
}

class Pen{
    String brandName;
    Cap cap;

     Pen(String brandName, Cap cap){
        this.brandName=brandName;
        this.cap=cap;
    }

    public void Write(){
         this.cap.open();
        System.out.println("Writing...");
        this.cap.close();
    }


    public static void main(String[] args) {
        System.out.println("Has a Relationship Example ");
        Pen p=new Pen("Reynold",new Cap());
        p.Write();
    }
}
