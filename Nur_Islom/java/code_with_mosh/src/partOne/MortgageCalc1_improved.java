package partOne;
import java.util.Scanner;
import java.text.NumberFormat;

public class MortgageCalc1_improved {
    public static void main(String[] args) {

        int principal = (int) readNumber("Principal: ", 1_000, 1_000_000);

        float annualInterest = (float) readNumber("Annual Interest Rate: ", 1, 100);

        byte period = (byte) readNumber("Period (Years): ", 1, 30);

        double mortgage = calculateMortgage(principal, annualInterest, period);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
    public static double readNumber(String prompt, double min, double max){
        Scanner scan = new Scanner(System.in);
        double value;
        while(true){
            System.out.print(prompt);
            value = scan.nextInt();
            if (value >= min && value <= max) break;
            System.out.println("Please Enter a value between " + min + " and " + max + ".");
        }
        return value;
    }
    public static double calculateMortgage(int principal, float annualInterest, float period){
        byte MONTHS_IN_YEAR = 12;
        byte PERCENT = 100;
        short numberOfPayments = (short) (period * MONTHS_IN_YEAR);
        float monthlyInterest = annualInterest / MONTHS_IN_YEAR / PERCENT;
        double mortgage = principal
                * (Math.pow(1 + monthlyInterest, numberOfPayments) * monthlyInterest)
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
        return mortgage;
    }
}