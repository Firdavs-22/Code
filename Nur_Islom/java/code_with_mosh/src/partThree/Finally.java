package partThree;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Finally {
    public static void show(){
        FileReader reader = null;
        try {
            reader = new FileReader("file.txt");
            var value = reader.read();
        }
        catch (FileNotFoundException e) {
            System.out.println("Cannot find file. It doesn't exist or read-only.");
        } catch (IOException e) {
            System.out.println("Couldn't read a data.");
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println("couldn't close the file.");
                }
            }
        }
    }
}
