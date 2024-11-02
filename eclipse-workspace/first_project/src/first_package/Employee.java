package first_package;

public class Employee extends Person{
    private double salary;
    
    public Employee(String name, String surname, Date birthdate, double salary){
        super(name, surname, birthdate);
        this.salary = salary;
    }
    
    public double getSalary(){
        return this.salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    @Override
    public void print(){
        super.print();
        System.out.println("salary: " + getSalary());
    }
}
