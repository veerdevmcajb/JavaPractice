package Interface;

public interface Services {
    void mobile();
    void laptop();

}

abstract class Veer implements Services{
    public void mobile(){
        System.out.println("This is mobile service center...");
    }
}

class Shiv extends Veer{
    public void laptop(){
        System.out.println("This is a Laptop service center..");
    }
}

class Test{
    public static void main(String[] args) {

        Shiv s=new Shiv();
        s.mobile();
        s.laptop();
    }
}
