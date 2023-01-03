package partTwo.Polymorphism;

import partTwo.Inheritance.ClassBox;
import partTwo.Inheritance.UXControl;

public class Demo {
    public static void main(String[] args) {
        UXControl[] controls = {new ClassBox(), new Checkbox()};
        for (var control :
                controls) {
            control.render();
        }
    }
}
