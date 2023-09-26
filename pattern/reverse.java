import java.util.Arrays;

public class reverse {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7};
        int len = a.length;
        // int first = a[0];
        // int last = a[len];
        int mid =len/2;
        int j=len;
        for(int i=0;i<mid;i++){
            int temp=0;
            
           
                temp =a[i];
                a[i]=a[j-1 -i];
                a[j-1-i]=temp;
                // a[i]=a[j];
            
            // for(int j=len;j>mid;j--){
            //     a[i]=a[j];
            // }
        }
        System.out.println(Arrays.toString(a));

    }
}
