public class prim{
    public static void main(String[] args) {
        int n=100;
        int count;
        int i;
	System.out.println("the prime numbers between 1 to 100 are :- ");
        for(i =2;i<=n;i++){
            count=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count ++;

                }
            }
                if(count==2){
			//System.out.println("the prime numbers between 1 to 100 are :- ");
                    System.out.print(i+ " ");
                }
            
            
            

            }
        }

    }

