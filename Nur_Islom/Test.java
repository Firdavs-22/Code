public class Test{
    static Test print(){
        return new Test();
    }
    public static void main(String[] args) {
        Test obj = print();
        obj.hello();
    }

    public void hello(){
        System.out.println("Hello");
    }
}
