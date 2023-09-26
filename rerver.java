// import java.lang.reflect.Array;
// import java.util.Collections;

import java.util.Arrays;

public class rerver {
    public static void rev(int[] a, int n, int i){
        int m =n+i/2;
        if(i>=n/2){
            return;
        }
        int temp = a[i];
        a[i]=a[n-1-i];
        a[n-1-i]=temp;
        rev(a, n-1, i+1);

    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int n = a.length;
        int i =0;
        rev(a, n, i);
        System.out.println(Arrays.toString(a));

    }
}
