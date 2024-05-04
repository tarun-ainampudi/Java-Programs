import java.util.Scanner;

class Rectangle {
    double length;
    double width;

    // Constructor to initialize length and width
    public Rectangle(double len, double wid) {
        length = len;
        width = wid;
    }

    // Method to calculate and print the area
    public void printArea() {
        double area = length * width;
        System.out.println("Area of rectangle: " + area);
    }

    // Method to calculate and print the perimeter
    public void printPerimeter() {
        double perimeter = 2 * (length + width);
        System.out.println("Perimeter of rectangle: " + perimeter);
    }
}

public class As_1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length of rectangle: ");
        double len = scanner.nextDouble();

        System.out.print("Enter width of rectangle: ");
        double wid = scanner.nextDouble();

        Rectangle rect = new Rectangle(len, wid);
        rect.printArea();
        rect.printPerimeter();

        scanner.close();
    }
}
