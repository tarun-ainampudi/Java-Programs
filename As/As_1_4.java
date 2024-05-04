import java.util.Scanner;

class FloatingPointSum {
    private double sum;
    private int chances;

    public FloatingPointSum() {
        sum = 0.0;
        chances = 2;
    }

    public void readInput() {
        Scanner scanner = new Scanner(System.in);
        while (chances > 0) {
            System.out.print("Enter a floating-point value: ");
            if (scanner.hasNextDouble()) {
                double value = scanner.nextDouble();
                sum += value;
                chances = 2; // Reset chances if valid input
            } else {
                System.out.println("Invalid input. Please enter a valid floating-point value.");
                chances--;
                scanner.next(); // Consume invalid input
            }
        }
        scanner.close();
    }

    public double getSum() {
        return sum;
    }
}

public class As_1_4 {
    public static void main(String[] args) {
        FloatingPointSum floatingPointSum = new FloatingPointSum();
        floatingPointSum.readInput();
        System.out.println("Sum of correctly entered values: " + floatingPointSum.getSum());
    }}

