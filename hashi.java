import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;

public class hashi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] a = new int[10];
        for(int i =0;i<n;i++){
            a[i]=sc.nextInt();

        }
        System.out.println(Arrays.toString(a));


        //precompute
        // Hashtable<Integer> hp = new Hashtable<>(13);
        // for(int i =0;i<n;i++){
        //     hp.put(a[i]);
        // }
        int[] hash = new int[13];
        for(int i =0;i<n;i++){
            hash[a[i]]+=1;

        }
        System.out.println(Arrays.toString(hash));

        int num = sc.nextInt() ;
        while(num--!=0){
            int m = sc.nextInt();
            System.out.println((hash[m]));
        }

    }
}
