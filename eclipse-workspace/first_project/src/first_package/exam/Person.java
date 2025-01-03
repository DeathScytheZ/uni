public class Person {
    private String name;
    private String surname;
    private String birthdate;

    Person(String name, String surname, String birthdate){
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
    }

    public void print(){
        System.out.println("name: " + this.name);
        System.out.println("surname: " + this.surname);
        System.out.println("birthdate: " + this.birthdate); 
    }
}


