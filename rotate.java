import java.util.Arrays;

public class rotate {
    public static void ro(int[] a, int n){
        int temp = 0;
        temp = a[0];
        for(int i =0;i<n-1;i++){
            // a[i-1]=a[i];
            a[i]=a[i+1];
        }
        a[n-1]=temp;
        System.out.println(Arrays.toString(a));
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int len = a.length;
        ro(a,len);
    }
}
