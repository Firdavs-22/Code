public class Variable {
    public static void main(String[] args) {
        byte b = 10;
        short s = 2000;
        int i = 1999999999;
        long l = -29999999999L;

        float f = 5.7f;
        double d = 3.12123123;

        boolean bool = true;
        char c = 'C';
        String str = "Test";

        String res = "";
        res += "Byte b = "+b+"\n";
        res += "Short s = "+s+"\n";
        res += "Int i = "+i+"\n";
        res += "Long l = "+l+"\n";
        res += "Float f = "+f+"\n";
        res += "Double d = "+d+"\n";
        res += "Boolean b = "+bool+"\n";
        res += "Char c = "+c+"\n";
        res += "String str = "+str+"\n";

        System.out.println(res);

        String x ="666";
        int sum = Integer.parseInt(x) + 111;
        System.out.println(sum);

        String numb = "53.5";
        double changed = Double.parseDouble(numb);
        System.out.println(changed);
        char firstLetter = 'F';
        System.out.println(firstLetter);
        int age = 18;
        System.out.println(age);
    }
}