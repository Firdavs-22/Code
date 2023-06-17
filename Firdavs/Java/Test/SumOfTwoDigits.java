import java.util.Scanner;
class SumOfTwoDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(
            sumOfTwoDigits(scan.nextInt(), scan.nextInt())
        );
    }

    static int sumOfTwoDigits(int a, int b) {
        return a + b;
    }
}