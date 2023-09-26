import java.util.Arrays;
import java.util.Scanner;

public class chh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name =sc.next();
        char[] aray = name.toCharArray();
        int len = name.length();
        int[] a = new int[10];
        for(int i =0;i<len;i++){
            int num = (int)(aray[i]-'a');
            a[i]=num;
        }
        System.out.println(Arrays.toString(a));



        int[] hash = new int[160];
        for(int i =0;i<len;i++){
            hash[a[i]]+=1;
        }
        System.out.println(Arrays.toString(hash));


        int q = sc.nextInt();
        while(q--!=0){
            char ni= sc.next().charAt(0);
            int no=(int)(ni-'a');
            System.out.println(hash[no]);
        }

    }
    
}
