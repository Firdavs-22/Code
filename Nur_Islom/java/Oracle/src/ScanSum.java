import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;
public class ScanSum {
    public static void main(String[] args) throws IOException {
        Scanner scan = null;
        double sum = 0;

        try {
            scan = new Scanner(new BufferedReader(new FileReader("/home/geek/usnumbers.txt")));

            while (scan.hasNext()){
                if (scan.hasNextDouble()) sum += scan.nextDouble();
                else scan.next();
            }
        } finally {
            scan.close();
        }
        System.out.println(sum);
    }
}
