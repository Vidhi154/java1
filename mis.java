public class mis {
    public static void main(String[] args) {
        
    
    int[] a ={1,2,4,5};
    int num=0;
    int len = a.length;
    for(int i =0;i<len;i++){
        if(a[i]!=i+1){
            num=a[i];
        }
    }


    System.out.println(num);
    }
    
}
