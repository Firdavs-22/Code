import java.util.regex.Matcher;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Regex {
    public static void main(String[] args) {
        function.write(simple_match("dog","doggy"));
    }

    static boolean simple_match(String pattern,String text){
        Pattern pattern_ = Pattern.compile(pattern);
        Matcher match = pattern_.matcher(text);
        return match.find();
    }

    static void test(){
        Pattern pat = Pattern.compile("dog",Pattern.CASE_INSENSITIVE);
        //Pattern.CASE_INSENSITIVE  A==a
        //Pattern.LITERAL see special text to text
        //Pattern.UNICODE_CASE see unicode
        Matcher match = pat.matcher("It's rain cats and dogs!");
        boolean res = match.find();
        function.write( res ? "success" : "fail");
    }
}
