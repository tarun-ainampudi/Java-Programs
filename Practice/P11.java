public class P11 {
    public static void main(String[] args) {
        try{
            throw new ArithmeticException("Not Allowed");
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
