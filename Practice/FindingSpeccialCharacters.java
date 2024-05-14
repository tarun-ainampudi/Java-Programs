public class FindingSpeccialCharacters {
    public static void main(String[] args) {
        String UserName = "t@run1";
        if (!UserName.matches("[a-zA-Z0-9]+")){
            System.out.println("Special Charcters Found");
        }
        else{
            System.out.println("Special Charcters Not Found");
        }
    }
}