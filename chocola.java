import java.util.Scanner;

public class chocola {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        for (int i =0;i<t;i++){
            int to= sc.nextInt();//total chocolate
            int a = sc.nextInt();//gaave you
            int ch= to-a;//remaining chocolate
            System.out.println("ch" + "- " + ch);
            int tc= (Math.abs(a-ch));
            System.out.println("="+ tc);
        }
    }
}
