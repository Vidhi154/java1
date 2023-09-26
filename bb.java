import java.util.Arrays;
import java.util.Scanner;

public class bb{

    public static void bbsort(int[] a, int n){
        int temp ;
        boolean swap;
        do {
            swap = false;
        for(int i =0;i<n-1;i++){

            if(a[i]>a[i+1]){
                temp = a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
                swap = true;
            }

        }
    }while(swap);
    System.out.println(Arrays.toString(a));
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        int[] ar= new int[10];
        int len = ar.length;
        System.out.println("insert the elements in the arra");
        for(int i =0;i<len;i++){
            int num = sc.nextInt();
            ar[i]=num;
        }
        System.out.println("this is the array you have inputed-");
        System.out.println(Arrays.toString(ar));
        System.out.println("after bubble sort --");
        bbsort(ar, len);
        
    }
}