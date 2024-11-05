package third_package;

public abstract class Employee{
    private String name;
    private String surname;

    public Employee(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public String getName(){
        return this.name;
    }

    public String getSurname(){
        return this.surname;
    }
    
    public abstract double getSalary();
}