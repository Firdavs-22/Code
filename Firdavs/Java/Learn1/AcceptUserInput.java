import java.util.Scanner;

public class AcceptUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = scanner.nextLine();

        System.out.println("How old are you?");
        int age = scanner.nextInt();
//        for fix new line
        scanner.nextLine();

        System.out.println("Your favorite food?");
        String food = scanner.nextLine();


        System.out.println(
            "Your Info:\r\n"+
            "name: "+name+"\r\n"+
            "age: "+age+" old"+"\r\n"+
            "Liked food: "+ food
        );
    }
}
