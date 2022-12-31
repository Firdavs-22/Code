package PartOne;
import java.util.Scanner;
public class MortgageCalc1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        byte MONTH_IN_YEAR = 12;
        byte PERCENT = 100;

        System.out.print("Principal ($1K - $1M): ");
        int p = scan.nextInt();
        while(p < 1_000 || p > 1_000_000){
            System.out.println("Please enter a number between 1,000 and 1,000,000.");
            System.out.print("Principal ($1K - $1M): ");
            p = scan.nextInt();
        }

        System.out.print("Annual Interest Rate: ");
        double r = scan.nextDouble();
        while(r <= 0 || r > 30){
            System.out.println("Please enter a number between 0 and 30.");
            System.out.print("Annual Interest Rate: ");
            r = scan.nextDouble();
        }
        r = r / MONTH_IN_YEAR / PERCENT;

        System.out.print("Period (Years): ");
        int t = scan.nextInt();
        while(p <= 0){
            System.out.println("Please enter a positive number.");
            System.out.print("Period (Years): ");
            t = scan.nextInt();
        }
        t *= MONTH_IN_YEAR;

        double m = p * (Math.pow(1 + r, t) * r) / (Math.pow(1 + r, t) - 1);
        System.out.printf("Mortgage: $%.2f", m);
    }
}
