package University.College;

public class Graduate {

    public class UnderGraduate{
        static long Count=0;
        String Name;
        long Id;
        public UnderGraduate(String Name,long Id){
            Count++;
            this.Name=Name;
            this.Id=Id;
        }
        public static void Display(){
            System.out.println("No.of Undergraduate Students : "+Count);
        }

    }
    public class PostGraduate{
        static long Count=0;
        String Name;
        long Id;
        public PostGraduate(String Name,long Id){
            Count++;
            this.Name=Name;
            this.Id=Id;
        }
        public static void Display(){
            System.out.println("No.of Postgraduate Students : "+Count);
        }

    }
}
