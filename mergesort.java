import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mergesort {

    private static void merge(int[] a , int low ,int mid , int high){
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid +1;
        while(left<=mid && right <=high){
            if(a[left]<=a[right]){
                temp.add(a[left]);
                left++;

            }
            else{
                temp.add(a[right]);
                right++;
            }
        }
        while(left<=mid){
            temp.add(a[left]);
            left++;
        }
        while(right<=high){
            temp.add(a[right]);
            right++;
        }
        for(int i =low; i<=high ; i++){
            a[i]=temp.get(i-low);
        }

    }
    public static void mgs(int[] a , int l , int h){
        if(l>=h){
            return ;
        }
        int mid = (l+h)/2;
        mgs(a, l, mid);
        mgs(a,mid+1,h);
        merge(a, l, mid, h);
    }

    public static void main(String[] args) {
        int[] a = {2,6,3,7,9,1};
        System.out.println(Arrays.toString(a));
        int n =a.length;
         mgs(a, 0, n-1);
         System.out.println(Arrays.toString(a));
    }
}