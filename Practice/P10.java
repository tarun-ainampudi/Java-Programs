class A implements Cloneable{
    String Name ;
    A(String a){
        Name = a;
    };
    void GetName(){
System.out.println(Name);
    

}
public A clone() throws CloneNotSupportedException{
return (A) super.clone();
}
}
public class P10 {
    public static void main(String[] args) throws CloneNotSupportedException {
        A a = new A("Tarun");
        A b = a.clone();
        b.GetName();

    }
}
