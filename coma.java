public class coma{
    public static void main(String[] args) {
        // for(int i =0;i<args.length;i++){
        //     System.out.print(args[i]+" ");
        // }
	System.out.println("the prime numbers between 1 to n are : -");
        int count;
        for(String ea : args){
            //System.out.println(ea);
            int n = Integer.parseInt(ea);
		System.out.println("the n is :" + n);
            for(int i =2;i<=n;i++){
                count=0;
                for(int j =1;j<=i;j++){
                    if(i%j==0){
                        count++;
                    }

                }
                if(count==2){
                    System.out.print(i + " ");
                }
                
            }
        }
    }
}
