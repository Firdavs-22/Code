import java.io.*;
import java.util.Scanner;
import java.io.IOException;
public class ScanRead {
    public static void main(String[] args) throws IOException {
        Scanner scan = null;
        try {
            scan = new Scanner(new BufferedReader(new FileReader("/home/geek/read.txt")));

            while (scan.hasNext()){
                System.out.println(scan.next());
            }
        } finally {
            if (scan != null){
                /*Even though a scanner is not a stream, you need to close it to indicate that you're done with its underlying stream.*/
                scan.close();
            }
        }
    }
}