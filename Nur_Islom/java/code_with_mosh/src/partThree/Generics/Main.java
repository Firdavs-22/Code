package partThree.Generics;

import jdk.jshell.execution.Util;

public class Main {
    public static void main(String[] args) {
        /*var list = new GenericList<Integer>();
        list.add(1);
        int x = list.get(0);*/

        /*GenericList<User> numbers = new GenericList<>();
        numbers.add(new User(1)); // Boxing
        User number = numbers.get(0); // Unboxing*/

        /*var user = new User(10);
        var user1 = new User(12);
        System.out.println(user.compareTo(user1));*/

        /*System.out.println(Utils.max(new User(12), new User(23)));
        Utils.print(2, "Mosh");*/

        User user = new Instructor(10);
        Utils.printUser(user);
    }
}
