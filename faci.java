import java.util.Scanner;

public class faci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int n =3;
        int fac=1;
        int i=1;
        for(i=0;i<n;i++){
            fac=fac*i;
        }
        // while(i<n){
        //     fac=fac*i;
        // }
        System.out.println(fac);
    }
}
