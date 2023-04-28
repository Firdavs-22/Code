import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextToHTML {
    public static void main(String[] args) {
        String inputFileName = "/home/geek/JavaScript/Roadmap.org";
        String outputFileName = "/home/geek/JavaScript/output.html";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {

            // Write the HTML header and internal CSS
            writer.write("<!DOCTYPE html>\n");
            writer.write("<html>\n");
            writer.write("<head>\n");
            writer.write("<style>\n");
            writer.write("body { font-family: Arial, sans-serif; background-color: #292D3E;}\n");
            writer.write("</style>\n");
            writer.write("</head>\n");
            writer.write("<body>\n");

            String line;
            while ((line = reader.readLine()) != null) {
                line = replaceSymbolsWithTags(line);
                writer.write(line + "<br>\n");
            }

            // Write the HTML footer
            writer.write("</body>\n");
            writer.write("</html>\n");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String replaceSymbolsWithTags(String line) {
        String[] symbols = {"\\*", "/", "_", "=", "~", "\\+", "\\|", "-"};
        String[] tags = {"<strong>", "<em>", "<u>", "<mark>", "<del>", "<ins>", "<code>", "<s>"};

        for (int i = 0; i < symbols.length; i++) {
            String regex = symbols[i] + "(.*?)" + symbols[i];
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(line);
            StringBuffer sb = new StringBuffer();

            while (matcher.find()) {
                matcher.appendReplacement(sb, tags[i] + matcher.group(1) + tags[i].replace("<", "</"));
            }
            matcher.appendTail(sb);
            line = sb.toString();
        }

        return line;
    }
}
