import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class sumAndPrint {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("data_01.txt"));
            int sum = file.nextInt() + file.nextInt() + file.nextInt(),
                current = 0;
            System.out.println(sum);
            while (file.hasNext()) {
                current = file.nextInt() + file.nextInt() + file.nextInt();
                System.out.println(current);
                if (current > sum) sum = current;
            }
            System.out.println("max:"+sum);
            file.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
