public class bser {

    public static int search(int[] a , int srch){
        int low = 0;
        int high = a.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            int guess=a[mid];
            if(guess==srch){
                return mid;
            }
            if(guess>srch){
                high = mid -1 ;

            }else{
                low = mid +1 ;
                
            }
            // return 0;
        }
        return 0;

    }
    public static void main(String[] args) {
        int[] ary = {1,2,3,4,5,6,7,8,9,10};
        int ans = search(ary, 11);
        System.out.println(ans);


    }
}
