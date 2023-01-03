package partTwo.Overloading;

public class Employee {
    private int baseSalary;
    private int hourlyRate;
    public Employee(int baseSalary, int hourlyRate){
//        this.baseSalary = baseSalary;
//        this.hourlyRate = hourlyRate;
//        in constructor we can also call methods
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployees++;
    }
    public Employee(int baseSalary){
        this(baseSalary, 0);
        /* same as above
        setBaseSalary(baseSalary);
        setHourlyRate(0);
        */
    }
    private void setBaseSalary(int baseSalary){// this is setter and one of the method of encapsulation
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Salary cannot be equal or less than zero.");
        this.baseSalary = baseSalary;
    }

    private int getBaseSalary(){// this is getter and one of the method of encapsulation
        return baseSalary;
    }
    private void setHourlyRate(int hourlyRate){
        this.hourlyRate = hourlyRate;
    }
    private int getHourlyRate(){
        return hourlyRate;
    }
    public int calculateWage(int extraHours) { // the methods which are not labeled static, we call them instance methods, which means it will used by only objects (instances)
        return getBaseSalary() + (getHourlyRate() * extraHours);
    }
    public int calculateWage() {// from overloading methods there could be some difficulties, if you can, don't overload too methods
        return calculateWage(0);
    }

    public static int numberOfEmployees; // we can create static variables
    public static void printNumberOfEmployees(){ // and also we can create static methods
        System.out.println(numberOfEmployees);
    }
}