public class java_2 {
    public static void main(String[] args){
        String text = "Helo";
        System.out.println(text.length());
        System.out.println("123".length());
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());
        System.out.println(text.toLowerCase().indexOf("h"));
        System.out.println(text.indexOf("q"));
        System.out.println(text.concat("llo"));
        System.out.println("Hello\r\nWor\tld\b");
    }
}
