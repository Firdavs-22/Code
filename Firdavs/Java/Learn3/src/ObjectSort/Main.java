package ObjectSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(100,"a","b",999));
        list.add(new Employee(1,"a","a",1));
        list.add(new Employee(14,"a","a",5000));


        System.out.println("Before sort:\n"+list);
        Collections.sort(list,EmployeeComparator.name());
        System.out.println("After sort:\n"+list);
    }
}
