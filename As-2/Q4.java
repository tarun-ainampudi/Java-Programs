import Library.Book;
import Library.Users.*;
public class Q4 {
    public static void main(String[] args) {
       Book B1 = new Book("B-1", "To Kill a Mockingbird", "Harper Lee", "HarperCollins", 12.99);
            B1.Display();
    LibraryUser L1=new LibraryUser("U123", "John Doe", "123 Main St, Anytown", 1234567890);
    L1.Display();
    }
}
