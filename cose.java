public class cose {
    public static void main(String[] args) {
        int[] a = {1,0,1,1,0,1,0,1};
        int len = a.length;
        int count =0;
        // int num=0;
        int max =Integer.MAX_VALUE;
        for(int i =0;i<len-1;i++){
            if(a[i]==1){
                count++;
                if(count>max){
                    max=count;
                }
                
                // if(a[i+1]==0){
                //     count =0;
                // }
            }else{
                count =0;
            }
        }
        System.out.println(count);
    }
}
