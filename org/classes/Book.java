package org.classes;
import org.classes.Author;
import org.classes.Publisher;
public class Book{
    int id;
    String title;
    String subtitle;
    Author author;
    Publisher publisher;
    double price;
    public void setId(int id){
        this.id=id;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public void setSubTitle(String subTitle){
        this.subtitle=subTitle;
    }
    public void setAuthor(Author author){
        this.author=author;
    }
    public void setPublisher(Publisher publisher){
        this.publisher=publisher;
    }
    public void setPrice(double price){
        this.price=price;
    }
}