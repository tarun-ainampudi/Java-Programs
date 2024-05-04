import java.util.*;
public class Ex_1_3 {
    public static void main(String[] args){
Scanner in=new Scanner(System.in);
System.out.print("Enter the Number:");
int n = in.nextInt();
int i=0;
List<Integer> mylist=new ArrayList<>();
while (n>=i){
if(i%2==0){mylist.add(i);}
  i+=1;  
}
System.out.print("Even Number List:"+mylist);
    }
}
