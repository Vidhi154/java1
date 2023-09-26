import java.util.Arrays;

public class move {
    // public static int[] mov(int[] a , int n ){
    //     int temp;
    //     boolean swap;
    //     do{
    //         swap = false;
        
    //     for(int i =0;i<n-1;i++){
    //         temp=0;
    //         if(a[i]==0){
    //             temp=a[i];
    //             a[i]=a[i+1];
    //             a[i+1]=temp;
    //             swap=true;
    //         }
    //     }
    // }while(swap);
    //     // System.out.println(Arrays.toString(a));

    //     return a;
    // }
    public static void main(String[] args) {
        int[] a = {1,4,0,5,0,3,0,4,0};
        int ln = a.length;
        int temp;
        boolean swap;
        do{
            swap=false;
            for(int i=0;i<ln-1;i++){
                temp=0;
                if(a[i]==0){
                    temp=a[i];
                    a[i]=a[i+1];
                    a[i+1]=temp;
                    swap = true;

                }
            }
        }while(swap);

        System.out.println(Arrays.toString(a));
    }
}
