public class pra{

    //public static int poly(int[]  nt n){
        // for(int i =1;i<n;i++){
        //     for(int j =1;j<n;j++){
        //         for(int k =1;j<n;j++){
                    
        //             int x = i * i;
        //             int y = j * j;
        //             int z = k * k;


        //             if(x+y==z){
        //                 if(x<y){
        //                     System.out.println("(" + i + "," + j + "," + k+")");

        //                 }
        //                 // System.out.println("(" + i + "," + j + "," + k+")");
        //                 return 1;
        //             }
        //         }
        //     }
        // }
        // return -1;

    
    public static void main(String[] args) {
        //  int[] ={2,3,4,5,6,7,8,9,10,11,12,13};
        int n = 25;
         for(int i =1;i<n;i++){
            for(int j =1;j<n;j++){
                for(int k =1;j<n;j++){
                    
                    int x = i * i;
                    int y = j * j;
                    int z = k * k;


                    if(x+y==z ){
                        if(x<y){
                            System.out.println("(" + i + "," + j + "," + k+")");

                        }
                        // System.out.println("(" + i + "," + j + "," + k+")");
                        
                    }
                }
            }
        }
       
        // int m = lngth;
        // int result = poly(m;
        // System.out.println(result);
        // for(int i )
    }
}