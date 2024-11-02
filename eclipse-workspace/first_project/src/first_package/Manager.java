package first_package;

public class Manager extends Employee{
    private String service;

    public Manager(String name, String surname, Date birthdate, double salary, String service){
        super(name, surname, birthdate, salary);
        this.service = service;
    }

    public String getService(){
        return this.service;
    }

    public void setService(String service){
        this.service = service;
    }

    @Override
    public void print(){
        super.print();
        System.out.println("service: " + getService());
    }
}
