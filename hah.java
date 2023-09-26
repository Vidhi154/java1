public class hah {
    public static void main(String[] args) {
        int[] a ={1,2,4,5};
        int n = a.length;

        int[] hashh= new int[n+1];
        for(int i =0;i<n;i++){
            hashh[a[i]]+=1;

        }
        for(int i =1;i<n;i++){

        
        if(hashh[i]==0){
            System.out.println(i);
        }
    }
    }
}
