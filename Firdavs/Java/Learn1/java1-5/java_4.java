public class java_4 {
    public static void main(String[] args){
        writeHello();
        write("1234");
        add(1,3);
        write("boolean true :"+true_value());
    }

    static void writeHello(){
        write("Hello");
    }

    static void write(String text){
        System.out.println(text);
    }

    static void add(int x,int y){
        System.out.println(x+y);
    }

    static int true_value(){
        return 1;
    }

}