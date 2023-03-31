import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
public class BufferedStreams {
    public static void main(String[] args) throws IOException {
        BufferedReader input = null;
        BufferedWriter output = null;

        try {
            input = new BufferedReader(new FileReader("/home/geek/read.txt"));
            output = new BufferedWriter(new FileWriter("/home/geek/write.txt"));

            int l;
            while((l = input.read()) != -1){
                output.write(l);
            }
        } finally {
            if (input != null) input.close();
            if (output != null) output.close();
        }
    }
}
