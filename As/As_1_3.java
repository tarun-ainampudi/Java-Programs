import java.util.Scanner;

public class As_1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the value of b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter the value of c: ");
        double c = scanner.nextDouble();

        double discriminant = b * b - 4.0 * a * c;

        if (discriminant > 0.0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2.0 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2.0 * a);
            System.out.println("The roots are " + root1 + " and " + root2);
        } else if (discriminant == 0.0) {
            double root = -b / (2.0 * a);
            System.out.println("The root is " + root);
        } else {
            System.out.println("The equation has no real roots.");
        }
        System.out.println(Math.pow(2,3));
        scanner.close();
    }
}
