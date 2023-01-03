package partTwo.Inheritance;

public class Main {
    public static void main(String[] args) {
        var point1 = new Point(1, 2);
        var point2 = new Point(1, 2);

        System.out.println(point1.hashCode() /*point1.equals(new ClassBox())*/);
        System.out.println(point2.hashCode());
    }
}
