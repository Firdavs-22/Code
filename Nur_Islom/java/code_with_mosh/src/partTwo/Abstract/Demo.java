package partTwo.Abstract;
public class Demo {
    public static void main(String[] args) {
        UIControl[] controls = {new CheckBox(), new TextBox()};
        for (var control :
                controls) {
            control.render();
        }
    }
}