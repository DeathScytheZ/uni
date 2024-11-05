package third_package;

public class FirstTypeEmployee extends Employee{    
    private final double overTimeRate = 0.3;
    private double hourlyRate;
    private int hoursWorked;

    public FirstTypeEmployee(String name, String surname, int hoursWorked, double hourlyRate){
        super(name, surname);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    
    public double getSalary(){
        if (hoursWorked <= 39) {
            return hourlyRate * hoursWorked;
        }else{
            int overTimeHours = hoursWorked - 39;
            return ((hourlyRate * hoursWorked) + (overTimeHours * overTimeRate * hourlyRate));  
        }
    }

}
