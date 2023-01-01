package partTwo.OopDesign;

public class Main {
    public static void main(String[] args) {
        int principal = (int) Console.readNumber("Principal: ", 1_000, 1_000_000);
        float annualInterest = (float) Console.readNumber("Annual Interest Rate: ", 1, 100);
        byte period = (byte) Console.readNumber("Period (Years): ", 1, 30);
        var calculator = new MortgageCalculator(principal, annualInterest, period);
        new MortgageReport(calculator).printMortgage();
        new MortgageReport(calculator).printPaymentSchedule();
        /*
        var report = new MortgageReport(calculator);
        report.printMortgage();
        report.printPaymentSchedule();
        */
    }
}