import java.util.Arrays;

public class select {
    public static void main(String[] args) {
        int[] a ={3,4,5,2,1};
        System.out.println(Arrays.toString(a));
        int len = a.length;
        int j ;
        // int min = a[0];
        for(int i =0;i<len-1;i++){
            // int min=a[i];
            int minivale =i;
            for(j =i;j<len;j++){

            if(a[minivale]>a[j]){
                // min=a[j];
                minivale=j;
            }
            int temp = a[minivale];
            a[minivale]=a[i];
            a[i]=temp;
        }

        }
        System.out.println(Arrays.toString(a));
    }
}
