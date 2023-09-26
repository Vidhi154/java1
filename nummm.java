import java.util.Scanner;

public class nummm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        int num2= sc.nextInt();
        int sum = num + num2;
        int sub = num-num2;
        int mul = num*num2;
        System.out.println(sum + " " + sub + " " + mul );
        if(num2!=0){
            int div = num/num2;
            System.out.println(div);

        }else{
            System.out.println("this is invalid!!");
        }
        
    }
}
