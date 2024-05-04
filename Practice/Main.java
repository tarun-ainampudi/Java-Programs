public class Main{
    public static void main(String[] args) {
        String string = "Tarun";
        StringBuilder rev = new StringBuilder(string);
        System.out.println(rev);
        rev.reverse();
        System.out.println(rev);
    }
}