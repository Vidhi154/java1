import java.util.Arrays;
import java.util.Scanner;

public class using {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {1,2,5,6,4,5,3,2,4};
        int len = a.length;
        System.out.println(Arrays.toString(a));

        int[] hash = new int[10];
        for(int i =0;i<len;i++){
            hash[a[i]]+=1;
        }
        System.out.println(Arrays.toString(hash));

        int q =6;
        for(int i =0;i<q;i++){
            int nn = sc.nextInt();
            System.out.println(hash[nn]);
        }

        System.out.println(Arrays.toString(hash));

    }
}
