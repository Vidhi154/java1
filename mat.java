import java.util.Scanner;

public class mat {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        for(int i =0; i<=t;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a>b){
            int qot = a/b;
            int sub = a-b;
             System.out.println( i + " "+qot + " " +sub);
            }else{
                System.out.println("print new value:");
                continue;
            }
            // continue;
            // System.out.println(qot + " " +sub);
        }
    }
}
