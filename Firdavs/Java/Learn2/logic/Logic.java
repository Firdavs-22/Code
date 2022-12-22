package logic;

public class Logic {
    public static void main(String[] args) {
        boolean b_1 = true,
                b_2 = false,
                b_3 = true,
                b_4 = false;

        /*
        *  && when all true
        *  || when have true
        *  ^ when not same
        *  ! return reverse
        * */

        System.out.println(b_1+" && "+ b_2+" = "+(b_1 && b_2));
        System.out.println(b_1+" && "+ b_3+" = "+(b_1 && b_3));
        System.out.println(b_2+" && "+ b_4+" = "+(b_2 && b_4));

        System.out.println(b_1+" || "+ b_2+" = "+(b_1 || b_2));
        System.out.println(b_1+" || "+ b_3+" = "+(b_1 || b_3));
        System.out.println(b_2+" || "+ b_4+" = "+(b_2 || b_4));

        System.out.println(b_1+" ^ "+ b_2+" = "+(b_1 ^ b_2));
        System.out.println(b_1+" ^ "+ b_3+" = "+(b_1 ^ b_3));
        System.out.println(b_2+" ^ "+ b_4+" = "+(b_2 ^ b_4));

        System.out.println("!"+b_1+" = "+!b_1);
        System.out.println("!"+b_2+" = "+!b_2);

        System.out.println(b_1 && b_3);
        System.out.println(b_2 || b_4);
        System.out.println(b_1 ^ b_2);
    }
}
