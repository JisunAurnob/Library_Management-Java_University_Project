package org.operationclasses;
import org.classes.Patron;
import org.classes.Teacher;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TeacherOperations{
    Scanner sc = new Scanner(System.in);
    public void insertTeacher(Teacher t){
        FileWriter fw=null;
        FileReader fr = null;
        BufferedReader br = null;
        File f = new File("D:\\Study Zone\\4th Semester\\Java\\Project Final\\org\\operationclasses\\database\\TeacherInfo\\teacherinfo.txt");
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
        
        t.setId(pId);
        System.out.println("");
        System.out.print("Enter Patron Name: ");
        String pName = sc.nextLine();
        t.setName(pName);
        System.out.println("");
        System.out.print("Enter Patron Department Name: ");
        String departmentName = sc.nextLine();
        t.setDepartmentName(departmentName);
        System.out.println("");
        System.out.print("Enter Patron Email: ");
        String email=sc.nextLine();
        t.setEmail(email);
        System.out.println("");
        System.out.print("Enter Patron Contact No: ");
        String contactNo=sc.nextLine();
        t.setContactNo(contactNo);
        System.out.println("");
        System.out.print("Enter Patron Address: ");
        String pAddress=sc.nextLine();
        t.setAddress(pAddress);
        System.out.println("");
        System.out.print("Enter Amount(Patron): ");
        double amount = sc.nextDouble();
        sc.nextLine();
        t.setAmount(amount);
        System.out.println("");
        System.out.print("Enter Teacher ID: ");
        String teacherId = sc.nextLine();
        t.setTeacherId(teacherId);
        System.out.println("");
        try{
            fr= new FileReader(f);
            br=new BufferedReader(fr);
			String st="";
			String []words=null;
			while((st=br.readLine()) !=null){   
				words=st.split(" ");
            for (String word : words){
              if(word.equals(teacherId)){
					System.out.println("-------TeacherID Already Existed Try Another-------");
					 return;
				}	
		  }
		}						 
			fr.close();
	}				
			catch(IOException he){
				System.out.println("Error caught");
            }
        
        try{
            fw = new FileWriter(f,true);
            String st= "-----------Teacher Information--------\n";
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
            st= "Teacher ID: "+teacherId+"\n";
            fw.write(st);
        }
        catch(IOException ie){
            System.out.println("Teacher ID Already Exist Give Different Teacher ID");
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
    public Teacher getTeacher(String teacherId){
        File f = new File("D:\\Study Zone\\4th Semester\\Java\\Project Final\\org\\operationclasses\\database\\TeacherInfo\\teacherinfo.txt");
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
                if(word.equals(teacherId)){ 
                     System.out.println(st);
                     return null;}
        }
			   }
        }
        catch(Exception e){
            System.out.println("The Teacher ID You Have Given Not Found In The Database");
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
                if(!word.equals(teacherId)){ 
                     System.out.println("Teacher ID Not Found In The Database");
                     return null;}
        }
			   }
        }
        catch(Exception e){
            System.out.println("The Teacher ID You Have Given Not Found In The Database");
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
    public void showAllTeachers( ){
        File f = new File("D:\\Study Zone\\4th Semester\\Java\\Project Final\\org\\operationclasses\\database\\TeacherInfo\\teacherinfo.txt");
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