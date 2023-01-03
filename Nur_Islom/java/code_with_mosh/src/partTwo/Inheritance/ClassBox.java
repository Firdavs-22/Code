package partTwo.Inheritance;

public class ClassBox  extends UXControl {
public String text; // a field

        public ClassBox() {
                super(true); /*super should be first in constructor*/
                /*private members of superclass or parent class or base class are not visible or inherited to the child class or subclass*/
                /*System.out.println("ClassBox");*/
        }

        @Override
        public void render() {
                System.out.println("Render ClassBox");
        }

        @Override /*this is extra hint for java compiler that we are overriding toString method*/
        public String toString(){
                return text;
        }

        public void setText(String text){
                this.text = text; // this keyword means - an object of that class, simple as that.
        }

public void clear(){
        text = "";
        }
}
