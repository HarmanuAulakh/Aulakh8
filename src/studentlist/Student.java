/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentlist;

/**
 *
 * @author Ronak
 February 2022
 */
public class Student {
    
    private String studentId;
    private String studentName;
    private String StudentAge;
    
    public Student(String studentId,String studentName , String StudentAge){
        this.studentId = studentId;
        this.studentName=studentName;
        this.StudentAge=StudentAge;
        
        
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentAge() {
        return StudentAge;
    }

    public void setStudentAge(String StudentAge) {
        this.StudentAge = StudentAge;
    }
    
     
    
    
    
}
