public class com {
    public static void main(String[] args) {
        // for(int i =0;i<args.length;i++){
        //     System.out.print(args[i]+" ");
        // }
        int count;
        for(String ea : args){
            System.out.println(ea);
            int n = Integer.parseInt(ea);
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
