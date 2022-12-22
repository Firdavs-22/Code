public class java_4_1 {
    public static void main(String[] args){
        write(" "+add(1,3));
        write(" "+add(2,3,6));
        write(" "+add(1.1,3.2));
    }

    static void write(String text){
        System.out.println(text);
    }


    static int add(int x, int y){
        return x + y;
    }

    static int add(int x, int y,int z){
        return x + y + z;
    }

    static double add(double x,double y){
        return x+y;
    }
}
