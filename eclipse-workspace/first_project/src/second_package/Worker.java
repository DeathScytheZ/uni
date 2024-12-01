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

    public void superior(Worker w){
        if(this.getSalary() > w.getSalary()){
            System.out.println("The first worker's salary is greater than the second one's");
        }else{
            System.out.println("The second worker's salary is greater than the first one's");
        }
    }
}
