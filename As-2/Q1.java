
class NotEligibleToVoteException extends Exception{
    NotEligibleToVoteException(String msg){
        super(msg);
    }
}
class NameNotValidException extends Exception{
NameNotValidException(String msg){
    super(msg);
}
}
class Person{
long Id;
String Name;
int age;
char Gender;
Person(long Id,String Name,int age,char Gender){
    this.Id=Id;
    this.Name=Name;
    this.age=age;
    this.Gender=Gender;
}
void VoteEligibility()throws NotEligibleToVoteException,NameNotValidException{
    if(age<=18){
        throw new NotEligibleToVoteException("Insufficient Age");
        
    }
    if(!Name.matches("^[a-zA-Z]+$")){
        throw new NameNotValidException("Name is not Valid");
    }
}

}
public class Q1 {
    public static void main(String[] args) {
        Person p1 = new Person(1234,"abc",19, 'M');
        try{
        p1.VoteEligibility();
        System.out.println("Eligible to Vote");
    }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
