import java.util.*;
public class Ex_1_6 {
    public static void main(String[] args){

        Scanner in=new Scanner(System.in);
        System.out.print("Enter the Number:");
        int a=in.nextInt();
        int count=1;
        System.out.println("Numbers except the given Number");
        if (1<=a && a<=10){
        
        while(count<=10){
        
        if (count==a){count++;continue;}
        
        else if(count==10){count++;break;}
        
        System.out.print(count+" ");
        count++;
        
        }
    }
}
}
