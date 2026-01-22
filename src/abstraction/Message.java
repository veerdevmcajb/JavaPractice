package abstraction;

abstract class Message {
    abstract void wish();
}

class Shiv extends Message{
    void wish(){
        System.out.println("Good morning form Shiv");
    }
}

class Veer extends Message{
    void wish(){
        System.out.println("Good Evening froom veer");
    }
}

class TectClient{
    public static void main(String[] args) {
        //Message m=new Message(); // error abstract cannot be instantiated

        Shiv s=new Shiv();
        s.wish();

        Veer v=new Veer();
        v.wish();

        System.out.println("*********");

        Message m1=new Shiv();
        m1.wish();

        Message m2=new Veer();
        m2.wish();
    }
}
