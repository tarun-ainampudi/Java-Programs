abstract class Book{
    String BookTitle;
    double Price;
    Book(String BookTitle){
        this.BookTitle=BookTitle;
    }
    String getBookTitle(){
        return BookTitle;
    }
    double getPrice(){
        return Price;
    }
    public abstract void setPrice();
    public abstract void Display();
}
class Fiction extends Book{
    Fiction(String BookTitle){
        super(BookTitle);
        setPrice();
    }
    public void setPrice(){
        Price=24.99d;
    }
    public void Display(){
        System.out.printf("Fiction Book :%-30sPrice : %.3f$\n",BookTitle,Price);
    }
}
class NonFiction extends Book{
    NonFiction(String BookTitle){
        super(BookTitle);
        setPrice();
    }
    public void setPrice(){
        Price=37.99d;
    }
    public void Display(){
        System.out.printf("NonFiction Book :%-27sPrice : %.3f$\n",BookTitle,Price);
    }
}
public class Q3{
    public static void main(String[] args) {
        Book B[] = new Book[4];
        B[0]=new Fiction("Code Name Verity");
        B[1]=new Fiction("Lilac Girls");
        B[2]=new NonFiction("Night");
        B[3]=new NonFiction("In Cold Blood");
        B[0].Display();
        B[2].Display();
        B[3].Display();
        B[1].Display();
    }
}