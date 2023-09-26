public class hash{
    public static int coun(int[] a,int n) {
        int count =0;
        int len = a.length;
        for(int i =0;i<len;i++){
            if(n==a[i]){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] a ={1,2,4,5,2,5,2,4,3};
        int num = 2;
        int result = coun(a, num);
        System.out.println(result);
    }
}