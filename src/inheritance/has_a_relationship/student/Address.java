package inheritance.has_a_relationship.student;

public class Address {
    int dno,pin;
    String street,state,country;

    Address(int dno,String street,int pin,String state,String country){
        this.dno=dno;
        this.street=street;
        this.pin=pin;
        this.state=state;
        this.country=country;
    }
}
