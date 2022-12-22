package bitoperations;

public class BitOperations {
    public static void main(String[] args) {
        int a = 4,
            b = 7;
        String a_bit = Integer.toBinaryString(a),
                b_bit = Integer.toBinaryString(b);
//        System.out.println(a+" = "+a_bit);
//        System.out.println(b+" = "+b_bit);

//        System.out.println(a_bit + " & " + b_bit + " = " + (a & b));
//        System.out.println(a_bit + " & " + b_bit + " = " + Integer.toBinaryString(a & b));
        /*
        * & this * in bit
        *   100
        *  *111
        *    =
        *   100
        *
        *   0*1 = 0,0*1 = 0,1*1 = 1;
        * */

//        System.out.println(a_bit + " | " + b_bit + " = " + (a | b));
//        System.out.println(a_bit + " | " + b_bit + " = " + Integer.toBinaryString(a | b));
        /*
         * & this + in bit
         *   100
         *  +111
         *    =
         *   111
         *
         *   0+1 = 1,0+1 = 1,1*1 = 1;
         * */

//        System.out.println(a_bit + " ^ " + b_bit + " = " + (a ^ b));
//        System.out.println(a_bit + " ^ " + b_bit + " = " + Integer.toBinaryString(a ^ b));
        /*
         * ^ this no same return 1 else 0
         *   100
         *  ^111
         *    =
         *   011 = 11
         *
         *   0^1 = 1,0^1 = 1,1^1 = 0;
         * */

//        System.out.println("~" + a_bit + " = " + (~a));
//        System.out.println("~" + a_bit + " = " + Integer.toBinaryString(~a));
//        System.out.println("~" + b_bit + " = " + (~b));
//        System.out.println("~" + b_bit + " = " + Integer.toBinaryString(~b));
        /*
         * ~ this reverse all 0 to 1 and 1 to 0
         *   ~0100
         *    0000 0000 0000 0000 0000 0000 0000 0100
         *    =
         *    1111 1111 1111 1111 1111 1111 1111 1011
         * */

//        System.out.println(a_bit + ">>1 = " + (a >> 1));
//        System.out.println(a_bit + ">>1 = " + Integer.toBinaryString(a >> 1));
//        System.out.println(b_bit + ">>1 = " + (b >> 1));
//        System.out.println(b_bit + ">>1 = " + Integer.toBinaryString(b >> 1));
        /*
         * >> this move all bit to > and last deleted
         *   ~0100
         *    =
         *    0010
         *
         *   this operation 2/ to same
         * */

//        System.out.println(a_bit + "<<1 = " + (a << 1));
//        System.out.println(a_bit + "<<1 = " + Integer.toBinaryString(a << 1));
//        System.out.println(b_bit + "<<1 = " + (b << 1));
//        System.out.println(b_bit + "<<1 = " + Integer.toBinaryString(b << 1));
        /*
         * >> this move all bit to < and add 0 in last
         *   ~0100
         *    =
         *    1000
         *
         *   this operation 2* to same
         * */

        int x = 5,y = 10;
        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toBinaryString(y));
        System.out.println(x&y);
        System.out.println(x|y);
        System.out.println(x^y);
        System.out.println(~x);
        System.out.println(x>>1);
        System.out.println(x<<1);
    }
}
