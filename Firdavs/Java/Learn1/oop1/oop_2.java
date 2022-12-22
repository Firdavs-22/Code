public class oop_2
{
    public String specailText = "";
    public static void main(String[] args) {
        oop_2 obj = new oop_2("Bye World?");
        function.write(obj.specailText);
    }

    public oop_2(String text) {
        if (text.length() > 0) {
            specailText = text;
        }else {
            specailText = "Empty";
        }
    }
}
