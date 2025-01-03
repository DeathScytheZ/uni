public class Manager extends Employee{
    private String service;
    
    public Manager(String name, String surname, String birthDate, double salary, String service){
        super(name, surname, birthDate, salary);
        this.service = service;
    }

    @Override
    public void print(){
        super.print();
        System.out.println("service: " + this.service);
    }   
}
