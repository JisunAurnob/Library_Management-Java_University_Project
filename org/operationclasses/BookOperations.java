package org.operationclasses;
import org.classes.Book;
import org.classes.Author;
import org.classes.Publisher;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BookOperations{
    Scanner sc = new Scanner(System.in);
    public void insertBook(Book b){
        FileWriter fw=null;
        FileReader fr = null;
        BufferedReader br = null;
        File f = new File("D:\\Study Zone\\4th Semester\\Java\\Project Final\\org\\operationclasses\\database\\BookInfo\\bookinfo.txt");
        System.out.print("Enter Book ID:");
        int id = sc.nextInt();
        sc.nextLine();
        try{
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            String st=" ";
            String []words=null;
            while((st=br.readLine()) !=null){ 
				words=st.split(" ");
            for (String word : words){
                if(word.equals(Integer.toString(id))){ 
                     System.out.println("Book ID Already Existed Give Different ID");
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
        b.setId(id);
        System.out.println("");
        System.out.print("Enter Book Title:");
        String title = sc.nextLine();
        b.setTitle(title);
        System.out.println("");
        System.out.print("Enter Book Subtitle:");
        String subTitle = sc.nextLine();
        b.setSubTitle(subTitle);
        System.out.println("");
        //Author
        System.out.print("Enter Book Author Details:");
        System.out.println("");
        Author at = new Author();
        System.out.print("Author ID: ");
        int authorID = sc.nextInt();
        sc.nextLine();

        at.setId(authorID);
        System.out.println("");
        System.out.print("Author Name: ");
        String authorName = sc.nextLine();
        at.setName(authorName);
        System.out.println("");
        System.out.print("Author Email: ");
        String authorEmail = sc.nextLine();
        at.setEmail(authorEmail);
        System.out.println("");
        b.setAuthor(at);
        //Publisher
        System.out.print("Enter Book Publisher Details:");
        System.out.println("");
        Publisher pb= new Publisher();
        System.out.print("Publisher ID: ");
        int publisherID = sc.nextInt();
        sc.nextLine();
        
        pb.setId(publisherID);
        System.out.println("");
        System.out.print("Publisher Name: ");
        String publisherName = sc.nextLine();
        pb.setName(publisherName);
        System.out.println("");
        System.out.print("Publisher Contact No: ");
        String publisherContactNo = sc.nextLine();
        pb.setContactNo(publisherContactNo);
        System.out.println("");
        b.setPublisher(pb);
        System.out.print("Enter Book Price:");
        double bPrice=sc.nextDouble();
        sc.nextLine();
        b.setPrice(bPrice);
        System.out.println("");

        
        try{
            fw = new FileWriter(f,true);
            String st= "-----------Book Information--------\n";
            fw.write(st);
            st= "Book ID: "+id+" ";
            fw.write(st);
            st= "Book Title: "+title+" ";
            fw.write(st);
            st= "Book Subtitle: "+subTitle+" ";
            fw.write(st);
            st= "Author ID : "+authorID+" ";
            fw.write(st);
            st= "Author Name: "+authorName+" ";
            fw.write(st);
            st= "Author Email: "+authorEmail+" ";
            fw.write(st);
            st= "Publisher ID : "+publisherID+" ";
            fw.write(st);
            st= "Publisher Name: "+publisherName+" ";
            fw.write(st);
            st= "Publisher Contact No: "+publisherContactNo+" ";
            fw.write(st);
            st= "Book Price: "+bPrice+"\n";
            fw.write(st);
        }
        catch(IOException ie){
            System.out.println("!!!Book ID Already Exist Give Different Book ID!!!!");
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
    public Book getBook(int bookId){
        File f = new File("D:\\Study Zone\\4th Semester\\Java\\Project Final\\org\\operationclasses\\database\\BookInfo\\bookinfo.txt");
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
                if(word.equals(Integer.toString(bookId))){ 
                     System.out.println(st);
                     return null; }
        }
			   }
        }
        catch(Exception e){
            System.out.println("The Book ID You Have Given Not Found In The Database");
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
                if(!word.equals(Integer.toString(bookId))){ 
                     System.out.println("Book ID Not Found In The Database");
                     return null;}
        }
			   }
        }
        catch(Exception e){
            System.out.println("The Book ID You Have Given Not Found In The Database");
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
    public void showAllBooks(){
        File f = new File("D:\\Study Zone\\4th Semester\\Java\\Project Final\\org\\operationclasses\\database\\BookInfo\\bookinfo.txt");
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