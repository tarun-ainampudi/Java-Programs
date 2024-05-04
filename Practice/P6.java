class ElectricityBill{
long ConsumerNumber;
String ConsumerName;
int PreviousMonthReading;
int CurrentMonthReading;
int Units;
float Bill;
ElectricityBill(long ConsumerNumber,String ConsumerName,int PreviousMonthReading,int CurrentMonthReading){
    this.ConsumerNumber=ConsumerNumber;
    this.ConsumerName=ConsumerName;
    this.PreviousMonthReading=PreviousMonthReading;
    this.CurrentMonthReading=CurrentMonthReading;
    Units=CurrentMonthReading-PreviousMonthReading;
}
float CalculateBillAmount(){
if (Units<=100){
    Bill=Units*1;
}
else if(Units>100 && Units<=200){
   Bill=(float) (100*1+(Units-100)*2.50) ;
}
else if (Units>200 && Units<=500){
    Bill = (float)(100*1+100*2.50+(Units-200)*4);
}
else{
    Bill = (float)(100*1+100*2.50+300*4+(Units-500)*6);
}
return Bill;
}

}
public class P6 {
   public static void main(String[] args) {
    ElectricityBill EB = new ElectricityBill(1234,"ABC",250,500);
    System.out.println(EB.CalculateBillAmount()); 

   }
    
}
