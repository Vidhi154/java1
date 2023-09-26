import java.util.Scanner;


public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        int num = sc.nextInt();
        for(int i =1;i<11;i++){
            int add = i*num;
            System.out.println(num+"x"+i+"="+add);
            
        }
    }
}
