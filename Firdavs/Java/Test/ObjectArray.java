public class ObjectArray {
    int a;
    ObjectArray(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return ""+this.a;
    }

    public static void main(String[] args) {
        Object[] arr = new Object[10];
        arr[0] = new Elem(1);
        arr[1] = new ObjectArray(2);


        for (Object elem :
                arr) {
            System.out.println(elem);
        }
    }
}

class Elem {
    int a;

    Elem(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return ""+this.a;
    }
}