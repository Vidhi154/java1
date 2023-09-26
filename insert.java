import java.util.Arrays;

public class insert {
    public static void main(String[] args) {
        int[] a = {2,4,5,6,3,2,5};
        System.out.println(Arrays.toString(a));
        int len = a.length;
        for(int i =1;i<len -1; i++){
            int j =i;
            int temp=0;
            while(j>0){
                if(a[i]<a[j-1]){
                    temp = a[i];
                    a[i]=a[j-1];
                    a[j-1]=temp;
                    

                }
                j--;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
