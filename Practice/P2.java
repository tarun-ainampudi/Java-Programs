import java.util.*;
public class P2 {
    public static float[] Solve(){
        Scanner in = new Scanner(System.in);
        System.out.println("ax+by=c\ndx+ey=f");
        System.out.print("Enter the values seperated by space :");
        String s = in.nextLine();
        String a[] = s.split(" ");
        List<Integer> b=new ArrayList<>();
        for (String i:a){
        b.add(Integer.parseInt(i));
        }
        float x,y;
        float k = b.get(0)*b.get(4)-b.get(1)*b.get(3);
        x=(float)((b.get(4)*b.get(2) - b.get(1)*b.get(5))/k);
        y=(float)((b.get(0)*b.get(5) - b.get(3)*b.get(2))/k);
        float[] c = {x,y};
        in.close();
        return c;
    }
    public static void main(String[] args) {
        System.out.println("[x, y] : "+Arrays.toString(Solve()));

    }
    
}
