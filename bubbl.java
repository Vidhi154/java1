import java.util.Arrays;

public class bubbl {
    public static void main(String[] args) {
        int[] a ={3,6,2,5,7,3};
        int len =a.length;
        boolean swap;
        do{
            swap=false;
            for(int i =0;i<len-1 ;i++){
                if(a[i]>a[i+1]){
                    int temp =a[i];
                    a[i]=a[i+1];
                    a[i+1]=temp;
                    swap=true;
                }
            }
        }while(swap);

        System.out.println(Arrays.toString(a));
    }
}
