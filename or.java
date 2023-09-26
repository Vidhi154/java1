import java.util.Scanner;

public class or {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        if(z>x || z >y){
            System.out.println("pass");

        }else{
            System.out.println("fail");
        }
    }
}
