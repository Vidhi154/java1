public class secondlar {
    public static int secondl(int[] a,int n){
        if(n<2){
            return -1;
        }
        int largest = a[0];
        int secondlarge=0;
        for(int i=0;i<n;i++){
            if(a[i]>largest){
                largest=a[i];
                // return largest;
                //888

            }
            // if(largest!=a[i]){
            //     //888 is not equal to any other
            //    secondlarge=a[0];
            //    if(secondlarge<a[i] && a[i]<largest){
            //     System.out.println(secondlarge);
            //    }
            // }
        }
        for(int i =0;i<n;i++){
            if(largest!=a[i]){
                //888 is not equal to any other
               secondlarge=a[0];
               if(secondlarge<a[i] && a[i]<largest){
                secondlarge=a[i];
                System.out.println(secondlarge);
                break;
               }
            }
            
        }
        // if(largest!=a[i])
        // System.out.println(secondlarge);
        return 0;
    }
    public static void main(String[] args) {
        int[] arry={12,4,6,2,524,524,888,67,888};
        int len = arry.length;
        secondl(arry, len);

        
    }
}
