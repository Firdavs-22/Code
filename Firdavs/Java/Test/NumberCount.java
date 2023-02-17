import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NumberCount {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("pi_1000.txt"));
            String pi = file.next();
            int[] number = new int[10];
            int max = (new Scanner(System.in)).nextInt();
            number[3]++;
            for (int i = 0; i < max; i++) {
                number[Integer.parseInt(String.valueOf(pi.charAt(i+2)))]++;
            }

            for (int i = 0; i < 10; i++) {
                if (
                        number[i] >= number[0] &&
                        number[i] >= number[1] &&
                        number[i] >= number[2] &&
                        number[i] >= number[3] &&
                        number[i] >= number[4] &&
                        number[i] >= number[5] &&
                        number[i] >= number[6] &&
                        number[i] >= number[7] &&
                        number[i] >= number[8] &&
                        number[i] >= number[9]
                ){
                    System.out.println(i+":"+number[i]);
                }
            }
            file.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
