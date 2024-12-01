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

    public void  superior(Person p){
        if(this.getAge() > p.getAge()){
            System.out.println("The first person's age is greater than the second one's");
        }else{
            System.out.println("The second person's age is greater than the first one's");
        }
    }
}


