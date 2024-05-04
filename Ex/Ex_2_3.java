import java.util.*;
public class Ex_2_3{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double[][] a = new double[3][3];
for(int i=0;i<=2;i++){
    for(int j=0;j<=2;j++){
        System.out.printf("Enter the %dth row %d Element: ",i+1,j+1);
     a[i][j] = in.nextDouble();
    }
}System.out.println("Enter the Elements for Second Matrix.");
double[][] b = new double[3][3];
for(int i=0;i<=2;i++){
    for(int j=0;j<=2;j++){
        System.out.printf("Enter the %dth row %d Element: ",i+1,j+1);
     b[i][j] = in.nextDouble();
    }
}

Multiplication(a,b);

    }
    public static void Multiplication(double[][]a,double[][]b){
        double c[][]=new double[3][3];
        for(int i=0;i<=2;i++){
            for(int j=0;j<=2;j++){
                c[i][j]=a[i][j]*b[i][j];
            }
        }
    System.out.println(Arrays.deepToString(c));
    }
}
