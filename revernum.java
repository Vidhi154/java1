import java.util.Scanner;

public class revernum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int x =num;
        // System.out.println(x/10);
        // System.out.println(x%10);
        // System.out.println((num/10)%10);
        while(x!=0){
            x = (x/10)%10;
            System.out.print(x);
            // x=x/10;
        }
    }
}
