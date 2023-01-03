package partTwo.Inheritance;

public class Upcasting_Downcasting {

    public static void main(String[] args) {
        var control = new UXControl(true);
        var classbox = new ClassBox();
        show(control); /*this classbox object automatically upcasting to UIControl parameter in show method*/
    }
    public static void show(UXControl control){
        if (control instanceof ClassBox) {
            var classbox = (ClassBox) control; /*this is how downcasting an object done manually*/
            classbox.setText("hello world");
        }
        System.out.println(control);
    }
}
