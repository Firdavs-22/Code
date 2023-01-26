package partThree.Exceptions;

// checked      => extends Exception

// unchecked    => extends RuntimeException
public class InsufficentFundsException extends Exception {
    public InsufficentFundsException(){
        super("Insufficent fund in your account");
    }
    public InsufficentFundsException(String message){
        super(message);
    }
}
