import java.io.*;
public class KeyboardIOExample {
    public static void main(String[] args) throws IOException {
        // create a buffered reader to read from the keyboard
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // read input from the user
        System.out.println("Enter your name: ");
        String name = br.readLine();

        // display the input
        System.out.println("Hello, ".concat(name).concat("!"));
    }
}
