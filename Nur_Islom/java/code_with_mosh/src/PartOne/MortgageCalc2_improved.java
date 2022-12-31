package PartOne;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalc2_improved {
        final static byte MONTHS_IN_YEAR = 12;
        final static byte PERCENT = 100;
    public static void main(String[] args) {
        int principal = (int) readNumber("Principal: ", 1_000, 1_000_000);
        float annualInterest = (float) readNumber("Annual Interest Rate: ", 1, 100);
        byte period = (byte) readNumber("Period (Years): ", 1, 30);
        printMortgage(principal, annualInterest, period);
        printPaymentSchedule(principal, annualInterest, period);
    }

    private static void printMortgage(int principal, float annualInterest, byte period) {
        double mortgage = calculateMortgage(principal, annualInterest, period);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println();
        System.out.println("Mortgage");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }

    private static void printPaymentSchedule(int principal, float annualInterest, byte period) {
        System.out.println();
        System.out.println("Payment Schedule");
        System.out.println("----------------");
        for (short month = 1; month <= period * MONTHS_IN_YEAR; month++) {
            double balance = calculateBalance(principal, annualInterest, period, month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
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

        short numberOfPayments = (short) (period * MONTHS_IN_YEAR);
        float monthlyInterest = annualInterest / MONTHS_IN_YEAR / PERCENT;
        double mortgage = principal
                * (Math.pow(1 + monthlyInterest, numberOfPayments) * monthlyInterest)
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
        return mortgage;
    }
    public static double calculateBalance(int principal, float annualInterest, float period, short numberOfPaymentsMade){

        short numberOfPayments = (short) (period * MONTHS_IN_YEAR);
        float monthlyInterest = annualInterest / MONTHS_IN_YEAR / PERCENT;

        double balance = principal
                * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return balance;
    }
}