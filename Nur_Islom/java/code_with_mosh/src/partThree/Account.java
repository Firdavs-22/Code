package partThree;

import java.io.IOException;

public class Account {
    private float balance;
    public void deposit(float value) throws IOException{
        if (value <= 0) throw new /*IllegalArgumentException()*/ IOException();
    }
    public void withdraw(float value) throws InsufficentFundsException {
        if (value > balance)
            throw new InsufficentFundsException();
    }
}
