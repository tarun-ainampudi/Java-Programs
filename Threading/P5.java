import java.util.*;
public class P5 {
    public static void main(String[] args) {
        HashSet<Integer> a = new HashSet<>();
        
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);
        a.add(7);
        a.add(8);
        a.add(9);
        a.add(10);

        Object[] b= a.toArray();
        System.out.println(a.hashCode());
        System.out.println(a);
        System.out.println(Arrays.toString(b));
        for(int i : a){System.out.println(i);}
        a.clear();
        System.out.println(a);
        List<Integer> c  = new ArrayList<>();
        c.clear(); 
        System.out.println(c);
    }
}
