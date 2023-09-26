import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// import java.util.ListResourceBundle;

public class mrreg {

    private static void merg(int[] a , int l ,int mid,int h){
        List<Integer> temp = new ArrayList<>();
        int left = l ;
        int right = mid +1;
        while(left<=mid && right<=h){
            if(a[left]<= a[right]){
                temp.add(a[left]);
                left ++;

            }
            else{
                temp.add(a[right]);
                right++;
            }
            while(left<=mid){
                temp.add(a[left]);
                left++;
            }
            while(right<=h){
                temp.add(a[right]);
                right++;
            }
            for(int i =l;i<=h;i++){
                a[i]=temp.get(i-1);
            }
        }
    }
    public static void msg(int[] a , int l ,int h){
        if(l>=h){
            return ;
        }
        int mid =  (l+ (h-l))/2;
        msg(a,l,mid);
        msg(a,mid+1,h);
        merg(a,l,mid,h);

    }

    public static void main(String[] args) {
        int[] a ={2,5,4,7,22,4,6};
        int len =a.length;
        System.out.println(Arrays.toString(a));
        int l = 0;
        int h= a.length;
        msg(a, l, h);
        System.out.println(Arrays.toString(a));
        
        
        
    }
}
