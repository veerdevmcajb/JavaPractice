package singletonclass;

public class PrimeMinister {

    static PrimeMinister pm;
    private PrimeMinister(){
        System.out.println("PM Got elected");
    }

    public static void createObject(){
        if(pm==null){
            pm=new PrimeMinister();
        }
    }

}

class Test{
    public static void main(String[] args) {
        PrimeMinister.createObject();
        PrimeMinister.createObject();
        PrimeMinister.createObject();
    }
}
