import java.util.*;
public class P6 {
    public static void main(String[] args) {
        HashMap<String,String> a = new HashMap<>(); 
        a.put("in","India");
        a.put("us","United States");
        a.put("br","Brazil");
        System.out.println(a);
        HashMap<String,String> b = new HashMap<>();
        b.putAll(a);
        System.out.println("a  : "+a);
        System.out.println("b  : "+b);
        System.out.println(a.getOrDefault("us","us"));
        System.out.println("a  : "+a);
        String key="us";
        String value="United States";
        if(a.containsKey(key)){
            if(a.containsValue(value)){
                a.replace("us","United Kingdom");
            }
        }System.out.println("a  : "+a);
    }
}
