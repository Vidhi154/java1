import java.util.Arrays;

public class rotate2 {

    public static void ro(int[] a , int n,int k){
        // int temp = a[0];
        int count=0;
        do{
            int temp = a[0];
            for(int i =0;i<n-1;i++){
                a[i]=a[i+1];
                // count ++;
            }
            a[n-1]=temp;
            count++;
        }while(count<=k-1);
        System.out.println(Arrays.toString(a));
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        int k =100;
        int len = a.length;
        ro(a,len,k);
        
    }
}
