public class Annotation {
        /**
         * @deprecated This method is deprecated and will be removed in future versions.
         * Use the add(int, int) method instead.
         */
        @Deprecated
        public int add(int a, int b){
            return a + b;
        }
        public int add(int... numbers){
            int sum = 0;
            for(int num: numbers){
                sum += num;
            }
            return sum;
        }
    public static void main(String[] args) {
        Annotation calculator = new Annotation();

        int result = calculator.add(1, 2, 4, 5);
        System.out.println(result);

        System.out.println(calculator.add(2, 3)); // Deprecated method warning will be shown in IDE
    }
}