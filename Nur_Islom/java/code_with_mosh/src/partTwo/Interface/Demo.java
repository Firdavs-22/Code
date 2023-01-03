package partTwo.Interface;

public class Demo {

    public static void main(String[] args) {

        var calculator = new TaxCalculator(100_000);

        /*var report = new TaxReport(calculator);*/ /*this is constructor injection method
        that you pass values on constructor*/
        /*report.show();*/

        /*report.setCalculator(new NewTaxCalculator());*/ /*this is setter injection method
        that we can change dependency of our class throughout lifetime of our application*/
        /*report.show();*/

        var report = new TaxReport();
        report.show(calculator);
        report.show(new NewTaxCalculator());
    }
}