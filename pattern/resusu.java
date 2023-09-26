public class resusu {
    public static void sub(int n,int sum ){
        
        if(n<1){
            System.out.println(sum);
            return;

        }
        
       sub(n-1,sum+n);
       
        
    //    System.out.println(add);

        // add=add+

        // int sum=0;

    }
    public static void main(String[] args) {
        int n =20;
        int sum=0;
        sub(n,sum);
    }
}
