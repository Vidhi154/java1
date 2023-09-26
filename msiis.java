public class msiis {
    public static void main(String[] args) {
        int[] a= {1,3,4,5};
        int n = 1;
        int miss=0;
        int len = a.length;
        int i=0;
        do{
            i++;
            n++;
            if(a[i]!=n){
                System.out.println(n);
            }
        }while(n<5);
       
        
        System.out.println(miss);
    }
}
