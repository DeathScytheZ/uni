package second_package;

public class Student extends Person{
    private int yearOfStudy;

    public Student(String name, int age, int yearOfStudy){
        super(name, age);
        this.yearOfStudy = yearOfStudy;
    }

    public int getYearOfStudy() {
        return this.yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy){
        this.yearOfStudy = yearOfStudy;
    }
    
    public boolean superior(Student s){
        return this.getYearOfStudy() > s.getYearOfStudy();
    }

}
