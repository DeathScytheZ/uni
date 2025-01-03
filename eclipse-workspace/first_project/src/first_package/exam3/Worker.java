public class Worker extends Person{
    private double salary;

    public Worker(String name, int age, double salary){
        super(name, age);
        this.salary = salary;
    }

    public boolean superior(Worker a, Worker b){
        return a.salary > b.salary;
    }
}
