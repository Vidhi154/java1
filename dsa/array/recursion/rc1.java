package dsa.array.recursion;
 class rc{
    /**
     * @param i
     * @return
     */
    public int rc(int i){
        // return i;
        if(i<10){
            return 0;
        }
         return rc(i+1); 
        // return sol;

}
}
public class rc1 {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(rc(n));

    }

    // private static char[] rc(int n) {
    //     return null;
    // }

    // private static char[] rc(int n) {
    //     return null;
    // }
    
}
