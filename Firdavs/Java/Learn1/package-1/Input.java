import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter something text: ");
        String text = input.nextLine();
        System.out.println("You Entered: "+text);
        System.out.print("Enter something number: ");
        int num = input.nextInt();
        System.out.println("You Entered: "+num);
        System.out.print("Enter true or false: ");
        boolean cond = input.nextBoolean();
        System.out.println("You Entered: "+cond);
        System.out.print("Enter number: ");
        double numb = input.nextDouble();
        System.out.println("You Entered: "+numb);
    }
}
