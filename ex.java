import java.util.Scanner;

public class ex {
    public static void solve(double meal, int tip, int tax) {
        // Write your code here
        System.out.println("int tip1=(int)((tip)*(meal/100));");
        System.out.println(tip);
        System.out.println("meal" + meal);

        int tip1=(int) ((tip*meal)/100);
        System.out.println();
        System.out.println(tip1);
        System.out.println("int tax1=(int)(meal*(tax/100));");
        int tax1=(int)(meal*tax)/100;
        System.out.println(tax1);
        int meal1=((int)(meal));
        System.out.println(meal1);
        //+tip+tax;
        System.out.println(meal);    
    
        }
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
        // long meal= nextLong();
        // int tax= nextInt();
        double meal = sc.nextDouble();
        int tax= sc.nextInt();
        int tip = sc.nextInt();
        //int so=(int)(meal);
        // double n=0.5;
        // int ss= (int)(n);
        // System.out.println(ss);
        // System.out.println(so);
        double tet = ((meal *tax)/100);
        System.out.println(tet);
        double trt = ((meal*tip)/100);
        System.out.println(trt);
        // int so=(int)(meal);
        long sol= Math.round(meal+trt +tet);
        System.out.println(sol);
        //solve(meal, tip, tax);

        //int to =  (int) (meal*tax);
       // System.out.println(to);

    }

    // private static long nextLong() {
    //     return 0;
    // }
}
