package ObjectSort;

import java.util.Comparator;

public class EmployeeComparator {
    static Comparator<Employee> name(){
        return new NameComparator();
    }

    static Comparator<Employee> salary(){
        return new SalaryComparator();
    }

    static Comparator<Employee> nameAndSurname(){
        return new NameAndSurnameComparator();
    }
}

class NameComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee employee1, Employee employee2) {
        return employee1.compareTo(employee2);
    }
}

class SalaryComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee employee1, Employee employee2) {
        return employee1.salary-employee2.salary;
    }
}

class NameAndSurnameComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee employee1, Employee employee2) {
        int name = new NameComparator().compare(employee1,employee2);
        if (name == 0){
            return employee1.surname.compareTo(employee2.surname);
        }
        return name;
    }
}