public class class_package {
    public static void main(String[] args) {
        my_package parent = new my_package();
        my_package.child parent_son = parent.new child();
        my_package.child.children son_son = parent_son.new children();

        function.write("parent: "+parent.classification+"\n"+"child: "+parent_son.classification+"\n"+"children: "+son_son.classification);
    }
}

class my_package{
    char classification = 'S';
    class child{
        char classification = 'A';
        class children{
            char classification = 'F';
        }
    }
}

class OuterClass {
    int x = 10;

    private static class InnerClass {
        int y = 5;
    }

        InnerClass in = new InnerClass();

    public static void main(String[] args) {
        OuterClass out = new OuterClass();
        function.write(out.in.y);
    }
}