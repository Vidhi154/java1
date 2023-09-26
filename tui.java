import java.util.Scanner;

public class tui {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();//weeks
        for(int i =0; i<=t;i++){
            int y = sc.nextInt();//pr week cost
            int x = sc.nextInt();
            int total= x*y;
            System.out.println(i+ ":" + total);

        }
    }
}
