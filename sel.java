import java.util.Arrays;

public class sel {

    public static void main(String[] args) {
        // int min;
        int[] a ={3,7,3,56,2,45};
        int len = a.length;
       for(int i =0;i<len-1;i++){
        int mn= i;
        for(int j =1;j<len ;j++){
            if(a[j]<a[mn]){
                mn=j;
            //    int temp = a[i];
            //    a[i]=a[mn];
            //    a[mn]=temp;

            //    mn=j;

            }
            int temp = a[i];
               a[i]=a[mn];
               a[mn]=temp;
        }
       }
       
        System.out.println(Arrays.toString(a));
    }
}