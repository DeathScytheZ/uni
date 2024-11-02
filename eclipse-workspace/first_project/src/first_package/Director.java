package first_package;

public class Director extends Manager{
    private String company;

    public Director(String name, String surname, Date birthdate, double salary, String service, String company){
        super(name, surname, birthdate, salary, service);
        this.company = company;
    }

    public String getCompany(){
        return this.company;
    }

    public void setCompany(String company){
        this.company = company;
    }

    @Override
    public void print(){
        super.print();
        System.out.println("company: " + getCompany());
    }
}
