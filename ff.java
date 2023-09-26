import java.util.Scanner;

public class ff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        int a;
        
        for(a=1;a<11;a++){
            System.out.println(num + "x" + a + "=" + num*a);
            
        }
    }
}
