
abstract class Element{
String Name;
int AtNum;
String Symbol;
Element(String Name,int AtNum,String Symbol){
    this.Name=Name;
    this.AtNum=AtNum;
    this.Symbol=Symbol;
}
abstract public void describeElement();}
class MetalElement extends Element{
    MetalElement(String Name,int AtNum,String Symbol){
        super(Name, AtNum, Symbol);
        describeElement();
    }
    public void describeElement(){
        System.out.printf("%-12s",Name);
        System.out.print(AtNum);
        System.out.printf("  %-5s",Symbol);
        System.out.println("Good Conductor");

    }
}
class NonMetalElement extends Element{
    NonMetalElement(String Name,int AtNum,String Symbol){
        super(Name, AtNum, Symbol);
        describeElement();
    }
    public void describeElement(){
        System.out.println(Name);
        System.out.println(AtNum);
        System.out.println(Symbol);
        System.out.println("Bad Conductors");

    }
}

public class P7 {

    public static void main(String[] args) {
        Element e[] = new Element[4];
        e[0]=new MetalElement("Magnesium",12,"Mg");
        e[1]=new MetalElement("Calcium",20,"Ca");
        e[2]=new MetalElement("Argon",18,"Ar");
        e[3]=new MetalElement("Neon",10,"Ne");
        }
}
