import java.util.LinkedList;

public class LinkedListArray {
    public static void main(String[] args) {
        LinkedList<String> car_list = new LinkedList<String>();
        car_list.add("Hello");
        car_list.add("World");
        car_list.add("Bye");
        car_list.add("Earth");
        car_list.addFirst("!");
        car_list.addLast("?");
        function.write(car_list);
        car_list.removeFirst();
        car_list.removeLast();
        function.write(car_list);
        function.write(car_list.getFirst());
        function.write(car_list.getLast());

    }
}
