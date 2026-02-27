package singletonclass;

public class User {
    public static void main(String[] args) {
        Account.createObject();  // 1st time object will be created
        Account.createObject();  // 2nd time obj var have a address of that obj it is not null so it will not create a object.

        Account.createObject();
    }
}
