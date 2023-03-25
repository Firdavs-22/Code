import java.util.ArrayList;
import java.util.List;

public class Autoboxing {/*Autoboxing in short, an action of converting primitive value to an object of it's class*/
    public static void main(String[] args) {
        int i = 10;
        Integer integer = i; // autoboxing int to Integer

        System.out.println("Value of i: " + i);
        System.out.println("Value of integer: " + integer);

        double d = 10.5;
        Double doubleValue = d; // autoboxing double to Double

        System.out.println("Value of d: " + d);
        System.out.println("Value of doubleValue: " + doubleValue);

        boolean b = true;
        Boolean booleanValue = b; // autoboxing boolean to Boolean

        System.out.println("Value of b: " + b);
        System.out.println("Value of booleanValue: " + booleanValue);

        List<Integer> numbers = new ArrayList<Integer>();
        /*numbers.add(Integer.valueOf(1));
        numbers.add(Integer.valueOf(2));
        numbers.add(Integer.valueOf(3));*/
        // with autoboxing the same code can be written as
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        Integer myInt = 10; // autoboxing - converting int to Integer
        System.out.println(myInt.toString()); // calling toString() method of Integer class

        Double myDouble = Double.valueOf("10.5"); // creating Double object from a string value
        System.out.println(myDouble);

        List<Integer> number = new ArrayList<>();
        number.add(42); // autoboxing int to Integer
        int x = number.get(0); // autoboxing Integer to int
    }
}
