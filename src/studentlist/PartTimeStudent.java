/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentlist;

/**
 *
 * @author aulak
 */
public class PartTimeStudent  {
    
    private String studentId;
    private String studentName;
    private String studentAge;
    
    
     public PartTimeStudent(String studentId,String studentName , String StudentAge){
        this.studentId = studentId;
        this.studentName=studentName;
        this.studentAge=StudentAge;
        
        
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
        return studentAge;
    }

    public void setStudentAge(String studentAge) {
        this.studentAge = studentAge;
    }
    
     

     
     
 
}
