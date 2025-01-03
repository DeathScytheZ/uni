public class SalesPeople extends Employee{
    private double fixedSalary;
    private double weeklyEarnings;

    public SalesPeople(String name, double fixedSalary, double weeklyEarnings){
        super(name);
        this.fixedSalary = fixedSalary;
        this.weeklyEarnings = weeklyEarnings;
    }

    public double getSalary(){
        return fixedSalary + (weeklyEarnings * 0.1);
    }
}
