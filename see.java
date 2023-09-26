import java.util.Arrays;

public class see {
    public static void main(String[] args) {
        int[] a ={2,5,2,4,73,5,8};
        int n =a.length;
        for(int i =0;i<n-1;i++){
            int min =i;
            for(int j=i+1;j<n;j++){
                if(a[min]>a[j]){
                    min =j;
                }
                // int temp= a[min];
                // a[min]=a[i];
                // a[i]=temp;

            }
            int temp= a[min];
                a[min]=a[i];
                a[i]=temp;

        }
        System.out.println(Arrays.toString(a));
    }
}
