package inheritance.has_a_relationship;

public class Address {

    int dno;
    String street, state;

    Address(int dno,String street,String state){
        this.dno=dno;
        this.street=street;
        this.state=state;
    }
}
