import java.util.Scanner;

public class flo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	System.out.println("enter the num1 :");
        float num= sc.nextFloat();
	System.out.println("enter the num2 :");
        float num2= sc.nextFloat();
        float sum = num + num2;
        float sub = num-num2;
        float mul = num*num2;
        System.out.println("addition = " + sum);
	System.out.println("subtract = " + sub);
	System.out.println("multiplication = " + mul); 
	
        if(num2!=0){
            float div = num/num2;
            System.out.println("division =" + div);

        }else{
            System.out.println("this is invalid!!");
        }
        
    }
}