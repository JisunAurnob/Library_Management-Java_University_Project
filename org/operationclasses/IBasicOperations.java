package org.operationclasses;
import org.classes.Patron;
import org.classes.Teacher;
import org.classes.Student;
import org.classes.Book;
public interface IBasicOperations{
    void borrow(Patron p,Book b);
    void returnBook(Patron p, Book b);
    void fine(Patron p, double amount);
}