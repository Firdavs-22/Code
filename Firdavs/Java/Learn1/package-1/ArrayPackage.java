import java.util.ArrayList;
import java.util.Collections;

public class ArrayPackage {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<Integer> inte = new ArrayList<Integer>();

        String[] arr = {"Hello","world","!"};

        list.add("John");
        list.add("Doe");
        list.add("Tester");

        System.out.println(list);
        System.out.println(arr);

        function.write(list.get(0));
        list.set(0,"Johnson");

        function.write(list.get(0));
        list.remove(0);

        function.write(list.size());

        int list_length = list.size();
        for (int i = 0;list_length > i;i++){
            function.write(list.get(i)+";");
        }

        for (String elem : list){
            function.write(elem+":");
        }


        function.write(list.get(0));
        list.clear();

        System.out.println(list);


        inte.add(0);
        inte.add(-1);
        inte.add(10);

        Collections.sort(inte);

        System.out.println(inte);
    }
}
