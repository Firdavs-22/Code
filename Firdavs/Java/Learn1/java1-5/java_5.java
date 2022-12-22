public class java_5 {
    public static void main(String[] args) {
        System.out.print(factorial(4));
    }

    static int factorial(int x){
        if (x == 1){
            return 1;
        }else {
            return x * factorial(x-1);
        }
    }
}
