/* Develop a Class “Circle” with a radius attribute and calcArea(). During creation of 
Circle object, prompt the user to take the value for radius and handle the exception 
InputMismatchException if user has given a non-numeric value. As a developer of 
class, you want to give a second chance for the user to calculate area of a circle. So, as 
a second attempt, allow the user to supply input for radius only when he has given 
wrong input in the first attempt. Even after, if the user is supplied a non-numeric 
value, display the exception message*/

import java.util.Scanner;

class InputMismatchException extends Exception{
    InputMismatchException(String msg){
super(msg);
    }
}
class Circle {
    String s;
    Scanner in = new Scanner(System.in);
    double Radiuds;
    Circle(){
        SetRadius();
    }
void SetRadius(){
    System.out.print("Enter Radius :");
    s=in.nextLine();
    try{
   if(!s.matches("^[-+]?\\d*\\.?\\d*")){
    throw new InputMismatchException("Enter the Correct Radius Value");
   }
   else{
    Radiuds=Double.parseDouble(s);
   }
}
catch(InputMismatchException e){
    System.out.println(e+" : "+e.getMessage());
    System.out.println("Enter Radius :");
    s=in.nextLine();
    try{
        if(!s.matches("^[-+]?\\d*\\.?\\d*")){
         throw new InputMismatchException("Enter the Correct Radius Value");
        }
        else{
            Radiuds=Double.parseDouble(s);
           }}
    catch(InputMismatchException e1){
        System.out.println(e1+" : "+e1.getMessage());
    }

}

}
void CalcArea(){
    double Area = (float)(Math.PI*Math.pow(Radiuds,2));
    System.out.println("Area of the Circle is "+Area);
}


}
public class P8 {
    public static void main(String[] args) {
        Circle c1=new Circle();
        c1.CalcArea();
        
    }
}
