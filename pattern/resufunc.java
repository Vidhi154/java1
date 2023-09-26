public class resufunc {
    public static int sum(int n){
        // int num=0;
        if(n==0){
            return 0;
        }
        else{
            return n+sum(n-1);
        }
    }
    public static void main(String[] args) {
        int n=12;
// /        sum(n);
        System.out.println(sum(n));
    }
}
