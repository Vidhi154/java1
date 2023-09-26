import java.util.Scanner;



public class natural {
    public static void main(String[] args) {
        System.out.println("sum of n natural numbers ");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        int sum =0;
        for(int i =0;i<=num;i++){
             sum+=i;

        }
        System.out.println(sum);

    }
}
