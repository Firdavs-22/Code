public class Enumeration {
    public static void main(String[] args) {
        /* you don’t instantiate an ap using new*/
        Apple ap;

        ap = Apple.Jonathan;

        // Output an enum value.
        System.out.println("Value of ap: " + ap);
        System.out.println();

        ap = Apple.GoldenDel;

        // Compare two enum values.
        if (ap == Apple.GoldenDel)
            System.out.println("ap contains GoldenDel.\n");

        // Use an enum to control a switch statement.
        switch (ap){
            case RedDel -> System.out.println("Red Delicious is red.");
            case Jonathan -> System.out.println("Jonathan is red.");
            case Winesap -> System.out.println("Winesap is red.");
            case Cortland -> System.out.println("Cortland is red.");
            default -> {
                System.out.println("Golden Delicious is yellow.");
                System.out.println();
            }
        }
    }
}

enum Apple{
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}