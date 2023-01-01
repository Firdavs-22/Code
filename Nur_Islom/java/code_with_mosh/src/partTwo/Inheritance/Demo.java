package partTwo.Inheritance;

public class Demo {
    public static void main(String[] args) {
        UIControl control = new UIControl();
        System.out.println(control.isEnabled());
        control.disable();
        System.out.println(control.isEnabled());
    }
}
