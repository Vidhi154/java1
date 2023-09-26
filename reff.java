import java.util.Scanner;

public class reff {
    static int fac(int n){
       
        if(n>1){
            return  (n*fac(n-1));
        }else{
           
            return 1;
        }
       
    }
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        //int n = sc.nextInt();
	for(String ea : args){
	int n = Integer.parseInt(ea);
        System.out.println("the factorial of a number using recursion method and command line argument input");
        System.out.println();
        System.out.println("factorial of a number"+ n + " " + "is :");
        System.out.println(fac(n));
	}
        
    }
}
