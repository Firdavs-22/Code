package code_with_mosh.part_one;
import java.util.Scanner;
public class MortgageCalc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Principal: ");
        double p = scan.nextDouble();
        System.out.print("Annual Interest Rate: ");
        double r = scan.nextDouble();
        r /= 1200;
        System.out.print("Period (Years): ");
        int years = scan.nextInt();
        years *= 12;
        double formula = 1;
        for(int i = 0; i < years; i++){
            formula *= (1 + r);
        }
        double mortgage = ((r * formula) / (formula - 1)) * p;
        System.out.println();
        System.out.printf("Mortgage: %.2f", mortgage);
    }
}
