import java.util.Arrays;
import java.util.Scanner;

public class ins {
    public static  void inss(int[] a ,int k){
        for (int i =5;i>0;i++){
            int temp=0;
            if(a[i]>k){
                a[i+1]=a[i];
                // temp=a[i];
                // a[i]=a[i-1];
                // a[i-1]=temp;

            }
        }

    }
    public static void main(String[] args) {
        int[] a =new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i =0;i<5;i++){
            int num= sc.nextInt();
            a[i]=num;
        }
        System.out.println(Arrays.toString(a));

        inss(a, 5);
        System.out.println(Arrays.toString(a));
        
    }
}
