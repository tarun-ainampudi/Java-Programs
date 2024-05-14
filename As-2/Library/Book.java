package Library;
public class Book{
    String BookId;
    String BookName;
    String AuthorName;
    String PublisherName;
    double Price;
    public Book(String BookId,String BookName,String AuthorName,String PublisherName,double Price){
        this.BookId = BookId;
        this.BookName = BookName;
        this.AuthorName = AuthorName;
        this.PublisherName = PublisherName;
        this.Price = Price;
    }
    public void Display(){
        System.out.println("Book ID: "+BookId);
        System.out.println("Title: " + BookName);
        System.out.println("Author: " + AuthorName);
        System.out.println("Publisher: " + PublisherName);
        System.out.println("Price: $" + Price);
    }
}