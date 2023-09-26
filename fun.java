public class fun {
    public static int sum(int[] a) {
        int total =0;
        for(int i =0; i<a.length;i++){
            total += a[i];


        }
        return total;
        
    }
    public static int cout(int[] a, int k){
        int count=0;
        for(int e: a){
            if(e==k){
                count++;
            }
            
        }
        return count;
    }
    public static void main(String[] args) {
        //int[] ary={1,2,3,3,24,24,56,45,4,5,3,5,3,6};
        int[] yay={1,2,3,4,5,6};
        int[] day ={};
        yay=day;
        System.out.println(yay + "=" + day);
        
        
        // for(int i =0;i<r2.length;i++){
        //     r2[i]=1;
        //     System.out.println(r2);
        // }
        //System.out.println(r2);


        // System.out.println(sum(ary));
        // System.out.println(ary.length);
        // System.out.println(cout(ary, 3));
        // for(int e: ary){

        //     System.out.print(e);
        // }


        
    }
}
