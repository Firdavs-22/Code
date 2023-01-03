package partTwo.Abstract;

import partTwo.Polymorphism.Checkbox;

public final class CheckBox extends UIControl {
    /*final labeled classes can't be extended*/
    @Override
    public void render() {
        System.out.println("Render CheckBox");
    }
}