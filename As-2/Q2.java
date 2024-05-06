import University.College.*;
public class Q2 {
    public static void main(String[] args) {
        Graduate G1 = new Graduate();
        Graduate.UnderGraduate S1 = G1.new UnderGraduate("A", 1);
        Graduate.UnderGraduate S2 = G1.new UnderGraduate("B", 2);
        Graduate.UnderGraduate S3 = G1.new UnderGraduate("C", 3);
        Graduate.UnderGraduate S4 = G1.new UnderGraduate("D", 4);
        Graduate.UnderGraduate.Display();
        Graduate.PostGraduate S5 = G1.new PostGraduate("A", 1);
        Graduate.PostGraduate S6 = G1.new PostGraduate("B", 2);
        Graduate.PostGraduate S7= G1.new PostGraduate("C", 3);
        Graduate.PostGraduate.Display();

    }
    
}

