import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class CharacterStreams {
    public static void main(String[] args) throws IOException {
        FileReader inputStream = null;
        FileWriter outputStream = null;

        try {
            inputStream = new FileReader("/home/geek/read.txt");
            outputStream = new FileWriter("/home/geek/write.txt");

            int c;
            while ((c = inputStream.read()) != -1){
                outputStream.write(c);
            }
        } finally {
            if (inputStream != null) inputStream.close();
            if (outputStream != null) outputStream.close();
        }
    }
}
/*
* Character streams are designed for reading and writing text-based data (i.e., characters). They are also part of the java.io package and handle input and output operations in terms of characters rather than bytes. Character streams automatically take care of character encoding and decoding, which is important when working with text data in different character sets (e.g., ASCII, UTF-8, UTF-16). The main classes for character streams in Java are Reader and Writer and their subclasses, such as FileReader, FileWriter, BufferedReader, and BufferedWriter. Character streams are the recommended way to handle text-based data in Java, as they provide better support for internationalization and encoding conversions.*/
