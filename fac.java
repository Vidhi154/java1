import java.util.Scanner;

public class fac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // int fac1=0;
        int fac=1;
        for(int i = 1; i <=num ; i++){

        fac=fac*i;
            // fac+=fac1;
            // System.out.println(fac);

        }
        System.out.println(fac);
    }
}
