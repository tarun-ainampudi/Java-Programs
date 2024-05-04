import java.util.*;
public class Ex_1_1{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the First Number:");
        int a = in.nextInt();
        System.out.print("Enter the Second Number:");
        int b = in.nextInt();
        System.out.print("Enter the Third Number:");
        int c = in.nextInt();
if(a==b&&a==c){System.out.print("Three Numbers are Same");}
else if(a>=b && a>=c){System.out.print("Greatest Number is "+a);}
else if(b>=a && b>=c){System.out.print("Greatest Number is "+b);}
else{System.out.print("Greatest Number is "+c);}
    }
}