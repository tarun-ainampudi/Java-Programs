class Shape{
void Draw(){
System.out.println("Drawing Shape...");
}
void Erase(){
    System.out.println("Erasing Shape...");
}
}
class Circle extends Shape{
    void Draw(){
        System.out.println("Drawing Circle...");
        }
        void Erase(){
            System.out.println("Erasing Circle...");
        }
}
class Triangle extends Shape{
    void Draw(){
        System.out.println("Drawing Triangle...");
        }
        void Erase(){
            System.out.println("Erasing Triangle...");
        }
}
class Square extends Shape{
    void Draw(){
        System.out.println("Drawing Square...");
        }
        void Erase(){
            System.out.println("Erasing Square...");
        }
}
public class P3 {
    public static void main(String[] args) {
        Circle a = new Circle();
        Triangle b = new Triangle();
        Square c = new Square();
        Shape d = new Shape();
        a.Draw();
        a.Erase();
        b.Draw();
        b.Erase();
        c.Draw();
        c.Erase();
        d.Draw();
        d.Erase();
    }
}
