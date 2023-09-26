import java.util.Scanner;

public class and {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a%5==0 && a%7==0){
            System.out.println("a is divisible by both 3 and 7");
        }else{
            System.out.println("not divisible by 5 and 7");
        }
        if(b%5==0 && b%7==0){
            System.out.println("both divisible ");
        }else{
            System.out.println("not divible ");
        }
    }
}
