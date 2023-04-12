import java.io.File;
import java.io.IOException;

public class FileClass {
    public static void main(String[] args) throws IOException {
        File txt = new File("/home/geek/new.txt");
//        txt.createNewFile();
        System.out.println(txt.exists());
    }
}
