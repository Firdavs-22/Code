public class oop_1 {
    int x = 1;
    public static String text = "Hello";
    public String text_1 = "Bye";
    static String text_2 = "World";
    function fun = new function();

    public static void main(String[] args) {
        {
            oop_1 obj = new oop_1();
            function.write(""+obj.x);
            function.write(obj.fun);
        }
        {
            oop_1 text_obj = new oop_1();
            function.write(text);
            function.write(text_obj.text_1);
            function.write(text_2);
        }
    }
}
