package partTwo.Inheritance;

public class UXControl {
    private boolean isEnabled = true;
    public UXControl(boolean isEnabled) {
        this.isEnabled = isEnabled;
        /*System.out.println("UIControl");*/
    }
    public UXControl(){
        isEnabled = false;
    }
    public void render(){

    }
    public void enable(){
        isEnabled = true;
    }
    public void disable(){
        isEnabled = false;
    }

    public boolean isEnabled() {
        return isEnabled;
    }
}
