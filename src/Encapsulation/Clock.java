package Encapsulation;

public class Clock {
    private int hr;
    private int min;
    private int sec;

    public void setHr(int hr){
        if(hr>=0 && hr<=12){
        this.hr=hr;
        }else {
            System.out.println("Idiot enter correct hr");
        }
    }

    public int getHr(){
        return this.hr;
    }

    public void setMin(int min){
        if(min>=0 && min<=12){
            this.min=min;
        }else {
            System.out.println("Idiot enter correct min");
        }
    }

    public int getMin(){
        return this.min;
    }

    public void setSec(int sec){
        if(sec >=0 && sec<=12){
            this.sec=sec;
        }
        else {
            System.out.println("Idiot enter correct sec");
        }
    }

    public int getSec(){
        return this.sec;
    }

    Clock(int hr,int min,int sec){
            this.hr=hr;
            this.min=min;
            this.sec=sec;
    }

    public void display(){
        System.out.println("Time is : "+ this.hr + ": "+ this.min +" : "+ this.sec);
    }
}

class ClockTower{
    public static void main(String[] args) {
        Clock c=new Clock(11,10,26);
        c.display();
        c.setHr(12);
        c.setMin(10);
        c.setSec(5);
        c.display();

    }
}

