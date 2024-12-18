/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagementsystem;

/**
 *
 * @author deathscythe
 */
public class Student {
    private int student_id;
    private String first_name;
    private String last_name;
    private int study_year;
    
    public Student(int student_id, String first_name, String last_name, int study_year){
        this.student_id = student_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.study_year = study_year;
    }
    
    public int getStudentId(){
        return this.student_id;
    }
    
    public String getFirstName(){
        return this.first_name;
    }
    
    public String getLastName(){
        return this.last_name;
    }    

    public int getStudyYear(){
        return this.study_year;
    }
}
