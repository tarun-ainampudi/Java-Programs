import java.util.Scanner;
class InvalidMobileNumberException extends RuntimeException {
    public InvalidMobileNumberException(String message) {
        super(message);
    }
}
public class MobileNumberVerification{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a mobile number: ");
        String mobileNumber = scanner.nextLine();

        try {
            
            if (mobileNumber == null || mobileNumber.length() != 10 || !mobileNumber.matches("\\d+")) {
                throw new InvalidMobileNumberException("Mobile Number is Not Valid!");
            } else {
                System.out.println("Mobile Number is Valid!");
            }
        } catch (InvalidMobileNumberException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close(); 
        }
    }}

 