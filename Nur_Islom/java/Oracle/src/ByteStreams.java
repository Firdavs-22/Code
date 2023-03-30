import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class ByteStreams {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;

        try {
            inputStream = new FileInputStream ("/home/geek/read.txt");
            outputStream = new FileOutputStream("/home/geek/write.txt");

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
