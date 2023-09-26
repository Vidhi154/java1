import java.util.Scanner;

public class cou {
    public static void main(String[] args) {
        int count =0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(count);
        int x=n;
        while(true){
            // int x = n;
            if(x!=0){
                x = n/10;
                count++;
            }
            System.out.println(count);

        }
    }
}
