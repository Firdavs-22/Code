public class ExceptionHandling  {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[10] = 50;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        } finally {
            System.out.println("Thanks for using our program.");
        }

        try {
            int[] nums = {1, 2, 3};
            System.out.println(nums[3]); // out of index
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("An exception occured: ".concat(String.valueOf(e)));
        } finally {
            System.out.println("Feel free to use our program.");
        }
        try {
            ExceptionHandling.divide(3, 0);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("Hello world");
    }

    public static void divide(int num1, int num2) throws ArithmeticException{
        if (num2 == 0)
            throw new ArithmeticException("Cannot divide by zero");
        else {
            int result = num1/num2;
            System.out.println("Result: " + result);
        }
    }
}
