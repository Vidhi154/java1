import java.util.Scanner;

public class numi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	System.out.println("enter the num1 :");
        int num= sc.nextInt();
	System.out.println("enter the num2 :");
        int num2= sc.nextInt();
        int sum = num + num2;
        int sub = num-num2;
        int mul = num*num2;
        System.out.println("addition = " + sum);
	System.out.println("subtract = " + sub);
	System.out.println("multiplication = " + mul); 
	
        if(num2!=0){
            int div = num/num2;
            System.out.println("division =" + div);

        }else{
            System.out.println("this is invalid!!");
        }
        
    }
}
