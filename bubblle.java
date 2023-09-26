import java.util.Arrays;
import java.util.Scanner;

public class bubblle {
    public static void main(String[] args) {
        int[] a=new int[5];
        int n = a.length;
        Scanner  sc = new Scanner(System.in );
        // int nu = sc.nextInt();
        System.out.println("enter the array:");
        for(int i =0;i<n;i++){
            int nu= sc.nextInt();
            a[i]=nu;
        }
        System.out.println(Arrays.toString(a));
        boolean swap;
        do{
            swap = false;
            for(int i =0;i<n-1;i++){
                int temp=0;
                if(a[i]>a[i+1]){
                    temp = a[i];
                    a[i]=a[i+1];
                    a[i+1]=temp;
                    swap = true;
                }
            }
        }while(swap);
        System.out.println("the sorted array using bubble sort:");

        System.out.println(Arrays.toString(a));
    }

}
