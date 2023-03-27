public class Generics<T> {
    /*
    * Generics in Java is a feature that allows users to create reusable code that can work with different data types. With Generics, you can specify a type parameter when defining a class, interface or method. The type parameter can be used in the class or method to represent a specific type.
    * */
    public static <T extends Comparable<T>> void sort(T[] array){
        if (array == null || array.length < 2) return;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j].compareTo(array[i]) < 0) {
                    T temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
    private T data;
    public Generics(T data){
        this.data = data;
    }

    public T getData() {
        return this.data;
    }
    public void setData(T data){
        this.data = data;
    }

    public static void main(String[] args) {
        Generics<String> stringGenerics = new Generics<>("Hello world!");
        String stringData = stringGenerics.getData();
        System.out.println(stringData);

        Generics<Integer> integerGenerics = new Generics<>(123);
        Integer integerData = integerGenerics.getData();
        System.out.println(integerData);

        Integer[] numbers = {3, 4, 5, 2, 3, 5, 3, 6, 7, 0, 8, 9};
        Generics.sort(numbers);
        for (int n :
                numbers) {
            System.out.println(n);
        }
        String[] names = {"John", "Sally", "Adam", "Molly"};
        Generics.sort(names);
        for (String n :
                names) {
            System.out.println(n);
        }
    }
}
