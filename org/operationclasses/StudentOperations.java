package org.operationclasses;
import org.classes.Patron;
import org.classes.Student;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StudentOperations{
    Scanner sc = new Scanner(System.in);
    public void insertStudent(Student s){
        FileWriter fw=null;
        FileReader fr = null;
        BufferedReader br = null;
        File f = new File("D:\\Study Zone\\4th Semester\\Java\\Project Final\\org\\operationclasses\\database\\StudentInfo\\studentinfo.txt");
        System.out.print("Enter Patron ID: ");
        int pId = sc.nextInt();
        sc.nextLine();
        try{
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            String st=" ";
            String []words=null;
            while((st=br.readLine()) !=null){ 
				words=st.split(" ");
            for (String word : words){
                if(word.equals(Integer.toString(pId))){ 
                     System.out.println("Patron ID Already Existed Give Different ID");
                     return;}
        }
			   }
        }
        catch(Exception e){
            System.out.println("Exception Caught");
        }
        finally{
            try{
                fr.close();
            }
            catch(IOException ie){
                System.out.println("Cannot Close Database");
            }
            catch(NullPointerException ie){
                System.out.print("");
            }
        }
        s.setId(pId);
        System.out.println("");
        System.out.print("Enter Patron Name: ");
        String pName = sc.nextLine();
        s.setName(pName);
        System.out.println("");
        System.out.print("Enter Patron Department Name: ");
        String departmentName = sc.nextLine();
        s.setDepartmentName(departmentName);
        System.out.println("");
        System.out.print("Enter Patron Email: ");
        String email=sc.nextLine();
        s.setEmail(email);
        System.out.println("");
        System.out.print("Enter Patron Contact No: ");
        String contactNo=sc.nextLine();
        s.setContactNo(contactNo);
        System.out.println("");
        System.out.print("Enter Patron Address: ");
        String pAddress=sc.nextLine();
        s.setAddress(pAddress);
        System.out.println("");
        System.out.print("Enter Amount(Patron): ");
        double amount = sc.nextDouble();
        sc.nextLine();
        s.setAmount(amount);
        System.out.println("");
        System.out.print("Enter Student ID: ");
        String studentId = sc.nextLine();
        s.setStudentId(studentId);
        System.out.println("");
        
        try{
            fr= new FileReader(f);
            br=new BufferedReader(fr);
			String st="";
			String []words=null;
			while((st=br.readLine()) !=null){   
				words=st.split(" ");
            for (String word : words){
              if(word.equals(studentId)){
					System.out.println("-------StudentID Already Exist Try Another-------");
					 return;
				}	
		  }
		}						 
			fr.close();
	}				
			catch(IOException he){
				System.out.println("Error caught");
            }
        System.out.print("Enter Guardian Name: ");
        String guardianName = sc.nextLine();
        s.setGuardianName(guardianName);
        System.out.println("");
        System.out.print("Enter Guardian Contact No: ");
        String guardianContactNo = sc.nextLine();
        s.setGuardianContactNo(guardianContactNo);
        System.out.println("");
        
        try{
            fw = new FileWriter(f,true);
            String st= "-----------Student Information--------\n";
            fw.write(st);
            st= "Patron ID: "+pId+" ";
            fw.write(st);
            st= "Patron Name: "+pName+" ";
            fw.write(st);
            st= "Patron Department Name: "+departmentName+" ";
            fw.write(st);
            st= "Patron Email : "+email+" ";
            fw.write(st);
            st= "Patron Contact No: "+contactNo+" ";
            fw.write(st);
            st= "Patron Address: "+pAddress+" ";
            fw.write(st);
            st= "Amount(Patron): "+amount+" ";
            fw.write(st);
            st= "Student ID: "+studentId+" ";
            fw.write(st);
            st= "Student's Guardian Name: "+guardianName+" ";
            fw.write(st);
            st= "Student's Guardian Contact No: "+guardianContactNo+"\n";
            fw.write(st);
        }
        catch(IOException ie){
            System.out.println("!!!!Error Caught!!!!");
        }
        finally{
            try{
            fw.close();
        }
        catch(IOException ie){
            System.out.println("Cannot Close The Database");
        }
        catch(NullPointerException ie){
            System.out.println("");
        }
        }
    }
    // public void removeStudent(Student s){
    //     System.out.print("Enter Student ID To Remove A Student:");
    //     String sid = sc.nextLine();
    //     File f = new File("D:\\Study Zone\\4th Semester\\Java\\Project Final\\org\\operationclasses\\database\\StudentInfo\\"+sid+".txt");
    //     FileWriter fw = null;
    //     try {
    //         boolean b = f.delete();
    //         if(b == true) {
    //             System.out.println("\nStudent Removed!!");
    //         }
    //         else{
    //             System.out.println("\nFailed To Remove Student Or The Student Not Existed!!");
    //         }
    //     }
    //     catch(Exception ie) {
    //         ie.printStackTrace();
    //     }
    // }
    public Student getStudent(String studentId){
        File f = new File("D:\\Study Zone\\4th Semester\\Java\\Project Final\\org\\operationclasses\\database\\StudentInfo\\studentinfo.txt");
        FileReader fr=null;
        BufferedReader br=null;
        try{
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            String st=" ";
            String []words=null;
            while((st=br.readLine()) !=null){ 
				words=st.split(" ");
            for (String word : words){
                if(word.equals(studentId)){ 
                     System.out.println(st);
                     return null;}
        }
			   }
        }
        catch(Exception e){
            System.out.println("The Student ID You Have Given Not Found In The Database");
        }
        finally{
            try{
                fr.close();
            }
            catch(IOException ie){
                System.out.println("Cannot Close Database");
            }
            catch(NullPointerException ie){
                System.out.print("");
            }
        }

        try{
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            String st=" ";
            String []words=null;
            while((st=br.readLine()) !=null){ 
				words=st.split(" ");
            for (String word : words){
                if(!word.equals(studentId)){ 
                     System.out.println("StudentID Not Found In The Database");
                     return null;}
        }
			   }
        }
        catch(Exception e){
            System.out.println("The Student ID You Have Given Not Found In The Database");
        }
        finally{
            try{
                fr.close();
            }
            catch(IOException ie){
                System.out.println("Cannot Close Database");
            }
            catch(NullPointerException ie){
                System.out.print("");
            }
        }
        return null;
    }
    public void showAllStudents( ){
        File f = new File("D:\\Study Zone\\4th Semester\\Java\\Project Final\\org\\operationclasses\\database\\StudentInfo\\studentinfo.txt");
        FileReader fr=null;
        BufferedReader br=null;
        try{
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            String st=" ";
            while((st=br.readLine())!=null){
                System.out.println(st);
            }
        }
        catch(Exception e){
            System.out.println("Error Caught!");
        }
        finally{
            try{
                fr.close();
            }
            catch(IOException ie){
                System.out.println("Cannot Close Database");
            }
            catch(NullPointerException ie){
                System.out.print("");
            }
        }
  }
}