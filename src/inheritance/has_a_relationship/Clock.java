package inheritance.has_a_relationship;

public class Clock {
    int hr;
    int min;
    int sec;

    Clock(int hr,int min,int sec){
        this.hr=hr;
        this.min=min;
        this.sec=sec;
    }
}

class ClockTower{
    Clock clock;
    String loc;
    ClockTower(Clock clock,String loc){
        this.clock=clock;
        this.loc=loc;
    }

    public void showTime(){
        System.out.println("Loc "+this.loc + " Showing Time is -> "+ this.clock.hr +" : "+ this.clock.min +" : "+ this.clock.sec);
    }

    public static void main(String[] args) {
        ClockTower ct=new ClockTower(new Clock(10,11,45),"Pune");
        ct.showTime();
    }
}
