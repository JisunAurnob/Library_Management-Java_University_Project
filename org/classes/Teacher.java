package org.classes;

import org.classes.Patron;

public class Teacher extends Patron{
    String teacherId;
    public void setTeacherId(String teacherId){
        this.teacherId=teacherId;
    }
    public String getTeacherId(){
        return teacherId;
    }
    public void showInfo(){
        System.out.println("Teacher ID: "+teacherId);
    }
}