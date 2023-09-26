import java.util.Scanner;

public class q3 {
    public static boolean isodd(int i){
        if((i & 1) ==1){
            return true;

        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        boolean check =isodd(num);
        System.out.println(check);
    }
}
