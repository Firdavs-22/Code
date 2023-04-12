import java.util.Scanner;

public class DelimiterExample {
    public static void main(String[] args) {
        // A sample input string
        String input = "John,Doe,30,Software Developer";

        // Create a Scanner object with the input string
        Scanner scanner = new Scanner(input);

        /* By default, the Scanner uses whitespace as the delimiter, but you can change it to any regular expression using useDelimiter().*/
        // Set the delimiter to a comma using useDelimiter()
        scanner.useDelimiter(",");

        // Read and print the values using the specified delimiter
        String firstName = scanner.next();
        String lastName = scanner.next();
        int age = scanner.nextInt();
        String occupation = scanner.next();

        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Occupation: " + occupation);

        // Close the scanner
        scanner.close();
    }
}
