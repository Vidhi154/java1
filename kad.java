public class kad {
    public static void main(String[] args) {
        int[] a = {1, -2,-3, 4, -1, 2, 1};
        int len = a.length;
        int sum =0;
        int max = Integer.MIN_VALUE;
        for(int i =0;i<len ;i++){
            sum= sum + a[i];
            if(sum>max){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }
            
        }
        System.out.println(max);
    
    
    }
}
