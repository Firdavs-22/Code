package partThree.Exceptions;

import java.io.IOException;

public class Account {
    private float balance;
    public void deposit(float value) throws IOException{
        if (value <= 0) throw new /*IllegalArgumentException()*/ IOException();
    }
    public void withdraw(float value) throws AccountException {
        if (value > balance) {
            /*var fundsException = new InsufficentFundsException();*/
            /*var accountException =*/ throw new AccountException(new InsufficentFundsException());
            /*accountException.initCause(fundsException);*/
            /*throw accountException;*/
        }
    }
}
