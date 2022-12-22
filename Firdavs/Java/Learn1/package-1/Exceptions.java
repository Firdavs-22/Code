public class Exceptions {
    public static void main(String[] args) {
        try{
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            function.write("Your code is bad\r\n"+e);
        } finally {
            try {
                ageCheck();
            } catch (Exception e1){
                function.write(e1);
            }
        }
    }

    static void ageCheck(){
        int age = 1;
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        }
        else {
            System.out.println("Access granted - You are old enough!");
        }
    }
}
