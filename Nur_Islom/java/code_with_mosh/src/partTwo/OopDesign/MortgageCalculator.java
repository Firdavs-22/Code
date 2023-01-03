package partTwo.OopDesign;

public class MortgageCalculator {
    private final static byte MONTHS_IN_YEAR = 12;
    private final static byte PERCENT = 100;
    private int principal; /*this is an amount of money that we lend*/
    private float annualInterest; /*this is an annual percentage of money we should pay*/
    private byte period; /*this is a period of time we want to take a loan for*/
    public MortgageCalculator(int principal, float annualInterest, byte period) {
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.period = period;
    }
    public double calculateMortgage() {
        /*this method will calculate the mortgage*/
        short numberOfPayments = getNumberOfPayments();/*numberOfPayments = period * MONTHS_IN_YEAR*/
        float monthlyInterest = getMonthlyInterest();/*monthlyInterest = annualInterest / MONTHS_IN_YEAR / PERCENT*/
        double mortgage = principal
                * (Math.pow(1 + monthlyInterest, numberOfPayments) * monthlyInterest)
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
        return mortgage;
    }
    public /*static*/ double calculateBalance(short numberOfPaymentsMade) { // static methods can only see static fields of a class
        /*this method will calculate a balance of our loan*/
        short numberOfPayments = getNumberOfPayments();
        float monthlyInterest = getMonthlyInterest();

        double balance = principal
                * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return balance;
    }
    public double[] getRemainingBalance(){
        var balances = new double[getNumberOfPayments()];
        for (short month = 1; month <= balances.length; month++)
            balances[month - 1] = calculateBalance(month);
        return balances;
    }
    private short getNumberOfPayments() {
        return (short) (period * MONTHS_IN_YEAR);
    }

    private float getMonthlyInterest() {
        return annualInterest / MONTHS_IN_YEAR / PERCENT;
    }
}
