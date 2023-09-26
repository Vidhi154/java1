import java.util.Scanner;

public class q5 {
    public static int sum(int n){
        int sum =0;
        // if(i%2!=0){
            for(int i =0; i<n;i++){
                if(i%2!=0){
                    sum+=i;

                }
                
            }
            return sum;
        // }
    }
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        int su =sum(num);
        System.out.println(su);
    }
}
