import java.util.*;
public class Ex_1_2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the Character:");
        char a=in.next().charAt(0);
        if (a=='a' || a=='A'){System.out.print("Given Character is Vowel");}
        else if (a=='e' || a=='E'){System.out.print("Given Character is Vowel");}
        else if (a=='i' || a=='I'){System.out.print("Given Character is Vowel");}
        else if (a=='o' || a=='O'){System.out.print("Given Character is Vowel");}
        else if (a=='u' || a=='U'){System.out.print("Given Character is Vowel");}
        else{System.out.print("Given Character is not a Vowel");}
    }
}
