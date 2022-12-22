import java.util.HashSet;

public class HashSetData {
    public static void main(String[] args) {
        idList();
    }

    static void idList(){
        HashSet<Integer> list = new HashSet<Integer>();

        list.add(1);
        list.add(777);
        list.add(111);

        function.write(list);
    }

    static void users(){
        HashSet<String> users = new HashSet<String>();

        users.add("John Doe");
        users.add("Test User");
        users.add("System Admin");
        users.add("Test User");

        function.write(users);

        users.remove("John Doe");

        function.write("John Doe? "+users.contains("John Doe"));

        function.write("size: "+users.size());

        for (String name :
                users) {
            function.write("user: "+name);
        }

        users.clear();

        function.write(users);
    }
}
