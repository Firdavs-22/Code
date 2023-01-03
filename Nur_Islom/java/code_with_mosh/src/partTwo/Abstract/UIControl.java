package partTwo.Abstract;

public abstract class UIControl {
    private boolean isEnabled = true;
    public UIControl(boolean isEnabled) {
        this.isEnabled = isEnabled;
        /*System.out.println("UIControl");*/
    }
    public UIControl(){
        isEnabled = false;
    }
    public abstract void render(/*abstract methods can't hold body*/);
    /*any class extending abstract class must either be declared abstract
    or implement/override from superclass has abstract method within it*/
    public final void enable(){
        /*methods labeled with final keyword can't be overridden*/
        isEnabled = true;
    }
    public void disable(){
        isEnabled = false;
    }

    public boolean isEnabled() {
        return isEnabled;
    }
}
