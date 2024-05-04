class Value{
private int integerValue;
private String stringValue;
void SetValue(int a,String b){
    integerValue=a;
    stringValue=b;
}
void getIntValue(){
System.out.println("Using Get Integer Value Method : "+integerValue);
}
void getStringValue(){
    System.out.println("Using Get String Value Method : "+stringValue);
} 
}

public class Ex_3_2 {
    public static void main(String[] args) {
        Value v1 = new Value();
v1.SetValue(25,"Car");
v1.getStringValue();
v1.getIntValue();
    }
    
}
