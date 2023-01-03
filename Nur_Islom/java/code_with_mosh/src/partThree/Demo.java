package partThree;

import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        Account account = new Account();
        try {
            account.withdraw(10);
        } catch (InsufficentFundsException e) {
            System.out.println(e.getMessage());
        }
        /*try {
            account.deposit(-1);
        } catch (IOException e) {
            System.out.println("Logging");
            throw e;
        }*/
    }
}
