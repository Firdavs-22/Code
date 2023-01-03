package partTwo.Overloading;

public class Constructor {
    public static void main(String[] args) {
        Employee employee = new Employee(60_000);
        Employee worker = new Employee(50_000, 20);
        System.out.println(worker.calculateWage());
        System.out.println(Employee.numberOfEmployees);
        Employee.printNumberOfEmployees();
    }
}
