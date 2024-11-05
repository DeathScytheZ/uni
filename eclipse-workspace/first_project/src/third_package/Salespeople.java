package third_package;

public class Salespeople extends Employee{
    private final double commissionRate = 0.01;
    private double fixedSalary;
    private double weeklySales;

    public Salespeople(String name, String surname, double fixedSalary, double weeklySales){
        super(name, surname);
        this.fixedSalary = fixedSalary;
        this.weeklySales = weeklySales;
    }

    public double getSalary(){
        return fixedSalary + weeklySales * commissionRate;
    }

}
