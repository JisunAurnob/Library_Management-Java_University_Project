package org.main;
import org.operationclasses.BasicOperations;
import org.operationclasses.BookOperations;
import org.operationclasses.StudentOperations;
import org.operationclasses.TeacherOperations;
import org.classes.Patron;
import org.classes.Student;
import org.classes.Teacher;
import org.classes.Book;
import java.util.Scanner;

public class Start{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Patron p;
		Student s = new Student();
		Teacher t = new Teacher();
		Book b = new Book();
		p=s;
		StudentOperations so = new StudentOperations();
		TeacherOperations to = new TeacherOperations();
		BookOperations bo = new BookOperations();
		BasicOperations bas = new BasicOperations();
		
		
    while(true){
		System.out.print("\nPress From 1 To 5 For These Operations\n1.Student Management\n2.Teacher Management\n3.Book Management\n4.Basic Operations\n5.Exit\nPress: ");
		int sw=sc.nextInt();
		sc.nextLine();
		switch(sw){
			case 1:
			{System.out.print("\n1.Insert New Student\n2.Search By Student Id\n3.Show All Student\nPress: ");
			int sw1 = sc.nextInt();
			sc.nextLine();
				switch(sw1){
					case 1:
					so.insertStudent(s);
					break;
					case 2:
					System.out.print("\nEnter Student ID: ");
					String studentId = sc.nextLine();
					so.getStudent(studentId);
					break;
					case 3:
					so.showAllStudents();
					break;
					default:
					System.out.println("Wrong Pressing Press From 1 To 3");
				}
			}
			break;

			case 2:
			{System.out.print("\n1.Insert New Teacher\n2.Search By Teacher Id\n3.Show All Teacher\nPress: ");
			int sw1 = sc.nextInt();
			sc.nextLine();
				switch(sw1){
					case 1:
					to.insertTeacher(t);
					break;
					case 2:
					System.out.print("\nEnter Teacher ID: ");
					String teacherId = sc.nextLine();
					to.getTeacher(teacherId);
					break;
					case 3:
					to.showAllTeachers();
					break;
					default:
					System.out.println("Wrong Pressing Press From 1 To 3");
				}
			}
			break;

			case 3:
			{System.out.print("\n1.Insert New Book\n2.Search By Book Id\n3.Show All Books\nPress: ");
			int sw1 = sc.nextInt();
			sc.nextLine();
				switch(sw1){
					case 1:
					bo.insertBook(b);
					break;
					case 2:
					System.out.print("\nEnter Book ID: ");
					int bookId = sc.nextInt();
					sc.nextLine();
					bo.getBook(bookId);
					break;
					case 3:
					bo.showAllBooks();
					break;
					default:
					System.out.println("Wrong Pressing Press From 1 To 3");
				}
			}
			break;

			case 4:
			{System.out.print("\n1.Borrow book\n2.Return Book\n3.Add Fine\nPress: ");
			int sw1 = sc.nextInt();
			sc.nextLine();
				switch(sw1){
					case 1:
					bas.borrow(p,b);
					break;
					case 2:
					bas.returnBook(p,b);
					break;
					case 3:
					System.out.print("\nEnter Fine Amount: ");
					double amount = sc.nextDouble();
					sc.nextLine();
					bas.fine(p,amount);
					break;
					default:
					System.out.println("Wrong Pressing Press From 1 To 3");
				}
			}
			break;

			case 5:
			return;

			default:
			System.out.println("Wrong Pressing Press From 1 To 5");
		}
	}
  }
}