package exception_Handling;

public class InvalidPassword extends RuntimeException{

    InvalidPassword(String msg){
        super(msg);
    }
}
