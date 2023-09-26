public class re3 {
    public static void nums(int n){
        if(n>6){
            return;
        }
        System.out.println(n);
        nums(n+1);
    }
    public static void main(String[] args) {
        int start =1 ;
        int num= 6;
        nums(1);
    }
}
