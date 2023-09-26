import java.util.Scanner;

public class ref {
    static int fac(int n){
        // int fa=1;
        if(n>1){
            return  (n*fac(n-1));
        }else{
            // int fa;
            return 1;
        }
        // return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc.nextInt();
        System.out.println("the factorial of a number using recursion method");
        System.out.println();
        System.out.println("factorial of a number"+ n + " " + "is :");
        System.out.println(fac(n));
        
    }
}
