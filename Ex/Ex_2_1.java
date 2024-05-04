import java.util.*;
class Car{
   private String name;
   private int mileage;
   Car(String name,int mileage)
   {this.name=name;
    this.mileage=mileage;
   }
   protected String get_name(){return name;}
protected int get_mileage(){return mileage; }

} 
public class Ex_2_1 {
    public static void main(String[] args) {
        Car[] a=new Car[3];
        a[1]=new Car("Swift",30);
        a[2]=new Car("SwiftDzire",40);
        a[0]=new Car("Toyota",20);    
        for(int i=0;i<a.length;i++){
            System.out.println(a[i].get_name()+":"+a[i].get_mileage());
        }    
    }
    
}
