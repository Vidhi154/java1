public class tweice {
    public static void main(String[] args) {
        int[] a ={1,1,2,3,4,4};
        int len =a.length;
        int count=0;
        int max =0;
        for(int i=0;i<len ;i++){
            for(int j =i+1;j<len-1;j++){
                if(a[i]!=a[j] && a[j]==a[j+1]){
                    System.out.println(a[i]);


                }
            }
        }
    }
}
