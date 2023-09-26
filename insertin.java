import java.util.Arrays;

public class insertin {
    public static void ins(int[] a , int n){
        int i;int temp,j;
        for( i =1;i<n;i++){
            temp=a[i];//first
            j=i-1; // first k pehle 
            while(j>=0 && a[j]>temp){
                a[j+1]=a[j];
                j--;

            }
            a[j+1]=temp;

        }
        System.out.println(Arrays.toString(a));
    }
    public static void main(String[] args) {
        int[] a = {5,2,7,3,6};
        int len = a.length;
        ins(a, len);
    }
}
