public class Ex_2_4 {
    public static void main(String[] args) {
    String s1="Java";
    String s2="Programming";
    String concat=s1.concat(" ").concat(s2);
    System.out.println("Result String : "+concat);
    int len=concat.length();
    System.out.println("String Length : "+len);
    char at=concat.charAt(5);
    System.out.println("Character at Index 5 : "+at);
    String ss=concat.substring(0,4);
    System.out.println("SubString : "+ss);
    String rs=concat.replace("Java","Python");
    System.out.println("Replaced String : "+rs);
    String us=concat.toUpperCase();
    System.out.println("String in UpperCase : "+us);
    String ls=concat.toLowerCase();
    System.out.println("String in LowerCase : "+ls);
    int index=concat.indexOf("Programming");
    System.out.println("Index of Programming Starts From : "+index);
    boolean bool=s1.equals(s2);
    System.out.println("Comparing Java and Programming : "+bool);
    }
    
}
