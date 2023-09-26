import java.util.Arrays;

public class reversee{


    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int len = a.length;
        int j =len-1;
        int mid = len/2;
        for(int i =0;i<mid;i++){
            int temp = a[i];
            a[i]=a[j-i];
            a[j-i]=temp;

            if(j==mid){
                break;
            }
        }
        System.out.println(Arrays.toString(a));

    }
}
