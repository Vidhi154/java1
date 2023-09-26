public class fac {
    public static int facc(int n){
        if(n==1)
            return 1;
        else
            return n*facc(n-1);

        
    }
    public static void main(String[] args) {
        int n =5;
        System.out.println(facc(n));
    }
    
}
