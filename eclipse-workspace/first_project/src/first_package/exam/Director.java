public class Director extends Manager{
    private String company;

    public Director(String name, String surname, String birthDate, double salary, String service, String company){
        super(name, surname, birthDate, salary, service);
        this.company = company;
    }
    
    @Override
    public void print(){
        super.print();
        System.out.println("company: " + this.company);
    }
}
