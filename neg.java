import java.util.Scanner;

public class neg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i =0;i<=t;i++){
            int n = sc.nextInt();
            int op= -(n);
            System.out.println(op);
        }
    }
}
