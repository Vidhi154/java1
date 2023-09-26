import java.util.Scanner;

public class q4 {
    public static void sum(int n){
        int sum =0;
        for( int i = 0; i<n;i++){
            sum +=i;

        }
        System.out.println(sum);
        


    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        sum(num);
        
    }
}
