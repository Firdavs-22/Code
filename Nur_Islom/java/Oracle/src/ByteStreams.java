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
/*
* Byte streams are used for reading and writing binary data, such as images, audio files, or any file format that isn't text-based. They operate on data in terms of bytes (8-bit chunks) and are part of the java.io package. The main classes for byte streams in Java are InputStream and OutputStream and their subclasses, such as FileInputStream, FileOutputStream, BufferedInputStream, and BufferedOutputStream. Byte streams are useful when you're working with raw binary data, but they are not suitable for reading and writing character-based data.*/
