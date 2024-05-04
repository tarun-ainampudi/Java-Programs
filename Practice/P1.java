class Employee{
String Name;
String EmpID;
protected float salary=50000;
Employee(String Name,String EmpID){
this.Name=Name;
this.EmpID=EmpID;
}
void GetDetails(){
    System.out.printf("Name : %-15s| EmpID : %-10s| Salary : %.0f\n",Name,EmpID,salary);
}
}
class Programmer extends Employee{
protected String Department;
private float bonus =5000;
 Programmer(String Name,String EmpID,String Department){
    super(Name,EmpID);
    this.Department=Department;
    super.salary=super.salary+bonus;
 }
 void GetDetails(String Department){
    System.out.printf("Name : %-15s| EmpID : %-10s| Salary : %.0f | Department : %-15s\n",Name,EmpID,salary,Department);

 }
}
class Worker extends Employee{
    private float HourlyRate=300;
    Worker(String Name, String EmpID,float HoursWorked) {
        super(Name, EmpID);
        super.salary=HoursWorked*HourlyRate;
    }


}
public class P1 {
    public static void main(String[] args) {
    Programmer a = new Programmer("X","A1","Development");
    Employee b = new Employee("Y","A2");
    Worker c = new Worker("Z","A3",40);
    a.GetDetails(a.Department);
    b.GetDetails();
    c.GetDetails();
}
    }
