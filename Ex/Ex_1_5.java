import java.util.*;

public class Ex_1_5 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the Number:");
        int n=in.nextInt();
        List<Integer> mylist=new ArrayList<>();
        mylist.add(0);
        mylist.add(1);int j;
        for(int i=1;i<n-1;i++){j=mylist.get(i)+mylist.get(i-1);mylist.add(j);}
        System.out.print("Fibonacci List : "+mylist);
    }
    
}
