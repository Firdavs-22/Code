import java.util.Scanner;
import com.database.db;

public class package_oop
{
    public static void main(String[] args) {
        Scanner scanObj = new Scanner(System.in);
        function.write("Please enter anything text:");

        String text = scanObj.nextLine();
        function.write("Why you enter this text: \""+text+"\"");

        db db_conn = new db("","hello","localhost");
    }
}
