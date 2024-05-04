class Student{
private String name;
private int rool_no;
Student(){
this.name="Null";
this.rool_no=0;
this.Display();
}
Student(String name){
    this.name=name;
    this.Display();
}
Student(String name,int rool_no){
    this.name=name;
    this.rool_no=rool_no;
    this.Display();
}
private void Display(){
    System.out.printf("Name : %-10s",this.name);
    System.out.printf(" Roll Number : %s\n",this.rool_no);
}


}
public class Ex_3_1 {
   public static void main(String[] args) {
    Student s1 = new Student();
    Student s3=new Student("Hari");
    Student s2 = new Student("Ram",20); 
   }
}
