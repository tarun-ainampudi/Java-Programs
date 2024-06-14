import java.util.*;
public class As_1_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Speed of 5 Racers Seperated by Space :");
        String s = in.nextLine();
        String[] t= s.split(" ");
        int[] speeds=new int[t.length];
        int count=0;
        for(String a :  t){
            speeds[count]=Integer.parseInt(a);count+=1;
        }
        System.out.println("Speed of the bikers are : "+Arrays.toString(speeds));   
        double avgSpeed;
        int sum=0;
        for(int speed : speeds){
            sum+=speed;
        }
        avgSpeed=(double)sum/t.length;
        System.out.printf("Average Speed :%f\n",avgSpeed);
        System.out.println("Average speed of the racers is : "+avgSpeed);
        System.out.print("Speed Greater than Average Speed are :");
        for(int speed : speeds){
            if(speed>avgSpeed){System.out.printf("%d ",speed);}
        
        }
      in.close();
    }
    
}
