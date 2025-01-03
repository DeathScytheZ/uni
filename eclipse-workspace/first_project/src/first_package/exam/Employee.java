public class Employee extends Person{
    private double salary;
    
    public Employee(String name, String surname, String birthdate, double salary){
        super(name, surname, birthdate);
        this.salary = salary;
    }
    
    @Override
    public void print(){
        super.print();
        System.out.println("salary: " + this.salary);
    }
}
