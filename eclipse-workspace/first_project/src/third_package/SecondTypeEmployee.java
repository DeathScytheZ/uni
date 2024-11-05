package third_package;

public class SecondTypeEmployee extends Employee{
    private final double overTimeRate = 0.5;
    private double hourlyRate;
    private int hoursWorked;

    public SecondTypeEmployee(String name, String surname, int hoursWorked, double hourlyRate){
        super(name, surname);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double getSalary(){
        if (hoursWorked <= 39){
            return hourlyRate * hoursWorked;
        }else{
            int overTimeHours = hoursWorked - 39;
            return ((hourlyRate  * hoursWorked) + (overTimeHours * overTimeRate * hourlyRate));
        }
    }

}
