import java.util.Scanner;

public class Intnum{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter the num1:");
int num1= sc.nextInt();
System.out.println("enter the num2 :");
int num2= sc.nextInt();
int sum= num1+num2;
int sub = num1-num2;
int mul= num1*num2;
int div=num1/num2;
System.out.println("sum = " + sum + "\n" + "sub = " + sub + "\n" + "mul = " + mul + "\n");
if(div=="Infinity"){
System.out.println("this is invalid!!");
}else{
System.out.println("div = " + div);
}
}
}
