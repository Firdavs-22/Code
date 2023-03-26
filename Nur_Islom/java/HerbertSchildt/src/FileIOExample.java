import java.io.*;
public class FileIOExample {
    public static void main(String[] args) throws IOException {
        // open input and output files
        FileReader inputFile = new FileReader("input.txt");
        FileWriter outputFile = new FileWriter("output.txt");

        // read and write data
        int c;
        while ((c = inputFile.read()) != -1){
            outputFile.write(c);
        }

        // close input and output files
        inputFile.close();
        outputFile.close();
    }
}
