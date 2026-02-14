package Encapsulation;

public class Bike {
    String brandName;
    private double topSpeed;
    double mileage;

    public void setTopSpeed(double topSpeed){
        if(topSpeed>=0 && topSpeed<=220) {
            this.topSpeed = topSpeed;
        }else {
            this.topSpeed=220;
        }
    }

    public double getTopSpeed(){
        return this.topSpeed;
    }

    Bike(String brandName, double topSpeed,double mileage){
        this.brandName=brandName;
        if(topSpeed>=0 && topSpeed<=220){
            this.topSpeed=topSpeed;
        }else {
            this.topSpeed=220;
        }
        this.mileage=mileage;
    }

    public void ride(){
        System.out.println("Brand Name is "+ this.brandName +" Top speed is "+this.topSpeed+" Mileage is "+ this.mileage);
    }
}

class BikeRide{
    public static void main(String[] args) {
        Bike b=new Bike("KTM",250,30);
        b.setTopSpeed(250);
        b.ride();

        Bike b2=new Bike("FZ",300,45);
        b2.setTopSpeed(250);
        b2.ride();
    }
}

