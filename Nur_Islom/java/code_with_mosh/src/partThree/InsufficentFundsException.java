package partThree;

// checked      => Exception

// unchecked    => RuntimeException
public class InsufficentFundsException extends Exception {
    public InsufficentFundsException(){
        super("Insufficent fund in your account");
    }
    public InsufficentFundsException(String message){
        super(message);
    }
}
