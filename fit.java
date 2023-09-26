import java.util.Scanner;

public class fit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i =0; i<=t; i++){
            int x = sc.nextInt();//top 10
            int y = sc.nextInt();//11th to 100th
            int t1= x * 10;
            int t2 = y*90;
            System.out.println("total prize money will be :" + (t1+t2));

        }
    }
}
