import java.util.Scanner;

public class fii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc.nextInt();
        // int n =3;
        int fac=1;
        int i;
        System.out.println("the factorial of a number using iterative ");
        System.out.println();
        System.out.println("the factorial of a number is :" + n);
        for(i=1;i<=n;i++){
            fac=fac*i;
        }
        // while(i<n){
        //     fac=fac*i;
        // }
        System.out.println(fac);
    }
}
