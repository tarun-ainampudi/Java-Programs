import java.util.*;
public class Ex_1_4 {
    public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    System.out.print("Enter the Number:");
    int n=in.nextInt();
    List<Integer> mylist=new ArrayList<>();
    int count;
    int i=1;
    int j;
    do{
        count=0;
        j=1;
        do{
            if(i%j==0){count+=1;}
            j+=1;

        }while(i>=j);
        if (count==2){mylist.add(i);}
        i+=1;

    }while(n>=i);

System.out.print("Pirme Numbers Upto Given Number:"+mylist);

}
}
