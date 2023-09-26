public class recursion {
    public static int count =0 ;
    public static int cou(int n){
        count++;
       if(count==5){
        return 0;
        // count++;
       }else{
        System.out.println(count);
        cou(count);
        
       }
       return 0;
    }
    public static void main(String[] args) {
        int n =7;
        System.out.println(cou(n));
    }
}
