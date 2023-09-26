class subj{
    public static int maxi(int[] num){
            int maxx= num[0];

            for(int var : num){
                if(var> num){
                    maxx= var;
                }
            }
            return maxx;
        }

}




public class grad {
    public static void main(String[] args) {
        int[] marks ={123,234,43,223,224,463,532,435};
        int nuu= maxi(marks);
        System.out.println(nuu);



        // public static int maxi(int[] num){
        //     int maxx= num[0];

        //     for(int var : num){
        //         if(var> num){
        //             maxx= var;
        //         }
        //     }
        //     return maxx;
        // }
        

    }
}
