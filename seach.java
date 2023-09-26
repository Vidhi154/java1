public class seach {
    public static int search(int[] a,int n,int e){
        for(int i =0;i<n;i++){
            if(a[i]==e){
                System.out.println(a[e]);
            }
            
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] a ={1,3,4,2,5,8};
        int len=a.length;
        int s=search(a, len, 2);
        System.out.println(s);
    }
}
