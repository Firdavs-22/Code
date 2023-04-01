import java.util.Scanner;

public class Root2 {
    public static void main(String[] args) {
        /*int i = 2;
        double r = Math.sqrt(i);

        System.out.format("The square root of %d is %f.%n", i, r);
        System.out.format("%f, %<+020.10f %n", Math.PI);*/

        /*// Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a number
        System.out.println("Enter a number:");

        // Read the number from the user
        double inputNumber = scanner.nextDouble();

        // Print the rounded number using System.out.format()
        System.out.format("Rounded to two decimal points: %.2f%n", inputNumber);

        // Close the scanner
        scanner.close();*/

        /*%[argument_index$][flags][width][.precision]conversion*/
        double number = 12345.6789;
        System.out.format("Formatted number: %+10,.2f%n", number);

    }
}
/*
* d -> formats an integer value as a decimal value.
* f -> formats a floating point value as a decimal value.
* n -> outputs a platform-specific line terminator.
* x -> formats an integer as a hexadecimal value.
* s -> formats any value as a string.
* tB -> formats an integer as a locale-specific month name.
* */