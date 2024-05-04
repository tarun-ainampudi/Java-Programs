import java.io.*;
import java.util.*;
public class FileHandling {
    public static void main(String[] args) throws FileNotFoundException,NumberFormatException,ArithmeticException{
        
       try{
       File file = new File("new.txt");
       Scanner FileScanner = new Scanner(file);
       String Name = FileScanner.nextLine();
       System.out.println(Name);
       String s = FileScanner.nextLine();
       int rollNum=Integer.parseInt(s);
       System.out.println(rollNum);
       System.out.println(rollNum/0);
       FileScanner.close();
       }
       catch(FileNotFoundException e1){
        System.out.println("From e1");
        System.out.println(e1.getMessage());
       }
       catch(NumberFormatException e2){
        System.out.println("From e2");
        System.out.println(e2.getMessage());
       }
       catch(ArithmeticException e3){
        System.out.println("From e3");
        System.out.println(e3.getMessage());
       }
       catch(Exception e4){
        System.out.println("From e4");
        System.out.println(e4.getMessage());
       }
       
       
       
    }
}
