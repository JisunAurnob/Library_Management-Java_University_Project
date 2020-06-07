package org.operationclasses;
import org.classes.Patron;
import org.classes.Teacher;
import org.classes.Student;
import org.classes.Book;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
import org.operationclasses.IBasicOperations;

public class BasicOperations implements IBasicOperations{
    Scanner sc = new Scanner(System.in);
    public void borrow(Patron p,Book b){
        
        while(true){
            System.out.print("\nPress 0 To 2 For These Operations\n1.As Student,2.As Teacher,0.Exit To Main Menu:");
            int sw=sc.nextInt();
            sc.nextLine();
            System.out.println("");
            int flag=0;
            switch(sw){
                case 0:
                return;
                case 1:
                System.out.print("Enter Student ID: ");
                String studentId = sc.nextLine();
                System.out.println("");
                File f = new File("D:\\Study Zone\\4th Semester\\Java\\Project Final\\org\\operationclasses\\database\\StudentInfo\\studentinfo.txt");
                FileReader fr = null;
                BufferedReader br = null;
                try{
                    fr = new FileReader(f);
                    br = new BufferedReader(fr);
                    String st=" ";
                    String []words=null;
                    while((st=br.readLine()) !=null){ 
                        words=st.split(" ");
                    for (String word : words){
                        if(word.equals(studentId)){ 
                             System.out.print("");
                             flag=1;
                            }
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
                if(flag==0){
                    System.out.println("StudentID Not Registered Give Correct One");
                    return;
                }
                flag=0;
                    System.out.print("Enter Patron ID: ");
                    int patronId = sc.nextInt();
                    sc.nextLine();
                    System.out.println("");
                    try{
                        fr = new FileReader(f);
                        br = new BufferedReader(fr);
                        String st=" ";
                        String []words=null;
                        while((st=br.readLine()) !=null){ 
                            words=st.split(" ");
                        for (String word : words){
                            if(word.equals(Integer.toString(patronId))){ 
                                System.out.print("");
                                flag=1;
                                }
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
                    if(flag==0){
                        System.out.println("Patron ID Not Registered Give Correct One");
                        return;
                    }
                    flag=0;

                    System.out.print("Enter Your Book ID: ");
                    int bookId = sc.nextInt();
                    sc.nextLine();
                    System.out.println("");
                    File bidchk = new File("D:\\Study Zone\\4th Semester\\Java\\Project Final\\org\\operationclasses\\database\\BookInfo\\bookinfo.txt");
                    try{
                        fr = new FileReader(bidchk);
                        br = new BufferedReader(fr);
                        String st=" ";
                        String []words=null;
                        while((st=br.readLine()) !=null){ 
                            words=st.split(" ");
                        for (String word : words){
                            if(word.equals(Integer.toString(bookId))){ 
                                System.out.print("");
                                flag=1;}
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
                    if(flag==0){
                        System.out.println("Book ID Not Registered Give Correct One");
                        return;
                    }
                    flag=0;
                   
                    File f2 = new File("D:\\Study Zone\\4th Semester\\Java\\Project Final\\org\\operationclasses\\database\\Basic Info\\Borrow\\borrow student.txt");
                    FileWriter fw=null;
                    try{
                        fw = new FileWriter(f2,true);
                        String st= "-----------Student Borrow Information--------\n";
                        fw.write(st);
                        st= "Patron ID: "+patronId+" ";
                        fw.write(st);
                        st= "Book ID: "+bookId+"\n";
                        fw.write(st);
                    }
                    catch(IOException ie){
                        ie.printStackTrace();
                    }
                    finally{
                        try{
                        fw.close();
                    }
                    catch(IOException ie){
                        System.out.println("Cannot Close The Database");
                    }
                    }
                    System.out.println("Your Borrow Request Have Been Saved In The Database");
                
                break;
                case 2:
                System.out.print("Enter Teacher ID: ");
                String teacherId = sc.nextLine();
                System.out.println("");
                File f3 = new File("D:\\Study Zone\\4th Semester\\Java\\Project Final\\org\\operationclasses\\database\\TeacherInfo\\teacherinfo.txt");
                FileReader fr2 = null;
                // BufferedReader br = null;
                try{
                    fr2 = new FileReader(f3);
                    br = new BufferedReader(fr2);
                    String st=" ";
                    String []words=null;
                    while((st=br.readLine()) !=null){ 
                        words=st.split(" ");
                    for (String word : words){
                        if(word.equals(teacherId)){ 
                             System.out.print("");
                             flag=1;
                            }
                }
                       }
                }
                catch(Exception e){
                    System.out.println("The Teacher ID You Have Given Not Found In The Database");
                }
                finally{
                    try{
                        fr2.close();
                    }
                    catch(IOException ie){
                        System.out.println("Cannot Close Database");
                    }
                    catch(NullPointerException ie){
                        System.out.print("");
                    }
                }
                if(flag==0){
                    System.out.println("Teacher ID Not Registered Give Correct One");
                    return;
                }
                flag=0;
                    System.out.print("Enter Patron ID: ");
                    patronId = sc.nextInt();
                    sc.nextLine();
                    System.out.println("");
                    try{
                        fr2 = new FileReader(f3);
                        br = new BufferedReader(fr2);
                        String st=" ";
                        String []words=null;
                        while((st=br.readLine()) !=null){ 
                            words=st.split(" ");
                        for (String word : words){
                            if(word.equals(Integer.toString(patronId))){ 
                                System.out.print("");
                                flag=1;
                                }
                    }
                           }
                    }
                    catch(Exception e){
                        System.out.println("Exception Caught");
                    }
                    finally{
                        try{
                            fr2.close();
                        }
                        catch(IOException ie){
                            System.out.println("Cannot Close Database");
                        }
                        catch(NullPointerException ie){
                            System.out.print("");
                        }
                    }
                    if(flag==0){
                        System.out.println("Patron ID Not Registered Give Correct One");
                        return;
                    }
                    flag=0;

                    System.out.print("Enter Your Book ID: ");
                    bookId = sc.nextInt();
                    sc.nextLine();
                    System.out.println("");
                    File bidchk2 = new File("D:\\Study Zone\\4th Semester\\Java\\Project Final\\org\\operationclasses\\database\\BookInfo\\bookinfo.txt");
                    try{
                        fr2 = new FileReader(bidchk2);
                        br = new BufferedReader(fr2);
                        String st=" ";
                        String []words=null;
                        while((st=br.readLine()) !=null){ 
                            words=st.split(" ");
                        for (String word : words){
                            if(word.equals(Integer.toString(bookId))){ 
                                System.out.print("");
                                flag=1;}
                    }
                           }
                    }
                    catch(Exception e){
                        System.out.println("Exception Caught");
                    }
                    finally{
                        try{
                            fr2.close();
                        }
                        catch(IOException ie){
                            System.out.println("Cannot Close Database");
                        }
                        catch(NullPointerException ie){
                            System.out.print("");
                        }
                    }
                    if(flag==0){
                        System.out.println("Book ID Not Registered Give Correct One");
                        return;
                    }
                    flag=0;
                   
                    File f4 = new File("D:\\Study Zone\\4th Semester\\Java\\Project Final\\org\\operationclasses\\database\\Basic Info\\Borrow\\borrow teacher.txt");
                    FileWriter fw2=null;
                    try{
                        fw2 = new FileWriter(f4,true);
                        String st= "-----------Teacher Borrow Information--------\n";
                        fw2.write(st);
                        st= "Patron ID: "+patronId+" ";
                        fw2.write(st);
                        st= "Book ID: "+bookId+"\n";
                        fw2.write(st);
                    }
                    catch(IOException ie){
                        ie.printStackTrace();
                    }
                    finally{
                        try{
                        fw2.close();
                    }
                    catch(IOException ie){
                        System.out.println("Cannot Close The Database");
                    }
                    }
                    System.out.println("Your Borrow Request Have Been Saved In The Database");
                break;
                default:
                System.out.println("Wrong Pressing Press From 0 To 2");
            }
            }
    }
    public void returnBook(Patron p, Book b){
        while(true){
            System.out.print("\nPress 0 To 2 For These Operations\n1.As Student,2.As Teacher,0.Exit To Main Menu:");
            int sw=sc.nextInt();
            sc.nextLine();
            System.out.println("");
            int flag=0;
            switch(sw){
                case 0:
                return;
                case 1:
                System.out.print("Enter Student ID: ");
                String studentId = sc.nextLine();
                System.out.println("");
                File f = new File("D:\\Study Zone\\4th Semester\\Java\\Project Final\\org\\operationclasses\\database\\StudentInfo\\studentinfo.txt");
                FileReader fr = null;
                BufferedReader br = null;
                try{
                    fr = new FileReader(f);
                    br = new BufferedReader(fr);
                    String st=" ";
                    String []words=null;
                    while((st=br.readLine()) !=null){ 
                        words=st.split(" ");
                    for (String word : words){
                        if(word.equals(studentId)){ 
                             System.out.print("");
                             flag=1;
                            }
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
                if(flag==0){
                    System.out.println("StudentID Not Registered Give Correct One");
                    return;
                }
                flag=0;
                    System.out.print("Enter Patron ID: ");
                    int patronId = sc.nextInt();
                    sc.nextLine();
                    System.out.println("");
                    try{
                        fr = new FileReader(f);
                        br = new BufferedReader(fr);
                        String st=" ";
                        String []words=null;
                        while((st=br.readLine()) !=null){ 
                            words=st.split(" ");
                        for (String word : words){
                            if(word.equals(Integer.toString(patronId))){ 
                                System.out.print("");
                                flag=1;
                                }
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
                    if(flag==0){
                        System.out.println("Patron ID Not Registered Give Correct One");
                        return;
                    }
                    flag=0;

                    System.out.print("Enter Your Book ID: ");
                    int bookId = sc.nextInt();
                    sc.nextLine();
                    System.out.println("");
                    File bidchk = new File("D:\\Study Zone\\4th Semester\\Java\\Project Final\\org\\operationclasses\\database\\BookInfo\\bookinfo.txt");
                    try{
                        fr = new FileReader(bidchk);
                        br = new BufferedReader(fr);
                        String st=" ";
                        String []words=null;
                        while((st=br.readLine()) !=null){ 
                            words=st.split(" ");
                        for (String word : words){
                            if(word.equals(Integer.toString(bookId))){ 
                                System.out.print("");
                                flag=1;}
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
                    if(flag==0){
                        System.out.println("Book ID Not Registered Give Correct One");
                        return;
                    }
                    flag=0;
                   
                    File f2 = new File("D:\\Study Zone\\4th Semester\\Java\\Project Final\\org\\operationclasses\\database\\Basic Info\\Return\\return student.txt");
                    FileWriter fw=null;
                    try{
                        fw = new FileWriter(f2,true);
                        String st= "-----------Student Return Information--------\n";
                        fw.write(st);
                        st= "Patron ID: "+patronId+" ";
                        fw.write(st);
                        st= "Book ID: "+bookId+"\n";
                        fw.write(st);
                    }
                    catch(IOException ie){
                        ie.printStackTrace();
                    }
                    finally{
                        try{
                        fw.close();
                    }
                    catch(IOException ie){
                        System.out.println("Cannot Close The Database");
                    }
                    }
                    System.out.println("Your Return Request Have Been Saved In The Database");
                
                break;
                case 2:
                System.out.print("Enter Teacher ID: ");
                String teacherId = sc.nextLine();
                System.out.println("");
                File f3 = new File("D:\\Study Zone\\4th Semester\\Java\\Project Final\\org\\operationclasses\\database\\TeacherInfo\\teacherinfo.txt");
                FileReader fr2 = null;
                
                try{
                    fr2 = new FileReader(f3);
                    br = new BufferedReader(fr2);
                    String st=" ";
                    String []words=null;
                    while((st=br.readLine()) !=null){ 
                        words=st.split(" ");
                    for (String word : words){
                        if(word.equals(teacherId)){ 
                             System.out.print("");
                             flag=1;
                            }
                }
                       }
                }
                catch(Exception e){
                    System.out.println("The Teacher ID You Have Given Not Found In The Database");
                }
                finally{
                    try{
                        fr2.close();
                    }
                    catch(IOException ie){
                        System.out.println("Cannot Close Database");
                    }
                    catch(NullPointerException ie){
                        System.out.print("");
                    }
                }
                if(flag==0){
                    System.out.println("Teacher ID Not Registered Give Correct One");
                    return;
                }
                flag=0;
                    System.out.print("Enter Patron ID: ");
                    patronId = sc.nextInt();
                    sc.nextLine();
                    System.out.println("");
                    try{
                        fr2 = new FileReader(f3);
                        br = new BufferedReader(fr2);
                        String st=" ";
                        String []words=null;
                        while((st=br.readLine()) !=null){ 
                            words=st.split(" ");
                        for (String word : words){
                            if(word.equals(Integer.toString(patronId))){ 
                                System.out.print("");
                                flag=1;
                                }
                    }
                           }
                    }
                    catch(Exception e){
                        System.out.println("Exception Caught");
                    }
                    finally{
                        try{
                            fr2.close();
                        }
                        catch(IOException ie){
                            System.out.println("Cannot Close Database");
                        }
                        catch(NullPointerException ie){
                            System.out.print("");
                        }
                    }
                    if(flag==0){
                        System.out.println("Patron ID Not Registered Give Correct One");
                        return;
                    }
                    flag=0;

                    System.out.print("Enter Your Book ID: ");
                    bookId = sc.nextInt();
                    sc.nextLine();
                    System.out.println("");
                    File bidchk2 = new File("D:\\Study Zone\\4th Semester\\Java\\Project Final\\org\\operationclasses\\database\\BookInfo\\bookinfo.txt");
                    try{
                        fr2 = new FileReader(bidchk2);
                        br = new BufferedReader(fr2);
                        String st=" ";
                        String []words=null;
                        while((st=br.readLine()) !=null){ 
                            words=st.split(" ");
                        for (String word : words){
                            if(word.equals(Integer.toString(bookId))){ 
                                System.out.print("");
                                flag=1;}
                    }
                           }
                    }
                    catch(Exception e){
                        System.out.println("Exception Caught");
                    }
                    finally{
                        try{
                            fr2.close();
                        }
                        catch(IOException ie){
                            System.out.println("Cannot Close Database");
                        }
                        catch(NullPointerException ie){
                            System.out.print("");
                        }
                    }
                    if(flag==0){
                        System.out.println("Book ID Not Registered Give Correct One");
                        return;
                    }
                    flag=0;
                   
                    File f4 = new File("D:\\Study Zone\\4th Semester\\Java\\Project Final\\org\\operationclasses\\database\\Basic Info\\Return\\return teacher.txt");
                    FileWriter fw2=null;
                    try{
                        fw2 = new FileWriter(f4,true);
                        String st= "-----------Teacher Return Information--------\n";
                        fw2.write(st);
                        st= "Patron ID: "+patronId+" ";
                        fw2.write(st);
                        st= "Book ID: "+bookId+"\n";
                        fw2.write(st);
                    }
                    catch(IOException ie){
                        ie.printStackTrace();
                    }
                    finally{
                        try{
                        fw2.close();
                    }
                    catch(IOException ie){
                        System.out.println("Cannot Close The Database");
                    }
                    }
                    System.out.println("Your Return Request Have Been Saved In The Database");
                break;
                default:
                System.out.println("Wrong Pressing Press From 0 To 2");
            }
            }
    }
    public void fine(Patron p, double amount){
            System.out.print("\nPress 1 To 2 For These Operations\n1.As Student,2.As Teacher: ");
            int sw=sc.nextInt();
            sc.nextLine();
            System.out.println("");
            int flag=0;
            switch(sw){
                case 1:
                System.out.print("Enter Student ID: ");
                String studentId = sc.nextLine();
                System.out.println("");
                File f = new File("D:\\Study Zone\\4th Semester\\Java\\Project Final\\org\\operationclasses\\database\\StudentInfo\\studentinfo.txt");
                FileReader fr = null;
                BufferedReader br = null;
                try{
                    fr = new FileReader(f);
                    br = new BufferedReader(fr);
                    String st=" ";
                    String []words=null;
                    while((st=br.readLine()) !=null){ 
                        words=st.split(" ");
                    for (String word : words){
                        if(word.equals(studentId)){ 
                             System.out.print("");
                             flag=1;
                            }
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
                if(flag==0){
                    System.out.println("StudentID Not Registered Give Correct One");
                    return;
                }
                flag=0;
                    System.out.print("Enter Patron ID: ");
                    int patronId = sc.nextInt();
                    sc.nextLine();
                    System.out.println("");
                    try{
                        fr = new FileReader(f);
                        br = new BufferedReader(fr);
                        String st=" ";
                        String []words=null;
                        while((st=br.readLine()) !=null){ 
                            words=st.split(" ");
                        for (String word : words){
                            if(word.equals(Integer.toString(patronId))){ 
                                System.out.print("");
                                flag=1;
                                }
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
                    if(flag==0){
                        System.out.println("Patron ID Not Registered Give Correct One");
                        return;
                    }
                    flag=0;
                   
                    File f2 = new File("D:\\Study Zone\\4th Semester\\Java\\Project Final\\org\\operationclasses\\database\\Basic Info\\Fine\\fine student.txt");
                    FileWriter fw=null;
                    try{
                        fw = new FileWriter(f2,true);
                        String st= "-----------Student Fine Information--------\n";
                        fw.write(st);
                        st= "Patron ID: "+patronId+" ";
                        fw.write(st);
                        st= "Fine Amount: "+amount+"\n";
                        fw.write(st);
                    }
                    catch(IOException ie){
                        ie.printStackTrace();
                    }
                    finally{
                        try{
                        fw.close();
                    }
                    catch(IOException ie){
                        System.out.println("Cannot Close The Database");
                    }
                    }
                    System.out.println("Your Fine Request Have Been Saved In The Database");
                
                break;
                case 2:
                System.out.print("Enter Teacher ID: ");
                String teacherId = sc.nextLine();
                System.out.println("");
                File f3 = new File("D:\\Study Zone\\4th Semester\\Java\\Project Final\\org\\operationclasses\\database\\TeacherInfo\\teacherinfo.txt");
                FileReader fr2 = null;
                
                try{
                    fr2 = new FileReader(f3);
                    br = new BufferedReader(fr2);
                    String st=" ";
                    String []words=null;
                    while((st=br.readLine()) !=null){ 
                        words=st.split(" ");
                    for (String word : words){
                        if(word.equals(teacherId)){ 
                             System.out.print("");
                             flag=1;
                            }
                }
                       }
                }
                catch(Exception e){
                    System.out.println("The Teacher ID You Have Given Not Found In The Database");
                }
                finally{
                    try{
                        fr2.close();
                    }
                    catch(IOException ie){
                        System.out.println("Cannot Close Database");
                    }
                    catch(NullPointerException ie){
                        System.out.print("");
                    }
                }
                if(flag==0){
                    System.out.println("Teacher ID Not Registered Give Correct One");
                    return;
                }
                flag=0;
                    System.out.print("Enter Patron ID: ");
                    patronId = sc.nextInt();
                    sc.nextLine();
                    System.out.println("");
                    try{
                        fr2 = new FileReader(f3);
                        br = new BufferedReader(fr2);
                        String st=" ";
                        String []words=null;
                        while((st=br.readLine()) !=null){ 
                            words=st.split(" ");
                        for (String word : words){
                            if(word.equals(Integer.toString(patronId))){ 
                                System.out.print("");
                                flag=1;
                                }
                    }
                           }
                    }
                    catch(Exception e){
                        System.out.println("Exception Caught");
                    }
                    finally{
                        try{
                            fr2.close();
                        }
                        catch(IOException ie){
                            System.out.println("Cannot Close Database");
                        }
                        catch(NullPointerException ie){
                            System.out.print("");
                        }
                    }
                    if(flag==0){
                        System.out.println("Patron ID Not Registered Give Correct One");
                        return;
                    }
                    flag=0;
                   
                    File f4 = new File("D:\\Study Zone\\4th Semester\\Java\\Project Final\\org\\operationclasses\\database\\Basic Info\\Fine\\fine teacher.txt");
                    FileWriter fw2=null;
                    try{
                        fw2 = new FileWriter(f4,true);
                        String st= "-----------Teacher Fine Information--------\n";
                        fw2.write(st);
                        st= "Patron ID: "+patronId+" ";
                        fw2.write(st);
                        st= "Fine Amount: "+amount+"\n";
                        fw2.write(st);
                    }
                    catch(IOException ie){
                        ie.printStackTrace();
                    }
                    finally{
                        try{
                        fw2.close();
                    }
                    catch(IOException ie){
                        System.out.println("Cannot Close The Database");
                    }
                    }
                    System.out.println("Your Fine Request Have Been Saved In The Database");
                break;
                default:
                System.out.println("Wrong Pressing Press From 1 To 2");
            }
    }
}