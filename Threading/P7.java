class Generic<F>{
    F a;
    Generic(){}
    Generic(F a){
        this.a=a;
    }
    public F get(){
        return a;
    }
}
class abhishek<F> extends Generic<F>{
    abhishek(F a){
        super(a);
    }
}
public class P7 {
    public static void main(String[] args) {
        Generic<Integer> g = new Generic<>(2);
        System.out.println(g.get());
        Generic<String> s = new abhishek<>("Hello");
        System.out.println(s.get());
    }
    
}
