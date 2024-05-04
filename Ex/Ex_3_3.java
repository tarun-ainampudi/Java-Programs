public class Ex_3_3 {
    static void Message(){
        System.out.println("Default Message");
    }
    static void Message(String m){
        System.out.println("Custom Meassage : "+m);
    }
    static void Message(String m1,String m2){
        System.out.println("First Message : "+m1);
        System.out.println("Second Message : "+m2);
    }
    public static void main(String[] args) {
        Message();
        Message("Hello");
        Message("Hello","Good Morning");
    }
}
