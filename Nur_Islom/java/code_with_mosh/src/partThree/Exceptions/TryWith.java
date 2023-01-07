package partThree.Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TryWith {
    public static void show(){
        /*with this block we don't need to explicitly close() the file, java compiler does it for us*/
        try (
                var reader = new FileReader("file.txt");
                var writer = new FileWriter("..."); ){
            var value = reader.read();
        }
         catch (IOException e) {
            System.out.println("Couldn't read a data.");
        }
    }
}
