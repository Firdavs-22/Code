package Test;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
   public static void main(String[] args) {
      try{
         File filename = new File("samplefile_01.txt");
         Scanner file = new Scanner(filename);
//         while (file.hasNext()) {
//            String line = file.nextLine();
//            System.out.println(line);
//         }
         file.close();
      } catch(FileNotFoundException e) {
         System.out.println(e);
      }
   }
}
