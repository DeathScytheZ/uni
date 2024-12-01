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
    
    public void superior(Student s){
        if(this.getYearOfStudy() > s.getYearOfStudy()){
            System.out.println("The first strudent's year of study is greater than the second one's");
        }else{
            System.out.println("The second strudent's year of study is greater than the first one's");
        }
    }

}
