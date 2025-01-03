public class Student extends Person{
    private int year;
    
    public Student(String name, int age, int year){
        super(name, age); 
        this.year = year;
    }
    public boolean superior(Student a, Student b){
        return a.year > b.year; 
    }
}
