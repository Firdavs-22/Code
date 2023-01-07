package partThree.Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TryCatch {
    public static void show(){
        try {
            var reader = new FileReader("file.txt");
            System.out.println("File opened");
        } catch (FileNotFoundException e) {
            System.out.println(/*"File doesn't exist or maybe read-only permission."*/ e.getMessage());
        }
    }
    public static void sayHello(String name){
        System.out.println(name.toUpperCase());
    }
}
