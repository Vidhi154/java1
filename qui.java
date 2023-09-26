import java.util.Arrays;

public class qui {

    public static void main(String[] args) {
        int[] a ={7,5,3,2,56};
        int n = a.length;
        int p= n-1;
        int i=0;
        System.out.println(Arrays.toString(a));
        while(true){
            if(a[i]<a[p]){
                int temp = a[i];
                a[i]=a[i-1];
                a[i-1]=temp;

            }
            if(a[p]<a[i]){
                int temp= a[i];
                a[i]=a[p];
                a[p]=temp;
            }
            i++;
        }
        System.out.println(Arrays.toString(a));
        
    }
    
}
