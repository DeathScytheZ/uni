package second_package;

public class Person{
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public boolean superior(Person p){
        return this.getAge() > p.getAge();
    }
}


