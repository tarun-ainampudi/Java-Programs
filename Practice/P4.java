class Horse{
    String Name;
    String Color;
    int BirthYear;
    void Set(String n,String c,int b){
    Name=n;
    Color=c;
    BirthYear=b;
    }
    void Get(){
    System.out.println("Name : "+Name);
    System.out.println("Color : "+Color);
    System.out.println("BirthYear : "+BirthYear+"\n");
    }
}
class RaceHorse extends Horse{
int NumOfRaces;
protected float Speed;
void Set(String n,String c,int b,int m, float s){
    Name=n;
    Color=c;
    BirthYear=b;
    NumOfRaces=m;
    Speed=s;
}
void Get(){
    System.out.println("Name : "+Name);
    System.out.println("Color : "+Color);
    System.out.println("BirthYear : "+BirthYear);
    System.out.println("Number of Races Partcipated : "+NumOfRaces);
    System.out.println("Speed of Horse : "+Speed+"\n");
}
}
public class P4 {
    public static void main(String[] args) {
        RaceHorse a =new RaceHorse();
        RaceHorse b= new RaceHorse();
        Horse c = new Horse();
        a.Set("RH-1","Black",2010,20,50);
        b.Set("RH-2","White",2012,18,45);
        c.Set("H-1","Brown",2015);
        RaceHorse e = new RaceHorse();
        RaceHorse[] d = {a,b,e};
        System.out.println("Number of horses Participated : "+d.length+"\n");
        float MaxSpeed = -1;
        RaceHorse s = new RaceHorse();
        for (RaceHorse i : d){
        if (i.Speed>MaxSpeed){
        MaxSpeed=i.Speed;
        s=i;
        }
        }
        System.out.println("The details of horse having highest speed is :");
        s.Get();
        }
}
