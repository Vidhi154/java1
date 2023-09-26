import java.util.Scanner;

public class stri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a= sc.next();
        int ln = a.length();
        int t = sc.nextInt();
        for(int i =0;i<t;i++){
            //int n = i/2
            if(i/2==0){
                char even = a.charAt(i);
                System.out.println(even);

            }
            // char even = a.charAt(i/2);
            // char odd = a.charAt(i);
            // System.out.println(even + "  " + odd);
            // if(i/2==0){
            //     System.out.println(a.charAt(i));

            // }else{
            //     System.out.println("  " + a.charAt(i));
            // }
        }
    }
}
