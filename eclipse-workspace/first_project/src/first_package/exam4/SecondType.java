public class SecondType extends Employee{
    private final double overTimeRate = 0.5; 
    private int hoursWorked;
    private double hourlyRate;
    
    public SecondType(String name, int hoursWorked, double hourlyRate){
        super(name);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    
    public double getSalary(){
        if(hoursWorked < 39){
            return hoursWorked * hourlyRate; 
        }else{
            int extraHours = hoursWorked - 39;
            return (hoursWorked * hourlyRate) + (extraHours * hourlyRate * overTimeRate);
        }
    }
}
