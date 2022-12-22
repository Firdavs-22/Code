package Compare;

public class Compare {
    public static void main(String[] args) {
        int a = 7,
            b = 8,
            c = 7;
        System.out.println(a+" < "+b+" = "+(a < b));
        System.out.println(a+" > "+b+" = "+(a > b));
        System.out.println(a+" <= "+b+" = "+(a <= b));
        System.out.println(a+" >= "+c+" = "+(a >= c));
        System.out.println(a+" == "+c+" = "+(a == c));
        System.out.println(a+" != "+c+" = "+(a != c));

        double x = 1.2,
                y = 3.14;

        System.out.println(x+" > "+y+" = " + (x > y));
        System.out.println(x+" < "+y+" = " + (x < y));
        System.out.println(x+" <= "+y+" = " + (x <= y));
        System.out.println(x+" >= "+y+" = " + (x >= y));
        System.out.println(x+" == "+y+" = " + (x == y));
        System.out.println(x+" != "+y+" = " + (x != y));
    }
}
