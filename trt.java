import java.util.Scanner;

public class trt {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the number of tests:");
      int t = sc.nextInt();
      for(int i =0; i<=t;i++){
         int a = sc.nextInt();
         int b = sc.nextInt();
         int s = a + b;
         int p = a *b;
         System.out.println("sum of the number:" + s);
         System.out.println("product of thr numbers area:" + p);
      }
    }
}
