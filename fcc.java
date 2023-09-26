import java.util.Scanner;

public class fcc {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        //int n = sc.nextInt();
        
        int fac=1;
        int i;
	for(String ea: args){
	int n = Integer.parseInt(ea);
        System.out.println("the factorial of a number using iterative ");
        System.out.println();
        System.out.println("the factorial of a number is :" + n);
        for(i=1;i<=n;i++){
            fac=fac*i;
        }
        
        System.out.println(fac);
	}
    }
}
