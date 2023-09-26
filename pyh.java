public class pyh {
        public static void main(String[] args) {
            //  int[] ={2,3,4,5,6,7,8,9,10,11,12,13};
            // int n = 25;
            // int i,j,k;
            //  for( i =1;i<n;i++){
            //     for( j =1;j<n;j++){
            //         for(k =1;j<n;j++){
                        
            //             int x = i * i;
            //             int y = j * j;
            //             int z = k * k;
    
    
            //             if(x+y==z || y+z==x || x+z==y){
            //                 if(x<y){
            //                     System.out.println("(" + i + "," + j + "," + k+")");
    
            //                 }
                    
            //             }
            //         }
            //     }
            // }
            int x1, x2, x3; 

            for(x1 = 1; x1 < 100; x1++)
            {
                for(x2 = 1; x2 < 100; x2++)
                {
                    for(x3 = 1; x3 < 100; x3++)
                    {
                        int a= x1, b=x2, c=x3;
    
                        if((Math.pow(a, 2) + Math.pow(b, 2)) == Math.pow(c, 2))
                        {
                            if(a < b)
                            {
                                System.out.println(x1 +"  "+ x2 +"   "+ x3);
                            }
                        }
                    }
                }
            }       
          
        }
    
}
