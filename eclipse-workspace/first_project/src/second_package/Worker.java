package second_package;

public class Worker extends Person{
    private double salary;

    public Worker(String name, int age, double salary){
        super(name, age);
        this.salary = salary;
    }

    public double getSalary(){
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean superior(Worker w){
        return this.getSalary() > w.getSalary();
    }
}
