package partTwo.Encapsulation;

public class Constructor {
    public static void main(String[] args) {
        Employee worker = new Employee(50_000, 20);
        System.out.println(worker.calculateWage(10));
    }
}
