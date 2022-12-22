public class java_1_1 {
    public static void main(String[] args){
        byte byte_type = -128;
        System.out.println("byte is number:"+byte_type+"~127");
        short short_type = -32768;
        System.out.println("short is number:"+short_type+"~32767");
        int int_type = -2147483648;
        System.out.println("int is number:"+int_type+"~2147483647");
        long long_type = -9223372036854775808L;
        System.out.println("long is number:"+long_type+"~9223372036854775807 must be ended with letter L");
        float float_type = 11.123456f;
        System.out.println("float is number:"+float_type+" after point number length 6 or 7 digits and must be ended with letter f");
        double double_type = 1.12345678901234567;
        System.out.println("double is number:"+double_type+" after point number length 15 digits and if you wont ended with letter d");
        System.out.println("In point number you can use e letter for *10 :2e1f = 20.0");
    }
}
