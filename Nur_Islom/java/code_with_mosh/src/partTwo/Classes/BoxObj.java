package partTwo.Classes;

public class BoxObj {
    public static void main(String[] args) {
        ClassBox obj = new ClassBox();
        obj.setText("This is ClassBox's object.");
        ClassBox obj1 = obj;
        obj1.setText("This is preference type and it will change obj's text.");
        System.out.println(obj.text);
    }
}
