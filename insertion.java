import java.util.Arrays;
import java.util.Scanner;

public class insertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array:");
        int[] a = new int[5];
        for(int i =0;i<a.length;i++){
            int num=sc.nextInt();
            a[i]=num;
        }
        System.out.println(Arrays.toString(a));
        int n = a.length;
        for(int i =1;i<n;i++){
           int j=i-1;
           int aa= a[i];
               while(j >= 0 && a[j] > aa){
                
                    a[j+1]=a[j];
                    j--;
                

               }
               a[j+1]=aa;
            
        }
        System.out.println("the sorted array using insertion sort is -:");
        System.out.println(Arrays.toString(a));
    }
}
