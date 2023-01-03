package partTwo.Encapsulation;

public class Employee {
    private int baseSalary;
    private int hourlyRate;
    public Employee(int baseSalary, int hourlyRate){
//        this.baseSalary = baseSalary;
//        this.hourlyRate = hourlyRate;
//        in constructor we can also call methods
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
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
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Hourly rate cannot be equal or less than zero.");
        this.hourlyRate = hourlyRate;
    }
    private int getHourlyRate(){
        return hourlyRate;
    }
    public int calculateWage(int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }
}