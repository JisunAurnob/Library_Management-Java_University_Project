package org.classes;

import org.classes.Patron;

public class Student extends Patron{
    String studentId;
    String guardianName;
    String guardianContactNo;
    public void setStudentId(String studentId){
        this.studentId=studentId;
    }
    public void setGuardianName(String guardianName){
        this.guardianName=guardianName;
    }
    public void setGuardianContactNo(String guardianContactNo){
        this.guardianContactNo=guardianContactNo;
    }
    public String getStudentId(){
        return studentId;
    }
    public String getGuardianName(){
        return guardianName;
    }
    public String getGuardianContactNo(){
        return guardianContactNo;
    }
    public void showInfo(){
        System.out.println("Student ID: "+studentId);
        System.out.println("Student Guardian Name: "+guardianName);
        System.out.println("Student Guardian Contact No: "+guardianContactNo);
    }
}