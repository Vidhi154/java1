import java.util.Scanner;

public class q2{
    public static boolean ismul(long n, long m){
        if(m%n==0){
            return true;

        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enytr num 1");
        long num1 = sc.nextLong();
        System.out.println("enter num2 ");
        long num2 = sc.nextLong();
        boolean mul= ismul(num1, num2);
        System.out.println(mul);


    }
}
