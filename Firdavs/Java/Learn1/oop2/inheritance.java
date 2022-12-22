public class inheritance extends parent {
    public static int id = 123;
    protected static String name = "Child";
    public static void main(String[] args) {
        getInfo();
    }
    public static void getInfo(){
        function.write("P id: "+id+" name: "+name+" classification:"+classification);
    }
}
