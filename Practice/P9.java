class MyClass{
    String a;
    MyClass(String a){
this.a=a;
    }
    public void finalize() throws Throwable{
        System.out.println("Finalize method is Called");
            }
    
}

public class P9 {
    
    public static void main(String[] args) {
        String a = null;
        MyClass b = new MyClass("abc");
        b=null;
        System.gc();
        System.out.println(a);
    }
}
