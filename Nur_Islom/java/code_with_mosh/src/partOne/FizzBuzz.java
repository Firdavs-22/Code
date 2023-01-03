package partOne;

import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("You are in PartOne.FizzBuzz program." +
                "If you want to exit type CTRL + C or CTRL + F2");
        while (true) {
            System.out.println("Number: ");
            int num = scan.nextInt();
            // if divisible by 5 => Fizz
            boolean isDivisibleByThree = num % 3 == 0;
            // if divisible by 3 => Buzz
            boolean isDivisibleByFive = num % 5 == 0;
            if (isDivisibleByFive && isDivisibleByThree) {
                System.out.println("PartOne.FizzBuzz");
            } else if (isDivisibleByThree) {
                System.out.println("Buzz");
            } else if (isDivisibleByFive) {
                System.out.println("Fizz");
            } else {
                System.out.println(num);
            }
        }
    }
}
