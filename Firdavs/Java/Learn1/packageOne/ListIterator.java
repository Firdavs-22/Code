import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ListIterator {
    public static void main(String[] args) {
        idList();
    }

    static void idList(){
        HashSet<Integer> list = new HashSet<Integer>();

        for (int i= 0;i <= 101; i++){
            list.add(i);
        }

        Iterator<Integer> list_it = list.iterator();
        while (list_it.hasNext()){
            int curr = list_it.next();
            if (curr == 0){
                function.write("this id's "+curr+" is a Develop Admin");
            } else if (curr > 0 && curr < 10) {
                function.write("this id's "+curr+" is a Admin");
            } else if (curr < 100) {
                function.write("this id's "+curr+" is a Operator");
            }else {
                function.write("this id's "+curr+" deleted");
                list_it.remove();
            }
        }

        function.write(list);
    }

    static void users(){
        ArrayList<String> list = new ArrayList<String>();

        list.add("John Doe");
        list.add("Tester");
        list.add("Admin");
        list.add("System");

        Iterator<String> list_it = list.iterator();
        Iterator<String> list_all = list.iterator();

        function.write(list_it.next());
        function.write(list_it.next());

        while (list_all.hasNext()){
            function.write("<<"+list_all.next());
        }


    }
}
