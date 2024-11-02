package first_package;

public class Person {
    private String name;
    private String surname;
    private Date birthdate;

    Person(String name, String surname, Date birthdate){
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
    }

    public String getName(){
        return this.name;
    }

    public String getSurname(){
        return this.surname;
    }
    public Date getBirthdate(){
        return this.birthdate;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public void setBirthdate(Date birthdate){
        this.birthdate = birthdate;
    }
    
    public void print(){
        System.out.println("name: " + getName());
        System.out.println("surname: " + getSurname());
        System.out.println("birthdate: " + getBirthdate().toString());
    }
}


