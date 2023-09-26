public class maxx {
    public static void main(String[] args) {
        int[] a ={1,1,0,1,1,1,0,1,1,1,1,0,0,0,1,0};
        int len = a.length;
        int max = Integer.MIN_VALUE;
        int count =0;
        for(int i =0;i<len;i++){
            if(a[i]==1){
                count++;
                if(count>max){
                    max = count;
                }

            }else{
                count =0;
            }
        }
        System.out.println("maximum sum is " + max);
    }
}
