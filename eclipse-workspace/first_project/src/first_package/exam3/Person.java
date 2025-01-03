public class Person{
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public boolean superior(Person a, Person b){
        return a.age > b.age; 
    }
}
